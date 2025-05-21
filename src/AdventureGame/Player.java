package AdventureGame;

import AdventureGame.Characters.Archer;
import AdventureGame.Characters.Characters;
import AdventureGame.Characters.Knight;
import AdventureGame.Characters.Samurai;
import AdventureGame.Locations.DangerousLocations.Cave;
import AdventureGame.Locations.DangerousLocations.Forest;
import AdventureGame.Locations.DangerousLocations.River;
import AdventureGame.Locations.Location;
import AdventureGame.Locations.SafeLocations.SafeHouse;
import AdventureGame.Locations.SafeLocations.ToolStore;

import java.util.Scanner;

public class Player {
    private Inventory inventory;
    private int damage;
    private int health;
    private int coins;
    private String name;
    private String characterName;
    private int maxHealth;


    public Player(String name) {
        this.name = name;
    }


    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Player selectChar(Player player) {

        Scanner scanner = new Scanner(System.in);
        Characters[] characterList = {new Knight(), new Archer(), new Samurai()};
        System.out.println(this.name + " Select a character ");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < characterList.length; i++) {
            System.out.printf("%-2d. %-7s --> damage: %-2d  health: %-3d  coins: %-3d%n",
                    i + 1,
                    characterList[i].getName(),
                    characterList[i].getDamage(),
                    characterList[i].getHealth(),
                    characterList[i].getMoney()
            );
        }

        int character = scanner.nextInt();
        System.out.println("-----------------------------------------------------------");
        boolean control = true;

        while (control) {
            switch (character) {
                case 1:
                    Match(player, characterList[0]);
                    control = false;
                    break;
                case 2:
                    Match(player, characterList[1]);
                    control = false;
                    break;
                case 3:
                    Match(player, characterList[2]);
                    control = false;
                    break;
                default:
                    System.out.println("Invalid character Enter a valid character");
                    character = scanner.nextInt();
            }
        }
        System.out.println(player.getCharacterName() + " selected");
        System.out.println("Character: " + player.getCharacterName()
                + ", Weapon: " + this.inventory.getWeaponName()
                + ", Armor:" + this.inventory.getArmorName()
                + ", Damage:" + player.getDamage() + ", Health : "
                + player.getHealth() + ", Coins: " + player.getCoins());

        return player;

    }

    public void selectLocation(Player player) {
        System.out.println("\nWhere would you like to go " + this.characterName + " " + this.name + "!");
        System.out.println("---------------------------------- Locations ----------------------------------");
        System.out.println("1-Safe House  --> This is a safe place for you. There are no enemies here, and you can heal.");
        System.out.println("2-Tools Store --> This is a store for tools. You can buy weapons and armor here.");
        System.out.println("3-Cave        --> Reward: <Food>. Be careful , a zombie might appear!");
        System.out.println("4-Forest      --> Reward: <Firefood>. Be careful , a vampire might appear!");
        System.out.println("5-River       --> Reward: <Water>. Be careful , a bear might appear!");
        System.out.println("0-Exit        --> You have left the game");

        int locationNumber = 8;

        while (locationNumber > 5 || locationNumber < 0) {
            System.out.println("Please select the location you want to go");
            Scanner scanner = new Scanner(System.in);
            boolean onLocation = true;
            locationNumber = scanner.nextInt();
            switch (locationNumber) {
                case 1:
                    System.out.println("You have entered safe house");
                    SafeHouse safeHouse = new SafeHouse(player);
                    safeHouse.healPlayer();
                    selectLocation(player);
                    break;
                case 2:
                    System.out.println("You have entered tools store");
                    ToolStore toolStore = new ToolStore(player);
                    toolStore.OnLocation();
                    selectLocation(player);
                    break;
                case 3:
                    System.out.println("You have entered cave");
                    Cave cave = new Cave(player);
                    onLocation = cave.OnLocation();
                    if (onLocation) selectLocation(player);
                    break;
                case 4:
                    System.out.println("You have entered forest");
                    Forest forest = new Forest(player);
                    onLocation = forest.OnLocation();
                    selectLocation(player);
                    break;
                case 5:
                    System.out.println("You have entered river");
                    River river = new River(player);
                    onLocation = river.OnLocation();
                    selectLocation(player);
                    break;
                case 0:
                    System.out.println("You have left the game");
                    break;
                default:
                    System.out.println("Invalid location number. Please enter a valid location number");
                    locationNumber = scanner.nextInt();
            }
            if (!onLocation) {
                System.out.println("Game Over! You have died.");

            }
            scanner.close();
        }
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void Match(Player player, Characters characters) {
        player.setCharacterName(characters.getName());
        player.setDamage(characters.getDamage());
        player.setHealth(characters.getHealth());
        player.setCoins(characters.getMoney());
        player.setMaxHealth(characters.getHealth());
        player.inventory = (characters.getInventory());
        player.setInventory(characters.getInventory());
    }
}

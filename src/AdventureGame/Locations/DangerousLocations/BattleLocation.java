package AdventureGame.Locations.DangerousLocations;

import AdventureGame.Locations.Location;
import AdventureGame.Obstacles.Bear;
import AdventureGame.Obstacles.Obstacles;
import AdventureGame.Obstacles.Vampire;
import AdventureGame.Obstacles.Zombie;
import AdventureGame.Player;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public abstract class BattleLocation {
    private Player player;
    private String name;
    private Obstacles obstacle;
    private static Scanner scanner = new Scanner(System.in);

    public BattleLocation(Player player, String name, Obstacles obstacle) {
        this.player = player;
        this.name = name;
        this.obstacle = obstacle;

    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean OnLocation();

    public boolean battle() {
        Random random = new Random();
        String choice;
        int randomObstacle = random.nextInt(3) + 1;
        Obstacles[] obstacleList;
        if (obstacle instanceof Zombie) {
            obstacleList = new Zombie[randomObstacle];
            for (int i = 0; i < randomObstacle; i++) {
                obstacleList[i] = new Zombie();
            }
        } else if (obstacle instanceof Vampire) {
            obstacleList = new Vampire[randomObstacle];
            for (int i = 0; i < randomObstacle; i++) {
                obstacleList[i] = new Vampire();
            }
        } else {
            obstacleList = new Bear[randomObstacle];
            for (int i = 0; i < randomObstacle; i++) {
                obstacleList[i] = new Bear();
            }
        }

        System.out.println("Watch out!" + randomObstacle + " " + obstacle.getObstacleName() + " Prepare for battle!");
        System.out.println("<F>ight or <R>un");
        choice = scanner.next();
        if (Objects.equals(choice, "f") || Objects.equals(choice, "F")) {
            PrintPlayerStats();
            PrintObstacleStats(obstacle);
            while (randomObstacle > 0) {
                System.out.println("<H>it or <R>un ");
                choice = scanner.next();
                if (Objects.equals(choice, "h") || Objects.equals(choice, "H")) {
                    System.out.println("You hit! " + (player.getDamage()+player.getInventory().getWeaponDamage()) + " damage!");
                    obstacleList[randomObstacle - 1].setHp(obstacleList[randomObstacle - 1].getHp() - (player.getDamage()+player.getInventory().getWeaponDamage()));
                    System.out.println(obstacle.getObstacleName() + " Health:" + obstacleList[randomObstacle - 1].getHp());
                    System.out.println(obstacle.getObstacleName() + " hit you " + obstacle.getDamage() + " damage!");
                    System.out.println("You have " + player.getInventory().getArmorDefence() + " defence!");
                    player.setHealth(player.getHealth() - (obstacle.getDamage() - player.getInventory().getArmorDefence()));
                    System.out.println("Your Health:" + player.getHealth());
                    if (obstacleList[randomObstacle - 1].getHp() <= 0) {
                        System.out.println("You killed " + obstacle.getObstacleName() + "!");
                        System.out.println("You won " + obstacle.getCoins() + " coins!");
                        player.setCoins(player.getCoins() + obstacle.getCoins());
                        randomObstacle--;
                    }
                    if (player.getHealth() <= 0) {
                        return false;
                    }
                }
                else return true;
            }
        }
        return true;
    }

    public void PrintPlayerStats() {
        System.out.println("Player Stats:");
        System.out.println("Health:" + player.getHealth()
                + "\n Weapon:" + player.getInventory().getWeaponName()
                + "\n Damage:" + (player.getDamage() + player.getInventory().getWeaponDamage())
                + "\n Armor:" + player.getInventory().getArmorName()
                + "\n Defence:" + player.getInventory().getArmorDefence()
                + "\n Coins:" + player.getCoins());
    }

    public void PrintObstacleStats(Obstacles obstacle) {
        System.out.println(obstacle.getObstacleName() + " Stats:");
        System.out.println("Health:" + obstacle.getHp() + "\n" + "Damage:" + obstacle.getDamage() + "\n" + "Reward:" + obstacle.getCoins() + "coins");
    }

}

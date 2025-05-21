package AdventureGame.Locations.SafeLocations;

import AdventureGame.Equipments.*;
import AdventureGame.Equipments.Armors.Armors;
import AdventureGame.Equipments.Armors.HeavyArmor;
import AdventureGame.Equipments.Armors.LightArmor;
import AdventureGame.Equipments.Armors.MediumArmor;
import AdventureGame.Equipments.Weapons.Gun;
import AdventureGame.Equipments.Weapons.Rifle;
import AdventureGame.Equipments.Weapons.SharpSword;
import AdventureGame.Equipments.Weapons.Weapons;
import AdventureGame.Player;

import java.util.Scanner;

public class ToolStore extends SafeLocation {
    private Scanner scanner;
    public ToolStore(Player player) {
        super(player,"Tool Store");
    }

    public void menu(int choice){
        scanner = new Scanner(System.in);
        int choice2;
        if(choice==1){
            System.out.println("\tYou have "+getPlayer().getCoins()+" coins.\n");
            System.out.println("1-Gun:   Damage:"+new Gun().getDamage()+" Price:"+new Gun().getPrice());
            System.out.println("2-Sword: Damage:"+new SharpSword().getDamage()+" Price:"+new SharpSword().getPrice());
            System.out.println("3-Rifle: Damage:"+new Rifle().getDamage()+" Price:"+new Rifle().getPrice());
            System.out.println("4-Back");
            System.out.println("Enter your choice: ");
            choice2 = scanner.nextInt();
            switch (choice2){
                case 1:buyWeapon(this.getPlayer(),new Gun());
                break;
                case 2:buyWeapon(this.getPlayer(),new SharpSword());
                break;
                case 3:buyWeapon(this.getPlayer(),new Rifle());
                break;
                case 4:OnLocation();
                break;
                default:System.out.println("Invalid choice. Please enter a valid number.");
            }
        } else if (choice==2) {
            System.out.println("\tYou have "+getPlayer().getCoins()+" coins.\n");
            System.out.println("1-Light Armor: Defence:"+new LightArmor().getDefence()+" Price:"+new LightArmor().getPrice());
            System.out.println("2-Medium Armor: Defence:"+new MediumArmor().getDefence()+" Price:"+new MediumArmor().getPrice());
            System.out.println("3-Heavy Armor:  Defence:"+new HeavyArmor().getDefence()+" Price:"+new HeavyArmor().getPrice());
            System.out.println("4-Back");
            System.out.println("Enter your choice: ");
            choice2 = scanner.nextInt();
            switch (choice2){
                case 1:buyArmor(this.getPlayer(),new LightArmor());
                break;
                case 2:buyArmor(this.getPlayer(),new MediumArmor());
                break;
                case 3:buyArmor(this.getPlayer(),new HeavyArmor());
                break;
                case 4:OnLocation();
                default:System.out.println("Invalid choice. Please enter a valid number.");
            }
        }



    }
    public void buyWeapon(Player player, Weapons weapons){
        if(player.getCoins()>= weapons.getPrice()){
            player.setCoins(player.getCoins()-weapons.getPrice());
            player.getInventory().setWeaponName(weapons.getName());
            player.getInventory().setWeaponDamage(weapons.getDamage());
            System.out.println("Your new weapon:"+player.getInventory().getWeaponName());
            System.out.println("You have "+player.getCoins()+" coins left");
        }else {
            System.out.println("You don't have enough money to buy it");
        }
        OnLocation();
    }
    public void buyArmor(Player player, Armors armors){
        if(player.getCoins()>= armors.getPrice()){
            player.setCoins(player.getCoins()-armors.getPrice());
            player.getInventory().setArmorName(armors.getName());
            player.getInventory().setArmorDefence(armors.getDefence());
            System.out.println("Your new armor:"+player.getInventory().getArmorName());
            System.out.println("You have "+player.getCoins()+" coins left");
        }else {
            System.out.println("You don't have enough money to buy it");
        }
        OnLocation();
    }

    @Override
    public boolean OnLocation() {
        System.out.println("-----------------Welcome to the Tool Store-----------------");
        System.out.println("1-Weapons");
        System.out.println("2-Armors");
        System.out.println("3-Exit");
        System.out.println("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        while (choice < 1 || choice > 3){
            System.out.println("Invalid choice. Please enter a valid number.");
            choice = scanner.nextInt();
        }
        if(choice!=3)menu(choice);
        System.out.println("You have left the Tool Store.");
        return true;
    }
}

package AdventureGame.Characters;

import AdventureGame.Inventory;

public abstract class Characters {
    private int money;
    private int health;
    private int damage;
    private String name;
    private String weaponName;
    private Inventory inventory;

    public Characters(String name, int money, int health, int damage, String weaponName, Inventory inventory) {
        this.name = name;
        this.money = money;
        this.health = health;
        this.damage = damage;
        this.weaponName=weaponName;
        this.inventory=inventory;
    }

    public int getMoney() {
        return money;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

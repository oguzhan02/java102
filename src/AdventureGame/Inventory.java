package AdventureGame;

public class Inventory {
    private Boolean water;
    private Boolean food;
    private Boolean fireWood;
    private String weaponName;
    private String armorName;
    private int weaponDamage;
    private int armorDefence;

    public Inventory() {
        this.water = false;
        this.food = false;
        this.fireWood = false;
        this.weaponName =" - ";
        this.armorName = " - ";
        this.weaponDamage =0;
        this.armorDefence = 0;
    }

    public Boolean getWater() {
        return water;
    }

    public void setWater(Boolean water) {
        this.water = water;
    }

    public Boolean getFood() {
        return food;
    }

    public void setFood(Boolean food) {
        this.food = food;
    }

    public Boolean getFireWood() {
        return fireWood;
    }

    public void setFireWood(Boolean fireWood) {
        this.fireWood = fireWood;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getArmorDefence() {
        return armorDefence;
    }

    public void setArmorDefence(int armorDefence) {
        this.armorDefence = armorDefence;
    }
}

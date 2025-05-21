package AdventureGame.Equipments;

public abstract class Equipments {
    private int price;
    private int damage;
    private int defence;
    private String name;

    public Equipments(int price,int damage,int defence,String name) {
        this.price = price;
        this.damage = damage;
        this.defence = defence;
        this.name=name;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}

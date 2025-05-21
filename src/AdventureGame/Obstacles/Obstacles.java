package AdventureGame.Obstacles;

public abstract class Obstacles {
    private int obstacleNumber;
    private String obstacleName;
    private int damage;
    private int hp;
    private int coins;

    public Obstacles(int obstacleNumber, String obstacleName, int damage, int hp, int coins) {
        this.obstacleNumber = obstacleNumber;
        this.obstacleName = obstacleName;
        this.damage = damage;
        this.hp = hp;
        this.coins = coins;
    }

    public int getObstacleNumber() {
        return obstacleNumber;
    }

    public void setObstacleNumber(int obstacleNumber) {
        this.obstacleNumber = obstacleNumber;
    }

    public String getObstacleName() {
        return obstacleName;
    }

    public void setObstacleName(String obstacleName) {
        this.obstacleName = obstacleName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }


}

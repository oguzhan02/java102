package AdventureGame.Locations.SafeLocations;

import AdventureGame.Player;

public class SafeHouse extends SafeLocation {
    private Player player;
    public SafeHouse(Player player) {
        super(player, "Safe House");
        this.player=player;
    }

    public void healPlayer() {
        this.player.setHealth(this.player.getMaxHealth());
        System.out.println("You have been healed.");
    }


    @Override
    public boolean OnLocation() {
        return true;
    }
}

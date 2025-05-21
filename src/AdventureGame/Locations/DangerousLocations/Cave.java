package AdventureGame.Locations.DangerousLocations;

import AdventureGame.Obstacles.Zombie;
import AdventureGame.Player;

import java.util.Random;

public class Cave extends BattleLocation {
    public Cave(Player player) {
        super(player, "Cave",new Zombie());
    }

    @Override
    public boolean OnLocation() {
        return super.battle();
    }





}

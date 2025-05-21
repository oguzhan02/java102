package AdventureGame.Locations.DangerousLocations;

import AdventureGame.Obstacles.Vampire;
import AdventureGame.Player;

public class Forest extends BattleLocation {
    public Forest(Player player) {
        super(player,"Forest",new Vampire());
    }

    @Override
    public boolean OnLocation() {
        return super.battle();
    }

}

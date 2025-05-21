package AdventureGame.Locations.DangerousLocations;

import AdventureGame.Obstacles.Bear;
import AdventureGame.Player;

public class River extends BattleLocation {
    public River(Player player) {
        super(player,"River",new Bear());
    }

    @Override
    public boolean OnLocation() {
        return super.battle();
    }
}

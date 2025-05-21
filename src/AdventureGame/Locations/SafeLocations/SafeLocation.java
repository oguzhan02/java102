package AdventureGame.Locations.SafeLocations;

import AdventureGame.Locations.Location;
import AdventureGame.Player;

public abstract class SafeLocation extends Location {
    public SafeLocation(Player player,String name) {
        super(player,name);
    }

    public  abstract boolean OnLocation();




}

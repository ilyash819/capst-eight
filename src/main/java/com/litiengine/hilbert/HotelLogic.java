package com.litiengine.hilbert;

import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.entities.Spawnpoint;
import de.gurkenlabs.litiengine.graphics.Camera;
import de.gurkenlabs.litiengine.graphics.LocationLockCamera;

public final class HotelLogic {
    private HotelLogic() {
    }

    public static void init() {
        Camera camera = new LocationLockCamera(TopHatGuy.instance());
        camera.setClampToMap(true);
        Game.world().setCamera(camera);

        //Game.world().setGravity(120);

        Game.world().onLoaded(e -> {
            // spawn the player instance on the spawn point with the name "enter"
            Spawnpoint spawn = Game.world().environment().getSpawnpoint(1);
                spawn.spawn(TopHatGuy.instance());
        });
    }
}

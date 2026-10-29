package com.example.game;
import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.resources.Resources;
import de.gurkenlabs.litiengine.gui.screens.GameScreen;
import de.gurkenlabs.litiengine.graphics.ICamera;
import de.gurkenlabs.litiengine.*;
import de.gurkenlabs.litiengine.entities.*;

public class Main {

    static void main(String[] args) {
        Game.info().setName("Hilbert's In Finite Hotel");
        Game.info().setVersion("v0.0.01");

        Game.init(args);

        Resources.load("game.litidata");
        Game.screens().add(new GameScreen());
        ICamera camera = Game.world().camera();
        camera.setFocus(315,710);

        Game.graphics().setBaseRenderScale(1.5f);
        Game.world().loadEnvironment("infinite_map");
        IEntity entity = Game.world().environment().get("tophatguy");
        if (entity != null) {
            Game.world().camera().setFocus(entity.getCenter());
        }
        Game.start();
    }
}
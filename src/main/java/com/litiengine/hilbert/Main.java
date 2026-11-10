package com.litiengine.hilbert;
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
        HotelLogic.init();

        Resources.load("game.litidata");
        Game.screens().add(new GameScreen());
        ICamera camera = Game.world().camera();
        camera.setFocus(315,710);

        Game.graphics().setBaseRenderScale(1.7f);

        Game.start();
        Game.world().loadEnvironment("infinite_map");
    }
}
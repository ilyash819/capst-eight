package com.example.game;
import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.resources.Resources;
import de.gurkenlabs.litiengine.gui.screens.GameScreen;
import de.gurkenlabs.litiengine.graphics.ICamera;
import de.gurkenlabs.litiengine.*;

public class Main {

    public static void main(String[] args) {
        Game.init(args);
        Resources.load("game1.litidata");
        Game.screens().add(new GameScreen());
        ICamera camera = Game.world().camera();
        camera.setFocus(315,410);
        Game.graphics().setBaseRenderScale(1.0f);
        Game.world().loadEnvironment("untitled");
        Game.start();
    }
}
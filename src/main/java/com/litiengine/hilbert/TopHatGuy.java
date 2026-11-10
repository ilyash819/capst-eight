package com.litiengine.hilbert;

import de.gurkenlabs.litiengine.entities.*;
import de.gurkenlabs.litiengine.input.KeyboardEntityController;
import de.gurkenlabs.litiengine.physics.*;

@EntityInfo(width = 32, height = 32)
@CollisionInfo(collisionBoxWidth = 12, collisionBoxHeight = 12, collision = true, collisionType = Collision.STATIC)
@MovementInfo(velocity = 120, acceleration = 800, deceleration = 800, turnOnMove = true)
public class TopHatGuy extends Creature {
    private static TopHatGuy instance;
    public TopHatGuy() {
        super("tophatguy");
    }
    public static TopHatGuy instance() {
        if (instance == null) {
            instance = new TopHatGuy();
        }

        return instance;
    }
    @Override
    protected IMovementController createMovementController() {
        return new KeyboardEntityController<>(this);

    }
}

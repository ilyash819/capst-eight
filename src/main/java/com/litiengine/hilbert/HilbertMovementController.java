package com.litiengine.hilbert;

import de.gurkenlabs.litiengine.input.KeyboardEntityController;

import java.awt.event.KeyEvent;

public class HilbertMovementController extends KeyboardEntityController<TopHatGuy> {

    public HilbertMovementController(TopHatGuy e) {
        super(e);
        this.addUpKey(KeyEvent.VK_W);
        this.addDownKey(KeyEvent.VK_S);
        this.addLeftKey(KeyEvent.VK_A);
        this.addRightKey(KeyEvent.VK_D);
    }
}

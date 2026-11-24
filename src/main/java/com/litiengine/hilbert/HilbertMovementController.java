package com.litiengine.hilbert;

import de.gurkenlabs.litiengine.input.KeyboardEntityController;

import java.awt.event.KeyEvent;

public class HilbertMovementController extends KeyboardEntityController<TopHatGuy> {

    public HilbertMovementController(TopHatGuy e) {
        super(e);
        this.addUpKey(KeyEvent.VK_UP);
        this.addDownKey(KeyEvent.VK_DOWN);
        this.addLeftKey(KeyEvent.VK_LEFT);
        this.addRightKey(KeyEvent.VK_RIGHT);
    }
}

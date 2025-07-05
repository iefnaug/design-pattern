package com.gf.factory;

import com.gf.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();

}

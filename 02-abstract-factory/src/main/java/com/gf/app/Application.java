package com.gf.app;

import com.gf.buttons.Button;
import com.gf.checkboxes.Checkbox;
import com.gf.factory.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;


    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}

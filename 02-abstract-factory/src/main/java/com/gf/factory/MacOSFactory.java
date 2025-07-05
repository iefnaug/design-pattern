package com.gf.factory;

import com.gf.buttons.Button;
import com.gf.buttons.MacOSButton;
import com.gf.checkboxes.Checkbox;
import com.gf.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

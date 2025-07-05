package com.gf.factory;

import com.gf.buttons.Button;
import com.gf.buttons.WindowsButton;
import com.gf.checkboxes.Checkbox;
import com.gf.checkboxes.MacOSCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

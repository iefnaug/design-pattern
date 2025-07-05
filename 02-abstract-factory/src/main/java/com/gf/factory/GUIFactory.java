package com.gf.factory;

import com.gf.buttons.Button;
import com.gf.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();

}

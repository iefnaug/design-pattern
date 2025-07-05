package com.gf.factory;

import com.gf.buttons.Button;
import com.gf.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

package com.gf.factory;

import com.gf.buttons.Button;
import com.gf.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}

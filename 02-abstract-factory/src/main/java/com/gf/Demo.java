package com.gf;

import com.gf.app.Application;
import com.gf.factory.WindowsFactory;

public class Demo {
    public static void main(String[] args) {
        Application app = new Application(new WindowsFactory());
        app.paint();
    }
}

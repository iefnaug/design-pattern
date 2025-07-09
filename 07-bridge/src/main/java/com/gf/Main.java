package com.gf;

import com.gf.devices.Device;
import com.gf.devices.Radio;
import com.gf.devices.Tv;
import com.gf.remotes.AdvancedRemote;
import com.gf.remotes.BasicRemote;

public class Main {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }

}
package Kunal.Interface;

import Kunal.Interface.interfaces.Media;

public class CDPlayer implements Media {
    @Override
    public void start() {
        System.out.println("Music Start");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }
}

package Kunal.Interface.main;

import Kunal.Interface.MyCar;

public class Main {
    public static void main(String[] args) {

        MyCar car = new MyCar();
        car.start();
        car.stop();
        car.upgradeToElectricEngine();
        car.start();
//        car.startMusic();
//        car.stopMusic();
//        car.stop();

    }
}

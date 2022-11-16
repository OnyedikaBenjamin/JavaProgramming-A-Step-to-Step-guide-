package Kunal.Interface;

import Kunal.Interface.interfaces.Engine;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        for(int i =0; i < 200000; i++) {
            System.out.println("Starting...");
        }
        System.out.println("Electric Engine has started");
    }
    @Override
    public void stop() {
        System.out.println("Electric Engine Stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric engine accelerate");
    }
}

package Kunal.Interface;

import Kunal.Interface.interfaces.Engine;
import Kunal.Interface.interfaces.Media;

public class MyCar {
    private Engine myCarEngine;
    private Media myCarPlayer;

    public MyCar(){                            //  I made my car to have a default engine of type Power engine
        this.myCarEngine = new PowerEngine();
        this.myCarPlayer = new CDPlayer();     // I made my car to have a default Media of type CDPlayer
    }
    public MyCar(Engine engine){               // I created a constructor to modify the car engine type whenever I want to.
       this.myCarEngine = engine;
    }
    public void start(){                      // This will start the engine based on the engine type
        myCarEngine.start();
    }
    public void stop(){
        myCarEngine.stop();
    }
    public void startMusic(){
        myCarPlayer.start();
    }
    public void stopMusic(){
        myCarPlayer.stop();
    }
    public void upgradeToElectricEngine(){
        this.myCarEngine = new ElectricEngine();
    }

}

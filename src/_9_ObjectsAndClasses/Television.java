package _9_ObjectsAndClasses;

public class Television {
    private int channel;
    private int volumeLevel;
    private boolean on;

    public Television (){}

    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }
    public void setChannel(int newChannel){
      if(on && newChannel > 1 && newChannel <=120){
          channel = newChannel;
      }
    }
    public void setVolume(int newVolume){
        if (on && newVolume >= 1 && newVolume <=7){
            volumeLevel = newVolume;
        }
    }

    public void increaseChannelByOne(){
        if (on && channel > 120){
            channel++;
        }
    }

    public void decreaseChannelByOne(){
        if (on && channel > 1){
            channel--;
        }
    }

    public void volumeUp(){
        if (on && volumeLevel < 7){
            volumeLevel++;
        }
    }

    public void volumeDown(){
        if (on && volumeLevel > 1){
            volumeLevel--;
        }
    }
    public static void main(String[] args) {

        Television tv = new Television();

        tv.turnOn();
        tv.setChannel(40);
        tv.setVolume(6);
        tv.increaseChannelByOne();
        tv.volumeDown();

        System.out.printf("%s%d%s%d", "The TV is at channel ", tv.channel, " and its at Volume ", tv.volumeLevel);

    }

}

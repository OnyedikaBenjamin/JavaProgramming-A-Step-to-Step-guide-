package _9_ObjectsAndClasses;

public class Television {
    private int channel, volumeLevel, volumeLevelSaverBeforeMuting;
    private boolean isOn, volumeMuted;

    public boolean isOn(){
        return isOn;
    }
    public void turnOn(){
        isOn = true;
        channel = getChannel();
    }
    public void turnOff(){
        isOn = false;
    }
    public int getChannel() {
        return channel;
    }
    public int getVolumeLevel() {
        return volumeLevel;
    }
    public void setChannel(int newChannel) {
        if (isOn && newChannel >= 1 && newChannel < 120){
            channel = newChannel;
        }
    }
    public void setVolume(int newVolume){
        if (isOn && newVolume >= 1 && newVolume < 7){
            volumeLevel = newVolume;
        }
    }
    public void channelUp(){
        if (isOn && channel < 120){
            channel++;
        }
    }
    public void channelDown(){
        if (isOn && channel > 1){
            channel--;
        }
    }
    public void volumeUp(){
        if (isOn && volumeLevel < 7){
            volumeLevel++;
        }
    }

    public void volumeDown(){
        if (isOn && volumeLevel > 1){
            volumeLevel--;
        }
    }
    public void mute(){
        if (isOn & volumeLevel > 1) {
            volumeMuted = true;
        volumeLevelSaverBeforeMuting = volumeLevel;
            volumeLevel = 0;
        }
    }
    public void unmute(){
        if (isOn){
          volumeMuted = false;
          volumeLevel = volumeLevelSaverBeforeMuting;
        }
    }
    public boolean volumeMuted(){
        return volumeMuted;
    }

}

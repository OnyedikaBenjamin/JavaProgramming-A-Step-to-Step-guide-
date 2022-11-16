package com.unicornsWimps;

public class RaceCourse {
    private int[] raceTrack = new int[100];

    public RaceCourse(){
        this.raceTrack = new int[100];
    }

    public RaceCourse(int[] raceTrack){
        if(raceTrack.length < 70){
            this.setRaceTrack(new int[100]);
        }
        else{
            this.raceTrack = raceTrack;
        }

    }

    public int[] getRaceTrack(){
        return raceTrack;
    }

    public void setRaceTrack(int[] raceTrack) {
        this.raceTrack = raceTrack;
    }
}

package Music;

import Music.Functions.Play;
import Music.Functions.Tune;

public class Guitar implements Tune, Play {

    private String color;
    private int strngCount = 6;
    private int[] tension = new int[6];

    public Guitar(String color, int strngCount, int[] tension) {
        this.color = color;
        this.strngCount = strngCount;
        this.tension = tension;
    }

    public Guitar(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStrngCount() {
        return strngCount;
    }

    public void setStrngCount(int strngCount) {
        this.strngCount = strngCount;
    }

    public int[] getTension() {
        return tension;
    }

    @Override
    public void setTune() {
        for(int i=0; i<6; i++){
            tension[i] = 5;
        }
    }

    @Override
    public void printSong() {
        for(int i=0; i<4; i++){
            System.out.println("Para-para");
        }
        unsettle();
    }

    public void unsettle(){
        for(int i=0; i<6; i++ ){
            tension[i] = (int)(Math.random()*(3-0))+0;
        }
    }
}

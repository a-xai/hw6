package com.company;

public class Skeletons extends Boss{
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public String printInfo1(){
        return printInfo()+ "\n Magic balls: "+ getArrows();
    }

    public Skeletons(int arrows) {
        this.arrows = arrows;
    }

}

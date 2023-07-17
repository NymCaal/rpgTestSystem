package com.actors;
public class StatSheet {
    int vigor;
    int deftness;
    int savvy;
    int education;
    int luck;

    StatSheet(int vigor, int deftness, int savvy, int education, int luck){
        this.vigor = vigor;
        this.deftness = deftness;
        this.savvy = savvy;
        this.education = education;
        this.luck = luck;
    }

    public int getVigor() {
        return vigor;
    }

    public int getEducation() {
        return education;
    }

    public int getSavvy() {
        return savvy;
    }

    public int getDeftness() {
        return deftness;
    }

    public int getLuck() {
        return luck;
    }
}

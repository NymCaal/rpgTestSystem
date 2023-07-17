package com.actors;

public class StatSheetBuilder
{
    int vigor;
    int deftness;
    int savvy;
    int education;
    int luck;

    public static StatSheetBuilder newBuilder(){
        return new StatSheetBuilder();
    }

    public StatSheetBuilder setVigor(int vigor) {
        this.vigor = vigor;
        return this;
    }

    public int getVigor() {
        return vigor;
    }

    public StatSheetBuilder setDeftness(int deftness) {
        this.deftness = deftness;
        return this;
    }

    public int getDeftness() {
        return deftness;
    }

    public StatSheetBuilder setSavvy(int savvy) {
        this.savvy = savvy;
        return this;
    }

    public int getSavvy() {
        return savvy;
    }

    public StatSheetBuilder setEducation(int education) {
        this.education = education;
        return this;
    }

    public int getEducation() {
        return education;
    }

    public StatSheetBuilder setLuck(int luck) {
        this.luck = luck;
        return this;
    }

    public int getLuck() {
        return luck;
    }

    public StatSheet build(){
        return new StatSheet(vigor, deftness, savvy, education, luck);
    }
}

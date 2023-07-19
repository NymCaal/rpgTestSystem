package com.actors;

public class ResourceBar {

    int current;
    int max;
    ResourceBar(int capacity) {
        current = capacity;
        max = capacity;
    }

    public void reset(){
        current = max;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getCurrent() {
        return current;
    }

    public void increaseCurrent(int value) {
        this.current += value;
        if (this.current >= max) {
            current = max;
        }
    }
    public void decreaseCurrent(int value) {
        this.current -= value;
    }
}

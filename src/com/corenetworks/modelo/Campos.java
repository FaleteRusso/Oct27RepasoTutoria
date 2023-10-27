package com.corenetworks.modelo;

public class Campos {
  private int x;

    public int muestra(){
        return x;
    }
    public void incrementa(){
        x++;
    }

    public Campos() {
    }

    public Campos(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

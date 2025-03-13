package org.example.models;

public class Cafetera {
    private int cantidadCafe;

    public Cafetera(){}

    public Cafetera(int cantidadCafe){
        this.cantidadCafe = cantidadCafe;
    }

    public int getCantidadDeCafe() {
        return cantidadCafe;
    }

    public void setCantidadDeCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public boolean hasCafe(int cantidadCafe){
        if (this.cantidadCafe >= cantidadCafe){
            return true;
        }else {
            return false;
        }
    }

    public int giveCafe(int cantidadCafe){
        return this.cantidadCafe -= cantidadCafe;
    }
}

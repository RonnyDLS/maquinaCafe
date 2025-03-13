package org.example.models;

public class Azucarero {
    private int cantidadDeAzucar;

    public Azucarero(){}
    public Azucarero(int cantidadDeAzucar){
        this.cantidadDeAzucar = cantidadDeAzucar;
    }

    public int getCantidadDeAzucar() {
        return cantidadDeAzucar;
    }

    public void setCantidadDeAzucar(int cantidadDeAzucar) {
        this.cantidadDeAzucar = cantidadDeAzucar;
    }

    public boolean hasAzucar(int cantidadDeAzucar){
        if (this.cantidadDeAzucar >= cantidadDeAzucar){
            return true;
        }else {
            return false;
        }
    }

    public int giveAzucar(int cantidadDeAzucar){
        return this.cantidadDeAzucar -= cantidadDeAzucar;
    }
}

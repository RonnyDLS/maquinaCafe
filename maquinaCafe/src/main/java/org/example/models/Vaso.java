package org.example.models;

public class Vaso {
    private int cantidadVasos;
    private int contenido;
    private String content;
    private String tipo;
    private Azucarero cantidadAzucar;

    public Vaso(){
        this.content = "Café con ";
    }

    public Vaso(int cantidadVasos, int contenido){
        this.cantidadVasos = cantidadVasos;
        this.contenido = contenido;
    }

    public Vaso(String tipo){
        this.tipo = tipo;
        this.content = "Café con ";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCantidadVasos() {
        return cantidadVasos;
    }

    public void setCantidadVasos(int cantidadVasos) {
        this.cantidadVasos = cantidadVasos;
    }

    public String getContent() {
        return content;
    }

    public void setContenido(Azucarero cucharaAzucar) {
        this.content = content +cucharaAzucar.getCantidadDeAzucar()+" cucharadas de azucar";
    }

    public Azucarero getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(Azucarero cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    public boolean hasVasos(int cantidadVasos){
        if (this.cantidadVasos>= cantidadVasos){
            return true;
        }else {
            return false;
        }
    }

    public int giveVasos(int cantidadVasos){
        return this.cantidadVasos -= cantidadVasos;
    }
}

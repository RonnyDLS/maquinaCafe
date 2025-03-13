package org.example.models;

public class MaquinaCafe {

    public Cafetera cafe;
    public Vaso vasoPequeno = new Vaso("Vaso pequeño");
    public Vaso vasoMediano = new Vaso("Vaso mediano");
    public Vaso vasGrande = new Vaso("Vaso grande");
    public Azucarero azuquero;

    public MaquinaCafe(){}

    public Vaso getTipoVaso(int tipoVaso){
        switch (tipoVaso){
            case 1:
                return vasoPequeno;
            case 2:
                return vasoMediano;
            case 3:
                return vasGrande;
            default:
                System.out.println("Opcion incorrecta, seleccione de 1-3");
                return null;
        }
    }

    public Vaso getTipoVaso(String tipoVaso){
        switch (tipoVaso){
            case "pequeno":
                return vasoPequeno;
            case "mediano":
                return vasoMediano;
            case "grande":
                return vasGrande;
            default:
                System.out.println("Opcion incorrecta, seleccione de 1-3");
                return null;
        }
    }

    public Vaso getVasoCafe(Vaso tipoVaso, int cantidadDeVasos, int cantidadDeAzucar){
        Vaso vaso = tipoVaso;
        vaso.setCantidadVasos(cantidadDeVasos);

        this.azuquero = new Azucarero();
        azuquero.setCantidadDeAzucar(cantidadDeAzucar);
        vaso.setContenido(azuquero);

        return vaso;
    }

    public String getVasoDeCafe(Vaso tipoVaso, int cantidadDeVasos, int cantidadDeAzucar){
        Vaso vaso = tipoVaso;

        if (this.cafe.getCantidadDeCafe()!=5 || cantidadDeVasos == 10){
            vaso.setCantidadVasos(vaso.getCantidadVasos() - cantidadDeVasos);

            if(this.azuquero.getCantidadDeAzucar()>= cantidadDeAzucar){
                vaso.setContenido(this.azuquero);
                if (vaso.getCantidadVasos()>= cantidadDeVasos){
                    return "Felicitaciones";
                }else {
                    return "No hay Vasos";
                }
            }else {
                return "No hay Azucar";
            }

        } else {
            return "No hay Cafe";
        }
    }

    public void setCafetera(Cafetera cafetera){
        this.cafe = cafetera;
    }

    public void setVasosPequeno(Vaso vasosPequenos){
        this.vasoPequeno = vasosPequenos;
    }

    public void setVasosMediano(Vaso vasosMedianos){
        this.vasoMediano = vasosMedianos;
    }

    public void setvasosGrande(Vaso vasosGrandes){
        this.vasGrande = vasosGrandes;
    }

    public void setAzucarero(Azucarero azucarero){
        this.azuquero = azucarero;
    }

    public Cafetera getCafe() {
        return cafe;
    }

    public void setCafe(Cafetera cafe) {
        this.cafe = cafe;
    }

    public Vaso getVasoPequeno() {
        return vasoPequeno;
    }

    public void setVasoPequeno(Vaso vasoPequeno) {
        this.vasoPequeno = vasoPequeno;
    }

    public Vaso getVasoMediano() {
        return vasoMediano;
    }

    public void setVasoMediano(Vaso vasoMediano) {
        this.vasoMediano = vasoMediano;
    }

    public Vaso getVasGrande() {
        return vasGrande;
    }

    public void setVasGrande(Vaso vasGrande) {
        this.vasGrande = vasGrande;
    }

    public Azucarero getAzuquero() {
        return azuquero;
    }

    public void setAzuquero(Azucarero azuquero) {
        this.azuquero = azuquero;
    }
}

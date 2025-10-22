package ar.org.centro8.curso.java.TpObjetos.entities;

public final class Bondi extends Vehiculo {

    public Bondi(String color, String marca, String modelo, Double precio) {
        super(color, marca, modelo, precio);
    }

   
    @Override
    public String toString() {
        return "Bondi [ color= " + getColor()+ ", marca= "+ getMarca()+", modelo="+getModelo()+", precio= "+getPrecio()+ ", radio="+getRadio() + "]";
    } 
     
}


package ar.org.centro8.curso.java.TpObjetos.entities;

public class AutoClasico extends Vehiculo {

    public AutoClasico(String color, String marca, String modelo, Double precio) {
        super(color, marca, modelo, precio);
    }

    @Override
    public String toString() {
        return "AutoClasico [ color= " + getColor()+ ", marca= "+ getMarca()+",  modelo="+getModelo()+", precio= "+getPrecio()+ ", radio="+getRadio() + "]";
    } 
     
    
    }

  
    
    

 
    




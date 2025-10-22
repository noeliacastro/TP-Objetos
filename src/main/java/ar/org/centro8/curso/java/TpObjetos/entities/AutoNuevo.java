package ar.org.centro8.curso.java.TpObjetos.entities;

public class AutoNuevo extends Vehiculo {

    public AutoNuevo(String color, String marca, String modelo, Double precio,String marcaRadio, int potencia) {
        super(color, marca, modelo, precio);
        cambiarRadio(marcaRadio,potencia);
        
    }

   

    @Override
    public String toString() {
        return "AutoNuevo [ color= " + getColor()+ ", marca= "+ getMarca()+", modelo="+getModelo()+", precio= "+getPrecio()+ ", radio="+getRadio() + "]";
    } 
     

    
}



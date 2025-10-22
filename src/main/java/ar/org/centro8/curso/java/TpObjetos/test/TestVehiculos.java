package ar.org.centro8.curso.java.TpObjetos.test;

import ar.org.centro8.curso.java.TpObjetos.entities.AutoClasico;
import ar.org.centro8.curso.java.TpObjetos.entities.AutoNuevo;
import ar.org.centro8.curso.java.TpObjetos.entities.Bondi;


public class TestVehiculos {
    public static void main(String[] args) {

        
        //Radio radio1 = new Radio("JBL", 100);

        // Crear Auto Clasico sin radio y luego agregarla
        AutoClasico clasico = new AutoClasico("Rojo", "Ford", "2010", 25000.0);
        
        System.out.println(clasico);

        clasico.cambiarRadio("JBL", 90);
        System.out.println(clasico);

       

        // Crear Auto Nuevo (debe tener radio desde el inicio)
        
        AutoNuevo nuevo = new AutoNuevo("Negro", "Toyota", "2016", null, "Bose", 150);
        System.out.println(nuevo);

        // Crear Bondi sin radio, luego se la agregamos
        Bondi colectivo = new Bondi("Amarillo", "Mercedes", "2018", null);
        
        colectivo.cambiarRadio("Kenwood", 120);
        System.out.println(colectivo);


    }

    
}

package ar.org.centro8.curso.java.TpObjetos.entities;

public abstract class Vehiculo {
    private String color;
    private String marca;
    private String modelo;
    private Double precio; // Puede ser null
    private Radio radio;   // Puede ser null

    public Vehiculo(String color, String marca, String modelo, Double precio) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.radio = null;
    }

    public void cambiarRadio(String marcaRadio,int potencia) {
        this.radio= new Radio(marcaRadio, potencia);
    }

    // Getters
    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public Radio getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return "Vehiculo [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
                + ", radio=" + radio + "]";
    }

    
}

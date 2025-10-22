package ar.org.centro8.curso.java.TpObjetos.entities;

public class Radio {
    private String marcaRadio;
    private int potencia;

    public Radio(String marca, int potencia) {
        this.marcaRadio = marca;
        this.potencia = potencia;

    }

    public String getMarca() {
        return marcaRadio;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return "Radio [marca= " + marcaRadio + ", potencia= " + potencia + "]";
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_juanflores;


public class Portatil extends Consola{
    
    private String tamañoPantalla;
    private int bateria;
    private boolean estuche;

   

    public Portatil(String tamañoPantalla, int bateria, boolean estuche) {
        this.tamañoPantalla = tamañoPantalla;
        this.bateria = bateria;
        this.estuche = estuche;
    }

    public Portatil(String tamañoPantalla, int bateria, boolean estuche, String identificacion, String fabricante, int añosDeUso, double precio, String modelo) {
        super(identificacion, fabricante, añosDeUso, precio, modelo);
        this.tamañoPantalla = tamañoPantalla;
        this.bateria = bateria;
        this.estuche = estuche;
    }

   

    public String getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(String tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public boolean isEstuche() {
        return estuche;
    }

    public void setEstuche(boolean estuche) {
        this.estuche = estuche;
    }

    @Override
    public String toString() {
        return "Portatil{" + "tama\u00f1oPantalla=" + tamañoPantalla + ", bateria=" + bateria + ", estuche=" + estuche + '}';
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_juanflores;

import java.util.ArrayList;


public class Consola {
    
    protected String identificacion;
    protected String fabricante;
    protected int añosDeUso;
    protected double precio;
    private ArrayList<juego> juegos = new ArrayList();
    protected String modelo;

    public Consola() {
    }

    public Consola(String identificacion, String fabricante, int añosDeUso, double precio, String modelo) {
        this.identificacion = identificacion;
        this.fabricante = fabricante;
        this.añosDeUso = añosDeUso;
        this.precio = precio;
        this.modelo = modelo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAñosDeUso() {
        return añosDeUso;
    }

    public void setAñosDeUso(int añosDeUso) {
        this.añosDeUso = añosDeUso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList juegos) {
        this.juegos = juegos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Consola{" + "identificacion=" + identificacion + ", fabricante=" + fabricante + ", a\u00f1osDeUso=" + añosDeUso + ", precio=" + precio + ", juegos=" + juegos + ", modelo=" + modelo + '}';
    }
    
    
    
}

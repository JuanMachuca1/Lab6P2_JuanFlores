/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_juanflores;


public class Estacionaria extends Consola{
    private int controles;
    private int almacenamiento;
    private String conexion;

    public Estacionaria() {
       
    }

    public Estacionaria(int controles, int almacenamiento, String conexion) {
        this.controles = controles;
        this.almacenamiento = almacenamiento;
        this.conexion = conexion;
    }

    public Estacionaria(int controles, int almacenamiento, String conexion, String identificacion, String fabricante, int añosDeUso, double precio, String modelo) {
        super(identificacion, fabricante, añosDeUso, precio, modelo);
        this.controles = controles;
        this.almacenamiento = almacenamiento;
        this.conexion = conexion;
    }

    public int getControles() {
        return controles;
    }

    public void setControles(int controles) {
        this.controles = controles;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    @Override
    public String toString() {
        return "Estacionaria{" + "controles=" + controles + ", almacenamiento=" + almacenamiento + ", conexion=" + conexion + '}';
    }
    
    
    
    
}

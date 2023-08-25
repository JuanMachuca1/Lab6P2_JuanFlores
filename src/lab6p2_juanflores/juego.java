/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_juanflores;

import java.util.Date;


public class juego {
    private String nombre;
    private String descripcion;
    private Date fechaLanzamiento;
    private double precio;
    private String estado;
    private boolean rentado;
    private boolean agregado;
    private int cantDisponibles;

    public juego() {
    }

    public juego(String nombre, String descripcion, Date fechaLanzamiento, double precio, String estado, boolean rentado, boolean agregado, int cantDisponibles) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaLanzamiento = fechaLanzamiento;
        this.precio = precio;
        this.estado = estado;
        this.rentado = rentado;
        this.agregado = agregado;
        this.cantDisponibles = cantDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isRentado() {
        return rentado;
    }

    public void setRentado(boolean rentado) {
        this.rentado = rentado;
    }

    public boolean isAgregado() {
        return agregado;
    }

    public void setAgregado(boolean agregado) {
        this.agregado = agregado;
    }

    public int getCantDisponibles() {
        return cantDisponibles;
    }

    public void setCantDisponibles(int cantDisponibles) {
        this.cantDisponibles = cantDisponibles;
    }

    @Override
    public String toString() {
        return "juego{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", fechaLanzamiento=" + fechaLanzamiento + ", precio=" + precio + ", estado=" + estado + ", rentado=" + rentado + ", agregado=" + agregado + ", cantDisponibles=" + cantDisponibles + '}';
    }
    
    
}

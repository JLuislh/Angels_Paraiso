/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassAngels;

import java.util.Date;

/**
 *
 * @author it
 */
public class Empleado {

    private String codigo;
    private String nombre;
    private String descripcion;
    private Double monto;
    private String fecha;

    // Constructor completo (para la tabla empleados)
    public Empleado(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        
    }

    // Constructor para la otra tabla (sin código ni nombre)
    public Empleado(String descripcion, Double monto, String fecha) {
        this.descripcion = descripcion;
        this.monto = monto;
        this.fecha = fecha;
    }

    // Getters correctos
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getMonto() {
        return monto;
    }

    public String getFecha() {
        return fecha;
    }
}


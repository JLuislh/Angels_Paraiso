/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassAngels;

/**
 *
 * @author it
 */
public class EmpleadoItem {
    private int codigo;
    private String nombre;

    public EmpleadoItem(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    // Esto define lo que se muestra visualmente en el ComboBox
    @Override
    public String toString() {
        return nombre;
    }

    
}

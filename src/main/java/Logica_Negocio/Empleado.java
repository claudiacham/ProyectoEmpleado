/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author jjesi
 */
public class Empleado {
    
   public String nombre;
   public int año_ingreso;
   public String codigo;

    public Empleado() {
    }

    public Empleado(String nombre, String codigo, int año_ingreso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.año_ingreso = año_ingreso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setAño_ingreso(int año_ingreso) {
        this.año_ingreso = año_ingreso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getAño_ingreso() {
        return año_ingreso;
    }
   
    
    
    
    
}

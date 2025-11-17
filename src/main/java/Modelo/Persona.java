/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author juank
 */
public abstract class Persona {
    protected String nombre;
    protected String id;
    
     public Persona(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
     public abstract String getTipoPersona();

    public String getNombre() { return nombre; }
    public String getId() { return id; }
}

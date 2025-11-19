/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author juank
 */
public class Paciente extends Persona {

    private String telefono;

    public Paciente(String nombre, String id, String telefono) {
        super(nombre, id);
        this.telefono = telefono;
    }

    @Override
    public String getTipoPersona() {
        return telefono;   
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author juank
 */
public class Medico extends Persona {

    private String especialidad;

    public Medico(String nombre, String id, String especialidad) {
        super(nombre, id);
        this.especialidad = especialidad;
    }

    @Override
    public String getTipoPersona() {
        return especialidad;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author juank
 */
public class CitaPresencial extends Cita {

    public CitaPresencial(Paciente paciente, Medico medico, String año, String mes, String dia, String hora) {
        super(paciente, medico, año, mes, dia, hora);
    }

    @Override
    public String getTipoCita() {
        return "Presencial";
    }
}

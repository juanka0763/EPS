/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author juank
 */
public class CitaVirtual extends Cita {

    private String enlace;

    public CitaVirtual(Paciente paciente, Medico medico, String año, String mes, String dia, String hora, String enlace) {
        super(paciente, medico, año, mes, dia, hora);
        this.enlace = enlace;
    }

    @Override
    public String getTipoCita() {
        return "Virtual";
    }

    public String getEnlace() { return enlace; }
}

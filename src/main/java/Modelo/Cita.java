/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author juank
 */
public abstract class Cita {
    protected Paciente paciente;
    protected Medico medico;
    protected String fecha;
    protected String hora;

    public Cita(Paciente paciente, Medico medico, String fecha, String hora) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.hora = hora;
    }

    public abstract String getTipoCita(); 

    public Paciente getPaciente() { return paciente; }
    public Medico getMedico() { return medico; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
}

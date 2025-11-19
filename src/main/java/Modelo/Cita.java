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
    protected String año;
    protected String mes;
    protected String dia;
    protected String hora;

    public Cita(Paciente paciente, Medico medico, String año, String mes, String dia, String hora) {
        this.paciente = paciente;
        this.medico = medico;
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
    }

    public abstract String getTipoCita(); 

    public Paciente getPaciente() { return paciente; }
    public Medico getMedico() { return medico; }
    public String getAño() { return año; }
    public String getMes() { return mes; }
    public String getDia() { return dia; }
    public String getHora() { return hora; }
}

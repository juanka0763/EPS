/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cita;
import Modelo.CitaPresencial;
import Modelo.CitaVirtual;
import Modelo.Medico;
import java.util.ArrayList;

/**
 *
 * @author Win10
 */
public class BaseDatos {

    public static ArrayList<Medico> listaMedicos = new ArrayList<>();

    public static ArrayList<Cita> listaCitas = new ArrayList<>();


    public static boolean medicoOcupado(Medico medico, String año, String mes, String dia, String hora) {
        for (Cita cita : listaCitas) {
            if (cita.getMedico().equals(medico) && cita.getAño().equals(año) && cita.getMes().equals(mes) && cita.getDia().equals(dia) && cita.getHora().equals(hora)) {
                return true;
            }
        }
        return false;
    }

}

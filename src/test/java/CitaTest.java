/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Modelo.*;

/**
 *
 * @author juank
 */
public class CitaTest {

    @Test
    public void testCitaPresencial() {

        Paciente p = new Paciente("Carlos", "123", "600000000");
        Medico m = new Medico("Dr. López", "999", "Dermatología");

        Cita cita = new CitaPresencial(p, m, "2025", "10", "21", "08:00");

        assertTrue(cita instanceof Cita);
        assertTrue(cita instanceof CitaPresencial);

        assertEquals("Carlos", cita.getPaciente().getNombre());
        assertEquals("123", cita.getPaciente().getId());
        assertEquals("Dr. López", cita.getMedico().getNombre());
        assertEquals("Dermatología", cita.getMedico().getTipoPersona());

        assertEquals("2025", cita.getAño());
        assertEquals("10", cita.getMes());
        assertEquals("21", cita.getDia());
        assertEquals("08:00", cita.getHora());

        assertEquals("Presencial", cita.getTipoCita());
    }

    @Test
    public void testCitaVirtual() {

        Paciente p = new Paciente("María", "456", "610101010");
        Medico m = new Medico("Dra. Pérez", "888", "Pediatría");

        CitaVirtual cita = new CitaVirtual(p, m, "2025", "12", "01", "14:30", "https://meet.com/123");

        assertTrue(cita instanceof Cita);
        assertTrue(cita instanceof CitaVirtual);

        assertEquals("María", cita.getPaciente().getNombre());
        assertEquals("Dra. Pérez", cita.getMedico().getNombre());

        assertEquals("2025", cita.getAño());
        assertEquals("12", cita.getMes());
        assertEquals("01", cita.getDia());
        assertEquals("14:30", cita.getHora());

        assertEquals("Virtual", cita.getTipoCita());
        assertEquals("https://meet.com/123", cita.getEnlace());
    }

    @Test
    public void testPolimorfismoEntreCitas() {

        Paciente p = new Paciente("Luis", "789", "620202020");
        Medico m = new Medico("Dr. Saenz", "777", "Cardiología");

        Cita cita1 = new CitaPresencial(p, m, "2025", "05", "10", "09:00");
        Cita cita2 = new CitaVirtual(p, m, "2025", "05", "10", "10:00", "http://videollamada.com/luis");

        assertEquals("Presencial", cita1.getTipoCita());
        assertEquals("Virtual", cita2.getTipoCita());
    }
}
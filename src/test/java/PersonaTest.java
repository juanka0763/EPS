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
public class PersonaTest {

    @Test
    public void testPacienteHerenciaYDatos() {
        Paciente p = new Paciente("Carlos Gómez", "12345", "600123789");

      
        assertTrue(p instanceof Persona, "Paciente no extiende de Persona.");

   
        assertEquals("Carlos Gómez", p.getNombre());
        assertEquals("12345", p.getId());

   
        assertEquals("Paciente", p.getTipoPersona());
    }

    @Test
    public void testMedicoHerenciaYDatos() {
        Medico m = new Medico("Dra. Ana Ruiz", "99999", "Cardiología");


        assertTrue(m instanceof Persona, "Medico no extiende de Persona.");

  
        assertEquals("Dra. Ana Ruiz", m.getNombre());
        assertEquals("99999", m.getId());

        assertEquals("Cardiología", m.getTipoPersona());
    }

    @Test
    public void testComparacionPolimorfica() {
        Persona persona1 = new Paciente("Efraín", "111", "50000000");
        Persona persona2 = new Medico("Dra. Elena", "222", "Pediatría");

      
        assertEquals("Paciente", persona1.getTipoPersona());
        assertEquals("Pediatría", persona2.getTipoPersona());
    }
}
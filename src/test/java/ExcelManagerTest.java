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
import java.io.File;
import Modelo.*;
import Controlador.ExcelManager;
/**
 *
 * @author juank
 */
public class ExcelManagerTest {

    @Test
    public void testGuardarCita() {

        // Crear objetos de prueba
        Paciente paciente = new Paciente("Juan Pérez", "12345678A", "600123123");
        Medico medico = new Medico("Dra. Marta López", "99887766B", "Cardiología");

        Cita cita = new CitaPresencial(paciente, medico, "2025-01-20", "10:00");

        ExcelManager excel = new ExcelManager();

        // Guardar cita
        excel.guardarCita(cita);

        // Verificar que el archivo existe
        File archivo = new File("registros_citas.xlsx");
        assertTrue(archivo.exists(), "El archivo Excel no fue creado correctamente.");
    }
}
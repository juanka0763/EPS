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
import Modelo.*;
import Controlador.ExcelManager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelManagerTest {

    private static final String FILE_PATH = "registros_citas.xlsx";

    @BeforeEach
    public void limpiarArchivo() {
        File f = new File(FILE_PATH);
        if (f.exists()) f.delete();
    }

    @Test
    public void testGuardarCita() throws Exception {

        Paciente p = new Paciente("Danna", "12345678A", "600123123");
        Medico m = new Medico("Alejandro", "99887766B", "General");

        Cita cita = new CitaPresencial(p, m, "2025", "05", "30", "16:00");

        ExcelManager excel = new ExcelManager();
        excel.guardarCita(cita);

        File archivo = new File(FILE_PATH);
        assertTrue(archivo.exists(), "El archivo Excel no fue creado.");

        try (FileInputStream input = new FileInputStream(FILE_PATH);
             Workbook workbook = new XSSFWorkbook(input)) {

            Sheet sheet = workbook.getSheet("Citas");
            assertNotNull(sheet, "La hoja 'Citas' no existe.");

            Row row = sheet.getRow(1); 
            assertNotNull(row, "La fila de la cita no fue creada.");

            assertEquals("Danna", row.getCell(0).getStringCellValue());
            assertEquals("12345678A", row.getCell(1).getStringCellValue());
            assertEquals("600123123", row.getCell(2).getStringCellValue());  
            assertEquals("Alejandro", row.getCell(3).getStringCellValue());
            assertEquals("99887766B", row.getCell(4).getStringCellValue());
            assertEquals("General", row.getCell(5).getStringCellValue());
            assertEquals("2025", row.getCell(6).getStringCellValue());
            assertEquals("05", row.getCell(7).getStringCellValue());
            assertEquals("30", row.getCell(8).getStringCellValue());
            assertEquals("16:00", row.getCell(9).getStringCellValue());
            assertEquals("Presencial", row.getCell(10).getStringCellValue());
            assertEquals("-", row.getCell(11).getStringCellValue());
        }
    }
}
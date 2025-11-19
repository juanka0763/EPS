/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author juank
 */
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import Modelo.*;

public class ExcelManager {

    private static final String FILE_PATH = "registros_citas.xlsx";

    public ExcelManager() {
        // Si el archivo no existe, se crea
        inicializarArchivo();
    }

    private void inicializarArchivo() {
        File file = new File(FILE_PATH);

        if (!file.exists()) {
            try (Workbook workbook = new XSSFWorkbook()) {
                Sheet sheet = workbook.createSheet("Citas");

                Row header = sheet.createRow(0);
                header.createCell(0).setCellValue("Paciente");
                header.createCell(1).setCellValue("Id Paciente");
                header.createCell(2).setCellValue("Teléfono Paciente");
                header.createCell(3).setCellValue("Médico");
                header.createCell(4).setCellValue("Id Médico");
                header.createCell(5).setCellValue("Especialidad");
                header.createCell(6).setCellValue("Año");
                header.createCell(7).setCellValue("Mes");
                header.createCell(8).setCellValue("Día");
                header.createCell(9).setCellValue("Hora");
                header.createCell(10).setCellValue("Tipo Cita");
                header.createCell(11).setCellValue("Enlace (si es virtual)");

                try (FileOutputStream out = new FileOutputStream(FILE_PATH)) {
                    workbook.write(out);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void guardarCita(Cita cita) {
        try {
            FileInputStream fileInput = new FileInputStream(FILE_PATH);
            Workbook workbook = new XSSFWorkbook(fileInput);
            Sheet sheet = workbook.getSheet("Citas");

            int lastRow = sheet.getLastRowNum() + 1;
            Row row = sheet.createRow(lastRow);

            row.createCell(0).setCellValue(cita.getPaciente().getNombre());
            row.createCell(1).setCellValue(cita.getPaciente().getId());
            row.createCell(2).setCellValue(cita.getPaciente().getTipoPersona());
            row.createCell(3).setCellValue(cita.getMedico().getNombre());
            row.createCell(4).setCellValue(cita.getMedico().getId());
            row.createCell(5).setCellValue(cita.getMedico().getTipoPersona());
            row.createCell(6).setCellValue(cita.getAño());
            row.createCell(7).setCellValue(cita.getMes());
            row.createCell(8).setCellValue(cita.getDia());
            row.createCell(9).setCellValue(cita.getHora());
            row.createCell(10).setCellValue(cita.getTipoCita()); 

            // Si es una cita virtual, se guarda el enlace
            if (cita instanceof CitaVirtual) {
                CitaVirtual cv = (CitaVirtual) cita;
                row.createCell(11).setCellValue(cv.getEnlace());
            } else {
                row.createCell(11).setCellValue("-");
            }

            fileInput.close();
            FileOutputStream fileOutput = new FileOutputStream(FILE_PATH);
            workbook.write(fileOutput);
            fileOutput.close();
            workbook.close();

            System.out.println("Cita guardada correctamente.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
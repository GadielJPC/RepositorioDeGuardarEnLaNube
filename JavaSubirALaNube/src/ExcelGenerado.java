package com.example.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelGenerado {
	public static void main(String[] args) {

		ArrayList<ExcelEventos> eventos = new ArrayList<>();
		eventos.add(new ExcelEventos("LoveRock", "20/05/2025", "Ifema Madrid",
				"Vente a disfrutar de esta excelente experiencia de rock"));

		for (ExcelEventos evento : eventos) {
			evento.mostrarInformacion();
		}

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Eventos");

		Row headerRow = sheet.createRow(0);
		headerRow.createCell(0).setCellValue("Nombre");
		headerRow.createCell(1).setCellValue("Fecha");
		headerRow.createCell(2).setCellValue("Ubicación");
		headerRow.createCell(3).setCellValue("Descripción");

		int rowNum = 1;
		for (ExcelEventos evento : eventos) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(evento.getNombre());
			row.createCell(1).setCellValue(evento.getFecha());
			row.createCell(2).setCellValue(evento.getUbicacion());
			row.createCell(3).setCellValue(evento.getDescripcion());
		}

		try (FileOutputStream fileOut = new FileOutputStream("Eventos.xlsx")) {
			workbook.write(fileOut);
			System.out.println("Archivo 'Eventos.xlsx' generado correctamente.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

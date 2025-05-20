package com.example.demo;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class pdf_examenfinal {
	public static void main(String[] args) {
		try {

			Document documento = new Document();

			PdfWriter.getInstance(documento, new FileOutputStream("eventoresumen.pdf"));

			documento.open();

			documento.add(new Paragraph("Nombre de evento1: Concierto1" + "Fecha: 20/05/2025"
					+ "Ubicacion: Calle de algun lado" + "Descripcion: alguien canta"));
			documento.add(new Paragraph("Nombre de evento2: Concierto2" + "Fecha: 22/05/2025"
					+ "Ubicacion: Calle de algun lado" + "Descripcion: alguien canta"));
			documento.add(new Paragraph("Nombre de evento3: Concierto3" + "Fecha: 24/05/2025"
					+ "Ubicacion: Calle de algun lado" + "Descripcion: alguien canta"));
			documento.add(new Paragraph("Nombre de evento4: Concierto4" + "Fecha: 26/05/2025"
					+ "Ubicacion: Calle de algun lado" + "Descripcion: alguien canta"));

			documento.close();

			System.out.println("PDF creado exitosamente!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

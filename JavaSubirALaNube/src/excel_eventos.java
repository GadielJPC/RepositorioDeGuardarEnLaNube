package com.example.demo;

public class ExcelEventos {

	private String nombre;
	private String fecha;
	private String ubicacion;
	private String descripcion;

	public ExcelEventos(String nombre, String fecha, String ubicacion, String descripcion) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.ubicacion = ubicacion;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha: " + fecha);
		System.out.println("Ubicación: " + ubicacion);
		System.out.println("Descripción: " + descripcion);
		System.out.println("-------------------------------------------------------");
	}
}

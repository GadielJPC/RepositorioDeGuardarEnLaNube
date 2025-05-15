package Jframe_netflix;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminMenuFrame extends JFrame {

	public AdminMenuFrame() {
		// Configuración de la ventana
		setTitle("Menú de Administrador");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Panel del menú
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 1));

		// Botones de opciones
		JButton btnAddSeries = new JButton("Añadir Serie");
		JButton btnAddMovie = new JButton("Añadir Película");
		JButton btnAddGame = new JButton("Añadir Juego");
		JButton btnListSeries = new JButton("Listar Series");
		JButton btnListMovies = new JButton("Listar Películas");

		// Agregar botones al panel
		panel.add(btnAddSeries);
		panel.add(btnAddMovie);
		panel.add(btnAddGame);
		panel.add(btnListSeries);
		panel.add(btnListMovies);

		// Agregar algunos datos para las series, películas y juegos
		btnListSeries.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Muestra las series almacenadas
				JOptionPane.showMessageDialog(null,
						"Series disponibles:\n" + "1. Breaking Bad - Temporada 1 - 13 episodios\n"
								+ "2. Stranger Things - Temporada 1 - 8 episodios");
			}
		});

		btnListMovies.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Muestra las películas almacenadas
				JOptionPane.showMessageDialog(null, "Películas disponibles:\n"
						+ "1. Inception - Género: Ciencia ficción\n" + "2. The Matrix - Género: Ciencia ficción");
			}
		});

		// Acción de los botones
		btnAddSeries.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Lógica para añadir una nueva serie
				JOptionPane.showMessageDialog(null, "Añadir nueva serie.");
			}
		});

		btnAddMovie.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Lógica para añadir una nueva película
				JOptionPane.showMessageDialog(null, "Añadir nueva película.");
			}
		});

		btnAddGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Lógica para añadir un nuevo juego
				JOptionPane.showMessageDialog(null, "Añadir nuevo juego.");
			}
		});

		// Agregar el panel al JFrame
		add(panel);
	}
}
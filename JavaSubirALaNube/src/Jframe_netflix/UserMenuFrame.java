
package Jframe_netflix;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserMenuFrame extends JFrame {

	public UserMenuFrame() {
		// Configuración de la ventana
		setTitle("Menú de Usuario");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Panel del menú
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 1));

		// Botones de opciones
		JButton btnViewSeries = new JButton("Ver Series");
		JButton btnViewMovies = new JButton("Ver Películas");
		JButton btnViewGames = new JButton("Ver Juegos");

		// Agregar botones al panel
		panel.add(btnViewSeries);
		panel.add(btnViewMovies);
		panel.add(btnViewGames);

		// Acción de los botones
		btnViewSeries.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Muestra las series disponibles
				JOptionPane.showMessageDialog(null,
						"Series disponibles:\n" + "1. Breaking Bad - Temporada 1 - 13 episodios\n"
								+ "2. Stranger Things - Temporada 1 - 8 episodios");
			}
		});

		btnViewMovies.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Muestra las películas disponibles
				JOptionPane.showMessageDialog(null, "Películas disponibles:\n"
						+ "1. Inception - Género: Ciencia ficción\n" + "2. The Matrix - Género: Ciencia ficción");
			}
		});

		btnViewGames.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Muestra los juegos disponibles
				JOptionPane.showMessageDialog(null, "Juegos disponibles:\n"
						+ "1. The Last of Us - Género: Acción-Aventura\n" + "2. God of War - Género: Acción");
			}
		});

		// Agregar el panel al JFrame
		add(panel);
	}
}
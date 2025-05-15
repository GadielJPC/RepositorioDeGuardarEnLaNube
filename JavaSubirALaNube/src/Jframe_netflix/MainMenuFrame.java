package Jframe_netflix;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuFrame extends JFrame {

	private boolean isAdmin;

	public MainMenuFrame(String usuario, boolean isAdmin) {
		this.isAdmin = isAdmin;

		// Configuración de la ventana
		setTitle("Menú Principal");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Panel del menú
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 1));

		// Mensaje de bienvenida
		JLabel bienvenidaLabel = new JLabel("Bienvenido, " + usuario, JLabel.CENTER);
		panel.add(bienvenidaLabel);

		// Botones de opciones
		JButton btnAdmin = new JButton("Acceder como Administrador");
		JButton btnUser = new JButton("Acceder como Usuario");

		// Agregar botones al panel
		panel.add(btnAdmin);
		panel.add(btnUser);

		// Acción de los botones
		btnAdmin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isAdmin) {
					// Abre el menú de administrador
					new AdminMenuFrame().setVisible(true);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "No tienes permisos de administrador.", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnUser.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Abre el menú de usuario
				new UserMenuFrame().setVisible(true);
				dispose();
			}
		});

		// Agregar el panel al JFrame
		add(panel);
	}
}

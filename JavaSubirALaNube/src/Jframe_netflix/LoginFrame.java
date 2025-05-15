package Jframe_netflix;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {

	private JTextField usuarioTextField;
	private JPasswordField passwordField;
	private JButton btnLogin;

	// Datos de usuarios
	private final String ADMIN_USER = "admin";
	private final String ADMIN_PASS = "admin123";
	private final String USER_USER = "user";
	private final String USER_PASS = "user123";

	public LoginFrame() {
		// Configuración de la ventana
		setTitle("Iniciar Sesión");
		setSize(400, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Panel de login
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));

		// Etiquetas y campos de texto
		JLabel usuarioLabel = new JLabel("Usuario:");
		usuarioTextField = new JTextField();
		JLabel passwordLabel = new JLabel("Contraseña:");
		passwordField = new JPasswordField();
		btnLogin = new JButton("Iniciar Sesión");

		// Agregar componentes al panel
		panel.add(usuarioLabel);
		panel.add(usuarioTextField);
		panel.add(passwordLabel);
		panel.add(passwordField);
		panel.add(new JLabel()); // Espacio vacío
		panel.add(btnLogin);

		// Agregar el panel al JFrame
		add(panel);

		// Acción de login
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String usuario = usuarioTextField.getText();
				String contraseña = new String(passwordField.getPassword());

				if (login(usuario, contraseña)) {
					JOptionPane.showMessageDialog(null, "¡Bienvenido!");
					// Abre el menú según el rol
					if (usuario.equals(ADMIN_USER)) {
						new MainMenuFrame(usuario, true).setVisible(true); // Admin
					} else {
						new MainMenuFrame(usuario, false).setVisible(true); // User
					}
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Credenciales incorrectas.", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}

	private boolean login(String usuario, String contraseña) {
		// Verificar usuario y contraseña
		return (ADMIN_USER.equals(usuario) && ADMIN_PASS.equals(contraseña))
				|| (USER_USER.equals(usuario) && USER_PASS.equals(contraseña));
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new LoginFrame().setVisible(true);
			}
		});
	}
}
package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class boxlayout extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					boxlayout frame = new boxlayout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public boxlayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel = new JLabel("Selecciona tu comida favorita");
		contentPane.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("pizza");
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("hamburguesa");
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("sushi");
		contentPane.add(chckbxNewCheckBox_2);
		
		JButton btnNewButton = new JButton("enviar seleccion");
		contentPane.add(btnNewButton);
	}

}

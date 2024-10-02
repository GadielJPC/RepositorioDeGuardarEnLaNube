package Interfaces;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane; // Asegúrate de importar JOptionPane
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dniquemuestrelaletra extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    dniquemuestrelaletra frame = new dniquemuestrelaletra();
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
    public dniquemuestrelaletra() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblDni = new JLabel("DNI");
        lblDni.setBounds(23, 46, 56, 27);
        contentPane.add(lblDni);
        
        textField = new JTextField();
        textField.setBounds(50, 50, 96, 19);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JButton btnNewButton = new JButton("Aceptar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dniText = textField.getText();
                
                // Validar si el campo está vacío
                if (dniText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "El DNI está vacío.");
                    return;
                }
                
                // Validar que el campo tenga solo números y que su longitud sea de 8 caracteres
                if (dniText.length() != 8 || !dniText.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un DNI válido de 8 dígitos.");
                    return;
                }
                
                // Calcular la letra del DNI utilizando el módulo 23
                int dniNumero = Integer.parseInt(dniText);
                char letra = calcularLetraDNI(dniNumero);
                
                // Mostrar la letra calculada
                JOptionPane.showMessageDialog(null, "La letra correspondiente al DNI " + dniText + " es: " + letra);
            }
        });
        btnNewButton.setBounds(156, 49, 85, 21);
        contentPane.add(btnNewButton);
    }

    // Método para calcular la letra del DNI
    private char calcularLetraDNI(int dniNumero) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = dniNumero % 23;
        return letras[resto];
    }
}
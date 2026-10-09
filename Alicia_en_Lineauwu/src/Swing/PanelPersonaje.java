package Swing;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PanelPersonaje extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldLocura;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PanelPersonaje() {
		setBackground(new Color(0, 191, 255));
		setBounds(100, 100, 500, 500);
		setLayout(null);
		
		JLabel textolocura = new JLabel("Ingresar Locura");
		textolocura.setHorizontalAlignment(SwingConstants.CENTER);
		textolocura.setBounds(-27, 75, 151, 36);
		add(textolocura);
		
		textFieldLocura = new JTextField();
		textFieldLocura.setBounds(106, 83, 86, 20);
		add(textFieldLocura);
		textFieldLocura.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ingresar Belleza");
		lblNewLabel.setBounds(10, 100, 112, 44);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(106, 112, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Personaje");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(205, 11, 86, 36);
		add(lblNewLabel_1);

	}
}

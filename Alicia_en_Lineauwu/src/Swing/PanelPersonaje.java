package Swing;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelPersonaje extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldLocura;

	/**
	 * Create the panel.
	 */
	public PanelPersonaje() {
		setBackground(new Color(0, 191, 255));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingresar Locura");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(-11, -15, 134, 113);
		add(lblNewLabel);
		
		textFieldLocura = new JTextField();
		textFieldLocura.setBounds(106, 31, 86, 20);
		add(textFieldLocura);
		textFieldLocura.setColumns(10);

	}
}

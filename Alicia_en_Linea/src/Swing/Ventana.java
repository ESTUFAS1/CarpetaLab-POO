package Swing;
import Modelo.Personaje;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int cantidadsecretos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 102, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Barra
		JProgressBar BarraLocura = new JProgressBar();
		BarraLocura.setToolTipText("");
		BarraLocura.setMaximum(100);
		BarraLocura.setMinimum(0);
		BarraLocura.setValue(0);
		BarraLocura.setBounds(124, 80, 459, 71);
		contentPane.add(BarraLocura);
		
		JLabel TextoAlicia = new JLabel("Alicia");
		TextoAlicia.setBounds(330, 11, 81, 38);
		TextoAlicia.setFont(new Font("Constantia", Font.BOLD, 30));
		contentPane.add(TextoAlicia);
		
		JButton BotonBelleza = new JButton("Embellecer");
		BotonBelleza.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valorActual = BarraLocura.getValue();
				int valorNuevo = valorActual += 10;
				BarraLocura.setValue(valorNuevo);

			}
		});
		BotonBelleza.setFont(new Font("Constantia", Font.BOLD, 16));
		BotonBelleza.setBounds(57, 245, 127, 64);
		contentPane.add(BotonBelleza);
	}
}

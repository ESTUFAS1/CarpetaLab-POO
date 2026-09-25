package Swing;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Logitech.Persona;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Ventana extends JFrame {
	
	private Persona persona;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		Persona persona = new Persona(100, 0);
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setBackground(Color.RED);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 670);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Juanito");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Georgia", Font.ITALIC, 46));
		lblNewLabel.setBounds(372, 24, 204, 59);
		contentPane.add(lblNewLabel);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setMaximum(100);
		progressBar.setMinimum(0);
		progressBar.setValue(0);
		progressBar.addChangeListener(new ChangeListener() {
			
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		progressBar.setBounds(21, 142, 655, 59);
		contentPane.add(progressBar);
		
		JButton btnNewButton = new JButton("si\r\n");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnNewButton.setBounds(35, 293, 123, 59);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("no\r\n");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton_1.setBounds(251, 293, 123, 59);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("¿Esta sheno?");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel_1.setBounds(46, 236, 283, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("mi panza...");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel_2.setBounds(279, 94, 188, 31);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Crecer\r\n");
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton_2.setEnabled(false);
				
				int aumentarPanza = progressBar.getValue();
				int toychocho = persona.getCapacidadestomago();//hola mundo
				if(aumentarPanza == progressBar.getMaximum()) {
					toychocho = progressBar.getMaximum();
					toychocho += 50;
				
				}
								
			}
		});
		btnNewButton_2.setBounds(35, 467, 130, 52);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Digerir\r\n");
		btnNewButton_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				progressBar.setValue(0);
				btnNewButton_2.setEnabled(true);
				persona.getCantidadingerida();
			}
		});
		btnNewButton_2_1.setBounds(35, 530, 130, 52);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3 = new JButton("Tragar");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valorActual = progressBar.getValue();
				int valorNuevo = valorActual += 10;
				if(valorNuevo <= progressBar.getMaximum()) {
					progressBar.setValue(valorNuevo);
				}
			}
			
		});
		btnNewButton_3.setBounds(35, 393, 130, 62);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\estudiante\\Downloads\\juan.png"));
		lblNewLabel_3.setBounds(493, 212, 441, 419);
		contentPane.add(lblNewLabel_3);
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
}

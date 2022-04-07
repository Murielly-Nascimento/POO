package Visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Estatisticas extends JFrame {
	
	//ATRIBUTOS
	private JPanel contentPane;
	JTextField barraVida;
	JTextField barraInimigos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estatisticas frame = new Estatisticas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame without arguments
	 */
	public Estatisticas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		barraVida = new JTextField();
		barraVida.setBounds(159, 25, 114, 19);
		contentPane.add(barraVida);
		barraVida.setColumns(10);
		
		barraInimigos = new JTextField();
		barraInimigos.setBounds(159, 63, 114, 19);
		contentPane.add(barraInimigos);
		barraInimigos.setColumns(10);
		
		JLabel vida = new JLabel("Vida");
		vida.setBounds(65, 27, 70, 15);
		contentPane.add(vida);
		
		JLabel inimigos = new JLabel("Inimigos");
		inimigos.setBounds(65, 65, 70, 15);
		contentPane.add(inimigos);
	}
	
	/**
	 * Create the frame with arguments
	 */
	public Estatisticas(String str, String str2) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		barraVida = new JTextField(str);
		barraVida.setBounds(159, 25, 114, 19);
		contentPane.add(barraVida);
		barraVida.setColumns(10);
		barraVida.setEditable(false);
		
		barraInimigos = new JTextField(str2);
		barraInimigos.setBounds(159, 63, 114, 19);
		contentPane.add(barraInimigos);
		barraInimigos.setColumns(10);
		barraInimigos.setEditable(false);
		
		JLabel vida = new JLabel("Vida");
		vida.setBounds(65, 27, 70, 15);
		contentPane.add(vida);
		
		JLabel inimigos = new JLabel("Inimigos");
		inimigos.setBounds(65, 65, 70, 15);
		contentPane.add(inimigos);
	}
	
	//Método responsável por atualizar a vida do personagem e a quantidade de inimigos.
	public void atualiza(String str, String str2) {
		barraVida.setText(str);
		barraInimigos.setText(str2);
	}
}


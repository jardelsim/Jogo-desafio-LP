package com.jems.jdlp.tela;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import com.jems.jdlp.jogo.Jogo;

import java.awt.Component;

public class Home {

	private JFrame frmNumeroAleatorio;
	private Jogo jogo = new Jogo();
	private int numeroSorteado;
	private int numUsuario;
	private JTextField textFieldNumeroUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frmNumeroAleatorio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
		// numeroSorteado recebe num aleatorio na inicializaçao do app
		this.numeroSorteado = Jogo.sortearNum();
		// manter foco no textFieldNumeroUsuario
		this.textFieldNumeroUsuario.requestFocus();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNumeroAleatorio = new JFrame();
		frmNumeroAleatorio.setResizable(false);
		frmNumeroAleatorio.setForeground(new Color(0, 0, 255));
		frmNumeroAleatorio.setFont(new Font("Arimo", Font.PLAIN, 20));
		frmNumeroAleatorio.setTitle("NUM ALEATORIO");
		frmNumeroAleatorio.setType(Type.UTILITY);
		frmNumeroAleatorio.getContentPane().setBackground(new Color(255, 255, 255));
		frmNumeroAleatorio.setBounds(100, 100, 195, 262);
		frmNumeroAleatorio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNumeroAleatorio.getContentPane().setLayout(null);
		
		JLabel JLabelPalpite = new JLabel("Digite seu Palpite");
		JLabelPalpite.setHorizontalAlignment(SwingConstants.CENTER);
		JLabelPalpite.setHorizontalTextPosition(SwingConstants.CENTER);
		JLabelPalpite.setForeground(Color.BLUE);
		JLabelPalpite.setFont(new Font("Cambria", Font.PLAIN, 15));
		JLabelPalpite.setBounds(10, 11, 169, 19);
		frmNumeroAleatorio.getContentPane().add(JLabelPalpite);

		JLabel JlabelTentaivas = new JLabel("");
		JlabelTentaivas.setHorizontalAlignment(SwingConstants.CENTER);
		JlabelTentaivas.setHorizontalTextPosition(SwingConstants.CENTER);
		JlabelTentaivas.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tentativas", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 255)));
		JlabelTentaivas.setForeground(Color.BLUE);
		JlabelTentaivas.setFont(new Font("Cambria", Font.PLAIN, 20));
		JlabelTentaivas.setBounds(10, 32, 81, 37);
		frmNumeroAleatorio.getContentPane().add(JlabelTentaivas);

		JLabel JlabelDica = new JLabel("");
		JlabelDica.setHorizontalAlignment(SwingConstants.CENTER);
		JlabelDica.setHorizontalTextPosition(SwingConstants.CENTER);
		JlabelDica.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Dica", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 255)));
		JlabelDica.setForeground(Color.BLUE);
		JlabelDica.setFont(new Font("Cambria", Font.PLAIN, 20));
		JlabelDica.setBounds(98, 32, 81, 37);
		frmNumeroAleatorio.getContentPane().add(JlabelDica);

		JLabel JlabelUltimoNumero = new JLabel("");
		JlabelUltimoNumero.setHorizontalAlignment(SwingConstants.CENTER);
		JlabelUltimoNumero.setHorizontalTextPosition(SwingConstants.CENTER);
		JlabelUltimoNumero.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ultimo", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 255)));
		JlabelUltimoNumero.setForeground(Color.BLUE);
		JlabelUltimoNumero.setFont(new Font("Cambria", Font.PLAIN, 18));
		JlabelUltimoNumero.setBounds(10, 66, 81, 37);
		frmNumeroAleatorio.getContentPane().add(JlabelUltimoNumero);

		textFieldNumeroUsuario = new JTextField();
		textFieldNumeroUsuario.setBackground(Color.WHITE);
		textFieldNumeroUsuario.setForeground(Color.BLUE);
		textFieldNumeroUsuario.setToolTipText("digite palpite");
		textFieldNumeroUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNumeroUsuario.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Palpites", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(0, 0, 255)));
		textFieldNumeroUsuario.setFont(new Font("Cambria", Font.PLAIN, 20));
		textFieldNumeroUsuario.setBounds(98, 66, 81, 37);
		frmNumeroAleatorio.getContentPane().add(textFieldNumeroUsuario);
		textFieldNumeroUsuario.setColumns(10);

		JTextPane txtpnTenteAcerta = new JTextPane();
		txtpnTenteAcerta.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		txtpnTenteAcerta.setAlignmentX(Component.RIGHT_ALIGNMENT);
		txtpnTenteAcerta.setEnabled(false);
		txtpnTenteAcerta.setBorder(UIManager.getBorder("TextArea.border"));
		txtpnTenteAcerta.setEditable(false);
		txtpnTenteAcerta.setForeground(Color.BLUE);
		txtpnTenteAcerta.setFont(new Font("Cambria", Font.PLAIN, 14));
		txtpnTenteAcerta
				.setText("Tente acerta o numero sorteado entre 1 e 100  digitando seu palpite e clicando em jogar ");
		txtpnTenteAcerta.setBounds(10, 107, 169, 78);
		frmNumeroAleatorio.getContentPane().add(txtpnTenteAcerta);

		JButton btnJogar = new JButton("Jogar");
		btnJogar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// numUsuario recebe num usuario
				numUsuario = Integer.parseInt(textFieldNumeroUsuario.getText());
				// chama verifica num, incrementa tentativas e lança feedback
				jogo.verificarNum(numeroSorteado, numUsuario, JlabelTentaivas, JlabelDica, JlabelUltimoNumero,
						JLabelPalpite);
				textFieldNumeroUsuario.setText("");
				// dica teste
				JLabelPalpite.setToolTipText("sorteado= " + numeroSorteado);
				// manter foco no textFieldNumeroUsuario
				textFieldNumeroUsuario.requestFocus();
			}
		});

		btnJogar.setIcon(null);
		btnJogar.setBorder(UIManager.getBorder("Button.border"));
		btnJogar.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnJogar.setForeground(new Color(0, 0, 255));
		btnJogar.setBackground(new Color(255, 255, 255));
		btnJogar.setBounds(94, 188, 85, 37);
		frmNumeroAleatorio.getContentPane().add(btnJogar);

		JButton btnNovoJogo = new JButton("Novo");
		btnNovoJogo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// novo jogo reseta tentativas e feedbacks e sorteia novo numero
				jogo.setTentativas(0);
				numeroSorteado = Jogo.sortearNum();
				textFieldNumeroUsuario.setText("");
				textFieldNumeroUsuario.requestFocus();
				JLabelPalpite.setText("Digite seu Palpite");
				JLabelPalpite.setToolTipText("sorteado= " + numeroSorteado);
				JlabelTentaivas.setText("");
				JlabelDica.setText("");
				JlabelUltimoNumero.setText("");
			}
		});
		btnNovoJogo.setForeground(Color.BLUE);
		btnNovoJogo.setFont(new Font("Cambria", Font.PLAIN, 20));
		btnNovoJogo.setBorder(UIManager.getBorder("Button.border"));
		btnNovoJogo.setBackground(Color.WHITE);
		btnNovoJogo.setBounds(10, 188, 85, 37);
		frmNumeroAleatorio.getContentPane().add(btnNovoJogo);
	}
}

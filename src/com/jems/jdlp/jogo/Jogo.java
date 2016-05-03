/**
 * 
 */
package com.jems.jdlp.jogo;

import java.awt.Color;
import java.util.Random;

import javax.swing.JLabel;

/**
 * @author jardel
 *@version 1.0
 */
public class Jogo {
	private static Random r;
	private  int tentativas;

	// metodo retorna um inteiro entre 1 e 100
	public static int sortearNum() {
		r = new Random();
		return r.nextInt(101);
	}
    // metodo verifica num, incrementa tentativas e lança feedback
	public void verificarNum(int numeroSorteado, int numeroUsuario, JLabel tentativas , JLabel dica, JLabel ultimoNumero, JLabel palpite) {
		ultimoNumero.setText(" "+numeroUsuario);
		if (numeroSorteado == numeroUsuario) {
			palpite.setText("Parabens vc acertou");
			tentativas.setForeground(new Color(0, 255,0));
			dica.setText("Num: "+numeroSorteado);
			this.tentativas++;
			tentativas.setText(" "+this.tentativas);
		} else {
			palpite.setText("Tente novamente");
			this.tentativas++;
			tentativas.setText(" "+this.tentativas);
			if (numeroSorteado < numeroUsuario) {
				dica.setText(" Menor");
				dica.setForeground(new Color(0, 255,0));
			} else {
				dica.setText(" Maior");
				dica.setForeground(new Color( 255,0,0));
			}
		}
	}

	public int getTentativas() {
		return tentativas;
	}

	public void setTentativas(int tentativas) {
		this.tentativas = tentativas;
	}
}
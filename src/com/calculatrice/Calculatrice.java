package com.calculatrice;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Calculatrice extends JFrame {
	private JPanel conteneur = new JPanel();
	private JLabel ecran = new JLabel("OH");
	
	
	public Calculatrice() {
		this.setTitle("Calculatrice");
		this.setSize(300,350);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(ecran);
		
		this.setVisible(true);
	}

}

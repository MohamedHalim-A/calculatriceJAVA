package com.calculatrice;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Calculatrice extends JFrame {
	private JPanel conteneur = new JPanel();
	private JLabel ecran = new JLabel("OH");
	private String[] table = {"0","1","2","3","4","5","6","7","8","9","C","+","-","*","/","="};
	private String valeur="";
	private JButton[] bouton;
	
	
	public Calculatrice() {
		this.setTitle("Calculatrice");
		this.setSize(300,350);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		conteneur.add(ecran);
		this.setContentPane(conteneur);
		//implement();
		this.setVisible(true);
	}
	public void implement() {
		for (int i=0; i<table.length; i++) {
			bouton[i]= new JButton(table[i]);
		}
	}

}

package ventana;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;	


public class Ventana extends JFrame {
	public Ventana() {
		setSize(500,500);
		setLocationRelativeTo(null);
		setTitle("Mi primera ventana");
		iniciarComponentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	private void iniciarComponentes() {
		JPanel panel = new JPanel();
		//panel.setBackground(Color.BLUE);
		panel.setLayout(null);
		this.getContentPane().add(panel);
		
		JLabel etiqueta = new JLabel("Hola");
		etiqueta.setBounds(10,10,30,20);
		panel.add(etiqueta);
		
	}

}

package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import java.awt.Dimension;
import java.awt.Color;

public class Fahrenheit_Celsius extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	private JLabel jLFahrenheit;
	private JTextField jTFFahrenheit;
	private JLabel jLCelsius;
	private JTextField jTFCelsius;
	private JButton jBtnEnde;
	private JButton jBtnUmrechnen;
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Fahrenheit_Celsius inst = new Fahrenheit_Celsius();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	public Fahrenheit_Celsius() {
		super();
		setPreferredSize(new Dimension(367, 152));
		initGUI();
	}
	private void initGUI() {
		try {
			getContentPane().setLayout(null);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Umrechnung Fahrenheit in Celsius");
			{
				jLFahrenheit = new JLabel();
				getContentPane().add(jLFahrenheit);
				jLFahrenheit.setText("Grad Fahrenheit");
				jLFahrenheit.setBounds(12, 12, 111, 14);
			}
			{
				jTFFahrenheit = new JTextField();
				getContentPane().add(jTFFahrenheit);
				jTFFahrenheit.setBounds(12, 32, 182, 21);
				jTFFahrenheit.addKeyListener(new KeyAdapter() {
					public void keyPressed(KeyEvent evt) {
						jTFFahrenheitKeyPressed(evt);
					}
				});
			}
			{
				jLCelsius = new JLabel();
				getContentPane().add(jLCelsius);
				jLCelsius.setText("Grad Celsius");
				jLCelsius.setBounds(12, 65, 111, 14);
			}
			{
				jTFCelsius = new JTextField();
				jTFCelsius.setBackground(new Color(204, 255, 204));
				getContentPane().add(jTFCelsius);
				jTFCelsius.setBounds(12, 85, 187, 21);
			}
			{
				jBtnUmrechnen = new JButton();
				getContentPane().add(jBtnUmrechnen);
				jBtnUmrechnen.setText("Umrechnen");
				jBtnUmrechnen.setBounds(233, 32, 115, 21);
				jBtnUmrechnen.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jBtnUmrechnenActionPerformed(evt);
					}
				});
			}
			{
				jBtnEnde = new JButton();
				getContentPane().add(jBtnEnde);
				jBtnEnde.setText("Ende");
				jBtnEnde.setBounds(233, 85, 115, 21);
				jBtnEnde.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jBtnEndeActionPerformed(evt);
					}
				});
			}
			pack();
			this.setSize(367, 152);
		} catch (Exception e) {
			// add your error handling code here
			e.printStackTrace();
		}
	}
	private void jBtnUmrechnenActionPerformed(ActionEvent evt) {
		umrechnen();
	}
	private void jBtnEndeActionPerformed(ActionEvent evt) {
		System.exit(0);
	}
	private void jTFFahrenheitKeyPressed(KeyEvent evt) {
		if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
			umrechnen();
		}
	}
	private void umrechnen() {
		double tf, tc;
		tf = Double.parseDouble(jTFFahrenheit.getText());
		tc = (tf - 32) * 5 / 9;
		DecimalFormat f = new DecimalFormat("#0.00");
		jTFCelsius.setText(f.format(tc));
		jTFFahrenheit.requestFocus();
		jTFFahrenheit.selectAll();
	}
}

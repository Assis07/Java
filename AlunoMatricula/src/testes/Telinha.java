package testes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import java.awt.GridBagConstraints;
import java.awt.List;
import java.awt.Button;
import java.awt.Checkbox;
import javax.swing.JLayeredPane;
import java.awt.Label;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Telinha extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telinha frame = new Telinha();
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
	public Telinha() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInsiraSeuNome = new JLabel("Insira seu nome");
		lblInsiraSeuNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInsiraSeuNome.setBounds(23, 11, 165, 23);
		contentPane.add(lblInsiraSeuNome);
		
		textField = new JTextField();
		textField.setBounds(23, 34, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Nome: "+textField.getText());
			}
		});
		btnOk.setBounds(210, 11, 139, 92);
		contentPane.add(btnOk);
		
		JButton button = new JButton("OK");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			textField.setText("");
			}
		});
		button.setBounds(210, 123, 139, 92);
		contentPane.add(button);
	}
}

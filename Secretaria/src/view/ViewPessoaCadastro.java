package view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ViewPessoaCadastro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Nome;
	private JTextField Idade;
	@SuppressWarnings({ "rawtypes", "unused" })
	private JComboBox comboBoxSexo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPessoaCadastro frame = new ViewPessoaCadastro();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ViewPessoaCadastro() {
		setTitle("Cadastro de Usu\u00E1rio");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 447, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(10, 38, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSexo.setBounds(10, 94, 46, 14);
		contentPane.add(lblSexo);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Arial", Font.PLAIN, 14));
		lblIdade.setBounds(10, 165, 46, 14);
		contentPane.add(lblIdade);
		
		Nome = new JTextField();
		Nome.setBounds(10, 63, 400, 20);
		contentPane.add(Nome);
		Nome.setColumns(10);
		
		Idade = new JTextField();
		Idade.setBounds(10, 190, 400, 20);
		contentPane.add(Idade);
		Idade.setColumns(10);
		
		JButton btnConfirmar = new JButton("Cadastrar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cadastrar();
			}
		});
		btnConfirmar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnConfirmar.setBounds(190, 237, 112, 23);
		contentPane.add(btnConfirmar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpar();
			}
		});
		btnLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLimpar.setBounds(324, 237, 89, 23);
		contentPane.add(btnLimpar);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 32, 421, 7);
		contentPane.add(separator);
		
		JLabel lblCadastroDeUsurios = new JLabel("Cadastro de Usu\u00E1rios");
		lblCadastroDeUsurios.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeUsurios.setFont(new Font("Arial", Font.BOLD, 16));
		lblCadastroDeUsurios.setBounds(125, 11, 177, 19);
		contentPane.add(lblCadastroDeUsurios);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino"}));
		comboBox.setBounds(10, 123, 118, 20);
		contentPane.add(comboBox);
		
		setLocationRelativeTo(null);
	}
	
	public void limpar() {
		Nome.setText("");
		Idade.setText("");
	}
	
	public void cadastrar() {
		// chamar a açao do botão
		
		// pegar os dados dos 3 campos
		
		//imprimir no console
		
	}
}

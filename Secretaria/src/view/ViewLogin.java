package view;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Email;
	private JPasswordField Senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin frame = new ViewLogin();
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
	public ViewLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Secretaria - Login");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ViewLogin.class.getResource("/imagens/pngwing.com.png")));
		setBounds(100, 100, 867, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Login de Usu\u00E1rio:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(10, 24, 177, 23);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 9, 822, 48);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 58, 822, 2);
		contentPane.add(separator_1);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 15));
		lblEmail.setBounds(10, 71, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblA = new JLabel("Senha:");
		lblA.setFont(new Font("Arial", Font.PLAIN, 15));
		lblA.setBounds(10, 140, 46, 14);
		contentPane.add(lblA);
		
		Email = new JTextField();
		Email.setFont(new Font("Arial", Font.PLAIN, 15));
		Email.setColumns(10);
		Email.setBounds(10, 96, 393, 20);
		contentPane.add(Email);
		
		Senha = new JPasswordField();
		Senha.setFont(new Font("Arial", Font.PLAIN, 15));
		Senha.setColumns(10);
		Senha.setBounds(10, 165, 393, 20);
		contentPane.add(Senha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.println("Clicou no entrar");
				validaLogin();
				
			}
		});
		btnEntrar.setBounds(431, 165, 102, 23);
		contentPane.add(btnEntrar);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setForeground(Color.BLUE);
		panel.setBounds(0, 265, 861, 111);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("AOBA - TUDO B\u00C3O");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 38));
		lblNewLabel_2.setBounds(200, 30, 560, 52);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(ViewLogin.class.getResource("/imagens/pngwing.com.png")));
		lblNewLabel.setBounds(393, 58, 439, 201);
		contentPane.add(lblNewLabel);
		
		setLocationRelativeTo(null);
	}
	
	@SuppressWarnings("deprecation")
	private void validaLogin() {
		// dados ficticios para testar login
		String email = "tiozeca@gmail.com";
		String senha = "1234legal";
		
		if(email.equals(Email.getText()) && senha.equals(Senha.getText())) { 
			//login efetuado com sucesso
			JOptionPane.showMessageDialog(null, "Login com sucesso", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
			
			//abrir outra tela após login
			ViewPrincipal frame = new ViewPrincipal("Uma boa noite");
			frame.setVisible(true);
			setLocationRelativeTo(null);
			//fechar tela
			dispose();
			
		}
		else {
			// dados inválidos
			JOptionPane.showMessageDialog(null, "Dados inválidos, tente novamente", "Mensagem do Sistema", JOptionPane.ERROR_MESSAGE);
		}
		// System.out.println("Email: "+Email.getText());
		// System.out.println("Senha: "+Senha.getText());
	}
	
}

package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ViewPessoaCadastro vwPessoaCadastro = null;

	private void controlaFechamentoTela() {
		Object[] opcoes = {"Sim", "Cancelar"};
		int resultado = JOptionPane.showOptionDialog(null,
							"Deseja realmente sair??",
							"Aviso",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null,     //do not use a custom Icon
							opcoes,  //the titles of buttons
							opcoes[0]); //default button title

		// Primeiro botão -> "Sim" -> Retorna 0
		// Segundo botão -> "Não" -> Retorna 1
		
		if(resultado == 0) {
			System.exit(0);
		}
				
	}
	
	public ViewPrincipal(String nomeUsuario) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				controlaFechamentoTela();
				
				
			}
		});
		setResizable(false);
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 889, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 389, 883, 93);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel nomepessoa = new JLabel("Bem vindo ");
		nomepessoa.setHorizontalAlignment(SwingConstants.CENTER);
		nomepessoa.setFont(new Font("Tahoma", Font.PLAIN, 49));
		nomepessoa.setForeground(Color.BLACK);
		nomepessoa.setBounds(0, 11, 873, 71);
		panel.add(nomepessoa);
		
		nomepessoa.setText(nomeUsuario);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 11, 873, 33);
		contentPane.add(menuBar);
		
		JMenu menuArquivo = new JMenu("Arquivo");
		menuArquivo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.add(menuArquivo);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlaFechamentoTela();
			}
		});
		menuArquivo.add(mntmSair);
		
		JMenu mnNewMenu = new JMenu("Pessoas");
			
	
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCadastro = new JMenuItem("Cadastro");
		mntmCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// não permitir criação de uma nova janela
				if(vwPessoaCadastro == null) {
					vwPessoaCadastro = new ViewPessoaCadastro();	
				}
				vwPessoaCadastro.setVisible(true);
			}
		});
		mnNewMenu.add(mntmCadastro);
		
		JMenu mnNewMenu_1 = new JMenu("Ajuda");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mnNewMenu_1.add(mntmSobre);
		
		// centralizar janelas
		setLocationRelativeTo(null);
	}
}

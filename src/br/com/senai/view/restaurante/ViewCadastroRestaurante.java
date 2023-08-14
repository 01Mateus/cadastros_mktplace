package br.com.senai.view.restaurante;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.senai.core.domain.Restaurante;

public class ViewCadastroRestaurante extends JFrame {

	private JPanel contentPane;
	private JTextField edtNome;
	private JTextField edtCategoria;
	private JTextField edtDescricao;
	private JTextField edtLogradouro;
	private JTextField edtCidade;
	private JTextField edtBairro;
	private JTextField edtComplemento;
	private JTable tableRestaurantes;
	private Restaurante restaurante;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCadastroRestaurante frame = new ViewCadastroRestaurante();
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
	public ViewCadastroRestaurante() {
		setResizable(false);
		setTitle("Gerenciar Restaurante - Cadastro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 664, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(22, 53, 46, 14);
		contentPane.add(lblNome);
		
		edtNome = new JTextField();
		edtNome.setBounds(89, 50, 242, 20);
		contentPane.add(edtNome);
		edtNome.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(371, 53, 59, 14);
		contentPane.add(lblCategoria);
		
		edtCategoria = new JTextField();
		edtCategoria.setBounds(440, 50, 118, 20);
		contentPane.add(edtCategoria);
		edtCategoria.setColumns(10);
		
		JComboBox cbCategoria = new JComboBox();
		cbCategoria.setBounds(558, 49, 30, 22);
		contentPane.add(cbCategoria);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewConsultaRestaurante view = new ViewConsultaRestaurante();
				view.setVisible(true);
				dispose();
			}
		});
		btnPesquisar.setBounds(522, 11, 98, 26);
		contentPane.add(btnPesquisar);
		
		JLabel lblDescricao = new JLabel("Descrição");
		lblDescricao.setBounds(10, 108, 69, 16);
		contentPane.add(lblDescricao);
		
		edtDescricao = new JTextField();
		edtDescricao.setBounds(99, 108, 489, 81);
		contentPane.add(edtDescricao);
		edtDescricao.setColumns(10);
		
		JLabel lblLogradouro = new JLabel("Logradouro");
		lblLogradouro.setBounds(10, 211, 69, 16);
		contentPane.add(lblLogradouro);
		
		edtLogradouro = new JTextField();
		edtLogradouro.setBounds(99, 209, 489, 20);
		contentPane.add(edtLogradouro);
		edtLogradouro.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(24, 249, 55, 16);
		contentPane.add(lblCidade);
		
		edtCidade = new JTextField();
		edtCidade.setBounds(98, 247, 198, 20);
		contentPane.add(edtCidade);
		edtCidade.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(325, 249, 55, 16);
		contentPane.add(lblBairro);
		
		edtBairro = new JTextField();
		edtBairro.setBounds(371, 247, 217, 20);
		contentPane.add(edtBairro);
		edtBairro.setColumns(10);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setBounds(10, 293, 84, 16);
		contentPane.add(lblComplemento);
		
		edtComplemento = new JTextField();
		edtComplemento.setBounds(99, 291, 489, 20);
		contentPane.add(edtComplemento);
		edtComplemento.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(382, 326, 98, 26);
		contentPane.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					int opcao = JOptionPane.showConfirmDialog(contentPane, "Deseja realmente cancelar a edição ou inclusão de restaurante?",
							"Cancelar", JOptionPane.YES_NO_OPTION);
					
					if (opcao == 0) {
						edtNome.setText("");
						edtCategoria.setText("");
						edtDescricao.setText("");
						edtLogradouro.setText("");
						edtCidade.setText("");
						edtBairro.setText("");
						edtComplemento.setText("");
						restaurante = null;
					}		
			}
		});
		btnCancelar.setBounds(490, 326, 98, 26);
		contentPane.add(btnCancelar);
	}
	
	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
		this.edtNome.setText(restaurante.getNome());
	}
}

package br.com.senai.view.horario;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class ViewCadastroHorario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField edtRestaurante;
	private JTextField edtDiaDaSemana;
	private JTextField edtAbertura;
	private JTextField edtFechamento;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCadastroHorario frame = new ViewCadastroHorario();
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
	public ViewCadastroHorario() {
		setTitle("Gerenciar Horários - Cadastro");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 664, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRestaurante = new JLabel("Restaurante");
		lblRestaurante.setBounds(10, 33, 71, 14);
		contentPane.add(lblRestaurante);
		
		edtRestaurante = new JTextField();
		edtRestaurante.setBounds(91, 30, 489, 20);
		contentPane.add(edtRestaurante);
		edtRestaurante.setColumns(10);
		
		JComboBox cbRestaurante = new JComboBox();
		cbRestaurante.setBounds(578, 29, 30, 22);
		contentPane.add(cbRestaurante);
		
		JLabel lblDiaDaSemana = new JLabel("Dia da Semana");
		lblDiaDaSemana.setBounds(10, 80, 94, 16);
		contentPane.add(lblDiaDaSemana);
		
		edtDiaDaSemana = new JTextField();
		edtDiaDaSemana.setBounds(101, 78, 114, 20);
		contentPane.add(edtDiaDaSemana);
		edtDiaDaSemana.setColumns(10);
		
		JComboBox cbDiaDaSemana = new JComboBox();
		cbDiaDaSemana.setBounds(213, 76, 31, 25);
		contentPane.add(cbDiaDaSemana);
		
		JLabel lblAbertura = new JLabel("Abertura");
		lblAbertura.setBounds(255, 80, 55, 16);
		contentPane.add(lblAbertura);
		
		edtAbertura = new JTextField();
		edtAbertura.setBounds(310, 78, 71, 20);
		contentPane.add(edtAbertura);
		edtAbertura.setColumns(10);
		
		JLabel lblFechamento = new JLabel("Fechamento");
		lblFechamento.setBounds(386, 80, 76, 16);
		contentPane.add(lblFechamento);
		
		edtFechamento = new JTextField();
		edtFechamento.setColumns(10);
		edtFechamento.setBounds(459, 78, 71, 20);
		contentPane.add(edtFechamento);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(542, 75, 98, 26);
		contentPane.add(btnAdicionar);
		
		JLabel lblHorarios = new JLabel("Horários");
		lblHorarios.setBounds(10, 133, 55, 16);
		contentPane.add(lblHorarios);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "A\u00E7\u00F5es", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(430, 163, 188, 112);
		contentPane.add(panel);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(12, 27, 156, 23);
		panel.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExcluir.setBounds(12, 77, 156, 23);
		panel.add(btnExcluir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					edtRestaurante.setText("");
					edtDiaDaSemana.setText("");
					edtAbertura.setText("");
					edtFechamento.setText("");
			}
		});
		btnCancelar.setBounds(520, 313, 98, 26);
		contentPane.add(btnCancelar);
	}
}

package br.com.senai.view.restaurante;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import br.com.senai.core.domain.Restaurante;
import br.com.senai.core.service.RestauranteService;
import br.com.senai.view.componentes.table.RestauranteTableModel;

public class ViewConsultaRestaurante extends JFrame {
	
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField edtNome;
	private JTextField edtCategoria;
	private RestauranteService service;
	private JTable tableRestaurantes;



	/**
	 * Create the frame.
	 */
	public ViewConsultaRestaurante() {
		setResizable(false);
		setTitle("Gerenciar Restaurante - Listagem");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 664, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFiltro = new JLabel("Filtros");
		lblFiltro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFiltro.setBounds(10, 42, 46, 14);
		contentPane.add(lblFiltro);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 92, 55, 16);
		contentPane.add(lblNome);
		
		edtNome = new JTextField();
		edtNome.setBounds(59, 90, 200, 20);
		contentPane.add(edtNome);
		edtNome.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(266, 92, 55, 16);
		contentPane.add(lblCategoria);
		
		edtCategoria = new JTextField();
		edtCategoria.setBounds(327, 90, 149, 20);
		contentPane.add(edtCategoria);
		edtCategoria.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(477, 88, 31, 25);
		contentPane.add(comboBox);
		
		JButton btnListar = new JButton("Listar");

	
		
		btnListar.setBounds(513, 87, 98, 26);
		contentPane.add(btnListar);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCadastroRestaurante view = new ViewCadastroRestaurante();
				view.setVisible(true);
				dispose();
			}
		});
		btnNovo.setBounds(513, 12, 98, 26);
		contentPane.add(btnNovo);
		
		JLabel lblRestaurantesEncontrados = new JLabel("Restaurantes Encontrados");
		lblRestaurantesEncontrados.setBounds(10, 163, 159, 16);
		contentPane.add(lblRestaurantesEncontrados);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "A\u00E7\u00F5es", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(428, 289, 210, 62);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int linhaSelecionada = tableRestaurantes.getSelectedRow();
					if (linhaSelecionada >= 0) {
						RestauranteTableModel model = (RestauranteTableModel)tableRestaurantes.getModel();
						Restaurante restauranteSelecionado = model.getPor(linhaSelecionada);
						ViewCadastroRestaurante view = new ViewCadastroRestaurante();
						view.setRestaurante(restauranteSelecionado);
						view.setVisible(true);
						dispose();
					}
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(contentPane, "Selecione uma linha para edição");
				}
			}
		});
		btnEditar.setBounds(12, 27, 89, 23);
		panel.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int linhaSelecionada = tableRestaurantes.getSelectedRow();
					if (linhaSelecionada >= 0) {
						RestauranteTableModel model = (RestauranteTableModel)tableRestaurantes.getModel();
						Restaurante restauranteSelecionado = model.getPor(linhaSelecionada);
						ViewCadastroRestaurante view = new ViewCadastroRestaurante();
						view.setRestaurante(restauranteSelecionado);
						view.setVisible(true);
						dispose();
					}
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(contentPane, "Selecione uma linha para exclusão");
				}			
			}
		});
		btnExcluir.setBounds(113, 27, 89, 23);
		panel.add(btnExcluir);
	}
	
	
}

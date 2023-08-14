package br.com.senai.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.senai.view.categoria.ViewCadastroCategoria;
import br.com.senai.view.horario.ViewCadastroHorario;
import br.com.senai.view.restaurante.ViewCadastroRestaurante;
import br.com.senai.view.restaurante.ViewConsultaRestaurante;

public class ViewPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPrincipal frame = new ViewPrincipal();
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
	public ViewPrincipal() {
		setResizable(false);
		setTitle("Tela Principal");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 664, 402);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastros = new JMenu("Cadastros");
		menuBar.add(mnCadastros);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Categorias");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCadastroCategoria view = new ViewCadastroCategoria();
				view.setVisible(true);
				dispose();
			}
		});
		mnCadastros.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Restaurantes");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewConsultaRestaurante view = new ViewConsultaRestaurante();
				view.setVisible(true);
				dispose();
			}
		});
		mnCadastros.add(mntmNewMenuItem_1);
		
		JMenu mnConfigurações = new JMenu("Configurações");
		menuBar.add(mnConfigurações);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Horários");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCadastroHorario view = new ViewCadastroHorario();
				view.setVisible(true);
				dispose();
			}
		});
		mnConfigurações.add(mntmNewMenuItem_2);
		
		JMenu mnSair = new JMenu("Sair");
		menuBar.add(mnSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}

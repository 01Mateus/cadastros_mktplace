package br.com.senai.core.dao;

import java.util.List;

import br.com.senai.core.domain.Horario;

public interface DaoHorario {

	public int contarPor(int idDoRestaurante);
	
	public void inserir(Horario horario);
	
	public void alterar(Horario horario);
	
	public void excluirPor(int id);
	
	public List<Horario> listarPor(int id);
	
}

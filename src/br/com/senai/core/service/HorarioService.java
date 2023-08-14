package br.com.senai.core.service;

import br.com.senai.core.dao.DaoHorario;
import br.com.senai.core.dao.DaoRestaurante;
import br.com.senai.core.dao.FactoryDao;
import br.com.senai.core.domain.Horario;

public class HorarioService {
	
	private DaoHorario dao;
	
	private DaoRestaurante daoRestaurante;
	
	public HorarioService() {
		this.dao = FactoryDao.getInstance().getDaoHorario();
		this.daoRestaurante = FactoryDao.getInstance().getDaoRestaurante();
	}
	
	public void salvar(Horario horario) {
		boolean isJaInserido = horario.getId() > 0;
		if (isJaInserido) {
			this.dao.alterar(horario);
		} else {
			this.dao.inserir(horario);
		}
	}
}

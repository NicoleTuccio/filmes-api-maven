package br.com.fiap.filmesapi.filmesapi.service;

import java.util.List;

import br.com.fiap.filmesapi.filmesapi.data.FilmeDao;
import br.com.fiap.filmesapi.filmesapi.model.Filme;

public class FilmeService {

	FilmeDao dao = new FilmeDao();
	
	public List<Filme> findAll(){
		return dao.findAll();
	}
	
}

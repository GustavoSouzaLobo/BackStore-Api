package com.gustavo.projeto.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.projeto.domain.Categoria;
import com.gustavo.projeto.domain.Livro;
import com.gustavo.projeto.repositories.CategoriaRepository;
import com.gustavo.projeto.repositories.LivroRepository;


@Service
public class DBservice {
	

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {
		Categoria Cat1 = new Categoria(null, "Infomatica", "Livros de T.I");
		
		Livro L1 = new Livro(null, "Clean code", "Robert Martin", "Lorem ipsun", Cat1);
		
		Cat1.getLivros().addAll(Arrays.asList(L1));
		
		this.categoriaRepository.saveAll(Arrays.asList(Cat1));
		this.livroRepository.saveAll(Arrays.asList(L1));
	}
}

package com.gustavo.projeto.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.projeto.domain.Categoria;
import com.gustavo.projeto.repositories.CategoriaRepository;
import com.gustavo.projeto.service.exeption.ObjectNotFoundedExeption;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundedExeption(
				"Objeto não encontrado! ID: " + id + " Tipo: " + Categoria.class.getName()));
	}
}

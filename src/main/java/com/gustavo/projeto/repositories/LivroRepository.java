package com.gustavo.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavo.projeto.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

}

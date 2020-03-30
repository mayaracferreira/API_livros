package com.gft.socialbooks.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gft.socialbooks.domain.Livro;
import com.gft.socialbooks.repository.LivrosRepository;

@RestController
@RequestMapping("/livros")
public class LivrosResources {
	
	@Autowired
	private LivrosRepository livrosRepository;

		@RequestMapping(value = "/livros", method = RequestMethod.GET)
		public List<Livro> listar() {
			return livrosRepository.findAll();
		}
		
		@RequestMapping(value = "/livros", method = RequestMethod.POST)
		public void salvar(@RequestBody Livro livro) {
			livrosRepository.save(livro);
			
		}
}
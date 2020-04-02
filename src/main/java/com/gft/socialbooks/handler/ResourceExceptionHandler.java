package com.gft.socialbooks.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.gft.socialbooks.domain.DetalhesErro;
import com.gft.socilabooks.services.exceptions.AutorExistenteException;
import com.gft.socilabooks.services.exceptions.AutorNaoEncontradoException;
import com.gft.socilabooks.services.exceptions.LivroNaoEncontratoException;

@ControllerAdvice
public class ResourceExceptionHandler {
		
		
	@ExceptionHandler(LivroNaoEncontratoException.class)
	public ResponseEntity<DetalhesErro> handlerLivroNaoEncontradoException
						(LivroNaoEncontratoException e, HttpServletRequest request){
		
		DetalhesErro erro = new DetalhesErro();			
			erro.setStatus(404l);
			erro.setTitulo("O Livro não pôde ser encontrado.");
			erro.setMensagemDesenvolvedor("https://stackoverflow.com/");
			erro.setTimestamp(System.currentTimeMillis());

	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
	
	@ExceptionHandler(AutorExistenteException.class)
	public ResponseEntity<DetalhesErro> handlerAutorExistenteException
						(AutorExistenteException e, HttpServletRequest request){
		
		DetalhesErro erro = new DetalhesErro();			
			erro.setStatus(409l);
			erro.setTitulo("Autor Já existente.");
			erro.setMensagemDesenvolvedor("https://stackoverflow.com/");
			erro.setTimestamp(System.currentTimeMillis());

	return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
	}
	
	@ExceptionHandler(AutorNaoEncontradoException.class)
	public ResponseEntity<DetalhesErro> handlerAutorNaoEncontradoException
						(AutorNaoEncontradoException e, HttpServletRequest request){
		
		DetalhesErro erro = new DetalhesErro();			
			erro.setStatus(409l);
			erro.setTitulo("O autor não pôde ser encontrado.");
			erro.setMensagemDesenvolvedor("https://stackoverflow.com/");
			erro.setTimestamp(System.currentTimeMillis());

	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
}

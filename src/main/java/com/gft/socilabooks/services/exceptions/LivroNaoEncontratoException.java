package com.gft.socilabooks.services.exceptions;

public class LivroNaoEncontratoException  extends RuntimeException{

	
	public LivroNaoEncontratoException (String mensagem) {
		super(mensagem);
	}
	
	public LivroNaoEncontratoException (String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}

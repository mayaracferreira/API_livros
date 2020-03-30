package com.gft.socialbooks.domain;

import java.util.Date;

public class Comentario {

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getUsusario() {
		return ususario;
	}

	public void setUsusario(String ususario) {
		this.ususario = ususario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	private Long id;
	
	private String texto;
	
	private String ususario;
	
	private Date data;
}

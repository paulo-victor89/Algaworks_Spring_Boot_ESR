package com.campelo.osvictor.api.model;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class OrdemServicoInput {

	@NotBlank
	private String descricao;
	
	@NotNull
	private BigDecimal preco;
	@Valid
	@NotNull
	private ClietneIdInput cliente;
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public ClietneIdInput getCliente() {
		return cliente;
	}
	public void setCliente(ClietneIdInput cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
	
}

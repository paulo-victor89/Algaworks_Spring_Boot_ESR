package com.campelo.osvictor.api.model;

import javax.validation.constraints.NotNull;

public class ClietneIdInput {
	
	@NotNull
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}

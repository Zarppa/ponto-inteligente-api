package com.guiPalma.pontoInteligente.api.services;

import java.util.Optional;

import com.guiPalma.pontoInteligente.api.entities.Empresa;

public interface EmpresaService {
	
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	Empresa persistir (Empresa empresa);

}

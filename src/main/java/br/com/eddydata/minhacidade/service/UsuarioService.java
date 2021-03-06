package br.com.eddydata.minhacidade.service;

import java.util.List;
import java.util.Optional;

import br.com.eddydata.minhacidade.entity.Usuario;

public interface UsuarioService {
		
	Usuario save(Usuario o);
	
	Optional<Usuario> findById(Long id);

	List<Usuario> findAll();
	
	void deleteById(Long id);
}

package br.com.oms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oms.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}

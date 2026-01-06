package br.com.oms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.oms.model.Usuario;
import br.com.oms.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioService (UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }


    public void delete (Long id){
        usuarioRepository.deleteById(id);
    }

}

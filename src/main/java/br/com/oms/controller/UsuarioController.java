package br.com.oms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.oms.model.Usuario;
import br.com.oms.service.UsuarioService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

 private final UsuarioService usuarioService;

    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario) {
      return  usuarioService.salvar(usuario);
      
    }
    
    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.listarTodos();
    }
    
    @DeleteMapping("/{id}")
    public void deletar (@PathVariable Long id){
        usuarioService.delete(id);
    }

}

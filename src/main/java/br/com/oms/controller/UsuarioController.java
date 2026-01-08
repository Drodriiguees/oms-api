package br.com.oms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.oms.dto.UsuarioRequestDTO;
import br.com.oms.dto.UsuarioResponseDTO;
import br.com.oms.model.Usuario;
import br.com.oms.service.UsuarioService;
import jakarta.validation.Valid;
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
public UsuarioResponseDTO criar(@Valid @RequestBody UsuarioRequestDTO dto) {

    Usuario usuario = new Usuario();
    usuario.setNome(dto.nome());
    usuario.setEmail(dto.email());

    Usuario usuarioSalvo = usuarioService.salvar(usuario);

    return new UsuarioResponseDTO(
        usuarioSalvo.getId(),
        usuarioSalvo.getNome(),
        usuarioSalvo.getEmail()
    );
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

package br.com.oms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/saude")
public class SaudeController {

    @GetMapping
    public ResponseEntity<Map<String,String>> verificarSaude(){

        Map<String, String> resposta = new HashMap<>();
        resposta.put("status", "ATIVO");
        resposta.put("servico", "Sistema de Gestão de Pedidos");

        return ResponseEntity.ok(resposta);
    }
    
}

package br.com.tech4me.clinica.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.clinica.model.DadosProcedimentos;

@RestController
@RequestMapping("/procedimentos")
public class ProcedimentosController {
    
    List<DadosProcedimentos> procedimentos = new ArrayList<>();

    @GetMapping
private List<DadosProcedimentos> obterListaProcedimentos(){
    return procedimentos;
}
@GetMapping("/{descricao}")
private String requisiGetComParametro(@PathVariable String descricao){
    return String.format("Página com informações sobre o procedimento %s", descricao);
}
@PostMapping
private String requisiPost(@RequestBody DadosProcedimentos procedimento){
    procedimentos.add(procedimento);
    return String.format("Requisição post com o procedimento %s", procedimento.descricao());
}


}

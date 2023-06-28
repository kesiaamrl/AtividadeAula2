package br.com.tech4me.clinica.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.clinica.model.DadosMedico;

@RestController
    @RequestMapping("/medicos")
public class MedicosController {
    List <DadosMedico> medicos=new ArrayList<>();

 @GetMapping
private List<DadosMedico> obterListaMedicos(){
        return medicos;
    }
@GetMapping("/{nome}")
private String requisicaoGetComParametro(@PathVariable String nome){
    return String.format("Página com informações sobre Dr(a). %s", nome);
}
@PostMapping
private String requisicaoPost(@RequestBody DadosMedico medico){
    medicos.add(medico);
    return String.format("Requisição post com o nome: %s", medico.nome());
}
}

package com.vinicius.pos.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.pos.base.ResourceBase;
import com.vinicius.pos.model.Endereco;
import com.vinicius.pos.repository.EnderecoRepository;
import com.vinicius.pos.service.EnderecoService;

@RestController
@RequestMapping("/emprestimos/clientes/enderecos")
public class EnderecoResources extends ResourceBase<Long, Endereco, EnderecoRepository, EnderecoService>{

}

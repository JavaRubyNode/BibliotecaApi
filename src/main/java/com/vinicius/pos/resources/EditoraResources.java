package com.vinicius.pos.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.pos.base.ResourceBase;
import com.vinicius.pos.model.Editora;
import com.vinicius.pos.repository.EditoraRepository;
import com.vinicius.pos.service.EditoraService;

@RestController
@RequestMapping("/emprestimos/livros/editoras")
public class EditoraResources extends ResourceBase<Long, Editora, EditoraRepository, EditoraService>{

}

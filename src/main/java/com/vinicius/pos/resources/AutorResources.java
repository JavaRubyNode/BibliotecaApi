package com.vinicius.pos.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.pos.base.ResourceBase;
import com.vinicius.pos.model.Autor;
import com.vinicius.pos.repository.AutorRepository;
import com.vinicius.pos.service.AutorService;

@RestController
@RequestMapping("/emprestimos/livros/autores")
public class AutorResources extends ResourceBase<Long, Autor, AutorRepository, AutorService>{

}

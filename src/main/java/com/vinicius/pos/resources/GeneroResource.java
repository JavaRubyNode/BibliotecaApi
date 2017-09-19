package com.vinicius.pos.resources;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.pos.base.ResourceBase;
import com.vinicius.pos.model.Genero;
import com.vinicius.pos.repository.GeneroRepository;
import com.vinicius.pos.service.GeneroService;


@RestController
@RequestMapping("/emprestimos/livros/generos")
public class GeneroResource extends ResourceBase<Long, Genero, GeneroRepository ,GeneroService>{

    
    
    

}

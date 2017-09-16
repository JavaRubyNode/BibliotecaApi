package com.vinicius.pos.resources;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vinicius.pos.base.ResourceBase;
import com.vinicius.pos.model.Livro;
import com.vinicius.pos.repository.LivroRepository;
import com.vinicius.pos.service.LivroService;


@RestController
@RequestMapping("/livros")
public class LivroResource extends ResourceBase<Long, Livro, LivroRepository ,LivroService>{

    
    
    

}

package com.vinicius.pos.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.pos.base.ResourceBase;
import com.vinicius.pos.model.Emprestimo;
import com.vinicius.pos.repository.EmprestimoRepository;
import com.vinicius.pos.service.EmprestimoService;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimosResources extends ResourceBase<Long, Emprestimo, EmprestimoRepository, EmprestimoService> {

}

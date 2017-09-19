package com.vinicius.pos.service;

import org.springframework.stereotype.Service;

import com.vinicius.pos.base.ServiceCrudBase;
import com.vinicius.pos.model.Emprestimo;
import com.vinicius.pos.repository.EmprestimoRepository;
@Service
public class EmprestimoService extends ServiceCrudBase<Long, Emprestimo, EmprestimoRepository>{

}

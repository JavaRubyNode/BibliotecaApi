package com.vinicius.pos.service;

import org.springframework.stereotype.Service;

import com.vinicius.pos.base.ServiceCrudBase;
import com.vinicius.pos.model.Endereco;
import com.vinicius.pos.repository.EnderecoRepository;
@Service
public class EnderecoService extends ServiceCrudBase<Long, Endereco, EnderecoRepository>{

}

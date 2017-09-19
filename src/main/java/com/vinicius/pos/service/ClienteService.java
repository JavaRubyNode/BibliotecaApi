package com.vinicius.pos.service;

import org.springframework.stereotype.Service;

import com.vinicius.pos.base.ServiceCrudBase;
import com.vinicius.pos.model.Cliente;
import com.vinicius.pos.repository.ClienteRepository;

@Service
public class ClienteService extends ServiceCrudBase<Long, Cliente, ClienteRepository>{

}

package com.vinicius.pos.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.pos.base.ResourceBase;
import com.vinicius.pos.model.Cliente;
import com.vinicius.pos.repository.ClienteRepository;
import com.vinicius.pos.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteResources extends ResourceBase<Long, Cliente, ClienteRepository, ClienteService>{

}

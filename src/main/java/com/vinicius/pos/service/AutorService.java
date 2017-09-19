package com.vinicius.pos.service;

import org.springframework.stereotype.Service;

import com.vinicius.pos.base.ServiceCrudBase;
import com.vinicius.pos.model.Autor;
import com.vinicius.pos.repository.AutorRepository;

@Service
public class AutorService extends ServiceCrudBase<Long, Autor, AutorRepository>{

}

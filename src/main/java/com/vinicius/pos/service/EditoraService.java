package com.vinicius.pos.service;

import org.springframework.stereotype.Service;

import com.vinicius.pos.base.ServiceCrudBase;
import com.vinicius.pos.model.Editora;
import com.vinicius.pos.repository.EditoraRepository;
@Service
public class EditoraService extends ServiceCrudBase<Long, Editora, EditoraRepository>{

}

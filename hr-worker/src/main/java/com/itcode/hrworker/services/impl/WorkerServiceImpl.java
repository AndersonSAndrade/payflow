package com.itcode.hrworker.services.impl;

import com.itcode.hrworker.domain.entity.Worker;
import com.itcode.hrworker.domain.repositories.WorkerRepository;
import com.itcode.hrworker.services.interfaces.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : andersons.andrade
 * @created : 14/08/21, sábado
 **/
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class WorkerServiceImpl implements WorkerService {

    private final WorkerRepository repository;


    @Override
    public List<Worker> findAll() {
        return repository.findAll();
    }

    @Override
    public Worker findById(Long id) {
        var worker = repository.findById(id).get();
        return worker;
    }

    @Override
    public Worker save(Worker worker) {
        return repository.save(worker);
    }

    @Override
    public void delete(Long id) {
        var worker = repository.findById(id).get();
        repository.deleteById(worker.getId());
    }
}

package com.itcode.hrworker.services.interfaces;

import com.itcode.hrworker.domain.entity.Worker;

import java.util.List;

/**
 * @author : andersons.andrade
 * @created : 14/08/21, sábado
 **/
public interface WorkerService {
    List<Worker> findAll();
    Worker findById(Long id);
    Worker save(Worker worker);
    void delete(Long id);
}

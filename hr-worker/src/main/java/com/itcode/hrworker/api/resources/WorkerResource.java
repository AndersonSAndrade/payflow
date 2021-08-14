package com.itcode.hrworker.api.resources;

import com.itcode.hrworker.domain.entity.Worker;
import com.itcode.hrworker.services.interfaces.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author : andersons.andrade
 * @created : 14/08/21, sábado
 **/
@RestController
@RequestMapping("worker")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class WorkerResource {

    private final WorkerService service;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        var worker = service.findAll();
        return ResponseEntity.ok().body(worker);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> workerId(@PathVariable(value = "id") Long id){
        var worker = service.findById(id);
        return ResponseEntity.ok().body(worker);
    }

    @PostMapping
    public ResponseEntity<Worker> save(@RequestBody Worker worker){
        var newWorker = service.save(worker);
        return ResponseEntity.status(HttpStatus.CREATED).body(newWorker);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        service.delete(id);
    }

}

package com.itcode.hrworker.domain.repositories;

import com.itcode.hrworker.domain.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : andersons.andrade
 * @created : 14/08/21, sábado
 **/
@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {
}

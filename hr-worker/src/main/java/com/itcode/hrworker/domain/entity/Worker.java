package com.itcode.hrworker.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author : andersons.andrade
 * @created : 14/08/21, sábado
 **/
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_worker")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private  Double dailyIncome;
}

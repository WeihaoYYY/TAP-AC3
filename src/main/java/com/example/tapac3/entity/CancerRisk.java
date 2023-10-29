package com.example.tapac3.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "cancer_risk")
public class CancerRisk {

    @Id
    private Long age;

    @Column(name = "10_ave")
    private double tenAve;

    @Column(name = "10_low")
    private double tenLow;

    @Column(name = "10_up")
    private double tenUp;

    @Column(name = "life_ave")
    private double lifeAve;

    @Column(name = "life_low")
    private double lifeLow;

    @Column(name = "life_up")
    private double lifeUp;

    @Column(name = "life_res")
    private double lifeRes;

    private String type;

}

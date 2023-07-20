package com.pthan1.nailservicereporter.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class DailyReport {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false) //@Column decorator used to add a constraint to the column
    private double service_total; //primitive types are not nullable, ex. double has default value of 0.0. wrapper types can be null

    @Column(nullable=false)
    private double tip_total;

    @OneToMany
    private List<ServiceEntry> serviceEntries;

    @ManyToOne
    private Employee employee;
}

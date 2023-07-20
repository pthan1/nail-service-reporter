package com.pthan1.nailservicereporter.entities;

import jakarta.persistence.*;

@Entity
public class ServiceEntry {

    @Id
    @GeneratedValue
    private Long id;

    private String service_name;

    @Column(nullable=false)
    private double cost;

    @Column(nullable=false)
    private double tip;

    @ManyToOne //left side is class i'm in. right side is other side of relationship, Match the singular/plurality
    private DailyReport dailyReport;
}

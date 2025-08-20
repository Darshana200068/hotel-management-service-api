package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "facilities")
public class Facility {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //get auto increment
    private long id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @ManyToOne()
    @JoinColumn(name = "room_id")
    private Room room;


}

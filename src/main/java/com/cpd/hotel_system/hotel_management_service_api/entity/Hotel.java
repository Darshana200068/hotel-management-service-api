package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Blob;
import java.time.LocalDateTime;

@Entity
@Table(name = "hotel")
public class Hotel {

    @Id  // annotation - Extra details
    @Column(name = "hotel_id")
    private String hotelId;

    @Column(name = "name" ,nullable = false, length = 100)
    private String hotelName;

    @Column(name = "star_rating" ,nullable = false)
    private int starRating;

    @Column(nullable = false)
    @Lob
    private Blob description;     //smart text area


    @Column(nullable = false ,name = "created_at")
    private LocalDateTime createdAt;

    @Column(nullable = false ,name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "active_status")
    private boolean activeStatus;

    @Column(name = "starting_from")
    private BigDecimal startingFrom;

}

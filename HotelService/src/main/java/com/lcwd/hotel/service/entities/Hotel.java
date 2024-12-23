package com.lcwd.hotel.service.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "micro_hotels")
public class Hotel {

    @Id
    @Column(name = "ID")
    private String hotelId;

    @Column(name = "NAME", length = 40)
    private String hotelName;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "ABOUT")
    private String about;
}

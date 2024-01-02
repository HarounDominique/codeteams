package com.empresaurios.codeteams.model;

import jakarta.persistence.*;

@Entity
@Table(name = "specialties")
public class Specialties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int specialty_id;
    @Column
    private String specialty_name;
    @Column
    private int sector_id;

    public int getSpecialty_id() {
        return specialty_id;
    }

    public void setSpecialty_id(int specialty_id) {
        this.specialty_id = specialty_id;
    }

    public String getSpecialty_name() {
        return specialty_name;
    }

    public void setSpecialty_name(String specialty_name) {
        this.specialty_name = specialty_name;
    }

    public int getSector_id() {
        return sector_id;
    }

    public void setSector_id(int sector_id) {
        this.sector_id = sector_id;
    }
}

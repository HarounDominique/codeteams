package com.empresaurios.codeteams.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sectors")
public class Sectors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sector_id;
    @Column
    private String sector_name;

    public int getSector_id() {
        return sector_id;
    }

    public void setSector_id(int sector_id) {
        this.sector_id = sector_id;
    }

    public String getSector_name() {
        return sector_name;
    }

    public void setSector_name(String sector_name) {
        this.sector_name = sector_name;
    }
}

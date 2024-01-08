package com.empresaurios.codeteams.model;

import jakarta.persistence.*;

@Entity
@Table(name="cvs")
public class Cvs {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int cv_id;

    @Column
    private int user_id;

    @Column
    private String experience;

    @Column
    private String education;

    @Column
    private int sector_id;

    public int getCv_id() {
        return cv_id;
    }

    public void setCv_id(int cv_id) {
        this.cv_id = cv_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getSector_id() {
        return sector_id;
    }

    public void setSector_id(int sector_id) {
        this.sector_id = sector_id;
    }
}

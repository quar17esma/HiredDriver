package com.sergii.shutyi.model.entity;

import java.util.Date;

public class Human {
    private String name;

    private Date birthDate;

    private Gender gender;

    private BloodGroup bloodGroup;

    private String workPlace;

    private DriverLicense driverLicense;

    public Human() {
    }

    public Human(String name, Date birthDate, Gender gender, BloodGroup bloodGroup, String workPlace, DriverLicense driverLicense) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.workPlace = workPlace;
        this.driverLicense = driverLicense;
    }

    public enum Gender { MALE , FEMALE };
    public enum BloodGroup {FIRST , SECOND, THIRD , FOURTH};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", bloodGroup=" + bloodGroup +
                '}';
    }
}

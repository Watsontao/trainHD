package com.HD.model;

import java.util.Objects;

/**
 * @@author vincent
 * @create2023-07-21-9:01
 */
public class department {
    private int apartmentId;
    private String apartmentName;
    private String apartmentInfo;

    public department() {
    }


    @Override
    public String toString() {
        return "department{" +
                "apartmentId=" + apartmentId +
                ", apartmentName='" + apartmentName + '\'' +
                ", apartmentInfo='" + apartmentInfo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        department that = (department) o;
        return apartmentId == that.apartmentId && Objects.equals(apartmentName, that.apartmentName) && Objects.equals(apartmentInfo, that.apartmentInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apartmentId, apartmentName, apartmentInfo);
    }

    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }

    public String getApartmentInfo() {
        return apartmentInfo;
    }

    public void setApartmentInfo(String apartmentInfo) {
        this.apartmentInfo = apartmentInfo;
    }

    public department(int apartmentId, String apartmentName) {
        this.apartmentId = apartmentId;
        this.apartmentName = apartmentName;
    }

    public department(int apartmentId, String apartmentName, String apartmentInfo) {
        this.apartmentId = apartmentId;
        this.apartmentName = apartmentName;
        this.apartmentInfo = apartmentInfo;
    }
}

package com.HD.model;

import java.util.Objects;

/**
 * @@author vincent
 * @create2023-07-21-8:53
 */
public class worker {
    private int workerId;
    private String userName;
    private String phone;
    private String password;
    private int apartmentId;
    private int isAdmin;


    public worker() {
    }

    public worker(int workerId, String userName, String phone, String password) {
        this.workerId = workerId;
        this.userName = userName;
        this.phone = phone;
        this.password = password;
    }

    @Override
    public String toString() {
        return "worker{" +
                "workerId=" + workerId +
                ", userName='" + userName + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", apartmentId=" + apartmentId +
                ", isAdmin=" + isAdmin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        worker worker = (worker) o;
        return workerId == worker.workerId && apartmentId == worker.apartmentId && isAdmin == worker.isAdmin && Objects.equals(userName, worker.userName) && Objects.equals(phone, worker.phone) && Objects.equals(password, worker.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workerId, userName, phone, password, apartmentId, isAdmin);
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public worker(int workerId, String userName, String phone, String password, int apartmentId, int isAdmin) {
        this.workerId = workerId;
        this.userName = userName;
        this.phone = phone;
        this.password = password;
        this.apartmentId = apartmentId;
        this.isAdmin = isAdmin;
    }
}

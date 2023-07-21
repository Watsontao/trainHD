package com.HD.model;

import java.sql.Date;
import java.util.Objects;

/**
 * @@author vincent
 * @create2023-07-21-8:57
 */
public class complaint {
    private int requestId;
    private int apartmentId;
    private String requestSort;
    private String requestContent;
    private Date time;
    private String location;
    private int userId;
    private int status;

    public complaint() {
    }

    public complaint(int requestId, String requestSort, String requestContent, int status) {
        this.requestId = requestId;
        this.requestSort = requestSort;
        this.requestContent = requestContent;
        this.status = status;
    }

    @Override
    public String toString() {
        return "complaint{" +
                "requestId=" + requestId +
                ", apartmentId=" + apartmentId +
                ", requestSort='" + requestSort + '\'' +
                ", requestContent='" + requestContent + '\'' +
                ", time=" + time +
                ", location='" + location + '\'' +
                ", userId=" + userId +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        complaint complaint = (complaint) o;
        return requestId == complaint.requestId && apartmentId == complaint.apartmentId && userId == complaint.userId && status == complaint.status && Objects.equals(requestSort, complaint.requestSort) && Objects.equals(requestContent, complaint.requestContent) && Objects.equals(time, complaint.time) && Objects.equals(location, complaint.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, apartmentId, requestSort, requestContent, time, location, userId, status);
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getRequestSort() {
        return requestSort;
    }

    public void setRequestSort(String requestSort) {
        this.requestSort = requestSort;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public complaint(int requestId, int apartmentId, String requestSort, String requestContent, Date time, String location, int userId, int status) {
        this.requestId = requestId;
        this.apartmentId = apartmentId;
        this.requestSort = requestSort;
        this.requestContent = requestContent;
        this.time = time;
        this.location = location;
        this.userId = userId;
        this.status = status;
    }
}

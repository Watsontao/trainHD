package com.HD.model;

import java.util.Objects;

/**
 * @@author vincent
 * @create2023-07-21-9:04
 */
public class sys_admin {
    private int adminId;
    private String adminName;
    private String phone;
    private String password;

    public sys_admin() {
    }

    @Override
    public String toString() {
        return "sys_admin{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        sys_admin sys_admin = (sys_admin) o;
        return adminId == sys_admin.adminId && Objects.equals(adminName, sys_admin.adminName) && Objects.equals(phone, sys_admin.phone) && Objects.equals(password, sys_admin.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminId, adminName, phone, password);
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
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

    public sys_admin(int adminId, String phone, String password) {
        this.adminId = adminId;
        this.phone = phone;
        this.password = password;
    }

    public sys_admin(int adminId, String adminName, String phone, String password) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.phone = phone;
        this.password = password;
    }
}

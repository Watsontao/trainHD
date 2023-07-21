package com.HD.model;

import java.util.Objects;

/**
 * @@author vincent
 * @create2023-07-21-8:29
 */
public class normal_user {
    private int userid;
    private String userName;
    private String gender;
    private String idCard;
    private String province;
    private String city;
    private String county;
    private String address;
    private String phone;
    private String email;
    private String password;
    private String nation;
    private String occupation;
    private String workUnit;
    private int  isAdmin;

    public normal_user() {
    }

    @Override
    public String toString() {
        return "normal_user{" +
                "userid=" + userid +
                ", userName='" + userName + '\'' +
                ", gender='" + gender + '\'' +
                ", idCard='" + idCard + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", nation='" + nation + '\'' +
                ", occupation='" + occupation + '\'' +
                ", workUnit='" + workUnit + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        normal_user that = (normal_user) o;
        return userid == that.userid && isAdmin == that.isAdmin && Objects.equals(userName, that.userName) && Objects.equals(gender, that.gender) && Objects.equals(idCard, that.idCard) && Objects.equals(province, that.province) && Objects.equals(city, that.city) && Objects.equals(county, that.county) && Objects.equals(address, that.address) && Objects.equals(phone, that.phone) && Objects.equals(email, that.email) && Objects.equals(password, that.password) && Objects.equals(nation, that.nation) && Objects.equals(occupation, that.occupation) && Objects.equals(workUnit, that.workUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, userName, gender, idCard, province, city, county, address, phone, email, password, nation, occupation, workUnit, isAdmin);
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public normal_user(int userid, String userName, String idCard, String phone, String password, int isAdmin) {
        this.userid = userid;
        this.userName = userName;
        this.idCard = idCard;
        this.phone = phone;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public normal_user(int userid, String userName, String gender, String idCard, String province, String city, String county, String address, String phone, String email, String password, String nation, String occupation, String workUnit, int isAdmin) {
        this.userid = userid;
        this.userName = userName;
        this.gender = gender;
        this.idCard = idCard;
        this.province = province;
        this.city = city;
        this.county = county;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.nation = nation;
        this.occupation = occupation;
        this.workUnit = workUnit;
        this.isAdmin = isAdmin;
    }
}

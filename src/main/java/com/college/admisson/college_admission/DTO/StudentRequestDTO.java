package com.college.admisson.college_admission.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class StudentRequestDTO {

    @NotBlank
    @Size(max=100, message = "Name cannot exceed 100 characters")
    private String Name;

    @NotBlank
    private double mark;

    @NotBlank
    private String address;

    @NotBlank
    @Size(max=10, message = "Phone numbers should not exceed 10 characters")
    private String phoneNumber;

    @NotBlank
    @Email(message = "Email should be valid")
    private String mail;

    @NotBlank
    private String hscId;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getHscId() {
        return hscId;
    }

    public void setHscId(String hscId) {
        this.hscId = hscId;
    }
}

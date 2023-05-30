package com.restful.booker.model;

import java.util.HashMap;

public class BookingPojo {
    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public HashMap<String, Object> getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(HashMap<String, Object> bookingdates) {
        this.bookingdates = bookingdates;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    private HashMap<String, Object> bookingdates;
    private String additionalneeds;


}
//    private String token;
//    private String username;
//    private String password;
//    private String firstname;
//    private String lastname;
//    private int totalPrice;
//    private boolean depositPaid;
//    private HashMap<String,String> bookingDates;
//    private String additionalNeeds;
//
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public int getTotalPrice() {
//        return totalPrice;
//    }
//
//    public void setTotalPrice(int totalPrice) {
//        this.totalPrice = totalPrice;
//    }
//
//    public boolean isDepositPaid() {
//        return depositPaid;
//    }
//
//    public void setDepositPaid(boolean depositPaid) {
//        this.depositPaid = depositPaid;
//    }
//
//    public HashMap<String, String> getBookingDates() {
//        return bookingDates;
//    }
//
//    public void setBookingDates(HashMap<String, String> bookingDates) {
//        this.bookingDates = bookingDates;
//    }
//
//    public String getAdditionalNeeds() {
//        return additionalNeeds;
//    }
//
//    public void setAdditionalNeeds(String additionalNeeds) {
//        this.additionalNeeds = additionalNeeds;
//    }
//
//    public String getToken() {
//        return token;
//    }
//
//    public void setToken(String token) {
//        this.token = token;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//}

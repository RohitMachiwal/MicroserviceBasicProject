package com.contact.model;

public class Contact {

    private  Long CId;

    private  String contactName;

    private String email;

    private Long userId;

    public Contact(){

    }

    public Contact(Long CId, String contactName, String email, Long userId) {
        this.CId = CId;
        this.contactName = contactName;
        this.email = email;
        this.userId = userId;
    }

    public Long getCId() {
        return CId;
    }

    public void setCId(Long CId) {
        this.CId = CId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}

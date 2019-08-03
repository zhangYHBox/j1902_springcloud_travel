package com.qf.j1902.entity;

public class ContactUser {
    private Integer contactId;

    private String contactName;

    private String contactTell;

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactTell() {
        return contactTell;
    }

    public void setContactTell(String contactTell) {
        this.contactTell = contactTell == null ? null : contactTell.trim();
    }
}
package com.m2i.CRM.controller.dto;

import javax.validation.constraints.NotEmpty;

public class OrderDto {

    private int id;

    @NotEmpty
    private String label;

    private double adrEt;
    private double numberOfDays;
    private double tva;
    private String status;
    private String type;
    private String notes;

    public OrderDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getAdrEt() {
        return adrEt;
    }

    public void setAdrEt(double adrEt) {
        this.adrEt = adrEt;
    }

    public double getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(double numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}

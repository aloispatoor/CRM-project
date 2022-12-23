package com.m2i.CRM.entity;

import javax.persistence.*;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String label;
    private double adrEt;
    private double numberOfDays;
    private double tva;
    private String status;
    private String type;
    private String notes;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

    public Order() {
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", adrEt=" + adrEt +
                ", numberOfDays=" + numberOfDays +
                ", tva=" + tva +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", notes='" + notes + '\'' +
                ", customer=" + customer +
                '}';
    }
}

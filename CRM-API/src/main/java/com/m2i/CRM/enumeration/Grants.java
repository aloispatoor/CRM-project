package com.m2i.CRM.enumeration;

public enum Grants {
    ADMIN(0, "ADMIN"),
    USER(1, "USER"),
    ;

    private Integer key;
    private String name;

    Grants(Integer key, String name) {
        this.key = key;
        this.name = name;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

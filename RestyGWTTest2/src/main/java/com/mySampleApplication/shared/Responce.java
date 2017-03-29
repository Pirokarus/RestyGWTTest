package com.mySampleApplication.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gwt.user.client.rpc.IsSerializable;

public class Responce implements IsSerializable {
    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Responce() {
    }

    public Responce(@JsonProperty("a") String a) {
        this.a = a;
    }
}

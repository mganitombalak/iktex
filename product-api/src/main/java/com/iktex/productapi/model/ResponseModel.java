package com.iktex.productapi.model;


import lombok.Getter;
import lombok.Setter;

public class ResponseModel<T> {

    @Getter
    @Setter
    private String server;
    @Getter
    @Setter
    private Iterable<T> data;
}

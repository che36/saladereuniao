package com.digital.crud.saladeruniao.saladereuniao.exception;

import java.util.Date;

public class ErroDetails {

    private Date timestamp;
    private String message;
    private String detais;

    public ErroDetails(Date timestamp, String message, String detais) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.detais = detais;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetais() {
        return detais;
    }

}

package com.d2s.cotizador.exeption;

import lombok.Data;

public class ResponseExeption extends Exception {
    private int code;

    public ResponseExeption(String message) {

        super(message);
        code = 500;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

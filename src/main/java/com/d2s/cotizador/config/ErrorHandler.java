package com.d2s.cotizador.config;

import com.d2s.cotizador.exeption.ResponseExeption;
import com.d2s.cotizador.pojo.structure.GetResponse;
import com.d2s.cotizador.util.ResponseUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Log4j2
public class ErrorHandler {
    @Autowired
    ResponseUtil<ResponseExeption> rsp;

    @ExceptionHandler({ResponseExeption.class})
    private ResponseEntity<GetResponse<ResponseExeption>> respondeExeption(ResponseExeption ex) {
        log.error(ex.getStackTrace());
        return rsp.badRequest(ex);
    }
}

package com.d2s.cotizador.util;

import com.d2s.cotizador.exeption.ResponseExeption;
import com.d2s.cotizador.pojo.structure.DetailResponse;
import com.d2s.cotizador.pojo.structure.GetResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ResponseUtil<T> {

    public ResponseEntity<GetResponse<T>> okResponse(T obj) {
        DetailResponse dt = new DetailResponse(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase());
        GetResponse<T> gt = new GetResponse(HttpStatus.OK.value(), dt, obj);
        return new ResponseEntity<>(gt, HttpStatus.OK);
    }

    public ResponseEntity<GetResponse<ResponseExeption>> badRequest(ResponseExeption obj) {

        GetResponse<ResponseExeption> gt = new GetResponse(obj);
        return new ResponseEntity<>(gt, HttpStatus.BAD_REQUEST);
    }
}

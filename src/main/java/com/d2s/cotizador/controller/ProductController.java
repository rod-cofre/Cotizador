package com.d2s.cotizador.controller;

import com.d2s.cotizador.entity.ProductEntity;
import com.d2s.cotizador.exeption.ResponseExeption;
import com.d2s.cotizador.pojo.ProductRequest;
import com.d2s.cotizador.services.impl.ProductServiceImpl;
import com.d2s.cotizador.util.ResponseUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/product")
@Log4j2
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("")
    private ResponseEntity getAllProduct() throws ResponseExeption {
        log.info("::INICIO DEL SERVICIO:: {}");

        return new ResponseUtil<List>().okResponse(productService.getAllProduct());
    }


}

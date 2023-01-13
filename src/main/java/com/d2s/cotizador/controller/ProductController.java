package com.d2s.cotizador.controller;

import com.d2s.cotizador.util.LoggerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/product")
public class ProductController {
    @Autowired
    private LoggerUtil loggerUtil;

    @GetMapping("")
    private String index() {
        loggerUtil.getLogger().info("::INICIO DEL SERVICIO::");
        return "Hola mundo";
    }
}

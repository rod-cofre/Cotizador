package com.d2s.cotizador.services;

import com.d2s.cotizador.entity.ProductEntity;
import com.d2s.cotizador.pojo.ProductRequest;

import java.util.List;

public interface ProductService {

    List<ProductRequest> getAllProduct();
}

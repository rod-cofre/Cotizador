package com.d2s.cotizador.services.impl;

import com.d2s.cotizador.entity.ProductEntity;
import com.d2s.cotizador.pojo.ProductRequest;
import com.d2s.cotizador.repository.ProductEntityRepository;
import com.d2s.cotizador.services.ProductService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductEntityRepository productRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ProductRequest> getAllProduct() {

        List<ProductRequest> productRequest = new ArrayList<>();
        List<ProductEntity> productEntities = productRepository.findAll();
        productRequest =  modelMapper.map(productEntities,  new TypeToken<List<ProductRequest>>() {}.getType());

        return productRequest;
    }
}

package com.d2s.cotizador.initial;


import com.d2s.cotizador.entity.ProductEntity;
import com.d2s.cotizador.repository.ProductEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
public class DataLoader implements ApplicationRunner {
    private final ProductEntityRepository productEntityRepository;

    @Autowired
    public DataLoader(ProductEntityRepository productEntityRepository) {
        this.productEntityRepository = productEntityRepository;

    }

    public void run(ApplicationArguments args) throws IOException {
        for (int i = 0; i < 10; i++) {
            ProductEntity prd = new ProductEntity("PRODUCTO 1", getRandomNumber(0,1000), getRandomNumber(0,1000), getRandomNumber(0,10));
            productEntityRepository.save(prd);

        }

    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}

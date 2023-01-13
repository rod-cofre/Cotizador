package com.d2s.cotizador.repository;

import com.d2s.cotizador.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ProductEntityRepository extends JpaRepository<ProductEntity, Integer> {
}
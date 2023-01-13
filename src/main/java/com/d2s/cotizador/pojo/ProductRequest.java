package com.d2s.cotizador.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Sale_price")
    private double sale_price;
    @JsonProperty("Purcharse_price")
    private double purcharse_price;
    @JsonProperty("Stock")
    private int stock;

}

package com.d2s.cotizador.pojo.structure;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailResponse {
    @JsonProperty("Code")
    private int code;
    @JsonProperty("Message")
    private String message;
}

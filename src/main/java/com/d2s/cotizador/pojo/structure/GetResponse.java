package com.d2s.cotizador.pojo.structure;

import com.d2s.cotizador.exeption.ResponseExeption;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"Code", "DetailResponse", "Body"})

public class GetResponse<T> {
    @JsonProperty("Code")
    private int code;
    @JsonProperty("DetailResponse")
    private DetailResponse detailResponse;
    @JsonProperty("Body")
    private T body;

    public GetResponse(ResponseExeption rsp) {
        this.code = rsp.getCode();
        this.detailResponse = new DetailResponse(rsp.getCode(), rsp.getMessage());
    }
}

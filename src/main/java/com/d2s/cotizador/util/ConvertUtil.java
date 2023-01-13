package com.d2s.cotizador.util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConvertUtil  {
    @Autowired
    private ModelMapper modelMapper;

}

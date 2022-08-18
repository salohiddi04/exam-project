package com.example.Imtihon.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Builder
@Data
public class ResponsDto<T> {

    private String message;

    private Integer code;

    private Boolean succes;

    private T date;
}

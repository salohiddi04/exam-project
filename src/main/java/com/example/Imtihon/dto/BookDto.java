package com.example.Imtihon.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private Integer id;

    private String name;

    private Double price;

    private Date publiked_at;

    private String publiked_by;

    private String autor_name;

    private Integer page;

    private String ganre;
}
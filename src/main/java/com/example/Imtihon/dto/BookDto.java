package com.example.Imtihon.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private Integer id;

    @NotBlank
    @NotNull
    private String name;
    @NotNull
    private Double price;
    @NotNull
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date publiked_at;

    private String publiked_by;

    private String autor_name;

    private Integer page;

    private String ganre;
}
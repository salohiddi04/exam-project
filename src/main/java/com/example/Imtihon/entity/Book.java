package com.example.Imtihon.entity;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import java.util.Date;
@Entity
@Builder
@Table(name = "Book")
@AllArgsConstructor
@NoArgsConstructor

public class Book {
    @Valid
    @Id
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date publiked_at;

    @Column(name = "publiked_by")
    private String publiked_by;

    @Column(name = "autor_name")
    private String autor_name;

    @Column(name = "page")
    private Integer page;

    @Column(name = "ganre")
    private String ganre;
}

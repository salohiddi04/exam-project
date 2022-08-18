package com.example.Imtihon.controller;

import com.example.Imtihon.dto.BookDto;
import com.example.Imtihon.dto.ResponsDto;
import com.example.Imtihon.dto.ResponsValidation;
import com.example.Imtihon.entity.Book;
import com.example.Imtihon.repository.BookRepository;
import com.example.Imtihon.servis.impl.BookValidationImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/book")
@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookValidationImpl bookValidation;

    private final BookRepository bookRepository;

    @PostMapping
//    @Scope(scopeName = "")
    public ResponsDto<List<String>> addbook(@RequestBody @Valid BookDto bookDto){
        List<ResponsValidation> list =  bookValidation.valid(bookDto);
        if(!list.isEmpty()){
            return ResponsDto.<List<String>>builder()

                    .build();
        }

        if(list.isEmpty()){
            Book book = Book.builder()
                    .id(bookDto.getId())
                    .autor_name(bookDto.getAutor_name())
                    .ganre(bookDto.getGanre())
                    .price(bookDto.getPrice())
                    .publiked_at(bookDto.getPubliked_at())
                    .publiked_by(bookDto.getPubliked_by())
                    .page(bookDto.getPage())
                    .build();
            bookRepository.save(book);
        }

        return ResponsDto.<List<String>>builder()
                .code(0)
                .message("OK")
                .build();

    }


}

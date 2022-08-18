package com.example.Imtihon.servis.impl;

import com.example.Imtihon.dto.BookDto;
import com.example.Imtihon.dto.ResponsDto;
import com.example.Imtihon.dto.ResponsValidation;
import com.example.Imtihon.entity.Book;
import com.example.Imtihon.servis.BookValidation;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class BookValidationImpl implements BookValidation {
    List<ResponsValidation> list1 = new ArrayList<>();

    @Override
    public List<ResponsValidation> valid(BookDto bookDto){
        if(bookDto.getPage()<10){
            list1.add(new ResponsValidation("page","nopage"));
        }
        if(!StringUtils.hasText(bookDto.getName()) && bookDto.getName().length() > 3){
            list1.add(new ResponsValidation("name","no name"));
        }

        if(bookDto.getGanre().length()<3){
            list1.add(new ResponsValidation("length kam","ganre"));
        }

        if(bookDto.getAutor_name().length()<3){
            list1.add(new ResponsValidation("no autor name","autorname"));
        }

        if(bookDto.getPubliked_by().length()<3){
            list1.add(new ResponsValidation("no publik by","public by"));
        }


        return list1;
    }

}

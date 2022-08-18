package com.example.Imtihon.servis;

import com.example.Imtihon.dto.BookDto;
import com.example.Imtihon.dto.ResponsValidation;
import com.example.Imtihon.entity.Book;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public interface BookValidation {
    List<ResponsValidation> valid (BookDto bookDto);
}

package com.example.Imtihon.servis;

import com.example.Imtihon.dto.BookDto;
import com.example.Imtihon.dto.ResponsDto;
import com.example.Imtihon.entity.Book;

public interface BookService {
    ResponsDto<Book> addbook(BookDto bookDto);
}

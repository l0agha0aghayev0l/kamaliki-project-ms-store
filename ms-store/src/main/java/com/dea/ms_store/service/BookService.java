package com.dea.ms_store.service;

import com.dea.ms_store.dto.BookDto;
import com.dea.ms_store.entity.Book;
import com.dea.ms_store.mapper.BookMapper;
import com.dea.ms_store.repository.BookRepository;
import com.dea.ms_store.request.BookRequest;
import com.dea.ms_store.response.BookResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
//    private final BookMapper bookMapper;

    public BookResponse<Book> saveBook(BookRequest bookRequest) {
        BookDto bookDto = BookMapper.INSTANCE.toDto(bookRequest);

        log.info("Saving book {}", bookDto);
        return null;
    }

}

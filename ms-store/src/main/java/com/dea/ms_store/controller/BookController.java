package com.dea.ms_store.controller;

import com.dea.ms_store.entity.Author;
import com.dea.ms_store.entity.Book;
import com.dea.ms_store.entity.Genre;
import com.dea.ms_store.entity.Seller;
import com.dea.ms_store.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dea.ms_store.request.BookRequest;
import com.dea.ms_store.response.BookResponse;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/save")
    public ResponseEntity<BookResponse<BookRequest>> addBook(@RequestBody BookRequest bookRequest) {
        bookService.saveBook(bookRequest);
        return ResponseEntity
                .ok()
                .body(new BookResponse<>("SMTH", bookRequest));
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/all")
    public ResponseEntity<List<Book>> getAllBooks() {
        return null;
    }
}

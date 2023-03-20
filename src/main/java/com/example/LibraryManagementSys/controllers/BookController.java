package com.example.LibraryManagementSys.controllers;

import com.example.LibraryManagementSys.request.BookCreateRequest;
import com.example.LibraryManagementSys.request.BookFilterType;
import com.example.LibraryManagementSys.request.BookSearchOperationType;
import com.example.LibraryManagementSys.response.BookSearchResponse;
import com.example.LibraryManagementSys.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/book")
    public void createBook(@Valid @RequestBody BookCreateRequest bookCreateRequest){
        bookService.createOrUpdate(bookCreateRequest);
    }

    // GET - filter functionality / search
    @GetMapping("/books/search")
    public List<BookSearchResponse> findBooks(
            @RequestParam("filter")BookFilterType bookFilterType,
            @RequestParam("value") String value){

        return bookService
                .find(bookFilterType, value)
                .stream()
                .map(book -> book.to())
                .collect(Collectors.toList());
    }

    @GetMapping("/books/search/robust")
    public List<BookSearchResponse> findBooks2(
            @RequestParam("filter")BookFilterType bookFilterType,
            @RequestParam("value") String value,
            @RequestParam("bookSearchOperationType") BookSearchOperationType bookSearchOperationType){

        return bookService
                .find2(bookFilterType, value, bookSearchOperationType)
                .stream()
                .map(book -> book.to())
                .collect(Collectors.toList());
    }

    @GetMapping("/books/search/robust2")
    public List<BookSearchResponse> findBooks3(
            @RequestParam("filter")List<BookFilterType> bookFilterType,
            @RequestParam("value") List<String> value,
            @RequestParam("bookSearchOperationType") List<BookSearchOperationType> bookSearchOperationType){

        return bookService
                .find3(bookFilterType, value, bookSearchOperationType)
                .stream()
                .map(book -> book.to())
                .collect(Collectors.toList());
    }

    // author/search

}

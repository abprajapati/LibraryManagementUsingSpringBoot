package com.example.LibraryManagementSys.response;

import com.example.LibraryManagementSys.models.Author;
import com.example.LibraryManagementSys.models.Genre;
import com.example.LibraryManagementSys.models.Student;
import com.example.LibraryManagementSys.models.Transaction;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BookSearchResponse {
    private int id;
    private String name;
    private int cost;

    private Genre genre;

    @JsonIgnoreProperties({"bookList", "addedOn"})
    private Author author;
    private Student student;

    private List<Transaction> transactionList;
    private Date createdOn;
    private Date updatedOn;
}

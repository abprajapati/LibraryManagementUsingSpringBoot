package com.example.LibraryManagementSys.request;

import com.example.LibraryManagementSys.models.Author;
import com.example.LibraryManagementSys.models.Book;
import com.example.LibraryManagementSys.models.Genre;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookCreateRequest {

    @NotBlank
    private String name;

    @NotNull
    private Author author;

    @Positive
    private int cost;

    @NotNull
    private Genre genre;

    public Book to(){
        return Book.builder()
                .cost(this.cost)
                .genre(this.genre)
                .name(this.name)
                .author(this.author)
                .build();
    }

}

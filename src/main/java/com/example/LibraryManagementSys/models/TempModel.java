package com.example.LibraryManagementSys.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TempModel implements Serializable {

    @Id
    private int id;
    @Id
    private String name;

    @CreationTimestamp
    private Date createdOn;

//    @OneToMany(mappedBy = "tempModel")
//    private List<Book> bookList;

}

package com.example.LibraryManagementSys.request;

import com.example.LibraryManagementSys.models.*;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentCreateRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String contact;

    private String address;
    private String email;

    public Student to(){
        return Student.builder()
                .address(address)
                .contact(contact)
                .email(email)
                .name(name)
                .accountStatus(AccountStatus.ACTIVE)
                .build();
    }
}

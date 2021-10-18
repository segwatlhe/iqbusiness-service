package com.iqbusiness.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String fullName;

    @Column(unique = true)
    @NotNull
    private String idNumber;

    @Column(unique = true)
    @NotNull
    private String telephoneNumber;
}

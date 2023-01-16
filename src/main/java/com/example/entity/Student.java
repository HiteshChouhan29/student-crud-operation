package com.example.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "student")
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;

    @Column(name ="first_name" )
    private String firstName;

    @Column(name ="last_name" )
    private String lastName;

    @Column(name ="father_name" )
    private String  fatherName;

    @Column(name ="roll_nm" )
    private Integer rollNo ;

    @Column(name ="class" )
    private String  clss;



}

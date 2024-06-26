package com.guide.guidemicroservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "post")
public class Guide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "title",nullable = false)
    private String Title;
    @Column(name = "description",nullable = false)
    private String Description;
    @Column(name = "imageUrl",nullable = false)
    private String imageUrl;
    @Column(name = "autor",nullable = false)
    private String Autor;

}

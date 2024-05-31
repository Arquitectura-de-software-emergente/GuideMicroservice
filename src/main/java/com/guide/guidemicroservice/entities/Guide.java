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
@Table(name = "guide")
public class Guide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "agency_id",nullable = false)
    private int agencyId;
    @Column(name = "name",nullable = false)
    private String Name;
    @Column(name = "specilization",nullable = false)
    private String Specilization;
    @Column(name = "experience",nullable = false)
    private String Experience;
    @Column(name = "certifications",nullable = false)
    private String Certifications;

}

package com.kafka.springboot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="wikimedia_recentchange")
@Getter
@Setter
public class Wikimedia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(length = 7000)
    private String wikiEventData;
}

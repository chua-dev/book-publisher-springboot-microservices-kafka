package com.chuadev.bookpublisherkafka.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book")
public class Book {

    @Id
    private Long id;

    private String icon;

    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}

package ru.nikishechkin.catsgram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Data
@EqualsAndHashCode
@Getter
@Setter
public class Post {
    private Long id;
    private Long authorId;
    private String description;
    private Instant postDate;
}

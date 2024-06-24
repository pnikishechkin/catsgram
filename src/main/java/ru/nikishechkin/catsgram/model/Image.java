package ru.nikishechkin.catsgram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Data
@EqualsAndHashCode
@Getter
@Setter
public class Image {
    private Long id;
    private long postId;
    private String originalFileName;
    private String filePath;
}

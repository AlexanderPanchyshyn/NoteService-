package com.pb.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter @Setter
@NoArgsConstructor
@Document(collection = "NoteService")
public class Note {
    @Id
    @JsonIgnore
    private String id;
    private String content;
    private int likes;
}
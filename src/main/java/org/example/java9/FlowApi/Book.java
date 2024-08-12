package org.example.java9.FlowApi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Book {

    private int BookId;

    private String BookName;

}

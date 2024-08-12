package org.example.java9.collectionsAPiUpdate;



import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private int empId;

    private String name;
}

package org.example;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String sName;
    private String sAddr;
    private int age;
}

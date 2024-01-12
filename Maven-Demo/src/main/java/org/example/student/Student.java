package org.example.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Student {
    private String sName;
    private String lName;
    private int sAge;

    public void display() {
        System.out.println("Student{" +
                "sName='" + sName + '\'' +
                ", lName='" + lName + '\'' +
                ", sAge=" + sAge +
                '}');
    }
}

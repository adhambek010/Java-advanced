package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Artist {
    private String artistName;
    private int artistAge;
    private String url;
    private String bio;
    private String image;
}

package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Adapter implements  Target{
    private Adapte adapte;

    @Override
    public void request() {
        this.adapte.specificRequest();
    }
}

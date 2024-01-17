package org.example.restaurant;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class VeggieBurger implements Burger{
    private int productId;
    private boolean combo;
    private String addOns;

    @Override
    public void prepare(){
        // prepare Veggie
        // Burger code
    }
}

package org.example.restaurant;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BeefBurger implements Burger{
    private int productId;
    private boolean angus;
    private String addOns;

    @Override
    public void prepare(){
        // prepare Beef
        // Burger code
    }
}

package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;

    public Flies flyingType;

    public void setWeight(int weight) {
        if (weight > 0){
            this.weight = weight;
        }else {
            System.err.println("Weight must be bigger than 0");
        }
    }

    public String tryToFly(){
        return flyingType.fly();
    }

    public void setFlyingAbility(Flies newFlyType){
        flyingType = newFlyType;
    }
}

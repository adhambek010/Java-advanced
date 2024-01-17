package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter

public class Invoker {
    Commands on;
    Commands of;
    Commands up;
    Commands down;

    public Invoker(Commands on, Commands of, Commands up, Commands down) {
        this.on = on;
        this.of = of;
        this.up = up;
        this.down = down;
    }

    public void clickOn(){
        this.on.execute();
    }

    public void clickOf(){
        this.of.execute();
    }
    public void clickUp(){
        this.up.execute();
    }
    public void clickDown(){
        this.down.execute();
    }
}

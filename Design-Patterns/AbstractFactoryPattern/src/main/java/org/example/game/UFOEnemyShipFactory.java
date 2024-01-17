package org.example.game;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UFOEnemyShipFactory implements EnemyShipFactory {
    private String name;

    public UFOEnemyShipFactory() {

    }

    @Override
    public ESWeapon addESGun() {
        return null;
    }

    @Override
    public ESEngine addESEngine() {
        return null;
    }
}

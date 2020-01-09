package com.codeinvestigator.javadefaultmethodinterface.space;

public class RoundSpaceShip implements SpaceObject {
    @Override
    public SpaceObject flyaround() {
        System.out.printf("Flying %nbuzz buzz %n");
        return this;
    }
}

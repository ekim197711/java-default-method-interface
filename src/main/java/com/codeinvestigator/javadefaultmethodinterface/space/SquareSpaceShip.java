package com.codeinvestigator.javadefaultmethodinterface.space;

public class SquareSpaceShip implements SpaceObject {
    @Override
    public SpaceObject flyaround() {
        System.out.println("Hubba hubba hubba");
        return this;
    }
}

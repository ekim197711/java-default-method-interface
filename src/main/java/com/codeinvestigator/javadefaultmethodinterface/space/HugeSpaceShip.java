package com.codeinvestigator.javadefaultmethodinterface.space;

public class HugeSpaceShip implements SpaceObject{
    @Override
    public SpaceObject flyaround() {
        System.out.println("Wroooaaaarr rooaaaaarr ");
        return this;
    }

    @Override
    public SpaceObject hyperspace() {

        System.out.println("Woooooaammmm Woooooaammmm Woooooaammmm Woooooaammmm ");
        return this;
    }
}

package com.codeinvestigator.javadefaultmethodinterface.space;

public interface SpaceObject {
    public SpaceObject flyaround();

    public default SpaceObject hyperspace(){
        System.out.println("wiggle wipple wipple");
        return this;
    }
}

package com.codeinvestigator.javadefaultmethodinterface.space;

import org.junit.jupiter.api.Test;

public class SpaceTest {

    @Test
    public void trySpaceships(){
        new RoundSpaceShip().flyaround().hyperspace();
        new SquareSpaceShip().flyaround().hyperspace();
        new HugeSpaceShip().flyaround().hyperspace();
    }
}

package com.palmerlarson.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SWAPIdaoTest {

    @Test
    void getPlanetSuccess() {
        SWAPIdao dao = new SWAPIdao();
        assertEquals("Tatooine", dao.getPlanet().getName());
    }
}
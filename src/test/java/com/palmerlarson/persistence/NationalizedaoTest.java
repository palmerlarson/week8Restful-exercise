package com.palmerlarson.persistence;

import com.nationalize.CountryItem;
import com.nationalize.NameFinder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Nationalizedao test.
 */
class NationalizedaoTest {

    /**
     * The Dao.
     */
    Nationalizedao dao;

    /**
     * Sets .
     */
    @BeforeEach
    void setup() {
        dao = new Nationalizedao();
    }

    /**
     * Gets name.
     */
    @Test
    void getName() {
        dao = new Nationalizedao();
        dao.setName("michael");
        assertEquals("michael", dao.getNation().getName());
    }

    /**
     * Sets name.
     */
    @Test
    void setName() {
        dao = new Nationalizedao();

        dao.setName("tom");
        assertEquals("tom", dao.getName());
        assertEquals(dao.getName(), dao.getNation().getName());
    }

    /**
     * Gets country.
     */
    @Test
    void getCountry() {
        dao = new Nationalizedao();
        List<CountryItem> countryOne;
        List<CountryItem> countryTwo;
        dao.setName("bill");
        countryOne = dao.getNation().getCountry();
        dao.setName("jose");
        countryTwo = dao.getNation().getCountry();
        assertNotEquals(countryOne, countryTwo);
    }

    /**
     * Output.
     */
    @Test
    void output() {
        dao = new Nationalizedao();
        dao.setName("Palmer");
        assertTrue(true, dao.getNation().toString());
    }
}
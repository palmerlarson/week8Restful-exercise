package edu.matc.entity;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getAge() {
        User user = new User();

        LocalDate birthDate = LocalDate.parse("1972-01-01");
        user.setDateofBirth(birthDate);

        int expectedAge = 50;

        int actualAge = user.getAge();

        assertEquals(expectedAge, actualAge);
    }
}
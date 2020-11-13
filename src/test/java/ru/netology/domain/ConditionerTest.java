package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void increaseCurrentTemperature() {
    Conditioner conditioner = new Conditioner();
    conditioner.setMinTemperature(18);
    conditioner.setMaxTemperature(30);
    int currentTemperature = 21;
    int expected = 22;
    conditioner.setCurrentTemperature(currentTemperature);
    conditioner.increaseCurrentTemperature();
    assertEquals(expected, conditioner.getCurrentTemperature());

    }

    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(18);
        conditioner.setMaxTemperature(30);
        int currentTemperature = 21;
        int expected = 20;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureHigherThanMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(18);
        conditioner.setMaxTemperature(30);
        int currentTemperature = 31;
        int expected = 0;
        conditioner.setCurrentTemperature(currentTemperature);
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureLowerThanMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(18);
        conditioner.setMaxTemperature(30);
        int currentTemperature = 17;
        int expected = 0;
        conditioner.setCurrentTemperature(currentTemperature);
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(18);
        conditioner.setMaxTemperature(30);
        int currentTemperature = 30;
        int expected = 30;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(18);
        conditioner.setMaxTemperature(30);
        int currentTemperature = 18;
        int expected = 18;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

}





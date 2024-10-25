package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

public class CustomListTest {
    public CustomList MockCityList() {
        CustomList list= new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest() {
        CustomList list = MockCityList();
        int expectedCountBeforeAdd = 0;
        assertEquals(expectedCountBeforeAdd, list.getCount());
        City cityToAdd = new City("Edmonton", "AB");
        list.add(cityToAdd);

        int expectedCount = 1;
        assertEquals(expectedCount, list.getCount());
    }
    @Test
    public void hasCityTest() {
        CustomList list = MockCityList();
        City cityToAdd = new City("Edmonton", "AB");
        list.add(cityToAdd);
        assertTrue(list.hasCity(cityToAdd));
        

    }

}

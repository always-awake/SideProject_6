package me.sidepjt.eatgo.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RestaurantTests {

    @Test
    public void creatRestaurantTest() {
        Restaurant restaurant = new Restaurant("Bob zip", "Seoul");
        assertThat(restaurant.getName(), is("Bob zip"));
        assertThat(restaurant.getAddress(), is("Seoul"));
    }

    @Test
    public void getNameAddressOfRestaurantTest() {
        Restaurant restaurant = new Restaurant("Bob zip", "Seoul");
        assertThat(restaurant.getNameInAddress(), is("Bob zip in Seoul"));
    }

}
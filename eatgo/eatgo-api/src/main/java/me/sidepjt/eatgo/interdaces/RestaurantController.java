package me.sidepjt.eatgo.interdaces;

import me.sidepjt.eatgo.domain.Restaurant;
import me.sidepjt.eatgo.domain.RestaurantRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    private RestaurantRepository restaurantRepository = new RestaurantRepository();

    @GetMapping("/restaurants")
    public List<Restaurant> getGroupRestaurant() {
        List<Restaurant> restaurants = restaurantRepository.findAll();
        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant getDetailRestaurant(@PathVariable("id") Long id) {
        Restaurant restaurant = restaurantRepository.findByID(id);
        return restaurant;
    }

}

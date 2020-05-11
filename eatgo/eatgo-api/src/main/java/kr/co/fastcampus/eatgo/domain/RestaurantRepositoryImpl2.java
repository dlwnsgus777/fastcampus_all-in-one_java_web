package kr.co.fastcampus.eatgo.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class RestaurantRepositoryImpl2 implements RestaurantRepository {

    private List<Restaurant> restaurants = new ArrayList<>();

    public RestaurantRepositoryImpl2() {
        restaurants.add(new Restaurant(1004L,"asd", "Seoul"));
        restaurants.add(new Restaurant(2020L,"asdasd", "Seoul"));
    }

    @Override
    public List<Restaurant> findAll() {

        return restaurants;
    }

    @Override
    public Restaurant findById(Long id) {
       return  restaurants.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}

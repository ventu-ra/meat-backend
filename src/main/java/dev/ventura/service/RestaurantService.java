package dev.ventura.service;

import java.util.List;

import dev.ventura.dto.RestaurantDTO;
import dev.ventura.entity.RestaurantEntity;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RestaurantService {

  public List<RestaurantDTO> listAll() {

    return RestaurantEntity.findAll().project(RestaurantDTO.class)
        .list();
    // return restaurantRepository.listAllDto();
  }

  public RestaurantEntity create(RestaurantEntity restaurant) {
    RestaurantEntity.persist(restaurant);
    return restaurant;
  }
}

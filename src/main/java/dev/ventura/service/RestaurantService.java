package dev.ventura.service;

import java.util.List;

import dev.ventura.entity.RestaurantEntity;
import dev.ventura.repository.RestaurantRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class RestaurantService {

  @Inject
  private final RestaurantRepository restaurantRepository;

  public RestaurantService(RestaurantRepository repo) {
    this.restaurantRepository = repo;
  }

  public List<RestaurantEntity> list() {
    return restaurantRepository.findAll().list();
  }

  public List<RestaurantEntity> create(RestaurantEntity restaurant) {
    restaurantRepository.persist(restaurant);

    return list();
  }
}

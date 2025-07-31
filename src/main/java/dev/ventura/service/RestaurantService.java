package dev.ventura.service;

import java.util.List;

import dev.ventura.dto.RestaurantDTO;
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

  public List<RestaurantDTO> listAll() {
    return restaurantRepository.listAllDto();
  }

  public List<RestaurantDTO> create(RestaurantEntity restaurant) {
    restaurantRepository.persist(restaurant);
    return listAll();
  }
}

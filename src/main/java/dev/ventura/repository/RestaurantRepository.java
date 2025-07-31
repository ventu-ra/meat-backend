package dev.ventura.repository;

import java.util.List;

import dev.ventura.dto.RestaurantDTO;
import dev.ventura.entity.RestaurantEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RestaurantRepository implements PanacheRepository<RestaurantEntity> {

  public List<RestaurantDTO> listAllDto() {
    return findAll()
        .project(RestaurantDTO.class)
        .list();
  }

}

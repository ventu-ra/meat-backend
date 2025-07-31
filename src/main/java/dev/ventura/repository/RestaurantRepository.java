package dev.ventura.repository;

import dev.ventura.entity.RestaurantEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RestaurantRepository implements PanacheRepository<RestaurantEntity> {

}

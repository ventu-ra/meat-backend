package dev.ventura.resource;

import java.util.List;

import dev.ventura.entity.RestaurantEntity;
import dev.ventura.service.RestaurantService;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/api/restaurants")
public class RestaurantResource {
  private RestaurantService rService;

  public RestaurantResource(RestaurantService service) {
    this.rService = service;
  }

  @GET
  public List<RestaurantEntity> list() {
    return rService.list();
  }

  @POST
  @Transactional
  public List<RestaurantEntity> create(RestaurantEntity restaurant) {
    return rService.create(restaurant);
  }
}

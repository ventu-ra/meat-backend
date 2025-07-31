package dev.ventura.resource;

import java.util.List;

import dev.ventura.dto.RestaurantDTO;
import dev.ventura.entity.RestaurantEntity;
import dev.ventura.service.RestaurantService;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/restaurants")
public class RestaurantResource {
  private RestaurantService rService;

  public RestaurantResource(RestaurantService service) {
    this.rService = service;
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<RestaurantDTO> list() {
    return rService.listAll();
  }

  @POST
  @Transactional
  public List<RestaurantDTO> create(RestaurantEntity restaurant) {
    return rService.create(restaurant);
  }
}

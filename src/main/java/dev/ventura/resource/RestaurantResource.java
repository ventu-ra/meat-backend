package dev.ventura.resource;

import dev.ventura.entity.RestaurantEntity;
import dev.ventura.service.RestaurantService;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/restaurants")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestaurantResource {
  private RestaurantService rService;

  public RestaurantResource(RestaurantService service) {
    this.rService = service;
  }

  @GET
  public Response list() {
    return Response.ok(rService.listAll()).build();
  }

  @POST
  @Transactional
  public Response create(RestaurantEntity restaurant) {
    rService.create(restaurant);
    return Response.created(null).build();
  }
}

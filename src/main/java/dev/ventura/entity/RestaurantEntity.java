package dev.ventura.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_restaurants")
public class RestaurantEntity extends PanacheEntityBase {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long id;
  public String name;

  @Column(name = "category")
  public String category;

  @Column(name = "delivery_estimate")
  public String deliveryEstimate;

  @Column(name = "rating")
  public double rating;

  @Column(name = "image_path")
  public String imagePath;
  @Column(length = 255)
  public String about;

  @Column(name = "hours")
  public String hours;

}

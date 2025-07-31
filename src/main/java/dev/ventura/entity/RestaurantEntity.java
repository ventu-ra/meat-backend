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
  private Long id;
  private String name;

  @Column(name = "category")
  private String category;

  @Column(name = "delivery_estimate")
  private String deliveryEstimate;

  @Column(name = "rating")
  private double rating;

  @Column(name = "image_path")
  private String imagePath;
  @Column(length = 255)
  private String about;

  @Column(name = "hours")
  private String hours;

  public RestaurantEntity() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getDeliveryEstimate() {
    return deliveryEstimate;
  }

  public void setDeliveryEstimate(String deliveryEstimate) {
    this.deliveryEstimate = deliveryEstimate;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  public String getImagePath() {
    return imagePath;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }

  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }

  public String getHours() {
    return hours;
  }

  public void setHours(String hours) {
    this.hours = hours;
  }

}

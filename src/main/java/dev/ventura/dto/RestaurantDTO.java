package dev.ventura.dto;

public record RestaurantDTO(Long id, String name, String category, double rating, String deliveryEstimate,
        String imagePath) {

}

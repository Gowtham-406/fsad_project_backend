package com.wastewarrior.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "donations")
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String title;
    private String type;
    private String quantity;
    private String location;
    private String expiresIn;
    private String donorName;
    private String status = "available";
    private String imageUrl;
}

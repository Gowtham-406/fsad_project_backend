package com.wastewarrior.backend.controller;

import com.wastewarrior.backend.model.Donation;
import com.wastewarrior.backend.repository.DonationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donations")
@CrossOrigin(origins = "*")
public class DonationController {

    @Autowired
    private DonationRepository donationRepository;

    @GetMapping
    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Donation> createDonation(@RequestBody Donation donation) {
        if (donation.getStatus() == null) {
            donation.setStatus("available");
        }
        Donation savedDonation = donationRepository.save(donation);
        return ResponseEntity.ok(savedDonation);
    }
}

package com.elissandro.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elissandro.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}

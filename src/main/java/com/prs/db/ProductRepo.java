package com.prs.db;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prs.business.*;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}

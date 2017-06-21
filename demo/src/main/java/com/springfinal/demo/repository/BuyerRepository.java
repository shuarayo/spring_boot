package com.springfinal.demo.repository;

import com.springfinal.demo.domain.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Silver on 19/6/2017.
 */
public interface BuyerRepository extends JpaRepository<Buyer, Long>{
}

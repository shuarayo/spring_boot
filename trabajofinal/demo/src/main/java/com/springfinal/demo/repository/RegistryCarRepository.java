package com.springfinal.demo.repository;

import com.springfinal.demo.domain.RegistryCar;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Silver on 21/6/2017.
 */
public interface RegistryCarRepository extends JpaRepository<RegistryCar, Long> {
}

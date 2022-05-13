package com.dvsuperior.dsmovie.repositories;

import com.dvsuperior.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository  extends JpaRepository<Movie, Long> {

}

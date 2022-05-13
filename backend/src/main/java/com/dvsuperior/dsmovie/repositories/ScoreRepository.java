package com.dvsuperior.dsmovie.repositories;

import com.dvsuperior.dsmovie.entities.Score;
import com.dvsuperior.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}

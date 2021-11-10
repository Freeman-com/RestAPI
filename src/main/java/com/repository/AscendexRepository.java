package com.repository;

import com.model.exchanges.Ascendex.Ascendex;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface that extends {@link JpaRepository} for class {@link Ascendex}.
 *
 * @author ANTON KOZINAU
 * @version 1.0
 */

public interface AscendexRepository extends JpaRepository<Ascendex, Long> {
    Ascendex findByEmailId (Long id);
}

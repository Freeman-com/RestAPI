package com.service.impl;

import com.model.exchanges.Ascendex.Ascendex;
import com.repository.AscendexRepository;
import com.service.AscendexService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AscendexServiceImpl implements AscendexService {

    private final AscendexRepository ascendexRepository;

    public AscendexServiceImpl(AscendexRepository ascendexRepository) {
        this.ascendexRepository = ascendexRepository;
    }


    @Override
    public Ascendex findById (Long id) {
        Ascendex result = ascendexRepository.findById(id).orElse(null);
        if (result == null) {
            log.warn("IN findById - no user found by id: {}", id);
        }
        return result;
    }

    @Override
    public Ascendex findByEmailId (Long id) {

        Ascendex result = ascendexRepository.findByEmailId(id);
        if (result == null) {
            log.warn("IN findById - no user found by id: {}", id);
        }
        return result;
    }

    @Override
    public String findApiKeyByEmailId(String apiKey) {
        return null;
    }

    @Override
    public String findSecretByEmailId(String secret) {
        return null;
    }
}

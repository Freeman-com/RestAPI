package com.service;


import com.model.exchanges.Ascendex.Ascendex;

/**
 * Service interface for class {@link com.model.exchanges.Ascendex}.
 *
 * @author Anton Kozinau
 * @version 1.0
 */
public interface AscendexService {

    Ascendex findById(Long id);

    Ascendex findByEmailId(Long id);

    String findApiKeyByEmailId(String apiKey);

    String findSecretByEmailId(String secret);

}

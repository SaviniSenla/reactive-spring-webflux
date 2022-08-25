package com.learnreactiveprogramming.service;

import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

class FluxAndMonoGeneratorServiceTest {

    FluxAndMonoGeneratorService fluxAndMonoGeneratorService =
            new FluxAndMonoGeneratorService();

    @Test
    void namesFluxTest(){
        var namesFlux = fluxAndMonoGeneratorService.namesFlux();
        StepVerifier.create(namesFlux).expectNext("Alex")
                .expectNextCount(2)
                .verifyComplete();
        var namesMono = fluxAndMonoGeneratorService.nameMono();
        StepVerifier.create(namesMono).expectNext("Stephanie").verifyComplete();
    }
}
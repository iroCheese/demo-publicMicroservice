package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.client.RestrictedMicroserviceAuthorizedFeignClient;
import com.mycompany.myapp.client.dto.RestrictedEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * REST controller for managing {@link com.mycompany.myapp.client.dto.RestrictedEntity}.
 */
@RestController
@RequestMapping("/api")
public class RestrictedEntityResource {

    private final Logger log = LoggerFactory.getLogger(RestrictedEntityResource.class);

    private static final String ENTITY_NAME = "restrictedMicroserviceRestrictedEntity";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final RestrictedMicroserviceAuthorizedFeignClient restrictedMicroserviceAuthorizedFeignClient;

    public RestrictedEntityResource(RestrictedMicroserviceAuthorizedFeignClient restrictedMicroserviceAuthorizedFeignClient) {
        this.restrictedMicroserviceAuthorizedFeignClient = restrictedMicroserviceAuthorizedFeignClient;
    }


    /**
     * {@code GET  /restricted-entities} : get all the restrictedEntities.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of restrictedEntities in body.
     */
    @GetMapping("/restricted-entities")
    public List<RestrictedEntity> getAllRestrictedEntities() {
        log.debug("REST request to get all RestrictedEntities");
        return restrictedMicroserviceAuthorizedFeignClient.findAll();
    }


}

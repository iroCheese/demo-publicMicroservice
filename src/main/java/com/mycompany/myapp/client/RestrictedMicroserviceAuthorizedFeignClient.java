package com.mycompany.myapp.client;


import com.mycompany.myapp.client.dto.RestrictedEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@AuthorizedFeignClient(name = "restrictedmicroservice")
public interface RestrictedMicroserviceAuthorizedFeignClient {

    @RequestMapping(value = "/api/restricted-entities", method = RequestMethod.GET)
    List<RestrictedEntity> findAll();
}

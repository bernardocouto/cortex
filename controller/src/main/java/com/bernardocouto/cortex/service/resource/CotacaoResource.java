package com.bernardocouto.cortex.service.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/api/v1")
@RestController
public class CotacaoResource {

    public ResponseEntity<Object> save() {
        return ResponseEntity.ok().body("");
    }

}

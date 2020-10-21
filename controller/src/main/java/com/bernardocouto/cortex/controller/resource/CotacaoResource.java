package com.bernardocouto.cortex.controller.resource;

import com.bernardocouto.cortex.controller.mapper.CotacaoMapper;
import com.bernardocouto.cortex.controller.request.CotacaoRequest;
import com.bernardocouto.cortex.controller.response.CotacaoResponse;
import com.bernardocouto.cortex.controller.service.CotacaoService;
import com.bernardocouto.cortex.domain.common.Cotacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RequestMapping(path = "/api/v1/cotacao")
@RestController
public class CotacaoResource {

    private CotacaoService cotacaoService;

    @Autowired
    public CotacaoResource(CotacaoService cotacaoService) {
        this.cotacaoService = cotacaoService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> save(@RequestBody final CotacaoRequest cotacaoRequest) {
        final Cotacao cotacao = CotacaoMapper.INSTANCE.requestToDomain(cotacaoRequest);
        CotacaoResponse cotacaoResponse = cotacaoService.save(cotacao);
        return ResponseEntity.created(URI.create("/api/v1/cotacao/" + cotacao.getId().toString())).body(cotacaoResponse);
    }

}

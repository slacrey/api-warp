package com.parsechina.apiwarp.web;

import icu.develop.api.wrap.WrapRequest;
import icu.develop.api.wrap.annotation.ApiWrap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @ApiWrap
    @PostMapping(value = "/web")
    public DefaultWrapData web(@RequestBody DefaultWrapData request) {
        return request;
    }

}

package com.example.tapac3.controller;


import com.example.tapac3.entity.CancerRisk;

import com.example.tapac3.service.CancerRiskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/data")
//@Api(description = "Get Cancer Data")
@CrossOrigin
public class controller {

    @Autowired
    private CancerRiskService service;

//    @GetMapping("/{age}")
//    @ApiOperation("Get Cancer Data By Age")
//    public Braca1_Breast getBraca1_BreastByAge(@ApiParam(name="age", value="user input: age") @PathVariable Long age) {
//        return service.findByAge(age);
//    }

    @GetMapping("/{age}")
    @ApiOperation("Get Cancer Data By Age")
    public CancerRisk getRiskByAge(@ApiParam(name="age", value="user input: age") @PathVariable Long age) {
        return service.findByAge(age);
    }

    @GetMapping("/{age1}/{age2}")
    @ApiOperation("Get Cancer Data By Age Between")
    public List<CancerRisk> getRiskByAgeBetween(
            @ApiParam(name="age", value="user input: age low") @PathVariable Long age1,
            @ApiParam(name="age", value="user input: age high") @PathVariable Long age2) {
        return service.findByAgeBetween(age1, age2);
    }

    @GetMapping("/{type}/{age1}/{age2}")
    @ApiOperation("Get Cancer Data By Type and Age Between")
    public List<CancerRisk> getRiskByTypeAndAgeBetween(
            @ApiParam(name="type", value="user input: type") @PathVariable String type,
            @ApiParam(name="age", value="user input: age low") @PathVariable Long age1,
            @ApiParam(name="age", value="user input: age high") @PathVariable Long age2) {
        return service.findByTypeAndAgeBetween(type, age1, age2);
    }



}

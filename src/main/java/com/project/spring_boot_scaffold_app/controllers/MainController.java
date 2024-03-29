package com.project.spring_boot_scaffold_app.controllers;

import com.project.spring_boot_scaffold_app.model.ServerStatus;
import com.project.spring_boot_scaffold_app.services.SampleService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class MainController {

  private final SampleService sampleService;

  @Autowired
  public MainController(SampleService sampleService) {
    this.sampleService = sampleService;
  }

  @ApiOperation(value = "Test GET endpoint")
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String test() {
    return "Hello CML!";
  }

  @RequestMapping(value = "/testws", method = RequestMethod.GET)
  public String testws() {
    RestTemplate template = new RestTemplate();
    ServerStatus status =
        template.getForObject("https://l2c1x1.com/services/misc/server-stats", ServerStatus.class);
    return "" + status.totalAccounts;
  }

  @ApiOperation(value = "Show the DB version")
  @RequestMapping(value = "/testdb", method = RequestMethod.GET)
  public String testdb() {
    return sampleService.getDbVersion();
  }

  @ApiOperation(value = "Test POST endpoint")
  @PostMapping(value = "/testpost")
  public Map testPost(@RequestBody Map payload) {
    log.info("Test POST: {}", payload);
    HashMap res = new HashMap();
    res.put("success", true);
    return res;
  }
}

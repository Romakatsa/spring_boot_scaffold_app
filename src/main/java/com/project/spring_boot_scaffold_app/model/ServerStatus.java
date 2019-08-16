package com.project.spring_boot_scaffold_app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ServerStatus {
  public int totalAccounts;
}

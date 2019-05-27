package com.haruspring.oauth2.controller;

import com.haruspring.oauth2.domain.GitHubRepository;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class ReposController {

  @Autowired private OAuth2RestTemplate restTemplate;

  @GetMapping("/repos")
  public String repositories() {
    URI uri =
        UriComponentsBuilder.fromUriString("https://api.github.com/user/repos").build().toUri();
    return restTemplate.getForEntity(uri, GitHubRepository[].class).toString();
  }
}

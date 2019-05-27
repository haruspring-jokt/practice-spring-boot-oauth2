package com.haruspring.oauth2.domain;

import lombok.Getter;
import lombok.Setter;
import org.codehaus.jackson.annotate.JsonProperty;

@Getter
@Setter
public class GitHubRepository {

  private String name;

  @JsonProperty("html_url")
  private String html_url;
}

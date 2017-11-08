package com.theironyard.funcprogramspringgttm;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {

    private String title;
    private String posterPath;
    private String overview;
    private double popularity;

}

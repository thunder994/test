package com.example.demo.core;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Builder
@Getter
public class Movie implements Serializable {

    private String title;
    private String link;
    private String image;
    private String subtitle;
    private String director;
    private String actor;
    private float userRating;

}
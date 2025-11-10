package com.webCof.uniqueApp.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WeatherResponse {

    @JsonProperty("current")
    private Current current;

    @Getter
    @Setter
    public static class Current {
        @JsonProperty("observation_time")
        private String observationTime;

        @JsonProperty("temperature")
        private int temperature;

        @JsonProperty("feelslike")
        private int feelsLike;   // ← Add this

        @JsonProperty("weather_descriptions")
        private List<String> weatherDescriptions;
    }

}


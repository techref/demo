package com.example.trade.controller;

import com.example.trade.model.WatchList;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DemoController {

    @GetMapping(value = "/getWatchList", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<WatchList> getWatchList(){

        return Arrays.asList(new WatchList("AAPL","Apple"),
                new WatchList("NVDA","NVDIA Graphics"),
                new WatchList("AMZN","Amazon"),
                new WatchList("FB","Facebook"),
                new WatchList("TWTR","Twitter"),
                new WatchList("NFLX", "Netflix"));
    }
}

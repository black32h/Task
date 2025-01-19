package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MapController {

    private final CollectionsPropertyUtils collectionsPropertyUtils;

    @Autowired
    public MapController(CollectionsPropertyUtils collectionsPropertyUtils) {
        this.collectionsPropertyUtils = collectionsPropertyUtils;
    }

    @GetMapping("/filtered-map")
    public Map<String, String> getFilteredMap() {
        return collectionsPropertyUtils.getFilteredTestMap();
    }
}

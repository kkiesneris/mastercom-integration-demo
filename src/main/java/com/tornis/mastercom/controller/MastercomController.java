package com.tornis.mastercom.controller;

import com.tornis.mastercom.service.MastercomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mastercom")
public class MastercomController {

    private final MastercomService mastercomService;

    public MastercomController(MastercomService mastercomService) {
        this.mastercomService = mastercomService;
    }

    @GetMapping("/cases")
    public List<String> getCases() {
        return mastercomService.listCases();
    }

    @GetMapping("/cases/{id}")
    public String getCase(@PathVariable String id) {
        return mastercomService.getCaseDetails(id);
    }
}

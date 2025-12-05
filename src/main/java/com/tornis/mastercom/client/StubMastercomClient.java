package com.tornis.mastercom.client;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StubMastercomClient implements MastercomClient {

    @Override
    public List<String> getCases() {
        return List.of("CASE-123", "CASE-456");
    }

    @Override
    public String getCaseById(String id) {
        return "Details for " + id;
    }
}

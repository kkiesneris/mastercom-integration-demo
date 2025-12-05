package com.tornis.mastercom.service;

import com.tornis.mastercom.client.MastercomClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MastercomService {

    private final MastercomClient mastercomClient;

    public MastercomService(MastercomClient mastercomClient) {
        this.mastercomClient = mastercomClient;
    }

    public List<String> listCases() {
        return mastercomClient.getCases();
    }

    public String getCaseDetails(String id) {
        return mastercomClient.getCaseById(id);
    }
}

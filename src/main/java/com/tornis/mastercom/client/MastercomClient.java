package com.tornis.mastercom.client;

import java.util.List;

public interface MastercomClient {

    // TODO: replace with real DTOs later
    List<String> getCases();

    String getCaseById(String id);
}

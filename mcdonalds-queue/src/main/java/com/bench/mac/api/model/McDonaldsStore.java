package com.bench.mac.api.model;

import com.bench.mac.api.config.MacOptions;

import java.util.List;
import java.util.Set;

public interface McDonaldsStore {
    MacOptions getMacOptions();

    MacManager getMacManager();

    Set<List<Client>> getClientQueues();

    Set<Worker> getRegisteredWorkers();

    Set<Client> getFullFedClients();

    void openStore();

    void updateClientQueues();

    void updateWorkersNumber();

    void closeStore();

    String getName();
}

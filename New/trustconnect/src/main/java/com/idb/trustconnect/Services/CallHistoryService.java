package com.idb.trustconnect.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.idb.trustconnect.Entities.CallHistory;
import com.idb.trustconnect.Repositories.CallHistoryRepo;

@Service
public class CallHistoryService {
    @Autowired
    private CallHistoryRepo repo;

    public List<CallHistory> retrieveAll() {
        return repo.findAll();
    }

    public List<CallHistory> retrieveOnePage(Integer pageNumber, Integer pageSize) {
        Page<CallHistory> page = repo.findAll(PageRequest.of(pageNumber, pageSize, Sort.by("dateCreated").descending()));

        List<CallHistory> callHistories = page.getContent();

        return callHistories;
    }
}

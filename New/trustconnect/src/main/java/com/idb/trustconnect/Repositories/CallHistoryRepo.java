package com.idb.trustconnect.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idb.trustconnect.Entities.CallHistory;

@Repository
public interface CallHistoryRepo extends JpaRepository<CallHistory, String> {
    
}

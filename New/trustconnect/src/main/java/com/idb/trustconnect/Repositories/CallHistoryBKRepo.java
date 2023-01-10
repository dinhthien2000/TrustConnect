package com.idb.trustconnect.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idb.trustconnect.Entities.CallHistoryBK;

@Repository
public interface CallHistoryBKRepo extends JpaRepository<CallHistoryBK, String> {
    
}

package com.idb.trustconnect.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.idb.trustconnect.Entities.CallHistory;
import com.idb.trustconnect.Services.CallHistoryService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/calls-history")
public class CallHistoryController {
    @Autowired
    private CallHistoryService callHistoryService;

    @GetMapping(
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> retrieveAll(@RequestParam(value = "pageSize", required = true) Integer pageSize, @RequestParam(value = "page", required = true) Integer page) {
        ResponseEntity<Object> entity;

        // List<CallHistory> callHistories =callHistoryService.retrieveAll();

        // entity = new ResponseEntity<>(callHistories, HttpStatus.OK);

        if(pageSize == null || page == null) {
            entity = new ResponseEntity<>("{ \"notice\": \"bad request\" }", HttpStatus.BAD_REQUEST);
        } else {
            List<CallHistory> callHistories = callHistoryService.retrieveOnePage(page, pageSize);

            entity = new ResponseEntity<>(callHistories, HttpStatus.OK);
        }

        return entity;
    }
}

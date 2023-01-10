package idb.software.trustconnect.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import idb.software.trustconnect.model.HistoryCall;
import idb.software.trustconnect.service.HistoryCallService;

@RestController
@RequestMapping("api/v1/historycall")
public class HistoryCallController {
	
	@Autowired
	HistoryCallService service;
	
	@GetMapping(value = "/{employeeCode}/{departmentId}")
	public List<HistoryCall> getAll(@PathVariable String employeeCode,@PathVariable String departmentId) {
		List<HistoryCall> list = new ArrayList<>();
		list = service.getAll(employeeCode, departmentId);
		return list;
	}
}

package idb.software.trustconnect.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idb.software.trustconnect.model.HistoryCall;
import idb.software.trustconnect.repo.HistotyCallRepo;

@Service
public class HistoryCallService {
	
	@Autowired
	HistotyCallRepo repo;
	
	public List<HistoryCall> getAll(String employeeCode, String departmentId) {
		try {
			List<HistoryCall> list = new ArrayList<>();
			list = repo.getAll(employeeCode, departmentId);
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}

package idb.software.trustconnect.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import idb.software.trustconnect.model.HistoryCall;

@Repository
public interface HistotyCallRepo extends JpaRepository<HistoryCall,String> {
	
	String query = "\r\n"
			+ "select id, c_callStatus, c_callOutcome, c_callOutcome_sub,\r\n"
			+ "       c_call_id, c_fk_idKH, c_so_ext, c_sdthienthi, c_recording_url,\r\n"
			+ "       c_s_start_time, c_s_end_time, c_ringing_duration,\r\n"
			+ "       c_talking_duration, c_dir_text, c_status_log_text, c_sip_log\r\n"
			+ ", case when c_sdthienthi like '%+%' then api.SPLIT_STR(c_sdthienthi, '+', 1)\r\n"
			+ "       when c_sdthienthi like '%\\_%' then api.SPLIT_STR(c_sdthienthi, '_', 1)\r\n"
			+ "       when c_sdthienthi like '%*%' then api.SPLIT_STR(c_sdthienthi, '*', 1)\r\n"
			+ "      else c_sdthienthi\r\n"
			+ "    --   WHEN c_sdthienthi like '32%' THEN SUBSTRING(c_sdthienthi, 3)\r\n"
			+ "    --   ELSE c_sdthienthi\r\n"
			+ "    end as phone1\r\n"
			+ ", c_so_ext as ext,\r\n"
			+ "case when c_sdthienthi like '%+%' then api.SPLIT_STR_v2(c_sdthienthi, '+', 2)\r\n"
			+ "     when c_sdthienthi like '%\\_%' then api.SPLIT_STR_v2(c_sdthienthi, '_', 2)\r\n"
			+ "end as stt\r\n"
			+ ", c_sdthienthi as checkcc\r\n"
			+ ", REPLACE(c_recording_url, \"%\", \"%25\") as recording_url\r\n"
			+ "from jwdb.app_fd_sp_calls_bk\r\n"
			+ "where c_hienthi = '1'\r\n"
			+ "-- and date_add(c_s_start_time, interval 3 day) >= now()\r\n"
			+ "-- and dateCreated between '2022-12-20' and now()\r\n"
			+ "and ( c_so_ext = ?1 or ?2 in ('Admin','Leader'))";
	
//	String query = "select * 45";
	
	@Query(value = query,nativeQuery = true)
	public List<HistoryCall> getAll(String employeeCode, String departmentId );
}

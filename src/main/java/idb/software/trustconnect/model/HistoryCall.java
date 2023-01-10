package idb.software.trustconnect.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter@Setter
@NoArgsConstructor@AllArgsConstructor
public class HistoryCall {
	@Id
	@Column(name = "id")
	String id;
	
	@Column(name = "c_callStatus")
	String c_callStatus;
	
	@Column(name = "c_callOutcome")
	String c_callOutcome;
	
	@Column(name = "c_callOutcome_sub")
	String c_callOutcome_sub;
	
	@Column(name = "c_call_id")
	int c_call_id;
	
	@Column(name = "c_fk_idKH")
	String c_fk_idKH;
	
	@Column(name = "c_so_ext")
	int c_so_ext;
	
	@Column(name = "c_sdthienthi")
	String c_sdthienthi;
	
	@Column(name = "c_recording_url")
	String c_recording_url;
	
	@Column(name = "c_s_start_time")
	Date c_s_start_time;
	
	@Column(name = "c_s_end_time")
	Date c_s_end_time;
	
	@Column(name = "c_ringing_duration")
	String c_ringing_duration;
	
	@Column(name = "c_talking_duration")
	String c_talking_duration;
	
	@Column(name = "")
	String c_dir_text;
	
	@Column(name = "c_status_log_text")
	String c_status_log_text;
	
	@Column(name = "c_sip_log")
	String c_sip_log;
	
	@Column(name = "phone1")
	String phone1;
	
	@Column(name = "extString")
	int extString;
	
	@Column(name = "stt")
	String stt;
	
	@Column(name = "checkcc")
	String checkcc;
	
	@Column(name = "recording_url")
	String recording_url;
	
	
}

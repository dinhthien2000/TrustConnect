package com.idb.trustconnect.Entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "app_fd_sp_calls")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CallHistory {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "datecreated")
    private LocalDateTime dateCreated;

    @Column(name = "c_recording_url")
    private String recordingUrl;

    @Column(name = "c_sdthienthi")
    private String sdtHienThi;
}

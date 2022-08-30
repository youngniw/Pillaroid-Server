package com.nadoyagsa.pillaroid.entity;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.nadoyagsa.pillaroid.dto.AlarmTimeDto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Table(name = "alarm_time")
@Entity
public class AlarmTime {
	@Id
	@Column(name = "alarm_time_idx")
	private Long alarmTimeIdx;

	@OneToOne
	@JoinColumn(name = "alarm_idx")
	private Alarm alarm;

	@Column
	private LocalTime time;

	public AlarmTimeDto toAlarmTimeDto() {
		return AlarmTimeDto.builder()
				.alarmTimeIdx(this.alarmTimeIdx)
				.time(this.time)
				.build();
	}
}
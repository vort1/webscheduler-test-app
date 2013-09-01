package app.vortigaunt.webscheduler.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="meetings")
public class Meeting {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="meeting_date")
	private Date meetingDate;

	@ManyToOne
	private Office meetingOffice;
	
	@ManyToOne
	private Employee requestedByEmployee;
	
	public Office getMeetingOffice() {
		return meetingOffice;
	}

	public void setMeetingOffice(Office meetingOffice) {
		this.meetingOffice = meetingOffice;
	}

	public Employee getRequestedByEmployee() {
		return requestedByEmployee;
	}

	public void setRequestedByEmployee(Employee requestedByEmployee) {
		this.requestedByEmployee = requestedByEmployee;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(Date meetingDate) {
		this.meetingDate = meetingDate;
	}
}

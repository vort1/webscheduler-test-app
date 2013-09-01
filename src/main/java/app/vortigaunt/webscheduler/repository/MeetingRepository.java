package app.vortigaunt.webscheduler.repository;

import java.util.List;

import app.vortigaunt.webscheduler.model.Meeting;

public interface MeetingRepository {

	public Meeting getMeetingById(long id);
	
	public List<Meeting> getAllMeetings();
	
	public Meeting saveMeeting(Meeting meeting);
}

package app.vortigaunt.webscheduler.repository;

import java.util.List;

import app.vortigaunt.webscheduler.model.Office;

public interface OfficeRepository {

	public Office getOfficeById(long id);
	
	public List<Office> getAllOffices();
	
	public Office saveOffice(Office office);
	
}

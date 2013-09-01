package app.vortigaunt.webscheduler.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="offices")
public class Office {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="office_name")
	private String name;
	
	private int officeHoursStart;

	private int officeHoursEnd;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getOfficeHoursEnd() {
		return officeHoursEnd;
	}

	public int getOfficeHoursStart() {
		return officeHoursStart;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOfficeHoursEnd(int officeHoursEnd) {
		this.officeHoursEnd = officeHoursEnd;
	}
	
	public void setOfficeHoursStart(int officeHoursStart) {
		this.officeHoursStart = officeHoursStart;
	}
}

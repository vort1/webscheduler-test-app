package app.vortigaunt.webscheduler.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="employee_name")
	private String name;

	@OneToMany(mappedBy="employee", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Meeting> submittedMeetings;
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}

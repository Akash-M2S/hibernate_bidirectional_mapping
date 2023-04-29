package ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Doctor {
	@Id
	private String Dname;
	@ManyToMany
	List<Hospital>hospital;
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	public List<Hospital> getHospital() {
		return hospital;
	}
	public void setHospital(List<Hospital> hospital) {
		this.hospital = hospital;
	}
	
	

}

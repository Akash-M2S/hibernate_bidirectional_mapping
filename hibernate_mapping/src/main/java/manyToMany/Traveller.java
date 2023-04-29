package manyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Traveller {
	@Id
	private String tname;
	@ManyToMany
	List<TouristPlace> list;
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public List<TouristPlace> getList() {
		return list;
	}
	public void setList(List<TouristPlace> list) {
		this.list = list;
	}

}

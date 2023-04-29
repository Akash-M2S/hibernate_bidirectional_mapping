package oneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Student {
	@Id
	private int id;
	private String sname;
	@OneToMany
	List<InstaAccount> insta;
	// one student having many instagram accounts;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<InstaAccount> getInsta() {
		return insta;
	}
	public void setInsta(List<InstaAccount> insta) {
		this.insta = insta;
	}
	

}

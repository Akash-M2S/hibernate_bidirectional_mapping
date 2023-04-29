package oneToManyandManyToOne;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String sname;
	@OneToMany
	List<TwitterAccount> twitter;
	
	public List<TwitterAccount> getTwitter() {
		return twitter;
	}
	public void setTwitter(List<TwitterAccount> twitter) {
		this.twitter = twitter;
	}
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
	
}

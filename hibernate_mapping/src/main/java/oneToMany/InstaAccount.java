package oneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InstaAccount {
	@Id
	private String instaName;

	public String getInstaName() {
		return instaName;
	}

	public void setInstaName(String instaName) {
		this.instaName = instaName;
	}
}

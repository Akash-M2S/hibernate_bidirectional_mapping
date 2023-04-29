package manyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Train {
@Id
String tname;

public String getTname() {
	return tname;
}

public void setTname(String tname) {
	this.tname = tname;
}

}

package manyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TouristPlace {
@Id
private String place;

public String getPlace() {
	return place;
}

public void setPlace(String place) {
	this.place = place;
}

}

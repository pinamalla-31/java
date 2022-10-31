import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Students {
	int id;
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + "]";
	}
	String name;
	
	@Id

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}

package m2.siad.bi.project.dwh.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_moving_city")
@AttributeOverrides(
		@AttributeOverride(name="id",column=@Column(name="moving_city_id"))
		)
public class MovingCity extends BaseEntities{
	@Column(name = "name",nullable=false,unique=true)
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
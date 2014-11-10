package m2.siad.bi.project.dwh.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_moving_type")
@AttributeOverrides(
		@AttributeOverride(name="id",column=@Column(name="moving_type_id"))
		)
public class MovingType extends BaseEntities{
	@Column(name = "type",nullable=false,unique=true)
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
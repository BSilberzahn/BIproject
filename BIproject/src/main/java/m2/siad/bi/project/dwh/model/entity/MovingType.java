package m2.siad.bi.project.dwh.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_moving_type")
@AttributeOverrides(
		@AttributeOverride(name="id",column=@Column(name="move_type_id"))
		)
public class MovingType extends BaseEntities{
	@Column(name = "move_type",nullable=true)
	private String moveType;
	@Column(name = "move_type_category",nullable=true)
	private String moveCategory;
	
	public String getMoveType() {
		return moveType;
	}
	public void setMoveType(String moveType) {
		this.moveType = moveType;
	}
	public String getMoveCategory() {
		return moveCategory;
	}
	public void setMoveCategory(String moveCategory) {
		this.moveCategory = moveCategory;
	}
	
	
	
	
	
}
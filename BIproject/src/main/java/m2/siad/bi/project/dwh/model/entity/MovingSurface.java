package m2.siad.bi.project.dwh.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_moving_surface")
@AttributeOverrides(
		@AttributeOverride(name="id",column=@Column(name="moving_surface_id"))
		)
public class MovingSurface extends BaseEntities{
	@Column(name = "surface",nullable=false,unique=true)
	private String surface;
	public String getSurface() {
		return surface;
	}
	public void setSurface(String surface) {
		this.surface = surface;
	}

}
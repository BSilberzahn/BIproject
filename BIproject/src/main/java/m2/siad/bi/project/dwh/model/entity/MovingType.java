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
	@Column(name = "service_type",nullable=false)
	private String serviceType;
	@Column(name = "moving_type",nullable=false)
	private String movingType;
	@Column(name = "latitude",nullable=false)
	private String latitude;
	@Column(name = "longitude",nullable=false)
	private String longitude;
	
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getMovingType() {
		return movingType;
	}
	public void setMovingType(String movingType) {
		this.movingType = movingType;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	
	
}
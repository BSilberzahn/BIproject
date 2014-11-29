package m2.siad.bi.project.dwh.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_activity")
@AttributeOverrides(
		@AttributeOverride(name="id",column=@Column(name="activity_id"))
		)
public class Activity extends BaseEntities{

	@Column(name = "moving_type_id",nullable=false)
	private String movingType;//TODO
	@Column(name = "city_id",nullable=false)
	private String city;//TODO
	@Column(name = "latitude",nullable=false)
	private Float latitude;
	@Column(name = "longitude",nullable=false)
	private Float longitude;
	//Lycee, pole medical, equipement sportif
	@Column(name = "equipment_type",nullable=false)
	private String equipmentType;
	//type de catégorie: Medical, Culturel, Sportif
	@Column(name = "activity_type",nullable=false)
	private String activityType;
	
	
	
	public Float getLatitude() {
		return latitude;
	}
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	public Float getLongitude() {
		return longitude;
	}
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	public String getEquipmentType() {
		return equipmentType;
	}
	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}
	public String getActivityType() {
		return activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}
	
	
}

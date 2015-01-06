package m2.siad.bi.project.dwh.model.entity;

import java.io.Serializable;

public class MovePK implements Serializable {

	private Contract contract;
	private City cityDeparture;
	private City cityArrival;
	private MoveType type;
	private MoveIndicator indicator;
	private Year year;
	private MoveDuration duration;
	private String nationalityDimension;
	private String ageIntervalDimension;
	private String genderDimension;
	private String meansLocomotionDimension;
	private String immigrantDimension;
	private String economicActivityDimension;
	
	public MovePK(){}
	
	public MovePK(Contract contract, City cityDeparture, City cityArrival,
			MoveType type, MoveIndicator indicator, Year year,
			MoveDuration duration, String nationalityDimension,
			String ageIntervalDimension, String genderDimension,
			String meansLocomotionDimension, String immigrantDimension,
			String economicActivityDimension) {
		super();
		this.contract = contract;
		this.cityDeparture = cityDeparture;
		this.cityArrival = cityArrival;
		this.type = type;
		this.indicator = indicator;
		this.year = year;
		this.duration = duration;
		this.nationalityDimension = nationalityDimension;
		this.ageIntervalDimension = ageIntervalDimension;
		this.genderDimension = genderDimension;
		this.meansLocomotionDimension = meansLocomotionDimension;
		this.immigrantDimension = immigrantDimension;
		this.economicActivityDimension = economicActivityDimension;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((ageIntervalDimension == null) ? 0 : ageIntervalDimension
						.hashCode());
		result = prime * result
				+ ((cityArrival == null) ? 0 : cityArrival.hashCode());
		result = prime * result
				+ ((cityDeparture == null) ? 0 : cityDeparture.hashCode());
		result = prime * result
				+ ((contract == null) ? 0 : contract.hashCode());
		result = prime * result
				+ ((duration == null) ? 0 : duration.hashCode());
		result = prime
				* result
				+ ((economicActivityDimension == null) ? 0
						: economicActivityDimension.hashCode());
		result = prime * result
				+ ((genderDimension == null) ? 0 : genderDimension.hashCode());
		result = prime
				* result
				+ ((immigrantDimension == null) ? 0 : immigrantDimension
						.hashCode());
		result = prime * result
				+ ((indicator == null) ? 0 : indicator.hashCode());
		result = prime
				* result
				+ ((meansLocomotionDimension == null) ? 0
						: meansLocomotionDimension.hashCode());
		result = prime
				* result
				+ ((nationalityDimension == null) ? 0 : nationalityDimension
						.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovePK other = (MovePK) obj;
		if (ageIntervalDimension == null) {
			if (other.ageIntervalDimension != null)
				return false;
		} else if (!ageIntervalDimension.equals(other.ageIntervalDimension))
			return false;
		if (cityArrival == null) {
			if (other.cityArrival != null)
				return false;
		} else if (!cityArrival.equals(other.cityArrival))
			return false;
		if (cityDeparture == null) {
			if (other.cityDeparture != null)
				return false;
		} else if (!cityDeparture.equals(other.cityDeparture))
			return false;
		if (contract == null) {
			if (other.contract != null)
				return false;
		} else if (!contract.equals(other.contract))
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (economicActivityDimension == null) {
			if (other.economicActivityDimension != null)
				return false;
		} else if (!economicActivityDimension
				.equals(other.economicActivityDimension))
			return false;
		if (genderDimension == null) {
			if (other.genderDimension != null)
				return false;
		} else if (!genderDimension.equals(other.genderDimension))
			return false;
		if (immigrantDimension == null) {
			if (other.immigrantDimension != null)
				return false;
		} else if (!immigrantDimension.equals(other.immigrantDimension))
			return false;
		if (indicator == null) {
			if (other.indicator != null)
				return false;
		} else if (!indicator.equals(other.indicator))
			return false;
		if (meansLocomotionDimension == null) {
			if (other.meansLocomotionDimension != null)
				return false;
		} else if (!meansLocomotionDimension
				.equals(other.meansLocomotionDimension))
			return false;
		if (nationalityDimension == null) {
			if (other.nationalityDimension != null)
				return false;
		} else if (!nationalityDimension.equals(other.nationalityDimension))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}
	
	
	
	
}

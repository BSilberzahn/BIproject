package m2.siad.bi.project.dwh.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_moving_contract")
@AttributeOverrides(
		@AttributeOverride(name="id",column=@Column(name="contract_id"))
		)
public class MovingContract extends BaseEntities{

	@Column(name = "contract_type",nullable=true)
	private String contractType;
	@Column(name = "contract_category",nullable=true)
	private String contractCategory;
	
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	public String getContractCategory() {
		return contractCategory;
	}
	public void setContractCategory(String contractCategory) {
		this.contractCategory = contractCategory;
	}
	
	
}

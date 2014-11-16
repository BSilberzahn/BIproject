package m2.siad.bi.project.dwh.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_energy_household")
@AttributeOverrides(
		@AttributeOverride(name="id",column=@Column(name="household_id"))
		)
public class EnergyHousehold extends BaseEntities{
	@Column(name = "household_size",nullable=false)
	private String householdSize;
	@Column(name = "annual_income",nullable=false)
	private String annualIncome;
	@Column(name = "unemployee_number",nullable=true)
	private String unemployeeNumber;
	@Column(name = "employee_number",nullable=true)
	private String employeeNumber;
	@Column(name = "permanent_contract_number",nullable=true)
	private String permanentContractNumber;
	@Column(name = "temporary_contract_number",nullable=true)
	private String temporaryContractNumber;
	@Column(name = "working_persons_number",nullable=true)
	private String workingPersonsNumber;
	@Column(name = "not_working_persons_number",nullable=true)
	private String notWorkingPersonsNumber;
	@Column(name = "active_not_working_persons_number",nullable=true)
	private String activeNotWorkingPersonsNumber;
	@Column(name = "active_working_persons_number",nullable=true)
	private String activeWorkingPersonsNumber;
	@Column(name = "french_persons_number",nullable=true)
	private String frenchPersonsNumber;
	@Column(name = "foreign_persons_number",nullable=true)
	private String foreignPersonsNumber;
	@Column(name = "cs1_number",nullable=true)
	private String cs1Number;
	
	
}

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
	@Column(name = "cs2_number",nullable=true)
	private String cs2Number;
	@Column(name = "cs3_number",nullable=true)
	private String cs3Number;
	@Column(name = "cs4_number",nullable=true)
	private String cs4Number;
	@Column(name = "cs5_number",nullable=true)
	private String cs5Number;
	@Column(name = "cs6_number",nullable=true)
	private String cs6Number;
	@Column(name = "cs7_number",nullable=true)
	private String cs7Number;
	@Column(name = "cs8_number",nullable=true)
	private String cs8Number;
	@Column(name = "immigrant_number",nullable=true)
	private String immigrantNumber;
	@Column(name = "non_immigrant_number",nullable=true)
	private String nonImmigrantNumber;
	@Column(name = "unmarried_persons_number",nullable=true)
	private String unmarriedPersonsNumber;
	@Column(name = "married_persons_number",nullable=true)
	private String marriedPersonsNumber;
	@Column(name = "az_number",nullable=true)
	private String azNumber;
	@Column(name = "be_number",nullable=true)
	private String beNumber;
	@Column(name = "fz_number",nullable=true)
	private String fzNumber;
	@Column(name = "oq_number",nullable=true)
	private String oqNumber;
	@Column(name = "gu_number",nullable=true)
	private String guNumber;
	@Column(name = "zz_number",nullable=true)
	private String zzNumber;
	@Column(name = "retired_persons_number",nullable=true)
	private String retiredPersonsNumber;
	@Column(name = "active_persons_number",nullable=true)
	private String activePersonsNumber;
	@Column(name = "young_persons_number",nullable=true)
	private String youngPersonsNumber;
	public String getHouseholdSize() {
		return householdSize;
	}
	public void setHouseholdSize(String householdSize) {
		this.householdSize = householdSize;
	}
	public String getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getUnemployeeNumber() {
		return unemployeeNumber;
	}
	public void setUnemployeeNumber(String unemployeeNumber) {
		this.unemployeeNumber = unemployeeNumber;
	}
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getPermanentContractNumber() {
		return permanentContractNumber;
	}
	public void setPermanentContractNumber(String permanentContractNumber) {
		this.permanentContractNumber = permanentContractNumber;
	}
	public String getTemporaryContractNumber() {
		return temporaryContractNumber;
	}
	public void setTemporaryContractNumber(String temporaryContractNumber) {
		this.temporaryContractNumber = temporaryContractNumber;
	}
	public String getWorkingPersonsNumber() {
		return workingPersonsNumber;
	}
	public void setWorkingPersonsNumber(String workingPersonsNumber) {
		this.workingPersonsNumber = workingPersonsNumber;
	}
	public String getNotWorkingPersonsNumber() {
		return notWorkingPersonsNumber;
	}
	public void setNotWorkingPersonsNumber(String notWorkingPersonsNumber) {
		this.notWorkingPersonsNumber = notWorkingPersonsNumber;
	}
	public String getActiveNotWorkingPersonsNumber() {
		return activeNotWorkingPersonsNumber;
	}
	public void setActiveNotWorkingPersonsNumber(
			String activeNotWorkingPersonsNumber) {
		this.activeNotWorkingPersonsNumber = activeNotWorkingPersonsNumber;
	}
	public String getActiveWorkingPersonsNumber() {
		return activeWorkingPersonsNumber;
	}
	public void setActiveWorkingPersonsNumber(String activeWorkingPersonsNumber) {
		this.activeWorkingPersonsNumber = activeWorkingPersonsNumber;
	}
	public String getFrenchPersonsNumber() {
		return frenchPersonsNumber;
	}
	public void setFrenchPersonsNumber(String frenchPersonsNumber) {
		this.frenchPersonsNumber = frenchPersonsNumber;
	}
	public String getForeignPersonsNumber() {
		return foreignPersonsNumber;
	}
	public void setForeignPersonsNumber(String foreignPersonsNumber) {
		this.foreignPersonsNumber = foreignPersonsNumber;
	}
	public String getCs1Number() {
		return cs1Number;
	}
	public void setCs1Number(String cs1Number) {
		this.cs1Number = cs1Number;
	}
	public String getCs2Number() {
		return cs2Number;
	}
	public void setCs2Number(String cs2Number) {
		this.cs2Number = cs2Number;
	}
	public String getCs3Number() {
		return cs3Number;
	}
	public void setCs3Number(String cs3Number) {
		this.cs3Number = cs3Number;
	}
	public String getCs4Number() {
		return cs4Number;
	}
	public void setCs4Number(String cs4Number) {
		this.cs4Number = cs4Number;
	}
	public String getCs5Number() {
		return cs5Number;
	}
	public void setCs5Number(String cs5Number) {
		this.cs5Number = cs5Number;
	}
	public String getCs6Number() {
		return cs6Number;
	}
	public void setCs6Number(String cs6Number) {
		this.cs6Number = cs6Number;
	}
	public String getCs7Number() {
		return cs7Number;
	}
	public void setCs7Number(String cs7Number) {
		this.cs7Number = cs7Number;
	}
	public String getCs8Number() {
		return cs8Number;
	}
	public void setCs8Number(String cs8Number) {
		this.cs8Number = cs8Number;
	}
	public String getImmigrantNumber() {
		return immigrantNumber;
	}
	public void setImmigrantNumber(String immigrantNumber) {
		this.immigrantNumber = immigrantNumber;
	}
	public String getNonImmigrantNumber() {
		return nonImmigrantNumber;
	}
	public void setNonImmigrantNumber(String nonImmigrantNumber) {
		this.nonImmigrantNumber = nonImmigrantNumber;
	}
	public String getUnmarriedPersonsNumber() {
		return unmarriedPersonsNumber;
	}
	public void setUnmarriedPersonsNumber(String unmarriedPersonsNumber) {
		this.unmarriedPersonsNumber = unmarriedPersonsNumber;
	}
	public String getMarriedPersonsNumber() {
		return marriedPersonsNumber;
	}
	public void setMarriedPersonsNumber(String marriedPersonsNumber) {
		this.marriedPersonsNumber = marriedPersonsNumber;
	}
	public String getAzNumber() {
		return azNumber;
	}
	public void setAzNumber(String azNumber) {
		this.azNumber = azNumber;
	}
	public String getBeNumber() {
		return beNumber;
	}
	public void setBeNumber(String beNumber) {
		this.beNumber = beNumber;
	}
	public String getFzNumber() {
		return fzNumber;
	}
	public void setFzNumber(String fzNumber) {
		this.fzNumber = fzNumber;
	}
	public String getOqNumber() {
		return oqNumber;
	}
	public void setOqNumber(String oqNumber) {
		this.oqNumber = oqNumber;
	}
	public String getGuNumber() {
		return guNumber;
	}
	public void setGuNumber(String guNumber) {
		this.guNumber = guNumber;
	}
	public String getZzNumber() {
		return zzNumber;
	}
	public void setZzNumber(String zzNumber) {
		this.zzNumber = zzNumber;
	}
	public String getRetiredPersonsNumber() {
		return retiredPersonsNumber;
	}
	public void setRetiredPersonsNumber(String retiredPersonsNumber) {
		this.retiredPersonsNumber = retiredPersonsNumber;
	}
	public String getActivePersonsNumber() {
		return activePersonsNumber;
	}
	public void setActivePersonsNumber(String activePersonsNumber) {
		this.activePersonsNumber = activePersonsNumber;
	}
	public String getYoungPersonsNumber() {
		return youngPersonsNumber;
	}
	public void setYoungPersonsNumber(String youngPersonsNumber) {
		this.youngPersonsNumber = youngPersonsNumber;
	}
}

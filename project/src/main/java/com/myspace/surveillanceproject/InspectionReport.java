package com.myspace.surveillanceproject;

import java.util.Date;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InspectionReport implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("archiveNumber")
	private java.lang.String archiveNumber;
	@org.kie.api.definition.type.Label("reportDate")
	private Date reportDate;
	@org.kie.api.definition.type.Label("type")
	private java.lang.String type;
	@org.kie.api.definition.type.Label("basedOn")
	private java.lang.String basedOn;
	@org.kie.api.definition.type.Label("knownSubject")
	private String knownSubject;
	@org.kie.api.definition.type.Label("inspectionStartDate")
	private Date inspectionStartDate;
	@org.kie.api.definition.type.Label("inspectionEndDate")
	private Date inspectionEndDate;
	@org.kie.api.definition.type.Label("facilityName")
	private java.lang.String facilityName;
	@org.kie.api.definition.type.Label("facilityAddress")
	private java.lang.String facilityAddress;
	@org.kie.api.definition.type.Label("facilityMainActivity")
	private java.lang.String facilityMainActivity;

	@org.kie.api.definition.type.Label("common")
	private com.myspace.surveillanceproject.CommonInspectionObject common;

	@org.kie.api.definition.type.Label("subject")
	private com.myspace.surveillanceproject.InspectionSubject subject;

	@org.kie.api.definition.type.Label("description")
	private java.lang.String description;

	@org.kie.api.definition.type.Label("laws")
	private java.util.List<com.myspace.surveillanceproject.LawInstance> laws;

	@org.kie.api.definition.type.Label("involvedInspectors")
	private java.util.List<com.myspace.surveillanceproject.InvolvedInspector> involvedInspectors;

	@org.kie.api.definition.type.Label("accountableParties")
	private java.util.List<com.myspace.surveillanceproject.AccountableParty> accountableParties;

	@org.kie.api.definition.type.Label("subjectRepresentatives")
	private java.util.List<com.myspace.surveillanceproject.AccountableParty> subjectRepresentatives;

	@org.kie.api.definition.type.Label("checkLists")
	private java.util.List<com.myspace.surveillanceproject.CheckListInstance> checkLists;

	@org.kie.api.definition.type.Label("peoplePresent")
	private java.util.List<com.myspace.surveillanceproject.PersonPresent> peoplePresent;

	@org.kie.api.definition.type.Label("irregularitiesFound")
	private java.lang.Boolean irregularitiesFound;

	@org.kie.api.definition.type.Label("remarks")
	private java.lang.String remarks;

	@org.kie.api.definition.type.Label("repercussions")
	private java.util.List<com.myspace.surveillanceproject.Repercussion> repercussions;

	@org.kie.api.definition.type.Label("inspectionFindings")
	private java.lang.String inspectionFindings;

	@org.kie.api.definition.type.Label("id")
	private java.lang.String id;

	@org.kie.api.definition.type.Label("dependsOn.checkLists.usingCheckLists")
	private java.lang.Boolean usingCheckLists;

	@org.kie.api.definition.type.Label("archiveDate")
	private java.util.Date archiveDate;

	@org.kie.api.definition.type.Label("numOfIrregularities")
	private java.lang.Integer numOfIrregularities;

	@org.kie.api.definition.type.Label("reportReceiptDate")
	private java.util.Date reportReceiptDate;

	@org.kie.api.definition.type.Label("notUsedCheckListsReason")
	private java.lang.String notUsedCheckListsReason;

	@org.kie.api.definition.type.Label(value = "documents")
	private java.util.List<com.myspace.surveillanceproject.Documents> documents;

	public InspectionReport() {
	}

	public java.lang.String getArchiveNumber() {
		return this.archiveNumber;
	}

	public void setArchiveNumber(java.lang.String archiveNumber) {
		this.archiveNumber = archiveNumber;
	}

	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public java.lang.String getBasedOn() {
		return this.basedOn;
	}

	public void setBasedOn(java.lang.String basedOn) {
		this.basedOn = basedOn;
	}

	public java.lang.String getFacilityName() {
		return this.facilityName;
	}

	public void setFacilityName(java.lang.String facilityName) {
		this.facilityName = facilityName;
	}

	public java.lang.String getFacilityAddress() {
		return this.facilityAddress;
	}

	public void setFacilityAddress(java.lang.String facilityAddress) {
		this.facilityAddress = facilityAddress;
	}

	public java.lang.String getFacilityMainActivity() {
		return this.facilityMainActivity;
	}

	public void setFacilityMainActivity(java.lang.String facilityMainActivity) {
		this.facilityMainActivity = facilityMainActivity;
	}

	public com.myspace.surveillanceproject.CommonInspectionObject getCommon() {
		return this.common;
	}

	public void setCommon(
			com.myspace.surveillanceproject.CommonInspectionObject common) {
		this.common = common;
	}

	public com.myspace.surveillanceproject.InspectionSubject getSubject() {
		return this.subject;
	}

	public void setSubject(
			com.myspace.surveillanceproject.InspectionSubject subject) {
		this.subject = subject;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.util.List<com.myspace.surveillanceproject.LawInstance> getLaws() {
		return this.laws;
	}

	public void setLaws(
			java.util.List<com.myspace.surveillanceproject.LawInstance> laws) {
		this.laws = laws;
	}

	public java.util.List<com.myspace.surveillanceproject.InvolvedInspector> getInvolvedInspectors() {
		return this.involvedInspectors;
	}

	public void setInvolvedInspectors(
			java.util.List<com.myspace.surveillanceproject.InvolvedInspector> involvedInspectors) {
		this.involvedInspectors = involvedInspectors;
	}

	public java.util.List<com.myspace.surveillanceproject.AccountableParty> getAccountableParties() {
		return this.accountableParties;
	}

	public void setAccountableParties(
			java.util.List<com.myspace.surveillanceproject.AccountableParty> accountableParties) {
		this.accountableParties = accountableParties;
	}

	public java.util.List<com.myspace.surveillanceproject.AccountableParty> getSubjectRepresentatives() {
		return this.subjectRepresentatives;
	}

	public void setSubjectRepresentatives(
			java.util.List<com.myspace.surveillanceproject.AccountableParty> subjectRepresentatives) {
		this.subjectRepresentatives = subjectRepresentatives;
	}

	public java.util.List<com.myspace.surveillanceproject.CheckListInstance> getCheckLists() {
		return this.checkLists;
	}

	public void setCheckLists(
			java.util.List<com.myspace.surveillanceproject.CheckListInstance> checkLists) {
		this.checkLists = checkLists;
	}

	public java.util.List<com.myspace.surveillanceproject.PersonPresent> getPeoplePresent() {
		return this.peoplePresent;
	}

	public void setPeoplePresent(
			java.util.List<com.myspace.surveillanceproject.PersonPresent> peoplePresent) {
		this.peoplePresent = peoplePresent;
	}

	public java.lang.Boolean getIrregularitiesFound() {
		return this.irregularitiesFound;
	}

	public void setIrregularitiesFound(java.lang.Boolean irregularitiesFound) {
		this.irregularitiesFound = irregularitiesFound;
	}

	public java.lang.String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(java.lang.String remarks) {
		this.remarks = remarks;
	}

	public java.util.List<com.myspace.surveillanceproject.Repercussion> getRepercussions() {
		return this.repercussions;
	}

	public void setRepercussions(
			java.util.List<com.myspace.surveillanceproject.Repercussion> repercussions) {
		this.repercussions = repercussions;
	}

	public java.lang.String getInspectionFindings() {
		return this.inspectionFindings;
	}

	public void setInspectionFindings(java.lang.String inspectionFindings) {
		this.inspectionFindings = inspectionFindings;
	}

	public java.util.Date getReportDate() {
		return this.reportDate;
	}

	public void setReportDate(java.util.Date reportDate) {
		this.reportDate = reportDate;
	}

	public java.util.Date getInspectionStartDate() {
		return this.inspectionStartDate;
	}

	public void setInspectionStartDate(java.util.Date inspectionStartDate) {
		this.inspectionStartDate = inspectionStartDate;
	}

	public java.util.Date getInspectionEndDate() {
		return this.inspectionEndDate;
	}

	public void setInspectionEndDate(java.util.Date inspectionEndDate) {
		this.inspectionEndDate = inspectionEndDate;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.Boolean getUsingCheckLists() {
		return this.usingCheckLists;
	}

	public void setUsingCheckLists(java.lang.Boolean usingCheckLists) {
		this.usingCheckLists = usingCheckLists;
	}

	public java.util.Date getArchiveDate() {
		return this.archiveDate;
	}

	public void setArchiveDate(java.util.Date archiveDate) {
		this.archiveDate = archiveDate;
	}

	public java.lang.Integer getNumOfIrregularities() {
		return this.numOfIrregularities;
	}

	public void setNumOfIrregularities(java.lang.Integer numOfIrregularities) {
		this.numOfIrregularities = numOfIrregularities;
	}

	public java.util.Date getReportReceiptDate() {
		return this.reportReceiptDate;
	}

	public void setReportReceiptDate(java.util.Date reportReceiptDate) {
		this.reportReceiptDate = reportReceiptDate;
	}

	public java.lang.String getNotUsedCheckListsReason() {
		return this.notUsedCheckListsReason;
	}

	public void setNotUsedCheckListsReason(
			java.lang.String notUsedCheckListsReason) {
		this.notUsedCheckListsReason = notUsedCheckListsReason;
	}

	public java.lang.String getKnownSubject() {
		return this.knownSubject;
	}

	public void setKnownSubject(java.lang.String knownSubject) {
		this.knownSubject = knownSubject;
	}

	public java.util.List<com.myspace.surveillanceproject.Documents> getDocuments() {
		return this.documents;
	}

	public void setDocuments(
			java.util.List<com.myspace.surveillanceproject.Documents> documents) {
		this.documents = documents;
	}

	public InspectionReport(
			java.lang.String archiveNumber,
			java.util.Date reportDate,
			java.lang.String type,
			java.lang.String basedOn,
			java.lang.String knownSubject,
			java.util.Date inspectionStartDate,
			java.util.Date inspectionEndDate,
			java.lang.String facilityName,
			java.lang.String facilityAddress,
			java.lang.String facilityMainActivity,
			com.myspace.surveillanceproject.CommonInspectionObject common,
			com.myspace.surveillanceproject.InspectionSubject subject,
			java.lang.String description,
			java.util.List<com.myspace.surveillanceproject.LawInstance> laws,
			java.util.List<com.myspace.surveillanceproject.InvolvedInspector> involvedInspectors,
			java.util.List<com.myspace.surveillanceproject.AccountableParty> accountableParties,
			java.util.List<com.myspace.surveillanceproject.AccountableParty> subjectRepresentatives,
			java.util.List<com.myspace.surveillanceproject.CheckListInstance> checkLists,
			java.util.List<com.myspace.surveillanceproject.PersonPresent> peoplePresent,
			java.lang.Boolean irregularitiesFound,
			java.lang.String remarks,
			java.util.List<com.myspace.surveillanceproject.Repercussion> repercussions,
			java.lang.String inspectionFindings, java.lang.String id,
			java.lang.Boolean usingCheckLists, java.util.Date archiveDate,
			java.lang.Integer numOfIrregularities,
			java.util.Date reportReceiptDate,
			java.lang.String notUsedCheckListsReason,
			java.util.List<com.myspace.surveillanceproject.Documents> documents) {
		this.archiveNumber = archiveNumber;
		this.reportDate = reportDate;
		this.type = type;
		this.basedOn = basedOn;
		this.knownSubject = knownSubject;
		this.inspectionStartDate = inspectionStartDate;
		this.inspectionEndDate = inspectionEndDate;
		this.facilityName = facilityName;
		this.facilityAddress = facilityAddress;
		this.facilityMainActivity = facilityMainActivity;
		this.common = common;
		this.subject = subject;
		this.description = description;
		this.laws = laws;
		this.involvedInspectors = involvedInspectors;
		this.accountableParties = accountableParties;
		this.subjectRepresentatives = subjectRepresentatives;
		this.checkLists = checkLists;
		this.peoplePresent = peoplePresent;
		this.irregularitiesFound = irregularitiesFound;
		this.remarks = remarks;
		this.repercussions = repercussions;
		this.inspectionFindings = inspectionFindings;
		this.id = id;
		this.usingCheckLists = usingCheckLists;
		this.archiveDate = archiveDate;
		this.numOfIrregularities = numOfIrregularities;
		this.reportReceiptDate = reportReceiptDate;
		this.notUsedCheckListsReason = notUsedCheckListsReason;
		this.documents = documents;
	}

}
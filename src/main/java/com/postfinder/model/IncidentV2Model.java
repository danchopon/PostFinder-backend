package com.postfinder.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(schema = "public", name = "incident_v2")
public class IncidentV2Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "number")
    private String number;
    @Column(name = "date_at")
    private Timestamp dateAt;
    @Column(name = "applicant_surname")
    private String applicantSurname;
    @Column(name = "applicant_name")
    private String applicantName;
    @Column(name = "applicant_middlename")
    private String applicantMiddlename;
    @Column(name = "applicant_date_of_birth")
    private Timestamp applicantDateOfBirth;
    @Column(name = "applicant_address")
    private String applicantAddress;
    @Column(name = "applicant_phone")
    private String applicantPhone;
    @Column(name = "applicant_company_name")
    private String applicantCompanyName;
    @Column(name = "incident_address")
    private String incidentAddress;
    @Column(name = "incident_address_mark")
    private String incidentAddressMark;
    @Column(name = "incident_information")
    private String incidentInformation;
    @Column(name = "incident_information_comment")
    private String incidentInformationComment;
    @Column(name = "time_of_battalion")
    private Timestamp timeOfBattalion;
    @Column(name = "incident_type")
    private String incidentType;
    @Column(name = "battalion_id")
    private String battalionId;

    public IncidentV2Model(long id, String battalionId, String incidentAddress) {
        this.id = id;
        this.battalionId = battalionId;
        this.incidentAddress = incidentAddress;
    }

    public IncidentV2Model() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Timestamp getDateAt() {
        return dateAt;
    }

    public void setDateAt(Timestamp dateAt) {
        this.dateAt = dateAt;
    }

    public String getApplicantSurname() {
        return applicantSurname;
    }

    public void setApplicantSurname(String applicantSurname) {
        this.applicantSurname = applicantSurname;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getApplicantMiddlename() {
        return applicantMiddlename;
    }

    public void setApplicantMiddlename(String applicantMiddlename) {
        this.applicantMiddlename = applicantMiddlename;
    }

    public Timestamp getApplicantDateOfBirth() {
        return applicantDateOfBirth;
    }

    public void setApplicantDateOfBirth(Timestamp applicantDateOfBirth) {
        this.applicantDateOfBirth = applicantDateOfBirth;
    }

    public String getApplicantAddress() {
        return applicantAddress;
    }

    public void setApplicantAddress(String applicantAddress) {
        this.applicantAddress = applicantAddress;
    }

    public String getApplicantPhone() {
        return applicantPhone;
    }

    public void setApplicantPhone(String applicantPhone) {
        this.applicantPhone = applicantPhone;
    }

    public String getApplicantCompanyName() {
        return applicantCompanyName;
    }

    public void setApplicantCompanyName(String applicantCompanyName) {
        this.applicantCompanyName = applicantCompanyName;
    }

    public String getIncidentAddress() {
        return incidentAddress;
    }

    public void setIncidentAddress(String incidentAddress) {
        this.incidentAddress = incidentAddress;
    }

    public String getIncidentAddressMark() {
        return incidentAddressMark;
    }

    public void setIncidentAddressMark(String incidentAddressMark) {
        this.incidentAddressMark = incidentAddressMark;
    }

    public String getIncidentInformation() {
        return incidentInformation;
    }

    public void setIncidentInformation(String incidentInformation) {
        this.incidentInformation = incidentInformation;
    }

    public String getIncidentInformationComment() {
        return incidentInformationComment;
    }

    public void setIncidentInformationComment(String incidentInformationComment) {
        this.incidentInformationComment = incidentInformationComment;
    }

    public Timestamp getTimeOfBattalion() {
        return timeOfBattalion;
    }

    public void setTimeOfBattalion(Timestamp timeOfBattalion) {
        this.timeOfBattalion = timeOfBattalion;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public String getBattalionId() {
        return battalionId;
    }

    public void setBattalionId(String battalionId) {
        this.battalionId = battalionId;
    }
}

package com.example.visa.entity;

// import lombok.AllArgsConstructor;
// import lombok.Data;
// import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table
public class Visa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long visaId;
    @Column
    private String issueCountry;    
    @Column 
    private String issueMonth;      //month of issue
    @Column 
    private String issueRegistrar;  //city of registration

    public Long getVisaId() {
        return this.visaId;
    }

    public void setVisaId(Long id) {
        this.visaId = id;
    }

    public String getIssueCountry() {
        return this.issueCountry;
    }

    public void setIssueCountry(String issueCountry) {
        this.issueCountry = issueCountry;
    }

    public String getIssueMonth() {
        return this.issueMonth;
    }

    public void setIssueMonth(String issueMonth) {
        this.issueMonth = issueMonth;
    }

    public String getIssueRegistrar() {
        return this.issueRegistrar;
    }

    public void setIssueRegistrar(String issueRegistrar) {
        this.issueRegistrar = issueRegistrar;
    }
}
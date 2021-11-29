package com.example.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Visa {
    private Long visaId;
    private String issueCountry;    
    private String issueMonth;      //month of issue
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
package com.validatorbean;
// Generated Aug 22, 2019 3:41:11 AM by Hibernate Tools 4.3.1



/**
 * ResultTable generated by hbm2java
 */
public class ResultTable  implements java.io.Serializable {


     private Integer resultsId;
     private AdminTable adminTable;
     private ParticipantsInfo participantsInfo;
     private String result;

    public ResultTable() {
    }

    public ResultTable(AdminTable adminTable, ParticipantsInfo participantsInfo, String result) {
       this.adminTable = adminTable;
       this.participantsInfo = participantsInfo;
       this.result = result;
    }
   
    public Integer getResultsId() {
        return this.resultsId;
    }
    
    public void setResultsId(Integer resultsId) {
        this.resultsId = resultsId;
    }
    public AdminTable getAdminTable() {
        return this.adminTable;
    }
    
    public void setAdminTable(AdminTable adminTable) {
        this.adminTable = adminTable;
    }
    public ParticipantsInfo getParticipantsInfo() {
        return this.participantsInfo;
    }
    
    public void setParticipantsInfo(ParticipantsInfo participantsInfo) {
        this.participantsInfo = participantsInfo;
    }
    public String getResult() {
        return this.result;
    }
    
    public void setResult(String result) {
        this.result = result;
    }




}


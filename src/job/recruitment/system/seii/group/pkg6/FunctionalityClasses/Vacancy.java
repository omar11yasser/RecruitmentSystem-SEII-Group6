package job.recruitment.system.seii.group.pkg6.FunctionalityClasses;
import java.sql.SQLException;
import java.util.*;
import job.recruitment.system.seii.group.pkg6.Utils.VacancyTableDatabasUtils;
/**
 *
 * @author Omar
 */
public class Vacancy {
    private String vacancyID;    
    private String vacancyTitle;
    private String vacancyJobRequirments;
    private String vacancyEmployerId;
    private long deadlineTimeStamp;
    private long creationTimeStamp;
    private String vacancyState;
    private List<JobApplication> listOfApplicantions;
    private List<Admin> observersList;
    
    
    
    // Constructor to be used when creating new vacancies.
    public Vacancy(String vacancyTitle, String vacancyJobRequirments, String vacancyEmployerId, long deadlineTimeStamp) {
        this.vacancyTitle = vacancyTitle;
        this.vacancyJobRequirments = vacancyJobRequirments;
        this.vacancyEmployerId = vacancyEmployerId;
        this.deadlineTimeStamp = deadlineTimeStamp;
        // Add the current timestamp to the newely created vacancy as the creation time stamp.
        this.creationTimeStamp = System.currentTimeMillis();
    }
    // Constructor to be used when retrieving already existing vacancies.
    public Vacancy(String vacancyID, String vacancyTitle, String vacancyJobRequirments, String vacancyEmployerId, long deadlineTimeStamp
            , long creationTimeStamp, String vacancyState, List<JobApplication> listOfApplicantions, List<Admin> observersList) {
        this.vacancyID = vacancyID;
        this.vacancyTitle = vacancyTitle;
        this.vacancyJobRequirments = vacancyJobRequirments;
        this.vacancyEmployerId = vacancyEmployerId;
        this.deadlineTimeStamp = deadlineTimeStamp;
        this.creationTimeStamp = creationTimeStamp;
        this.vacancyState = vacancyState;
        this.listOfApplicantions = listOfApplicantions;
        this.observersList = observersList;
    }

    public Vacancy() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Getters and setters for the class' data.
    public String getVacancyID() {
        return vacancyID;
    }

    public void setVacancyID(String vacancyID) {
        this.vacancyID = vacancyID;
    }

    public String getVacancyTitle() {
        return vacancyTitle;
    }

    public void setVacancyTitle(String vacancyTitle) {
        this.vacancyTitle = vacancyTitle;
    }

    public String getVacancyJobRequirments() {
        return vacancyJobRequirments;
    }

    public void setVacancyJobRequirments(String vacancyJobRequirments) {
        this.vacancyJobRequirments = vacancyJobRequirments;
    }

    public String getVacancyEmployerId() {
        return vacancyEmployerId;
    }

    public void setVacancyEmployerId(String vacancyEmployerId) {
        this.vacancyEmployerId = vacancyEmployerId;
    }

    public long getDeadlineTimeStamp() {
        return deadlineTimeStamp;
    }

    public void setDeadlineTimeStamp(long deadlineTimeStamp) {
        this.deadlineTimeStamp = deadlineTimeStamp;
    }

    public long getCreationTimeStamp() {
        return creationTimeStamp;
    }

    public void setCreationTimeStamp(long creationTimeStamp) {
        this.creationTimeStamp = creationTimeStamp;
    }

    public String getVacancyState() {
        return vacancyState;
    }

    public void setVacancyState(String vacancyState) {
        this.vacancyState = vacancyState;
    }

    public List<JobApplication> getListOfApplicantions() {
        return listOfApplicantions;
    }

    
    public void setListOfApplicantions(List<JobApplication> listOfApplicantions) {
        this.listOfApplicantions = listOfApplicantions;
    }

    public List<Admin> getObserversList() {
        return observersList;
    }

    public void setObserversList(List<Admin> observersList) {
        this.observersList = observersList;
    }
    
    
    // Used to retrieve the submitted applications for this vacancy.
    public List<JobApplication> viewSubmittedApplications(){
        
        return listOfApplicantions;
    }
    
    // Get vacancy details using vacancy ID
    public Vacancy getVacancyUsingId(String vacancyId) throws SQLException{
        return  VacancyTableDatabasUtils.retieveFromVacancyUsingVacancyId(vacancyId);
    }
}

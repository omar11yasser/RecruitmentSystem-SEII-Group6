package job.recruitment.system.seii.group.pkg6.FunctionalityClasses;
import java.util.*;

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

    public Vacancy(String vacancyTitle, String vacancyJobRequirments, String vacancyEmployerId, long deadlineTimeStamp4) {
        this.vacancyTitle = vacancyTitle;
        this.vacancyJobRequirments = vacancyJobRequirments;
        this.vacancyEmployerId = vacancyEmployerId;
        this.deadlineTimeStamp = deadlineTimeStamp;
    }
    
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
    
    

    public List<JobApplication> viewSubmittedApplications(){
        
        return listOfApplicantions;
    }
}

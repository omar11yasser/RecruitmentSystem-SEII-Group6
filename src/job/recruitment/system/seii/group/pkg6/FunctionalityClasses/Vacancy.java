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

    public List<JobApplication> viewSubmittedApplications(){
        
        return listOfApplicantions;
    }
}

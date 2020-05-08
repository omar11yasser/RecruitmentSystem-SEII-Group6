package job.recruitment.system.seii.group.pkg6.FunctionalityClasses;

/**
 *
 * @author Omar
 */
public class JobApplication {
  
   private String ApplicationId;
   private String ApllicationAuthourID;
   private String VacancyID;
   private String EmployerResponse;
   private long SubmissionDataTimeStamp;
   private String UserFilledResponse;

    public JobApplication(String ApplicationId, String ApllicationAuthourID, String VacancyID, String EmployerResponse, long SubmissionDataTimeStamp, String UserFilledResponse) {
        this.ApplicationId = ApplicationId;
        this.ApllicationAuthourID = ApllicationAuthourID;
        this.VacancyID = VacancyID;
        this.EmployerResponse = EmployerResponse;
        this.SubmissionDataTimeStamp = SubmissionDataTimeStamp;
        this.UserFilledResponse = UserFilledResponse;
    }

    public String getApplicationId() {
        return ApplicationId;
    }

    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    public String getApllicationAuthourID() {
        return ApllicationAuthourID;
    }

    public void setApllicationAuthourID(String ApllicationAuthourID) {
        this.ApllicationAuthourID = ApllicationAuthourID;
    }

    public String getVacancyID() {
        return VacancyID;
    }

    public void setVacancyID(String VacancyID) {
        this.VacancyID = VacancyID;
    }

    public String getEmployerResponse() {
        return EmployerResponse;
    }

    public void setEmployerResponse(String EmployerResponse) {
        this.EmployerResponse = EmployerResponse;
    }

    public long getSubmissionDataTimeStamp() {
        return SubmissionDataTimeStamp;
    }

    public void setSubmissionDataTimeStamp(long SubmissionDataTimeStamp) {
        this.SubmissionDataTimeStamp = SubmissionDataTimeStamp;
    }

    public String getUserFilledResponse() {
        return UserFilledResponse;
    }

    public void setUserFilledResponse(String UserFilledResponse) {
        this.UserFilledResponse = UserFilledResponse;
    }
}
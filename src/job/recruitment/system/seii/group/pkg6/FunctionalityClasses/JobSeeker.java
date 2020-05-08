package job.recruitment.system.seii.group.pkg6.FunctionalityClasses;

import java.util.List;

/**
 *
 * @author Sawy
 */
public class JobSeeker extends User {
    
    private List <Vacancy> SavedVacancy;
    private List <JobApplication> ListOfPastSubmission;
    private List <Achivment> ListOfAchivment;

    public JobSeeker(List<Vacancy> SavedVacancy, List<JobApplication> ListOfPastSubmission, List<Achivment> ListOfAchivment) {
        this.SavedVacancy = SavedVacancy;
        this.ListOfPastSubmission = ListOfPastSubmission;
        this.ListOfAchivment = ListOfAchivment;
    }

    public List<Vacancy> getSavedVacancy() {
        return SavedVacancy;
    }

    public void setSavedVacancy(List<Vacancy> SavedVacancy) {
        this.SavedVacancy = SavedVacancy;
    }

    public List<JobApplication> getListOfPastSubmission() {
        return ListOfPastSubmission;
    }

    public void setListOfPastSubmission(List<JobApplication> ListOfPastSubmission) {
        this.ListOfPastSubmission = ListOfPastSubmission;
    }

    public List<Achivment> getListOfAchivment() {
        return ListOfAchivment;
    }

    public void setListOfAchivment(List<Achivment> ListOfAchivment) {
        this.ListOfAchivment = ListOfAchivment;
    }

    public Account getAccountDataAndUtils() {
        return accountDataAndUtils;
    }

    public void setAccountDataAndUtils(Account accountDataAndUtils) {
        this.accountDataAndUtils = accountDataAndUtils;
    }
 
    
    
     
    
    
     
    
    
     
    
    
    
    void addAchivment(){
    };
    void UpdateResume(){
    };
    void DeleteAchivment(){
    };
    void SaveI_Vacancies(){
    };
    
    void CreateJobApplication(){
    };
    void SubmitJobApplication(){
    };
    
}


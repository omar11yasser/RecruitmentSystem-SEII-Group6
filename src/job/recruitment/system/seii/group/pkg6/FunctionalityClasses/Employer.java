package job.recruitment.system.seii.group.pkg6.FunctionalityClasses;
import Interfaces.NewJobApplicationObserver;
import java.util.*;
import job.recruitment.system.seii.group.pkg6.EmployerCreateVacancy;

/**
 *
 * @author Omar
 */
public class Employer extends User implements NewJobApplicationObserver{
    private String companyCategory;
    private List<Vacancy> postedVacancies;
    
    public static void main(String[] args){
        CreateJobVacancy();
    }

    public Employer() {
    }
    
    Employer(String userName , String userMail , String userMobileNumber , String companyCategory){
        accountDataAndUtils = new Account();
        postedVacancies = new ArrayList<>();   
    }
    
    //Opens the requiered Jframe 
    public static void CreateJobVacancy(){
        EmployerCreateVacancy createVacancy = new EmployerCreateVacancy();
        createVacancy.setVisible(true);
    }
    
    public void updatePostedVacanciesList(Vacancy vacancy){
        postedVacancies.add(vacancy);
    }
    
    public void viewAllVacanciesCreatedByCertainEmployer(String employerId){
        
    }
    
    public void editVacancyDetails(Vacancy vacancy){
    }
    
    public void downloadJobSeekerResume(){}
    
    //TODO: ad the search functions here
    
    public String checkVacancyState(Vacancy vacancy){
        // return the vacancy state here
        return "";
    }
    
    private void respondToApplication(String adminResponse , JobApplication application){
    
    }
    
    public void update(JobApplication news){    }
        
}

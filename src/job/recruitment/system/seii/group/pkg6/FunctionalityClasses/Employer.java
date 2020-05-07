package job.recruitment.system.seii.group.pkg6.FunctionalityClasses;
import java.util.*;

/**
 *
 * @author Omar
 */
public class Employer extends User{
    private String companyCategory;
    private List<Vacancy> postedVacancies;

    public Employer() {
    }
    
    Employer(String userName , String userMail , String userMobileNumber , String companyCategory){
        accountDataAndUtils = new Account();
        postedVacancies = new ArrayList<>();   
    }
    
    
    public void CreateJobVacancy(){
    
    }
    
    public void updatePostedVacanciesList(Vacancy vacancy){
        postedVacancies.add(vacancy);
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
        
}

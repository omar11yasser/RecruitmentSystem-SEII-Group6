package Interfaces;

import job.recruitment.system.seii.group.pkg6.FunctionalityClasses.Employer;
import job.recruitment.system.seii.group.pkg6.FunctionalityClasses.JobApplication;

/**
 *
 * @author Omar
 */
public interface NewJobApplicationSubject {
    
    public void addObserver(Employer observer);
    public void removeObserver(Employer oobserver);
    public void updateAll(JobApplication jobApplication);
}

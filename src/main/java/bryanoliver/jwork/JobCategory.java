package bryanoliver.jwork;
/**
 * Enum JobCategory
 *
 * @author Bryan Oliver
 * @version 25.3.2021
 */
public enum JobCategory {
        WebDeveloper("Web Developer"), FrontEnd("Front End"), BackEnd("Back End"), UI("UI"), UX("UX"), Devops("Devops"),
    DataScientist("Data Scientist"), DataAnalyst("Data Analyst");
      private String jobcategory;

    private JobCategory(String category) {
        this.jobcategory = category;

    }

    @Override
    public String toString() {
        return jobcategory;
    }
    
    
    /**
 *  public static void main(String[] args) 
 *Fungsi Main untuk membentuk berbagai kategori untuk job
 */
    public static void main(String[] args) {
        JobCategory firstcat = JobCategory.WebDeveloper;
        JobCategory seccat = JobCategory.FrontEnd;
        JobCategory thirdcat = JobCategory.BackEnd;
        JobCategory fourthcat = JobCategory.UI;
        JobCategory fifthcat = JobCategory.UX;
        JobCategory sixthcat = JobCategory.Devops;
        JobCategory seventhcat = JobCategory.DataScientist;
        JobCategory eightcat = JobCategory.DataAnalyst;
        System.out.println(firstcat);
        System.out.println(seccat);
        System.out.println(thirdcat);
        System.out.println(fourthcat);
        System.out.println(fifthcat);
        System.out.println(sixthcat);
        System.out.println(seventhcat);
        System.out.println(eightcat);

    }
}
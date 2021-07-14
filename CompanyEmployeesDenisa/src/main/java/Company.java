
import java.util.Set;

public class Company {

    private String name;
    private Set<Candidate> candidateSet;
    private Set<Department> departmentSet;

    public static void recruiting(Candidate candidate) {
        Department dProduction = new Production();
        Department dMarketing = new Marketing();

        if (candidate.getChosenDepartmentName() != DepartmentName.MARKETING
                && candidate.getChosenDepartmentName() != DepartmentName.PRODUCTION) {
            throw new EvaluationIncapacityException("Departament neconform.");
        } else if (candidate.getChosenDepartmentName().equals(DepartmentName.MARKETING)) {
            dMarketing.setMinLevelOfCompetence(5);
            dMarketing.evaluate(candidate);
        } else if (candidate.getChosenDepartmentName().equals(DepartmentName.PRODUCTION)) {
            dProduction.setMinLevelOfCompetence(7);
            dProduction.evaluate(candidate);
        }

    }


}

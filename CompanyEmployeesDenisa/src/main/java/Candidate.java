public class Candidate {
   private String fullName;
   protected int levelOfCompetence;

   private DepartmentName chosenDepartmentName;

   private Status status;


    public Candidate(String fullName, int levelOfCompetence, DepartmentName chosenDepartmentName) {
        this.fullName = fullName;
        this.levelOfCompetence = levelOfCompetence;
        this.chosenDepartmentName = chosenDepartmentName;
        this.status = Status.AWAITING;
    }

    public int getLevelOfCompetence() {
        return levelOfCompetence;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public DepartmentName getChosenDepartmentName() {
        return chosenDepartmentName;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "fullName='" + fullName + '\'' +
                ", levelOfCompetence=" + levelOfCompetence +
                ", chosenDepartmentName=" + chosenDepartmentName +
                ", status=" + status +
                '}';
    }
}

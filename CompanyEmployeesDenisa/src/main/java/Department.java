public class Department implements Evaluator {

    protected int minLevelOfCompetence;


    public void setMinLevelOfCompetence(int minLevelOfCompetence) {
        this.minLevelOfCompetence = minLevelOfCompetence;
    }

    @Override
   public void evaluate(Candidate candidate) {
   if(candidate.levelOfCompetence>=minLevelOfCompetence)
       candidate.setStatus(Status.ACCEPTED);
   else
       candidate.setStatus(Status.REJECTED);
   }


}

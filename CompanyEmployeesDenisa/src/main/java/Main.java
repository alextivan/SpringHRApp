public class Main {

    public static void main(String[] args) {

        Candidate candidate1 = new Candidate("Paul", 8, DepartmentName.PRODUCTION);
        System.out.println(candidate1);
        Company.recruiting(candidate1);
        System.out.println(candidate1);


    }
}

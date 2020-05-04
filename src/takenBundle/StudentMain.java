package takenBundle;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("moges");
        Student student2 = new Student("Retta",23);
        System.out.println(student1.getNaam());
        System.out.println(student2.getScore());
        student1.setNaam("Leul");
        student2.setScore(92);
        System.out.println(student1.getNaam());
        System.out.println(student2.getScore());
    }
}

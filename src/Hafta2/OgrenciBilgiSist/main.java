package Hafta2.OgrenciBilgiSist;

public class main {
    public static void main(String[] args) {

        Course history = new Course("Kimya","1","TAR");
        Course physics = new Course("Fizik", "2","FZK");
        Course mathematics = new Course("Matematik","3","MAT");

        Teacher teacher1 = new Teacher("Esra Hoca","123","TAR");
        Teacher teacher2 = new Teacher("Ayşe Hoca", "456", "FZK");
        Teacher teacher3 = new Teacher("Necla Hoca","789","MAT");

        history.addTeacher(teacher1);
        physics.addTeacher(teacher2);
        mathematics.addTeacher(teacher3);

        System.out.println();

        history.printTeacher();
        physics.printTeacher();
        mathematics.printTeacher();

        Student student1 = new Student("Betül","11",4,history,physics,mathematics);
        student1.addBulkExamNote(90,70,90,80,70,65);
        student1.isPass();

        Student student2 = new Student("Ali","12",3,history,physics,mathematics);
        student2.addBulkExamNote(75,65,20,30,55,55);
        student2.isPass();

        Student student3 = new Student("Ece","13",2,history,physics,mathematics);
        student3.addBulkExamNote(55,60,85,20,75,90);
        student3.isPass();

    }
}

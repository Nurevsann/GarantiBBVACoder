package Hafta2.OgrenciBilgiSist;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }

    void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)){
            this.teacher = teacher;
            System.out.println("İşlem Başarılı !"+" "+teacher.name+" "+this.name+" dersi için akademisyen olarak eklendi.");
        }else {
            System.out.println(teacher.name+" "+this.name+" dersi veremez !");
        }
    }

    void printTeacher(){
        if (teacher != null){
            System.out.println(this.name+" dersinin akademisyeni : "+teacher.name);
        }else {
            System.out.println(this.name+" dersine akademisyen atanmamıştır !");
        }
    }
}

package Hafta2.OgrenciBilgiSist;

public class Student {

    String name;
    String stuNo;
    int classes;
    Course history;
    Course physics;
    Course mathematics;
    double average;
    boolean isPass;

    Student(String name, String stuNo, int classes, Course history, Course physics, Course mathematics){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.history = history;
        this.physics = physics;
        this.mathematics = mathematics;
        calculationAverage();
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int verbalNote1,int verbalNote2,int verbalNote3){
        if ((note1 >= 0  && note1 <= 100) && (verbalNote1 >= 0 && verbalNote1 <= 100)){
            this.history.note = note1;
            this.history.verbalNote = verbalNote1;
        }
        if ((note2 >= 0  && note2 <= 100) && (verbalNote2 >= 0 && verbalNote2 <= 100)){
            this.physics.note = note2;
            this.physics.verbalNote = verbalNote2;
        }
        if ((note3 >= 0  && note3 <= 100) && (verbalNote3 >= 0 && verbalNote3 <= 100)){
            this.mathematics.note = note3;
            this.mathematics.verbalNote = verbalNote3;
        }
    }

    void isPass(){
        if (this.history.note == 0 || this.physics.note == 0 || this.mathematics.note == 0 || this.history.verbalNote == 0 || this.physics.verbalNote == 0 || this.mathematics.verbalNote == 0){
            System.out.println("Notlar girilmemiş veya eksik girilmiş olabilir, lütfen kontrol ediniz !");
        }else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : "+this.average);
            System.out.println();
            if (this.isPass){
                System.out.println("Sınıfı Geçtiniz !");
            }else {
                System.out.println("Sınıfta Kaldınız !");
            }
        }
    }

    void calculationAverage(){
        this.average = ((((this.history.note)*0.8)+((this.history.verbalNote)*0.2) + (((this.physics.note)*0.8)+((this.physics.verbalNote)*0.2) + (((this.mathematics.note)*0.8)+((this.mathematics.verbalNote)*0.2)))))/3.0;
    }

    boolean isCheckPass(){
        calculationAverage();
        return this.average > 55;
    }

    void printNote(){
        System.out.println("==========================");
        System.out.println("Öğrenci : "+this.name);
        System.out.println();
        System.out.println(this.history.name+" Notu "+this.history.note);
        System.out.println(this.physics.name+" Notu "+this.physics.note);
        System.out.println(this.mathematics.name+" Notu "+this.mathematics.note);
    }
}

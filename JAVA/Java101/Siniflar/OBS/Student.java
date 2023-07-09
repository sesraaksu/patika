package JAVA.Java101.Siniflar.OBS;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addBulkVerbalNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.verbal = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.verbal = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.verbal = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        double fizikToplam = (this.fizik.note * 0.80) + (this.fizik.verbal * 0.20);
        double kimyaToplam = (this.kimya.note * 0.70) + (this.kimya.verbal * 0.30);
        double matToplam = (this.mat.note * 0.95) + (this.mat.verbal * 0.05);
        this.avarage = (fizikToplam + kimyaToplam + matToplam) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sınav Notu : " + this.mat.note + "\nMatematik Sözlü Notu : " + this.mat.verbal);
        System.out.println("Fizik Sınav Notu : " + this.fizik.note + "\nFizik Sözlü Notu : " + this.fizik.verbal);
        System.out.println("Kimya Sınav Notu : " + this.kimya.note + "\nKimya Sözlü Notu : " + this.kimya.verbal);
    }
}

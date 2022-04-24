public class Main {
    public static void main(String[] args) {
        Cors mat  = new Cors("Matematik", "MAT*", "MAT");
        Cors fizik = new Cors("Fizik", "FZK*", "FZK");
        Cors kimya = new Cors("Kimya", "KMY*", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Ogrenci s1 = new Ogrenci("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(40, 20, 90);
        s1.isPass();

        Ogrenci s2 = new Ogrenci("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(80, 15, 65);
        s2.isPass();

        Ogrenci s3 = new Ogrenci("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50, 20, 40);
        s3.isPass();
    }
}

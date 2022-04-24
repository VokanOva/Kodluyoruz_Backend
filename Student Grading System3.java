public class Ogrenci {
        String name, stuNo;
        int classes;
        Cors mat;
        Cors fizik;
        Cors kimya;
        double avarage;
        boolean isPass;


        Ogrenci(String name, int classes, String stuNo, Cors mat, Cors fizik, Cors kimya) {
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

        public void isPass() {
            if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
                System.out.println("Notlar tam olarak girilmemiş");
            } else {
                this.isPass = isCheckPass();
                printNote();
                System.out.println("Ortalama : " + this.avarage);
                if (this.isPass) {
                    System.out.println("Sinifi Gecti. ");
                } else {
                    System.out.println("Sinifta Kaldi.");
                }
            }
        }

        public void calcAvarage() {
            this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
        }

        public boolean isCheckPass() {
            calcAvarage();
            return this.avarage > 55;
        }

        public void printNote() {
            System.out.println("=========================");
            System.out.println("Öğrenci : " + this.name);
            System.out.println("Matematik Notu : " + this.mat.note);
            System.out.println("Fizik Notu : " + this.fizik.note);
            System.out.println("Kimya Notu : " + this.kimya.note);
        }
    }


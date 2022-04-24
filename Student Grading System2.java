public class Cors {
        Teacher courseTeacher;
        String name;
        String code;
        String pref;
        int note;

        public Cors(String name, String code, String pref) {
            this.name = name;
            this.code = code;
            this.pref = pref;
            this.note = 0;
        }

        public void addTeacher(Teacher t) {
            if (this.pref.equals(t.branch)) {
                this.courseTeacher = t;
                System.out.println("islem basarili");
            } else {
                System.out.println(t.name + " Akademisyeni bu dersi veremez.");
            }
        }

        public void printTeacher() {
            if (courseTeacher != null) {
                System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
            } else {
                System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
            }
        }
    }


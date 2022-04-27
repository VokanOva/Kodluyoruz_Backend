public class Eleman {

        String isim;
        double maas;
        int calismaSaati;
        int CBTarihi;
        double vergi;
        double ikramiye;
        double zam;


        Eleman(String name, int salary, int workHours, int hireYear) {
            this.isim = isim;
            this.maas = maas;
            this.calismaSaati = calismaSaati;
            this.CBTarihi = CBTarihi;
        }

        void vergi() {
            if (this.maas > 0 && this.maas < 1000) {
                this.vergi = this.maas * 0;
            } else {
                this.vergi = this.maas * 0.03;
            }
        }

        void ikramiye() {
            if (this.calismaSaati > 40) {
                this.ikramiye = 30 * (this.calismaSaati - 40);
            }
        }

        void MaasZami() {
            if (2021 - this.CBTarihi < 10) {
                this.zam = this.maas * 0.05;
            } else if (2021 - this.CBTarihi > 9 && 2021 - this.CBTarihi < 20) {
                this.zam = this.maas * 0.10;
            } else {
                this.zam = this.maas * 0.15;
            }
        }

        void ElemanBilgileri() {
            System.out.println("Adı : " + this.isim);
            System.out.println("Maaşı : " + this.maas);
            System.out.println("Çalışma Saati : " + this.calismaSaati);
            System.out.println("Başlangıç Yılı : " + this.CBTarihi);
            System.out.println("Vergi : " + this.vergi);
            System.out.println("Bonus : " + this.ikramiye);
            System.out.println("Maaş Artışı : " + this.zam);
            System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.maas + this.ikramiye - this.vergi));
            System.out.println("Toplam maaş : " + ((this.maas + this.ikramiye - this.vergi) + this.zam));
        }

    }



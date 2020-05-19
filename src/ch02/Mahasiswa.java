package ch02;

public class Mahasiswa {
       String nim;
       String nama;
       String alamat;
       String hp;

       public String getNim() {
          return nim;
       }
       public String getNma() {
          return nama;
       }
       public String getAlamat() {
          return alamat;
       }
       public String getHp() {
          return hp;
       }
       public void cetak() {
           Syetem.out.println("NIM : " + nim);
           Syetem.out.println("Nama : " nama);
           Syetem.out.println("Alamat : " +alamat);
           System.out.println("HP : " + hp);

     }
}

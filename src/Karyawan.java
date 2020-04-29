public class Karyawan {

    String nama;
    int umur;
    String pangkat;
    int gaji;
    String alamat;


    void umurKaryawan(int umurKaryawan){
        umur =  umurKaryawan;
    }

    void pangkatKaryawan(String pangkatKaryawan){
        pangkat = pangkatKaryawan;
    }

    void gajiKaryawan(int gajiKaryawan){
        gaji = gajiKaryawan;
    }
    public void cetak(){
        System.out.println("===========================");
        System.out.println("Nama   :" + nama );
        System.out.println("Umur   :" + umur );
        System.out.println("Pangkat:" + pangkat );
        System.out.println("Gaji   :" + gaji);
        System.out.println("Alamat : "+alamat);
        System.out.println();
    }

}

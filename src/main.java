public class main {
    public static void main(String[] args){

        Karyawan karyawan1 = new Karyawan();
        Karyawan karyawan2 = new Karyawan();

        karyawan1.nama ="Muhamad Noval";
        karyawan1.umur = 20;
        karyawan1.pangkat = "Web Deseign";
        karyawan1.gaji = 100000000;
        karyawan1.alamat = "Jln Merpati 2";
        karyawan1.cetak();

        karyawan2.nama ="Ana Putri Aisyah";
        karyawan2.umur = 21;
        karyawan2.pangkat = "Desain Grafis";
        karyawan2.gaji = 100000000;
        karyawan2.alamat = "Jln sukaramai 2 blok E";
        karyawan2.cetak();

    }
}

package TugasPraktikum;

public class MainMahasiswa {

    public static void main(String[] args) {
        ClassAlamat a1 = new ClassAlamat("M. Abdul Algoniu", "Banyuwangi", "08955376982", "mochniyu@gmail.com");
        a1.setNama("M. Abdul Algoniu");
        System.out.println("Nama           :" + a1.getNama());
        a1.setAlamat("Banyuwangi");
        System.out.println("Alamat         :" + a1.getAlamat());
        a1.setNomertelepon("45834574");
        System.out.println("Nomor telepon  :" + a1.getNomertelepon());
        a1.setEmail("mochniyu@gmail.com");
        System.out.println("Email          :" + a1.getEmail());
    }
}
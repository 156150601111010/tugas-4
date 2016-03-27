package TugasPraktikum;

public class ClassAlamat {

    private String nama;
    private String alamat;
    private String nmertelpn;
    private String email;

    public ClassAlamat(String nama, String alamat, String nmertelpn, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.nmertelpn = nmertelpn;
        this.email = email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNomertelepon(String nmertelpn) {
        this.nmertelpn = nmertelpn;
    }

    public String getNomertelepon() {
        return nmertelpn;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
class BahanMasakan{
    private String kode;
    private String nama;
    private String deskripsi;

    BahanMasakan(){
    }

    public void setKode(String kode){
        this.kode = kode;
    }

    public String getKode(){
        return this.kode;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }

    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }

    public String getDeskripsi(){
        return this.deskripsi;
    }
}
public class Motor {
    protected int id;
    protected String jenis;
    protected String warna;


    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public String getJenis() {
        return jenis;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }
}

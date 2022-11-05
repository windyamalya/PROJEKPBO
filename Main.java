public class Main {
    public static void main(String[] args) {
        Datapenitip costumer = new Datapenitip();
        Motor mt = new Motor();
        Petugas pt = new Petugas();
        Penitipan titip = new Penitipan();

        costumer.setId(50);
        costumer.setNama("Windy");
        costumer.setAlamat("Solo");
        costumer.setJenis_kelamin("perempuan");
        mt.setId(50);
        mt.setJenis("Beat");
        mt.setWarna("Hitam");
        pt.setId(50);
        pt.setNama("Asep");
        pt.setNo_hp(Integer.parseInt("089764"));

        titip.Penitipan(costumer,mt,pt);
        titip.lihatdataPenitipan();
    }
}
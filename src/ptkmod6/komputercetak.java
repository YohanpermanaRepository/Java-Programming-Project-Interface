package ptkmod6;
public final class komputercetak {
    final static void cetak(komputer[]obj){
        obj[0]= new pc();
        obj[1]= new netbook();
        obj[2]= new laptop();     
    for (int i=0; i < obj.length; i++){
        obj[i].hidupkan_os();
        obj[i].klik_kanan();
        obj[i].klik_kiri();
        obj[i].tekan_enter();
        obj[i].cetak_data();
        obj[i].matikan_os();
        System.out.println("");
        System.out.println("");
        }
    }
    public static void main(String[] args) {
    komputer[] com = new komputer[3];
    cetak(com);
    }
}

package ptkmod6;
public class netbook extends komputer implements mouse, keyboard, printer{
    @Override
    void hidupkan_os(){
        System.out.println("Turning on the Netbook...");
            System.out.println("Starting Windows 10...");
                System.out.println("Welcome");
    }
    @Override
    void matikan_os(){
    System.out.println("Shutting down");
    }
    @Override
    public void klik_kanan(){
    System.out.println("(Right-click)=>'Show option for item'");
    }
    public void klik_kiri(){
    System.out.println("(Left-click)=>'select item'");
    }
    @Override
    public void tekan_enter(){
    System.out.println("(Press-Enter)=>'Confirm option to run'");
    }
    @Override
    public void cetak_data(){
    System.out.println("printing...");
        System.out.println("");
            System.out.println("HOW DO YOU DO (*-*)");
    }
}

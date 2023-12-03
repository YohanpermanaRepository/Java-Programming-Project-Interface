package ptkmod6;
public class pc extends komputer implements mouse, keyboard, printer{
    @Override
    void hidupkan_os(){
        System.out.println("Turning on the PC...");
        System.out.println("Starting Windows 11...");
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
        System.out.println("Printing...");
        System.out.println("");
        System.out.println("NICE TO MEET YOU(@~@)");
    }
}

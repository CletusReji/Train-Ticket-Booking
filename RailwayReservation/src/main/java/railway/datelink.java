package railway;

public class datelink {
    public date first, last;
    public static date jul1=new date("01-07-2024");
    public static date jul2=new date("02-07-2024");
    public static date jul3=new date("03-07-2024");
    public static date jul4=new date("04-07-2024");
    public static date jul5=new date("05-07-2024");
    public static date jul6=new date("06-07-2024");
    public static date jul7=new date("07-07-2024");
    public void main() {
        this.insertlast(jul1);
        this.insertlast(jul2);
        this.insertlast(jul3);
        this.insertlast(jul4);
        this.insertlast(jul5);
        this.insertlast(jul6);
        this.insertlast(jul7);
    }

    public void insertlast(date s) {
        if(first==null) {
            first=last=s;
        }
        else {
            s.prev=last;
            last.next=s;
            last=s;
        }
    }
}

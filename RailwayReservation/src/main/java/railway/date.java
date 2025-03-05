package railway;

public class date {
    public date prev, next;
    public String dt;
    public trainlink trnlink=new trainlink();
    public date(String d) {
        dt=d;
        trnlink.main();
    }
}

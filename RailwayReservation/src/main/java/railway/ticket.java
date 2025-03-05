package railway;

public class ticket {
    public int pnr;
    public station source, destination;
    public int train_no, srctime;
    public String name, tname; 
    public date date;
    public int age, seatno;
    public String quota, status, coachtype;
    public ticket prev, next;
    public int price;
    public ticket(int pnr, station s, station d, int tno, int stm, String n, String tn, date dt, int a, String q, String ctp, int stno, String st, int pc) {
        this.pnr=pnr;
        source=s;
        destination=d;
        train_no=tno;
        srctime=stm;
        name=n;
        tname=tn;
        date=dt;
        age=a;
        quota=q;
        coachtype=ctp;
        seatno=stno;
        status=st;
        price=pc;
    }
}

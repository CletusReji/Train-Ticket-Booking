package railway;

public class stationlink {
    public station first, last;
    public static station pasa=new station("PASA", "Parassala", 0, 2);
    public static station davm=new station("DAVM", "Dhanuvachapuram", 6, 1);
    public static station amva=new station("AMVA", "Amaravila", 9, 1);
    public static station nyy=new station("NYY", "Neyyattinkara", 12, 2);
    public static station bram=new station("BRAM", "Balaramapuram", 16, 1);
    public static station nem=new station("NEM", "Nemom", 21, 1);
    public static station tvc=new station("TVC", "Thiruvananthapuram Central", 29, 3);
    public static station tvp=new station("TVP", "Thiruvananthapuram Pettah", 32, 1);
    public static station kcvl=new station("KCVL", "Kochuveli", 36, 3);
    public void main() {
        this.insertlast(pasa);
        this.insertlast(davm);
        this.insertlast(amva);
        this.insertlast(nyy);
        this.insertlast(bram);
        this.insertlast(nem);
        this.insertlast(tvc);
        this.insertlast(tvp);
        this.insertlast(kcvl);
    }

    public void insertlast(station s) {
        if(first==null) {
            first=last=s;
        }
        else {
            s.prev=last;
            last.next=s;
            last=s;
        }
    }
    public void displaylink() {
        station cur=first;
        while(cur!=null) {
            cur.displayname();
            cur=cur.next;
        }
    }
}
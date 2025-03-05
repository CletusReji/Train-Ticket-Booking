package railway;

public class ticketlink {
    //public ticket ticket1=new ticket(100, global.stlink.davm, global.stlink.amva, 16656, 2315, "Cletus", global.dtlink.jul1, 19, "General", "3AC", 18, "CNF");
    public ticket first, last;
//    public ticketlink() {
//        insertlast(ticket1);
//    }
    public void insertlast(ticket t) {
        if(first==null) {
            first=last=t;
        }
        else {
            t.prev=last;
            last.next=t;
            last=t;
        }
    }
}

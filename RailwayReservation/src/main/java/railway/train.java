package railway;

public class train {
    public train prev, next;
    public int number;
    public String name;
    public station start;
    public station end;
    public int starttime;
    public int priority;
    public char direction;
    public coach chaircar=new coach("CC");
    public coach threeac=new coach("3A");
    public coach sleeper=new coach("SL");
    public train(int no, String nm, station s, station e, int t, int p, char d) {
        number=no;
        name=nm;
        start=s;
        end=e;
        starttime=t;
        priority=p;
        direction=d;
    }
    public int seatavailable(String ctype, String quota) {
        coach c;
        switch (ctype) {
            case "3AC":
                c=threeac;
                break;
            case "SL":
                c=sleeper;
                break;
            default:
                c=chaircar;
                break;
        }
        int seats=0;
        for(int i=0; i<9; i++) {
            if(!c.general[i].occupied) {
                seats++;
            }
        }
        if(quota.equals("Women")) {
            for(int i=0; i<3; i++) {
                if(!c.women[i].occupied) {
                    seats++;
                }
            }
        }
        else if(quota.equals("Senior Citizen")) {
            for(int i=0; i<3; i++) {
                if(!c.srcitizen[i].occupied) {
                    seats++;
                }
            }
        }
        return seats;
    }
    public void displayname() {
        System.out.println(name);
    }
    public int getnumber() {
        return number;
    }
}
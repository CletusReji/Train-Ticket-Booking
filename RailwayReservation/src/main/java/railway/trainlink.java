package railway;

public class trainlink {
    public train first, last;
    public static train pasakcvlo=new train(6430, "PASA-KCVL Intercity Passenger", global.stlink.pasa, global.stlink.kcvl, 900, 1, 'n');
    public static train kcvlpasao=new train(6431, "KCVL-PASA Intercity Passenger", global.stlink.kcvl, global.stlink.pasa, 1600, 1, 's');
    public static train pasakcvle=new train(16672, "PASA-KCVL Express", global.stlink.pasa, global.stlink.kcvl, 1200, 2, 'n');
    public static train kcvlpasae=new train(16673, "KCVL-PASA Express", global.stlink.kcvl, global.stlink.pasa, 1800, 2, 's');
    public static train tvckcvlsf=new train(26645, "TVC-KCVL Superfast Express", global.stlink.tvc, global.stlink.kcvl, 300, 3, 'n');
    public static train kcvltvcsf=new train(26646, "KCVL-TVC Superfast Express", global.stlink.kcvl, global.stlink.tvc, 600, 3, 's');
    public void main() {
        this.insertlast(pasakcvlo);
        this.insertlast(kcvlpasao);
        this.insertlast(pasakcvle);
        this.insertlast(kcvlpasae);
        this.insertlast(tvckcvlsf);
        this.insertlast(kcvltvcsf);
    }

    public void insertlast(train s) {
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
        train cur=first;
        while(cur!=null) {
            cur.displayname();
            cur=cur.next;
        }
    }
}
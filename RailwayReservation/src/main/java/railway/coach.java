package railway;

public class coach {
    String type;
    public seat[] women=new seat[3];
    public seat[] srcitizen=new seat[3];
    public seat[] general=new seat[9];
    public coach(String t) {
        type=t;
        for(int i=0; i<3; i++) {
            women[i]=new seat();
            women[i].number=i+1;
            srcitizen[i]=new seat();
            srcitizen[i].number=i+4;
            int r=i%3;
            switch(r) {
                case 0:
                    women[i].berth='L';
                    srcitizen[i].berth='L';
                    break;
                case 1:
                    women[i].berth='M';
                    srcitizen[i].berth='M';
                    break;
                case 2:
                    women[i].berth='U';
                    srcitizen[i].berth='U';
                    break;
            }
        }
        for(int i=0; i<9; i++) {
            general[i]=new seat();
            general[i].number=i+7;
            int r=i%3;
            switch(r) {
                case 0:
                    general[i].berth='L';
                    break;
                case 1:
                    general[i].berth='M';
                    break;
                case 2:
                    general[i].berth='U';
                    break;
            }
        }
    }
}

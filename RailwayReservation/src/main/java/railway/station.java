package railway;

public class station {
    public String code, name;
    public station prev, next;
    public int src_distance, priority;
    public station(String c, String n, int d, int pr) {
        code=c;
        name=n;
        src_distance=d;
        priority=pr;
    }
    public void displayname() {
        System.out.println(name);
    }
    public String getcode() {
        return code;
    }
}
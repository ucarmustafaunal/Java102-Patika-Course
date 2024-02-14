package second;

import first.First;

public class Second {
    public static void main(String[] args) {
        First b = new First("Second Test");
        System.out.println(b.str);
        //b.showStr(); its protected.
    }
}

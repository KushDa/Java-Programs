class Demo {

    static int x = 10;

    static {
        System.out.println("Static block executed");
        x = 20;
    }

    static void show() {
        System.out.println("Static variable x = " + x);
    }

    public static void main(String[] args) {
        Demo.show();
    }
}

class Alpha {
    int x;

    Alpha(int a) {
        x = a;
    }

    public static void main(String[] args) {
        System.out.println("Alpha Class");
    }
}

class Beta {
    int y;

    Beta(int b) {
        y = b;
    }

    void show() {
        System.out.println("Beta y = " + y);
    }

    public static void main(String[] args) {
        System.out.println("Beta Class");
    }
}

class Test {
    public static void main(String[] args) {

        Alpha a = new Alpha(10);
        Beta b = new Beta(20);

        b.show();

        System.out.println("Alpha x = " + a.x);
    }
}
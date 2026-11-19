class explicit {
    public static void main(String[] args)  {
        double a = 1000;
        short b = (short) a;
        byte c = (byte) b;
        float d = (float) c;
        long e = (long) d;
        double f = (double) e;

        System.out.println("This is b var value; " +b);
        System.out.println("this is my c var value:" +c);
        System.out.println("this is my d var value: " +d);
        System.out.println("This is my e var value: "+e);
        System.out.println("This is my f var value: "+f);

    }
}
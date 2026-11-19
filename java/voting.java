class voting{
    public static void main(String[] args){
        int age;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("enter  your age");
        age = sc.nextInt();
        if(age > 18)
            { System.out.print("eligable for voting");} 
            else
            {System.out.print("not eligable");}
        }
    }
}
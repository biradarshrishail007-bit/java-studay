class marks{
    public static void main(String[]args){
      int marks;
      System.out.print("Enter your marks: ");
      java.util.Scanner sc = new scanner(System.in);
      int marks = sc.nextInt();
      if(marks> 80){
        System.out.print("A");
      }
      if(marks > 60 && marks <80){
        System.out.print("B");
      }
      if(marks > 40 && marks <59 ){
        System.out.print("C");
      } 
     if(marks < 40){
        System.out.print("Fail");
     }
    }
}
import java.io;

class Calculation{
  public static void main(String args[]){
    Student s = new Student;
    s.read();
    s.call();
    s.display();
  }
}
class Student{
  String name;
  int sub1,sub2,sub3,tot,avg;
  void read(){
    try{
      DataInputStream din=new DataInputStream(System.in); 
      System.out.print("name = ");
        name = din.readLine();
      System.out.print("Subjecct 1 = ");
        sub1 = Integer.parseInt(din.readLine());
      System.out.print("Subject 2 = ");
        sub2 = Integer.parseInt(din.readLine());
      System.out.print("Subject 3 = ");
        sub3 = Integer.parseInt(din.readLine());
    }
    catch(IOException ex){	}
  }
  void call(){
    total = subject1+subject2+subject3;
	  avg=total/3; 
  }
  void display(){
    System.out.println("students details are:");        
	  System.out.println("Subject 1 = " + sub1);
    System.out.println("Subject 2 = " + sub2);
    System.out.println("Subject 3 = " + sub3);
    System.out.println("Total = " + total);
 	  System.out.println("avg = " + avg);  
  }

}
    

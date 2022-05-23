import java.security.SecureRandom;
import java.util.*;


 class Employee {
    private int empno;
    private String ename;
    private int salary;

    Employee(int empno, String ename, int salary){
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
    }

     public int getEmpno() {
         return empno;
     }

     public String getEname() {
         return ename;
     }

     public int getSalary() {
         return salary;
     }
     // Concatenate Method of the output
     public String toString(){
        return empno+" "+ename+" "+salary;
     }
 }

 class CRUD{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int choices;
        do{
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("Enter Your Choice : ");
            choices = s.nextInt();
        }while(choices!=0);
    }
 }
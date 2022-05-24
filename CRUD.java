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

        List<Employee> c = new ArrayList<Employee>();
        Scanner s = new Scanner(System.in);
        Scanner sN = new Scanner(System.in);
        int choices;
        do{
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("Enter Your Choice : ");
            choices = s.nextInt();

            switch(choices){
                case 1:
                    System.out.print("Enter Empno : ");
                    int eno = s.nextInt();
                    System.out.print("Enter EmpName : ");
                    String ename = sN.nextLine();
                    System.out.print("Enter Salary : ");
                    int salary = s.nextInt();

                    c.add(new Employee(eno,ename,salary));
                break;
                case 2:
                    System.out.println("------------------------------------------");
                    Iterator<Employee> i = c.iterator();
                    while(i.hasNext()){
                        Employee e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("------------------------------------------");
                break;
                case 3:
                    boolean found = false;
                    System.out.println("Enter the employee number : ");
                    int empno = s.nextInt();
                    System.out.println("------------------------------------------");
                    i = c.iterator();
                    while(i.hasNext()){
                        Employee e = i.next();
                        if(e.getEmpno() == empno){
                            System.out.println(e);
                            found = true;
                        }

                    }
                    if(!found){
                        System.out.println("Record Not Found");
                    }
                    System.out.println("------------------------------------------");
                break;
                case 4:
                    found = false;
                    System.out.println("Enter the employee number to DELETE : ");
                    empno = s.nextInt();
                    System.out.println("------------------------------------------");
                    i = c.iterator();
                    while(i.hasNext()){
                        Employee e = i.next();
                        if(e.getEmpno() == empno){
                            i.remove();
                            found = true;
                        }

                    }
                    if(!found){
                        System.out.println("Record Not Found");
                    }else{
                        System.out.println("Record is DELETED successfully !!");
                    }
                    System.out.println("------------------------------------------");
                break;
                case 5:
                    found = false;
                    System.out.println("Enter the employee number to UPDATE : ");
                    empno = s.nextInt();
                    System.out.println("------------------------------------------");
                    ListIterator<Employee>li = c.listIterator();
                    while(li.hasNext()){
                        Employee e = li.next();
                        if(e.getEmpno() == empno){
                            System.out.println("Enter the MEW name : ");
                            ename = sN.nextLine();

                            System.out.println("Enter the MEW Salary : ");
                            salary = s.nextLine();
                            li.set( new Employee(empno, ename,salary));
                            found = true;
                        }

                    }
                    if(!found){
                        System.out.println("Record Not Found");
                    }else{
                        System.out.println("Record is UPDATED successfully !!");
                    }
                    System.out.println("------------------------------------------");
                    break;
            }
        }while(choices!=0);
    }
 }
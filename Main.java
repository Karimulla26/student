import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    static Scanner syed=new Scanner(System.in);
    static String collegeName=syed.next();
    int studentId;
    String studentName;
    int branchId;
    String branchName;
    Main(int studentId,String studentName,int branchId,String branchName ){
    this.studentId=studentId;
    this.studentName=studentName;
    this.branchId=branchId;
    this.branchName=branchName;
    }
    public static void main(String[]args){
        Main obj=new Main(22359,"Karimulla syed",101,"computer science and desiagn");
        Main obj2=new Main(22410,"SaiKumar",2204,"electric communication");
        obj.display();
        obj2.display();
    }
    public void display(){
        System.out.println(" collegeName:"+ collegeName);
        System.out.println("studentId:"+studentId);
        System.out.println("studentName:"+studentName);
        System.out.println("branchId:"+branchId);
        System.out.println("branchName:"+branchName);
    }


}
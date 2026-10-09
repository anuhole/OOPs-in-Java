import java.util.Arrays;
import java.util.Scanner;

public class Student {

    int studentprn;
    String studentName;
    int [] studentMarks;
    //double Totalpercentage;

    Student (){
         studentprn=000;
         studentName= "default";
         studentMarks=null;
        // Totalpercentage=00.00;
    }
    Student( int studentprn,String studentName,int []studentMarks){
        this.studentprn=studentprn;

        this.studentName=studentName;
        this.studentMarks=studentMarks;
        //this.Totalpercentage=Totalpercentage;
    }




//    public void displayDetals(){
//        System.out.println("Student PRN "+studentprn+" Student Name "+studentName+" percentage = "+this.Totalpercentage);
//       // System.out.println("Student Name"+studentName);
//        //System.out.println("Student Marks "+studentMarks);
////        for (int i=0;i<studentMarks.length;i++){
////            System.out.println("Student marks of subject "+studentMarks[i]);
////            //studentMarks[i]=sc.nextInt();
////        }
//       // System.out.println("Percentage you get "+this.Totalpercentage);
//
//
//
//    }


        public static double  calcper(int [] marks) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your marks ");
            for (int j = 0; j < marks.length; j++) {
                System.out.println("enter sub marks " + (j + 1));
                marks[j] = sc.nextInt();
            }
            int sum = 0;

            for (int i = 0; i < marks.length; i++) {
                sum += marks[i];
            }
            return (double) (sum * 100) / marks.length;

        }
        public String toString(){
        return "Name : "+studentName+" PRN "+studentprn + "percentage "+calcper(this.studentMarks);
        }
         public static void main(String[] args) {


//             Scanner sc = new Scanner(System.in);
//
//
//             Student[] students = new Student[3];
//             for (int i = 0; i < students.length; i++) {
//                 int[] marks = new int[3];
//
//                 System.out.println("Enter your PRN Number: ");
//                 int prn = sc.nextInt();
//                 System.out.println("Enter your name ");
//                 String name = sc.next();
//
//                 System.out.println("Enter Your marks ");
//                 for (int j = 0; j < marks.length; j++) {
//                     System.out.println("enter sub marks " + (j + 1));
//                     marks[j] = sc.nextInt();
//                 }
//                 int sum = 0;
//                 //System.out.println("Total addition of gatting marks ");
//                 for (int k = 0; k < marks.length; k++) {
//                     sum += marks[k];
//                 }
//                 System.out.println("Total marks you Get " + sum);
//
//
//                 int[] SubMarks = new int[3];
//
//
//                 System.out.println("Enter marks as per sub ");
//                 for (int l = 0; l < 3; l++) {
//
//                     SubMarks[l] = sc.nextInt();
//                 }
//                 int totalMarks = 0;
//                 for (int m = 0; m < marks.length; m++) {
//                     totalMarks += SubMarks[m];
//                 }
//                 System.out.println("Total marks " + totalMarks);


//                Student s1=new Student ();
//                 System.out.println(s1);

             }

         }


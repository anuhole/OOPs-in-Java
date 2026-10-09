import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//
//        Student[] students = new Student[3];
//        for (int i = 0; i < students.length; i++) {
//            int[] marks = new int[3];
//
//            System.out.println("Enter your PRN Number: ");
//            int prn = sc.nextInt();
//            System.out.println("Enter your name ");
//            String name = sc.next();
//
//            System.out.println("Enter Your marks ");
//            for (int j = 0; j < marks.length; j++) {
//                System.out.println("enter sub marks " + (j + 1));
//                marks[j] = sc.nextInt();
//            }
//            int sum = 0;
//            //System.out.println("Total addition of gatting marks ");
//            for (int k = 0; k < marks.length; k++) {
//                sum += marks[k];
//            }
//            System.out.println("Total marks you Get " + sum);
//
//
//            int[] SubMarks = new int[3];
//
//
//            System.out.println("Enter marks as per sub ");
//            for (int l = 0; l < 3; l++) {
//
//                SubMarks[l] = sc.nextInt();
//            }
//            int totalMarks = 0;
//            for (int m = 0; m < marks.length; m++) {
//                totalMarks += SubMarks[m];
//            }
//            System.out.println("Total marks " + totalMarks);

//            double percentage=((sum*100)/totalMarks);
//            System.out.println("Percentage you get "+percentage);
//
//            students[i]= new Student(prn,name,marks,percentage);
//
//        }
            int []arr = {90,99,89};
            Student s1 = new Student(101,"Anushka ",arr);
            System.out.println(s1);


        }
    }


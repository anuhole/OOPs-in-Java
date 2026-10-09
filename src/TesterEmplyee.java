import java.util.Scanner;

public class TesterEmplyee {
    public static void main(String[] args) {
        // Employee[] employees=new Employee;

        Scanner sc = new Scanner(System.in);
        Employee [] employees=new Employee[3];
        int choice;
        do {
            System.out.println("Welcome to EMS!");
            System.out.println("choose tour role");

            System.out.println("1:Employee");
            System.out.println("2: Manager");
            System.out.println("3:Developer");
            choice = sc.nextInt();



            int i=0;
            switch (choice) {


                case 1:
                    System.out.println("Enter name ,department,salary");
                     employees[i] = new Employee(sc.next(), sc.next(), sc.nextDouble());

                    break;
                case 2:
                    System.out.println("Enter name ,department,salary");
                     employees[i] = new Manager(sc.next(), sc.next(), sc.nextDouble(), sc.nextInt());

                    break;
                case 3:
                    System.out.println("Enter name ,department,salary");
                     employees[i] = new Developer(sc.next(), sc.next(), sc.nextDouble());

                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;

            }i++;
        }while(choice <4 && choice >0);
        for(Employee e:employees){
            System.out.println(e);
        }
    }
}
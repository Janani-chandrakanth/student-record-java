import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StudentMan manager=new StudentMan();
        int choice;
        do{
            System.out.println("\nStudent Record Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View all Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter ID: ");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name=sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept=sc.nextLine();
                    Student newStudent=new Student(id,name,age,dept);
                    manager.addStudent(newStudent);
                    break;
                case 2:
                    manager.view();
                    break;
                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int search=sc.nextInt();
                    Student found=manager.searchId(search);
                    if(found!=null){
                        System.out.println("Student Found: "+found);

                    }else{
                        System.out.println("No student with that id.");
                    }
                    break;
                    case 4:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = sc.nextInt();
                    boolean deleted = manager.deleteStudent(deleteId);
                    if (deleted) {
                        System.out.println("Student deleted.");
                    } else {
                        System.out.println(" No student found to delete.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println(" Invalid choice! Try again.");
            }
        } while (choice != 5);

        sc.close();
            }

        }
    

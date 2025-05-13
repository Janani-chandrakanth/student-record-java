import java.util.ArrayList;
public class StudentMan{
    private ArrayList<Student> students;
    public StudentMan{
        students=new ArrayList<>();

    }
    public void addStudent(Student s){
        students.add(s);
        System.out.println("Student added successfully!");
    }
    public void view(){
        if(students.isEmpty()){
            System.out.println("No Student is found ");
            return;
        }
        for(Student s:students){
            System.out.println(s);
        }
    }
    public Student searchId(int id){
        for(Student s:students){
            if(s.getId()==id){
                return s;
            }
        }
        return null;
    }
    public boolean deleteStudent(int id){
        Student s=searchId(id);
        if(s != null){
            students.remove(s);
            return true;
        }
        return false;
    }

}
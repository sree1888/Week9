class University{
    String name = "Amrita Vishwa Vidyapeetham";
    public void displayUniName(){
        System.out.println("University Name: "+name);
    }
    public class Department{
        String deptName = "Computer Science";
        int deptCode = 111;
        public void displayDeptInfo() {
            System.out.println("Department Name:-" + deptName  + "\nDepartment Code:-" + deptCode);
        }
    }
    public class Student{
        String studentName = "Sree durga";
        int rollNumber = 24020;
        public void displayStudentInfo() {
            System.out.println("Student Name:- " + studentName + "\nRoll Number:- " + rollNumber);
        }
    }
}
public class Main{
    public static void main(String[] args) {
        University U = new University();
        U.displayUniName();
        University.Department D = U.new Department();
        D.displayDeptInfo();
        University.Student S = U.new Student();
        S.displayStudentInfo();
    }
}

// ERROR: used public class for university.
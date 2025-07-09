class Employee{
    private double Salary;

    public void setSalary(double s){
        Salary=s;
    }
    public double getSalary(){
        return Salary;
    } 
    public class obj{
        public static void main(String[] args) {
            Employee e=new Employee();
            e.setSalary(20000);
            System.out.println(e.getSalary());
        }
    }

}




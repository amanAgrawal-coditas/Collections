package Week_6.AssignmentCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee
{
 int id;
 String name;
 float salary;

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
class SortByName implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Employee>employee=new ArrayList<>();
        employee.add(new Employee(1,"Aman Agrawal",3200.353f));
        employee.add(new Employee(2,"Aman Singh",42000.343f));
        employee.add(new Employee(4,"Aarushi",300004.233f));
        employee.add(new Employee(6,"Ashraf",20040.333f));
        employee.add(new Employee(7,"Praveer",2000.335f));
        System.out.println("Before sorting");
        for(int index=0;index<employee.size();index++)
        {
            System.out.println(employee.get(index));
        }
        Collections.sort(employee,new SortByName());
        System.out.println("After Sorting");
        for(int index=0;index<employee.size();index++)
        {
            System.out.println(employee.get(index));
        }
        System.out.println("People with salart >15000");
        for(Employee e:employee)
        {
            if(e.salary>15000.00f)
            {
                System.out.println(e);
            }
        }

    }
}
/*
Output-->
Before sorting
Employee{id=1, name='Aman Agrawal', salary=3200.353}
Employee{id=2, name='Aman Singh', salary=42000.344}
Employee{id=4, name='Aarushi', salary=300004.22}
Employee{id=6, name='Ashraf', salary=20040.332}
Employee{id=7, name='Praveer', salary=2000.335}
After Sorting
Employee{id=4, name='Aarushi', salary=300004.22}
Employee{id=1, name='Aman Agrawal', salary=3200.353}
Employee{id=2, name='Aman Singh', salary=42000.344}
Employee{id=6, name='Ashraf', salary=20040.332}
Employee{id=7, name='Praveer', salary=2000.335}
People with salart >15000
Employee{id=4, name='Aarushi', salary=300004.22}
Employee{id=2, name='Aman Singh', salary=42000.344}
Employee{id=6, name='Ashraf', salary=20040.332}

Process finished with exit code 0
 */
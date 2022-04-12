import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> list=new ArrayList<>();
        list.add(new Employee(1,"aakash",22,"active",2000));
        list.add(new Employee(2,"gokul",23,"inactive",4000));
        list.add(new Employee(3,"sai",23,"active",4000));
        list.add(new Employee(4,"john",23,"inactive",8000));
        list.add(new Employee(5,"sanjay",22,"active",6000));

         Map<Integer,List<Employee>>  map = list.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.toList()));
         System.out.println(map);
         System.out.println(list.stream().map(Employee::getSalary).filter(salary->salary==4000).count());
         System.out.println(list.stream().filter(f->"active".equals(f.getProfile())).count());
         System.out.println(list.stream().filter(f->"inactive".equals(f.getProfile())).count());
         list.stream().map(Employee::getName).filter(f->f.startsWith("a")).map(f->f.toUpperCase()).forEach(System.out::println);
         Map<Integer,Long> map1=list.stream().collect(Collectors.groupingBy(Employee::getRoll,Collectors.counting()));
         System.out.println(map1);
         Map<String,List<Employee>> map2=list.stream().collect(Collectors.groupingBy(Employee::getProfile,Collectors.toList()));
         System.out.println(map2);
    }
}

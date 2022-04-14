package com.homework.test;

import com.homework.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/**
 * @author: 谢绍亮
 * @date: Created in 2022/4/2 9:43
 * @description:
 * @modified By:
 * @version: 1.0.0
 */
public class TestEmployee {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"张三",5000));
        list.add(new Employee(2,"李四",5500));
        list.add(new Employee(3,"赵六",4000));
        System.out.println("员工姓名" + "\t" + "员工薪资");
        list.forEach(employee -> System.out.println(employee.getName() + "\t" + employee.getSalary()));
        count(list);
        avgBySalary(list);
    }

    private static void avgBySalary(List<Employee> list) {
        OptionalDouble average = list.stream()
                .mapToDouble(Employee::getSalary)
                .average();
        System.out.println("员工的平均工资为：" + average.getAsDouble());
    }

    private static void count(List<Employee> list) {
        long count = list.stream()
                .filter(employee -> employee.getSalary() > 5000)
                .count();
        String s = count == 0 ? "没有工资大于5000的" : "工资大于5000的有" + count + "个";
        System.out.println(s);

    }
}

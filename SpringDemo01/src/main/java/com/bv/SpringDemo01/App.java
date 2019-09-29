package com.bv.SpringDemo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bv.model.Student;
import com.bv.model.Triangle;
import com.bv.model.Triangle1;
import com.bv.model.Employee;
import com.bv.model.Person;

public class App 
{
    public static void main( String[] args )
    {
  ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
 // Employee employee=(Employee)context.getBean("employee");
  System.out.println("Employee Details");
  Employee employee=context.getBean(Employee.class);
  System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getAddress()+" "+employee.getDd()+""+employee.getMm()+""+employee.getYy());
  
  System.out.println("Traingle Details");
  Triangle triangle=context.getBean(Triangle.class);
  triangle.draw();
  
  System.out.println("student Details");
  Student student=context.getBean(Student.class);
System.out.println(student.getStdid()+" "+student.getStdName()+" "+student.getAddress());

System.out.println("Traingle1 Details");
Triangle1 triangle1=context.getBean(Triangle1.class);
//System.out.println(triangle1.getA()+" "+triangle1.getB()+" "+triangle1.getC());
triangle1.draw();
//System.out.println(triangle1);
   
//Autowire
    Person person=context.getBean(Person.class);
   // System.out.println(person.getId()+" "+person.getName()+" "+person.getAge());
    System.out.println(person);
    }
}

package org.example;

import java.util.*;

public class CustomLinkedlist {

    int n = 5;

    class Student{
        int id;
        String sName;
        int roll;

        public Student(int id, String sName, int roll) {
            this.id = id;
            this.sName = sName;
            this.roll = roll;
        }
    }

    public static void main(String[] args) {
        int[] id = { 13, 23, 45, 55, 66, 77 };
        String[] sName = { "Ram","Shyam","Hari","Mukesh","Dipesh" };
        int[] roll = { 22, 44, 66, 22, 44, 99 };

        CustomLinkedlist cs = new CustomLinkedlist();
        cs.add(id, sName, roll);
    }

    public void add(int id[], String sName[], int roll[]){
        List<Student> list=new LinkedList<>();
        for(int i = 0; i < n; i++) {
            list.add(new Student(id[i], sName[i], roll[i]));
        }
        displayArrayList(list);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Person name you want to remove:");
        String targetName = sc.next();
        remove(list, targetName);
        System.out.println("After removing elements with name '" + targetName + "':");
        displayArrayList(list);
    }


    public void remove(List<Student> list, String targetName) {
        Iterator<Student> itr = list.iterator();
        while (itr.hasNext()) {
            Student st = itr.next();
            if (st.sName.equals(targetName)) {
                itr.remove();
            }
        }
    }

    public void displayArrayList(List<Student> list) {

        for(int i=0;i< list.size();i++){

            Student student=list.get(i);
            System.out.println("The desire output are:"+" "+student.sName+" "+student.roll+" "+student.id);

        }
        Iterator<Student> itr = list.iterator();
        while (itr.hasNext()) {
            Student st = itr.next();
            System.out.println(st.sName + " " + st.roll + " " + st.id);
        }
    }
}


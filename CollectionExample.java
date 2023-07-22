package org.example;


import java.util.*;

public class CollectionExample{

        int age;
        int roll;
        String name;
        public CollectionExample(int age, int roll, String name){
            this.age=age;
            this.name=name;
            this.roll=roll;
        }

    public static void main(String[] args){

        List<CollectionExample> list=new ArrayList<>();//List Interface
        list.add(new CollectionExample(34,33,"Ram"));
        list.add(new CollectionExample(35,34,"Shyam"));
        list.add(new CollectionExample(36,35,"Hari"));
        list.add(new CollectionExample(37,36,"Pritam"));
        Iterator<CollectionExample> itr=list.iterator();
        while(itr.hasNext()){

            CollectionExample s=(CollectionExample)itr.next();
            System.out.println(s.age+" "+s.roll+" "+s.name);
        }
      System.out.println("AraryList Ends Here");
        List<CollectionExample> list1=new LinkedList<>();//List Inteface
        list1.add(new CollectionExample(34,33,"Ram"));
        list1.add(new CollectionExample(35,34,"Shyam"));
        list1.add(new CollectionExample(36,35,"Hari"));
        list1.add(new CollectionExample(37,36,"Pritam"));


        Iterator<CollectionExample> itr1=list1.iterator();
        while(itr1.hasNext()){

            CollectionExample s=(CollectionExample)itr1.next();
            System.out.println(s.age+" "+s.roll+" "+s.name);
        }
        System.out.println("LinkedList Ends Here");
        List<CollectionExample> list3=new Vector<>();//List Interface
        list3.add(new CollectionExample(34,33,"Ram"));
        list3.add(new CollectionExample(35,34,"Shyam"));
        list3.add(new CollectionExample(36,35,"Hari"));
        list3.add(new CollectionExample(37,36,"Pritam"));
        Iterator<CollectionExample> itr4=list3.iterator();
        while(itr4.hasNext()){

            CollectionExample s=(CollectionExample)itr4.next();
            System.out.println(s.age+" "+s.roll+" "+s.name);
        }
        System.out.println("Vector  Ends Here");

        List<CollectionExample> list4=new Stack<>();//List Interface
        list4.add(new CollectionExample(34,33,"Ram"));
        list4.add(new CollectionExample(35,34,"Shyam"));
        list4.add(new CollectionExample(36,35,"Hari"));
        list4.add(new CollectionExample(37,36,"Pritam"));
        Iterator<CollectionExample> itr5=list4.iterator();
        while(itr5.hasNext()){

            CollectionExample s=(CollectionExample)itr5.next();
            System.out.println(s.age+" "+s.roll+" "+s.name);
        }
        System.out.println("Stack  Ends Here");

        Set<CollectionExample> set=new HashSet<>();//Set Interface
        set.add(new CollectionExample(34,33,"Ram"));
        set.add(new CollectionExample(35,34,"Shyam"));
        set.add(new CollectionExample(36,35,"Hari"));
        set.add(new CollectionExample(37,36,"Pritam"));

        Iterator<CollectionExample> itr2=set.iterator();
        while(itr2.hasNext()){

            CollectionExample s=(CollectionExample)itr2.next();
            System.out.println(s.age+" "+s.roll+" "+s.name);
        }
        System.out.println("HashMap  Ends Here");
        Set<CollectionExample> set1=new LinkedHashSet<>();//Set Interface
        set1.add(new CollectionExample(34,33,"Ram"));
        set1.add(new CollectionExample(35,34,"Shyam"));
        set1.add(new CollectionExample(36,35,"Hari"));
        set1.add(new CollectionExample(37,36,"Pritam"));

        Iterator<CollectionExample> itr3=set.iterator();
        while(itr3.hasNext()){

            CollectionExample s=(CollectionExample)itr3.next();
            System.out.println(s.age+" "+s.roll+" "+s.name);
        }
        System.out.println("LinkedHashMap  Ends Here");

       Queue<CollectionExample> queue=new ArrayDeque<>();//FIFO Queue Interface
        queue.add(new CollectionExample(34,33,"Ram"));
        queue.add(new CollectionExample(35,34,"Shyam"));
        queue.add(new CollectionExample(36,35,"Hari"));
        queue.add(new CollectionExample(37,36,"Pritam"));
        Iterator<CollectionExample> itr6=queue.iterator();
        while(itr6.hasNext()){

            CollectionExample s=(CollectionExample)itr6.next();
            System.out.println(s.age+" "+s.roll+" "+s.name);
        }
        System.out.println("Queue Ends Here");




    }
    }




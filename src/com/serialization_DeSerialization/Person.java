package com.serialization_DeSerialization;
import java.io.*;
public class Person implements Serializable {
   int id;
   String name;
   public static void main(String[] args) throws Exception {
	   Person p = new Person();
	   p.id=100;
	   p.name="Raju";
	   
	   System.out.println("****Serializaton Started****");
	   FileOutputStream fos = new FileOutputStream("person.txt");
       ObjectOutputStream oos = new ObjectOutputStream(fos);
       oos.writeObject(p);
       oos.flush();
       oos.close();
       System.out.println("****Serialization completed****");
       System.out.println("****De-serialization Started****");
       FileInputStream fis = new FileInputStream("person.txt");
       ObjectInputStream ois = new ObjectInputStream(fis);
       Object object =ois.readObject();
       Person p1 =(Person)object;
       System.out.println("Id :"+p1.id);
       System.out.println("Name :"+p1.name);
       ois.close();
       System.out.println("****De-serialization completed");
   
   
   
   }
}

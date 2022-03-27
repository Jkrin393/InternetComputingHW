package Hospital;

//********************************************************************
//Hospital.java       Authors: Lewis/Loftus
//
//Solution to Programming Project 9.2 
//********************************************************************

public class Hospital
{
//-----------------------------------------------------------------
//  Creates several objects from classes derived from
//  HospitalEmployee.
//-----------------------------------------------------------------
public static void main (String[] args)
{
  HospitalEmployee vito = new HospitalEmployee ("Vito", 123);
  doctor michael = new doctor ("Michael", 234, "Heart");
  surgeon vincent = new surgeon ("Vincent", 645, "Brain", true);
  nurse sonny = new nurse ("Sonny", 789, 6);
  

  // print the employees
  System.out.println (vito);
  System.out.println (michael);
  System.out.println (vincent);
  System.out.println (sonny);
  

  // invoke the specific methods of the objects
  vito.work();
  michael.work();
  vincent.work();
  sonny.work();
 
}
}

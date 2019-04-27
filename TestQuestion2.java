
public class TestQuestion2 {

 public static void main(String[] args) {
  int[] testData = {15,2,13,4,5};
  IntLinkedList list1 = new IntLinkedList(testData);
  IntLinkedList list2 = new IntLinkedList();
  
  System.out.println("List 1: " + list1);
  System.out.println("List 2: " + list2);
  System.out.println("Max from list 1 is: " + list1.max());
  System.out.println("Max from the empty list (should be true): " + (list2.max() == Integer.MIN_VALUE));
  list1.removeFirst();
  System.out.println("\nRemoved the first element");
  System.out.println("Max from list 1 is now: " + list1.max());
   
  list1.removeFirst();
  list1.removeFirst();
  
  System.out.println("\nList 1 is now: " + list1);
  System.out.println("Max from list 1 is: " + list1.max());
  
  // try to reverse a 1 element list:
  list1.removeFirst();
  System.out.println("\nBefore reversing: " + list1);
  list1.reverse();
  System.out.println("After reversing: " + list1);
   
   //try to reverse an empty list
  list1.removeFirst();
  System.out.println("\nBefore reversing: " + list1);
  list1.reverse();
  System.out.println("After reversing: " + list1);
  
  list1.add(10);
  list1.add(12);
  list1.add(8);
  list1.add(5);
  
  // reverse a list with greater than 1 element
  System.out.println("\nBefore reversing: " + list1);
  list1.reverse();
  System.out.println("After reversing: " + list1);
 }

}

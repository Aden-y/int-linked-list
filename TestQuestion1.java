import java.util.Arrays;

public class TestQuestion1 {
 
  public static void main(String [] args) {
  
    int[] testData = {1,2,3,4,5};
    IntLinkedList list = new IntLinkedList(testData);
    
    System.out.println("These two lists should be in the same order:");
    System.out.println(list);
    System.out.println(Arrays.toString(testData));
    
    System.out.println("\nSize of the list (should be 5): " + list.size());
    System.out.println("Contains 3?: " + list.contains(3));
    System.out.println("Contains 6?: " + list.contains(6));                    
 
    
    list.removeFirst();
    System.out.println("\nShould have removed the first element:");
    System.out.println(list);
    list.removeFirst();
    list.removeFirst();
    list.removeFirst();
    list.removeFirst();
    System.out.println("\nShould be an empty list:");
    System.out.println(list);
    System.out.println("\nSize of the list: " + list.size());
    System.out.println("Contains 0? " + list.contains(0));
    
    // will the code crash?
    list.removeFirst();
    list.removeFirst();
    
    // Next test
    int []testData2 = {7,4,5,15,0,1};
    IntLinkedList list2 = new IntLinkedList(testData2);
    System.out.println("\nThe new list: " + list2);
    
    // clone some data
    IntLinkedList cloned = list2.clone();
    System.out.println("\nOld list and new list should be identical:");
    System.out.println("Old: " + list2);
    System.out.println("New: " + cloned);
    
    cloned.removeFirst();
    cloned.removeFirst();
    System.out.println("\nThe old list should be unchanged:");
    System.out.println("Old: " + list2);
    System.out.println("New: " + cloned);

 
 }
}

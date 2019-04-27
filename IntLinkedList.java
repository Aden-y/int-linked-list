/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

public class IntLinkedList {
   private int size;
   private IntNode head;
   //The default constructor for an empty linked list
 public IntLinkedList(){
     this.size=0;
 }
 //Method cused to add a single integer value to the list
 public void add(int a){
     if(this.head==null){
         this.head=new IntNode(a);
         this.size++;
         return;
     }
     IntNode cu=this.head;
     
     boolean placed=false;
     while(!placed){
         if(cu.next==null){
             cu.next=new IntNode(a);
             placed=true;
             this.size++;
         }
         if(placed){
             break;
         }
         cu=cu.next;
     }
 }
 //Constructor that takes an array of interger values
    public IntLinkedList(int [] array){
        this.size=1;
        array=array;
        this.head=new IntNode(array[0]);
        IntNode current=this.head;
        for(int i=1; i<array.length;i++){
            current.next=new IntNode(array[i]);
            current=current.next;
          this.size++;
        }
    }
    //Returns the largest of elements in the linked list
    public int max(){

        try{
                   

                    IntNode cu=this.head;
                     int max=cu.data;
                     while(cu!=null){
                     int tempMax=cu.data;
                     if(tempMax>max){
                         max=tempMax;
                       
                     }
                     cu=cu.next;
                 }
        return max;
        //If the list is empty, return the minimun Integer value
        }catch(NullPointerException e){
            return Integer.MIN_VALUE;
        }

    }
    //Reverses the elements in the linked list
    public void reverse(){
        if(this.head==null){
            return;
        }
        int[] array=new int[this.size];
        IntNode cu=this.head;
        int i=this.size-1;
        while(cu!=null){
            array[i]=cu.data;
            cu=cu.next;
            i--;
        }
                this.size=1;
        array=array;
        this.head=new IntNode(array[0]);
        IntNode current=this.head;
        for(i=1; i<array.length;i++){
            current.next=new IntNode(array[i]);
            current=current.next;
          this.size++;
        }
    }
    //Returns a string representation of the linked list
    public String toString(){
        String  sb=new String ("[");
        IntNode current=this.head;
        while(current!=null){
            sb+=current.data+"";
            current=current.next;
            if(current!=null){
                sb+=" ,";
            }
        }
        sb+="]";
        return sb;
    }
    //Returns a copy of the linked list
    public IntLinkedList clone(){
        return this;
    }
    public int size(){
        return this.size;
    }
    //Removes the head of the list
    public void removeFirst(){
        try{
          this.head=this.head.next;
        this.size--;
        }catch(NullPointerException e){
            //If the list is empty, simply do nothing
        }
        
    }
    //Returns a string yes or no if a value a is contained in the linked list
    public String contains(int a){
        IntNode current=this.head;
        boolean found=false;
        while(current!=null){
            if(current.data==a){
                found=true;
                break;
            }
            current=current.next;
        }
        if(found){
            return "Yes";
        }else{
            return "No";
        }
    }
    //Nodes in the linked list

}


class Link<T>
{
   public T dData;            
   public Link<T> next;            

   public Link(T dd)          
   { 
	   dData = dd; 
   }

   public void displayLink()      
   { 
	   System.out.print(dData.toString() + " "); 
   }
}  

class LinkList<T>
{
   private Link<T> first;            

   public LinkList()             
   { 
	   first = null; 
   }           

   public boolean isEmpty()       
   { 
	   return (first==null); 
   }

   public void insertFirst(T dd) 
   {                           
      Link<T> newLink = new Link<T>(dd);
      newLink.next = first;       
      first = newLink;            
   	}

   public T deleteFirst()      
   {                           
      Link<T> temp = first;          
      first = first.next;         
      return temp.dData;          
   }

   public void displayList()
   {
      Link<T> current = first;      
      while(current != null)      
      {
         current.displayLink();   
         current = current.next;  
      }
      System.out.println("");
   }

}  

class Stack<T>
{
   private LinkList<T> theList;

   public Stack()            
   {
      theList = new LinkList<T>();
   }

   public void push(T j)     
   {
      theList.insertFirst(j);
   }

   public T pop()           
   {
      return theList.deleteFirst();
   }

   public boolean isEmpty()    
   {
      return ( theList.isEmpty() );
   }

   public void displayStack()
   {
      System.out.print("Stack (top-->bottom): ");
      theList.displayList();
   }
}  

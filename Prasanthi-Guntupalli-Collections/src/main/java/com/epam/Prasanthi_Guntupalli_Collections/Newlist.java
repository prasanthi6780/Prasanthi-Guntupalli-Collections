package com.epam.Prasanthi_Guntupalli_Collections;
import java.util.Arrays;
public class Newlist<T> 
{
	private int size=0;
	private static final int initialcapacity=14;
    private Object[] obj;
    public Newlist() 
    {
 	   obj=new Object[initialcapacity];
    }
    
    public void append_element(T element) 
    {
 	   if(size==obj.length) 
 	   {
 		   increasecapacity();
 	   }
 	   obj[size++]=element;
    }
    
    private void increasecapacity() 
    {
		int new_length=obj.length*2;
		obj=Arrays.copyOf(obj,new_length);
	}

	@SuppressWarnings("unchecked")
	public T get_element(int index) 
	{
 	   if(index>=size ||index<0) 
 	   {
 		  throw new IndexOutOfBoundsException("Index error");
 		  
 	   }
 	   return (T) obj[index];
    }
	public int size() 
	{
	   return size;
    }

    @SuppressWarnings("unchecked")
    public T remove_element(int index) 
    {
	   if(index>=size ||index<0) 
	   {
		  throw new IndexOutOfBoundsException("Index error");
		  
	   }
	   Object new_list=obj[index];
	   int num=obj.length-(index+1);
	   System.arraycopy(obj,index+1,obj,index,num);
	   size--;
	   return (T) new_list;
	   
	   
}

public String toString() 
{
     StringBuilder sb = new StringBuilder();
     sb.append('[');
     for(int i = 0; i < size ;i++) {
         sb.append(obj[i].toString());
         if(i<size-1){
             sb.append(",");
         }
     }
     sb.append(']');
     return sb.toString();
}
}


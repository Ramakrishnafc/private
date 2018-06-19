package maven.first;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;



public class secondtest {

	  static String[] str= {"ram","sam"};
	  static int count =0;
	 static int[] ar = {1,2,3,4,5,6,7,8,9,10};
     public static void main(String[] args) 
     {
         String  str1 ="the bb the ccc cc bb";
    	 System.out.println("String:\n" + str);
 		str1 = StringUtils.lowerCase(str1);
 		int countThe = StringUtils.countMatches(str1, "ccc");
 		System.out.println("\"the\" count: " + countThe);
    	 
//    	 for(;;);
//    	 System.out.println("java");
    	 
//    	 System.out.println(ar.length);
//	   for(int i= 5;i<=ar.length-1;i++)
//		System.out.println(ar[i]);	  
//	    System.out.println("sdsd s");
    	 
//    	 System.out.println(str.length);
//    	 for(int i=0;i<=str.length-1;i++)
//    	 {
//    		 System.out.println(str[i]);
//    	 }
//    	 for (String s: str)
//    	 {
//    		 System.out.println(s);
//    	 }
    	 
    	 
//    	 for(String  j:str)
//    	 {
//    		 System.out.println(j);
//    	 }		 
//    	 for(int  j:ar)
//    	 {
//    		
//    		
//    		 if(j>5)
//    		 System.out.println(j);
//    		 
//    		
//    	 }
//    	 continue;
//    	 int i=0;
//    	 
//    	 while(i<ar.length)
//    	 {
//
//          
//    		if(i>=5)    			
//    			System.out.println(ar[i]);
//
//    		 i++;            		    		 
//    	 }
//    	int i=0; 
//    do{
//    	
//    	
//      }	 
    	 
//    	 1) Use enhanced for loop or classic for loop with lenth of array.
//    	 2) Use Arrays.asList() to convert Array into ArrayList and than print
//    	 3) Use Java 5 Arrays.toString() and Arrays.deepToString() methods
//int c=2;
//    	 int b=3;
//    	 switch(b)
//    	 
//    	 {
//    	 case 1: System.out.println("java");
//    	
//    	
//    	 case 2: System.out.println("bava");
//    	  break;
//    	 
//    	 default:System.out.println("kkk");
//    	 
//    	
//    	 }
//    	 char key = ' ';
//
//    			 switch(key) {
//    			     case     ' '  :
//    			     case     '\t' : System.out.println("white space char");
//    			                    break;
//
//    			     default       : System.out.println("amount is something else");
//    			 }
// 
    	 
//    	 int[] ints   = {1,2,3,4,5};
//
//    	 int insertIndex = 2;
//    	 int newValue    = 123;
//
//    	 //move elements below insertion point.
//    	 for(int i=ints.length-1; i > insertIndex; i--){
//    	     ints[i] = ints[i-1];
//    	 }
//
//    	 //insert new value
//    	 ints[insertIndex] = newValue;
//
//    	 System.out.println(Arrays.toString(ints));
    	 
//    	 int[] ints   = {1,2,3,4,5};
//
//    	 ints[3] = 123;
//
//    	 int removeIndex = 3;
//
//    	 for(int i = removeIndex; i < ints.length -1; i++){
//    	     ints[i] = ints[i + 1];
//    	 } 
//    	 System.out.println(Arrays.toString(ints));
  
//    	 int[] ints = {0,2,9,6,11,6,9};
    	

//    	 int maxVal = Integer.MIN_VALUE;
//    	 for(int i=0; i < ints.length; i++){
//    	     if(ints[i] > maxVal){
//    	         maxVal = ints[i];
//    	     }
//    	 }
//    	 System.out.println("maxVal = " + maxVal);
    	 String str = "java is java and is kova java";
    	 String[] ints =str.split(" ");
//    	 String[] ints={"abc","rr","rr","ryyy"};
    	 int count =0;
    	 System.out.println(ints.length);
    	 for(int i=0;i<ints.length;i++)
    	 {
//    		 System.out.println(ints[i]);
    		 for(int j=i+1;j<ints.length;j++)
    		 {
    		    
    			 if(ints[i].equals(ints[j]))
    			 {
    				 System.out.println(ints[i]);
    			 }
    			
    		 }
    	 }
    	 
    	 
    	 
    	 int p = 0;
    	 for( int i=1; i<=5; i++ ){
    	 for( int k=1; k<=5-i; k++ ){
    	 System.out.print (" ");
    	 }
    	 for( int j=1; j<=i+p; j++ ){
    	 System.out.print ("*");
    	 }
    	 System.out.println ();
    	 p=p+1;
     
     }
    	 
    	 
    	 
//    	 Scanner in = new Scanner(System.in);
//
//    	 System.out.println("enter the num for which u want the factorial");
//
//    	 int num = in.nextInt();
//
//    	 for(int i=num-1; i>0; i-- ){
//    		 System.out.println(num +" "+ i);
//    	 num = num*i;
//    	
//    	 }
//
//    	 System.out.println(num);
//
//    	 }
     
    	 
    	 String str3 = "I use selenium webdriver. selenium is a tool for web applications.";
    	 int i = str3.length();
    	 StringBuffer strb = new StringBuffer();
    	 for( int j=i-1; j>=0; j--){
    	 strb.append(str3.charAt(j));
    	 }
    	 System.out.println(strb);
    	 
     

         int b=1885;

         StringBuffer strb1 = new StringBuffer();
          int rem;
         while( b != 0 )
         {
               rem= b%10;
               b=b/10;
               strb1.append(rem);
         }

         System.out.println("Reverse of entered number is "+strb1);
     
     }
     

  
     
     
}

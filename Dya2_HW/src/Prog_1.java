
public class Prog_1 {
       int a,b,c;
       int num;
       Prog_1 (){
    	  //.num=num;
       }
       
       Prog_1(int a,int b,int c){
    	   this.a=a;
    	   this.b=b;
    	   this.c=c;
       }
       
       public int check()
       {
    	   if(a>b) {
    		   if(a>c)
    			   return a;
    		   else 
    			   return c;
    		   
    	   }else if(b>c)
    		   return b;
    	       else
    		   return c;
       }
       
       public int factorial(int num)
       {	
    	   for(int i=num-1;i>0;i--)
    	   {
    		   num=num*i;
    	   }
    	   return num;
       }
}

import java.util.Scanner;
class wrongAge extends Exception {
String str1;
wrongAge(String str2){
str1=str2;
}
	public String toString()
	{
	return	("An exception has occurred:  "+str1);
	}

}


 class father{
static int fatherAge;
 
father (){ System.out.println("<--------------->");}
father(int x){
	fatherAge=x;
		
	
	 try{
	 if (fatherAge<=0)
	 throw new wrongAge("age cant be less than zero ");
	 }
	 catch(wrongAge e){
	 System.out.println(e);
	 }
 }
}


class son extends father{
static int sonAge;
	 
	 son(int y)
    {
	 sonAge=y;
		
		 try{
		 if(sonAge>=fatherAge)
				throw new wrongAge("Son's Age cant be greater than Father's Age");
		 }
		 catch(wrongAge e) {
		 System.out.println(e);
		 }
	}	
}

class Exceptionex{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
System.out.println("Enter the father's Age");
int age1=sc.nextInt();
 new father(age1);
 
System.out.println("Enter the Son's Age");
int age2=sc.nextInt();
new son(age2);
System.out.println("\n Father's age:>" + father.fatherAge + "\t Son's age:> "+  son.sonAge );
		
}
}

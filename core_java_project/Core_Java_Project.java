import java.io.*;  
import java.util.*;
class Project1{ 
void Attendence (){
try
{
FileOutputStream fout=new FileOutputStream("Attendence.txt",true);    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	
	
	int i;
	String ch;

	String Array[] = {"1.prachi ", "2.Tejaswini", "3.prajawali" ,"4.priti" ,"5.dhanshree\n","6.shrutika\n" ,"7.nikita\n" ,"8.rutuja\n" ,"9.sakshi\n" ,"10.priyanka\n" ,"11.Tabbasum \n","12.Chaitali\n","13.shital\n","14.vrushali\n"};
	

	

    for(i = 0; i < 14; i++)  
    {  
        System.out.println(Array[i]);
 
	
	

		
		
        
     
 Scanner sce= new Scanner(System.in);
ch=sce.nextLine();
String cg = "yes" ;
String cgg = "YES" ;

       if (ch.equals(cg)  || ch.equals(cgg))
        {
            
             System.out.println( "present ");
             	
		
        }
        else if (ch.equals("no") || ch.equals("NO"))
        {            
            
			 System.out.println( "absent ");
			
	                                                   
        } 
        
        else
        {
            System.out.println("Invalid character Try again\n");
           
        }  
	 
	 bout.flush(); 	
     bout.close();    
     fout.close();    
     System.out.println("success");
	   
	
		          
    } 
System.out.println("Attendence Inserted successfully\n");
          
}
catch(Exception e)
{
System.out.println("error");
}   	
}

}

class Mock_t{ 
void Mock (){
try
{
FileOutputStream fout=new FileOutputStream("JavaMock.txt",true);    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	int count = 0 ;
	String n=("name:");
        byte b[]=n.getBytes();
        bout.write(b);

         Scanner sc= new Scanner(System.in);  
         System.out.println("Enter a string: \n");
         String str= sc.nextLine();
         byte c[]=str.getBytes();
         bout.write(c);  

         String p="\n";
         byte d[]=p.getBytes();
         bout.write(d);
        
        String n1=("Subject:");
        byte b1[]=n1.getBytes();
        bout.write(b1);

        Scanner sc1= new Scanner(System.in);  
        System.out.println("Enter a Answer: \n");
        String str1= sc1.nextLine();
        byte c1[]=str1.getBytes();
        bout.write(c1);  

        String p1="\n";
        byte d1[]=p1.getBytes();
        bout.write(d1);

Calendar calendar = Calendar.getInstance(); 
System.out.println("At present Day: " + calendar.get(Calendar.DATE)); 
 
System.out.println("Year: " + calendar.get(Calendar.YEAR));  
    
    
   

String cc = "Compiler" ;
System.out.println("Q.1 The Expanded source code is passes to the _");
String n2=("Answer :");
        byte b2[]=n2.getBytes();
        bout.write(b2);

         Scanner sc2= new Scanner(System.in);  
         System.out.println("Enter a Answer: \n");
         String str2= sc2.nextLine();
         byte dd[]=str2.getBytes();
         bout.write(dd);  

         String p2="\n";
         byte d2[]=p2.getBytes();
         bout.write(d2);
  if(cc.equals(str2))
{
count++;
System.out.println("Correct Answer: " );
}

String a = "Compiler" ;
System.out.println(a.equals(str2));

 String p11="\n";
        byte d11[]=p11.getBytes();
        bout.write(d11);

String cc1 = "0" ;
System.out.println("Q.2 Program execution status is successful then return_");
String n3=("Answer :");
        byte b3[]=n3.getBytes();
        bout.write(b3);

         Scanner sc3= new Scanner(System.in);  
         System.out.println("Enter a Answer: \n");
         String str3= sc3.nextLine();
         byte dd1[]=str3.getBytes();
         bout.write(dd1);  

         String p3="\n";
         byte d3[]=p3.getBytes();
         bout.write(d3);

String a1 = "0" ;

  if(a1.equals(str3))
{
count++;
System.out.println("Correct Answer: " );
}
  

String nnn=("Marks");
byte bbb[]=nnn.getBytes();
bout.write(bbb);   
String z = String.valueOf(count);

        byte y[]=z.getBytes();
        bout.write(y);
  



bout.flush();    
     bout.close();    
     fout.close();    
     System.out.println("success");







	    
}
catch(Exception e)
{
System.out.println("error");
}
}

	
}
class Project4
{
void Att()
{

try
{
FileOutputStream fout=new FileOutputStream("JavaAttende.txt",true);    
     BufferedOutputStream bout=new BufferedOutputStream(fout);   
ArrayList<String> al = new ArrayList<String>();
al.add("prachi");
al.add("indian");
al.add("prachi");

Iterator<String> itr = al.iterator();
String v=String.valueOf(al);
while(itr.hasNext())
{
System.out.println(itr.next());
} 
  
String nn1=("name:");
byte bb1[]=nn1.getBytes();
bout.write(bb1);

byte cc1[]=v.getBytes();
bout.write(cc1);  

String pp1="\n";
byte ddd1[]=pp1.getBytes();
bout.write(ddd1);
     bout.flush();    
     bout.close();    
     fout.close();    
     System.out.println("success");   
}
catch(Exception e)
{
System.out.println("error");
}
}
}

class Project5 extends Calculator
{
void Aptitude()
{
try
{
FileWriter fw = new FileWriter("Aptitude.txt");

Project5 ty1 = new Project5();


     int count = 0 ;
 fw.write("Q.1 what is 20 percent of 65 ? \n step 1. 20 percent =2 x 10 percent\n step 2.10 percent of 65 is 6.5 step 3.6.5 x2 \n \n Answer 13.00 \n \n");

System.out.println("Q.1 what is 20 percent of 65 ? " );
System.out.println("Step-1-> 20 percent =2 x 10 percent " );
System.out.println("step-2-> 10 percent of 65 is 6.5" );
System.out.println("step-3-> 2.6.5 x2" );
System.out.print("step-4-> Answer 13.00 \n \n " );

fw.write("Try to solve \n \n 20 percent of 63 is ? \n ");
System.out.println("step-1-> Try to solve ");
System.out.println("step-2-> 20 percent of 63 is ?" );


String a2 = "12.6" ;
System.out.println("your answer" ) ;
Scanner sc1=new Scanner(System.in);
String a5=sc1.nextLine();


  if(a2.equals(a5))
{
fw.write("correct");
System.out.println("Correct Answer" );
count++;
}
  
else
{
fw.write("wrong answer");
System.out.println("Wrong Answer" );
}


fw.write("Q.2 The price of petrol  increased by 14.28 percent.\nThe new price is 160 rupees \n find original price\n \n step 1. 14.28 percent is fraction of 7\n \n step 2. increment 7=7+1=8 \n\n step 3. new price is 160 =160/8\n \n step 4. answer =20 \n\n step 5 . Multiply 7 with 20 \n 7 x20 =140 \n\nanswer=140 \n\ntry this\n \nthe price of lemon increased by 33.3 percent.\n The original price was 200 \n find new ? \n\n");
System.out.println("The price of petrol  increased by 14.28 percent.");
System.out.println("The new price is 160 rupees");
System.out.print("find original price ?\n\n\n");
System.out.println("try this");
System.out.println("the price of lemon increased by 33.3 percent.\n The original price was 200 \n find new ?");
fw.write("NEED OF CALCULATOR:");
System.out.println("NEED OF CALCULATOR:");

Scanner scc =new Scanner(System.in);
String Need = scc.nextLine();

System.out.println("1.INTEGER \n2.FLOATING");
int Option =scc.nextInt();

if(Need.equals("y"))
{
            switch(Option)
             {
                  case 1:
			ty1.integer();
                          break;
			
		}
}


String a3 = "150" ;
System.out.println("your answer" ) ;
Scanner sc2=new Scanner(System.in);
String aa1=sc2.nextLine();


  if(a3.equals(aa1))
{
fw.write("correct");
System.out.println("Correct Answer" );
count++;
}
  
else
{
fw.write("wrong answer");
System.out.println("Wrong Answer" );
}





fw.close();
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("success");
  

}
}

class Calculator  
{

void integer()
{
try{

FileWriter fw1 = new FileWriter("Call.txt");
fw1.write("Which operation want to perfom :");
fw1.write("1.Addition (+)\n2.substraction(-)\n3.divide(/)\n4.multiplication(*)\n5.Square\n6.cube\n");
fw1.write("Operation chosen:");

	
System.out.println("Which operation want to perfom :");
	

System.out.println("1.Addition (+)\n2.substraction(-)\n3.divide(/)\n4.multiplication(*)\n5.Square\n6.cube\n");
Scanner sc3 = new Scanner(System.in);
int operation1 ;
                int operation = sc3.nextInt();

		
System.out.println("Enter a first value :");


                int valueFirst = sc3.nextInt();
fw1.write("first value" + valueFirst);

System.out.println("Enter a second value :");

                int valueSecond = sc3.nextInt();
fw1.write("first value" + valueSecond );


switch(operation)
	{
		case 1 :
System.out.print("Addition : ");
		System.out.println( valueFirst+valueSecond);	
		break;
			
		case 2 :
		System.out.println("Substraction : ");		
		System.out.println( valueFirst-valueSecond);	
		
			break;
			case 3 :
System.out.print("Division: ");
		System.out.println( valueFirst / valueSecond);	
		
			break;
			case 4 :
System.out.print("Multiplication : ");
System.out.println(valueFirst*valueSecond);
			
			break;
			
			case 5 :
System.out.print("Square : ");
System.out.println( valueFirst*valueFirst);
				
				break;
				case 6:
System.out.print("Cube: ");
System.out.println( valueFirst*valueFirst*valueFirst);
				
}
	     
	
}


  


catch(Exception e)
{
System.out.println("Error");
}
}
}

class Cv
{
void Resume()

{
try
{
FileWriter f = new FileWriter("Resumee.txt",true);
System.out.println("Enter Name: ") ;
Scanner s=new Scanner(System.in);
String name = s.nextLine();
System.out.println("Enter E-mail: ") ;
String ss=s.nextLine();
System.out.println("Enter Summary: ") ;
String summary=s.nextLine();
System.out.println("Enter phone: ") ;
String phone=s.nextLine();
System.out.println("Enter : ") ;
String e=s.nextLine();
System.out.println("Enter Strength : ") ;
String strength=s.nextLine();
String Strength1=s.nextLine();
String strength2=s.nextLine();
System.out.println("Enter Project : ") ;
String project=s.nextLine();
String project1=s.nextLine();

System.out.println("Enter Skills : ") ;
String skill=s.nextLine();
String skill1=s.nextLine();
String skill2=s.nextLine();

System.out.println("Enter Long Term Goal : ") ;
String g=s.nextLine();
String g1=s.nextLine();
String g2=s.nextLine();

System.out.println("Enter Skill Language : ") ;
String sl=s.nextLine();
String sl1=s.nextLine();
String sl2=s.nextLine();

System.out.println("Enter short term goal: ") ;
String sh=s.nextLine();
String sh1=s.nextLine();

System.out.println("Language Known: ") ;
String l=s.nextLine();
String l1=s.nextLine();
String l2=s.nextLine();


System.out.println("Enter Education Qualification: ") ;
String q1=s.nextLine();
String q2=s.nextLine();


System.out.println("Enter Weakness : ") ;
String weakness =s.nextLine();
f.write("name :"+name +"\t\t\t\t\t\t\t\t\t\t"+"Summary :"+summary+"\n" );
f.write("E-mail :"+ e +"\t\t\t\t\t\t\t\t\t\t"+"Strength 1:"+strength+"\n");
  
f.write("Phone:"+ phone +"\t\t\t\t\t\t\t\t\t\t"+"2." +Strength1 +"\n");
f.write("Project 1:"+project+"\t\t\t\t\t\t\t\t\t"+"3:"+strength2 +"\n" );
f.write("\t"+"2:"+ project1 +"\t\t\t\t\t\t\t\t\t\t"+"Weakness:"+weakness+"\n\n\n");

f.write("Skills 1:"+ skill + "\t\t\t\t\t\t\t\t\t" + "Goal 1:" +g +"\n" );
  
f.write("2:"+ skill1 +"\t\t\t\t\t\t\t\t\t"+"2."+g1 +"\n");
f.write("3:"+skill2+"\t\t\t\t\t\t\t\t\t"+"3:"+g2 +"\n" );

f.write("Skill Language:"+ sl +"\t\t\t\t\t\t\t\t\t"+"Short Goal 1:" +sh +"\n");
f.write("2:"+sl1+"\t\t\t\t\t\t\t\t\t"+"2:"+sh1 +"\n" );
f.write("2:"+ sl2 +"\t\t\t\t\t\t\t\t\t"+"Qualification:"+q1+"\n");

f.write("Language Known 1:"+ l +"\t\t\t\t\t\t\t\t\t"+"2:"+q2+"\n");
 f.write("2:"+ l1 +"\n");
 f.write("3:"+ l2 +"\n");


f.close();

}
catch(Exception e)
{
System.out.println("erro");
}
 
 
}
}


		






class Project2
{
public static void main(String args[]){
Project1 p = new Project1();
 Project4 a1 = new  Project4();
Project5 Apti = new Project5();
Cv resume= new Cv();
Mock_t m =new Mock_t();
System.out.println("Enter");
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();

switch(n)
{
 case 1 :
  p.Attendence();
break;
  case 2:
 m.Mock();
break;
case 3 : 
a1.Att();
break;
case 4:
Apti.Aptitude();
break;

case 5:
resume.Resume();
break;

}


    
     
} 
}   
 
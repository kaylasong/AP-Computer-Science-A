import java.util.*;
public class HumanDriver
{
    public static void main()
    {
        Freshman a=new Freshman("a",1.0);
        Freshman b=new Freshman("Bob",2.0);
        Freshman c=new Freshman("c",8.0);
        Senior d=new Senior("Bob",0.1);
        Senior e=new Senior("e",12.1);
        Senior f=new Senior("f",12.0);

        Student[] people=new Student[6];
        people[0]=a;
        people[1]=b;
        people[2]=c;
        people[3]=d;
        people[4]=e;
        people[5]=f;
        
        ArrayList<Human> people2=new ArrayList<Human>();
        for(int i=0;i<6;i++)
        {
            people2.add(people[i]);
        }
        Senior[] sen=new Senior[3];
        sen[0]=d;
        sen[1]=e;
        sen[2]=f;
        
        System.out.println(averageGPA(people));
        System.out.println(countBobs(people));
        System.out.println(countVoters(people2));
        System.out.println(valedictorian(sen));
        Human[] ans=honorRoll(people);
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
    }
    
    //returns the average gpa of the students in the list
    public static double averageGPA(Student[] humins)
    {
        double total=0;
        for(int i=0;i<humins.length;i++)
        {
            total=total+humins[i].getGPA();
        }
        return(total/humins.length);
    }

    //returns how many bobs are in this list
    public static int countBobs(Human[] humins)
    {
        int count=0;
        for(int i=0;i<humins.length;i++)
        {
            if(humins[i].getName().equals("Bob"))
            {
                count++;
            }
        }
        return(count);
    }

    //returns the number of voters
    public static int countVoters(ArrayList<Human> humins)
    {
        int count=0;
        for(int i=0;i<humins.size();i++)
        {
            if(humins.get(i).canVote())
            {
                count++;
            }
        }
        return(count);
    }

    //returns the humin with the highest GPA
    public static String valedictorian(Senior[] humins)
    {
        double max=-1000;
        int mark=0;
        for(int i=0;i<humins.length;i++)
        {
            if(humins[i].getGPA()>max)
            {
                max=humins[i].getGPA();
                mark=i;
            }
        }
        return(humins[mark].getName());
    }

    //finds who is on the honor roll
    public static Student[] honorRoll(Student[] humins)
    {
        ArrayList<Student> humans=new ArrayList<Student>();
        for(int i=0;i<humins.length;i++)
        {
            if(humins[i] instanceof Senior && humins[i].getGPA()>=4.0)
            {
                humans.add(humins[i]);
            }
            else if(humins[i] instanceof Freshman && humins[i].getGPA()>=3.5)
            {
                humans.add(humins[i]);
            }
        }
        Student[] ans=new Student[humans.size()];
        for(int i=0;i<humans.size();i++)
        {
            ans[i]=humans.get(i);
        }
        return(ans);
    }
}
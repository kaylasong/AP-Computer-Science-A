import java.util.*;
public class TicTacToe
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        //SET UP
        String[][]chart=new String[3][3];
        for(int r=0;r<3;r++)
        {
            for(int c=0;c<3;c++)
            {
                chart[r][c]=" ";
            }
        }
        System.out.println("    a   b   c ");
        System.out.println("1   "+chart[0][0]+" | "+chart[0][1]+" | "+chart[0][2]+" ");
        System.out.println("   ___|___|___");
        System.out.println("2   "+chart[1][0]+" | "+chart[1][1]+" | "+chart[1][2]+" ");
        System.out.println("   ___|___|___");
        System.out.println("3   "+chart[2][0]+" | "+chart[2][1]+" | "+chart[2][2]+" ");
        //THEY CHOOSE THEIR WEAPON
        System.out.println("CHOOSE YOUR WEAPON");
        System.out.println("x or o?");
        String choice=sc.nextLine();
        String myW=new String("");
        if(choice.equals("x"))
        {
            myW="o";
        }
        else
            myW="x";
        
        int count=0;
        boolean done=false;
        while(done==false)
        {
            //process!
            thingy(chart, choice);
            count++;
            wonOrNot(chart, choice, myW);
            if(wonOrNot(chart, choice, myW)==1)
            {
                System.out.println("You won!");
                done=true;
                break;
            }
            if(wonOrNot(chart, choice, myW)==2)
            {
                System.out.println("I won!");
                done=true;
                break;
            }
            opponent(chart, myW);
            wonOrNot(chart, choice, myW);
            if(wonOrNot(chart, choice, myW)==1)
            {
                System.out.println("You won!");
                done=true;
                break;
            }
            if(wonOrNot(chart, choice, myW)==2)
            {
                System.out.println("I won!");
                done=true;
                break;
            }
            count++;
            if(count==9)
            {
                System.out.println("Tie");
                done=true;
                break;
            }
        }
    }
    //the thingy to place the thingy
    public static String[][] thingy(String[][] chart, String choice)
    {
        Scanner sc=new Scanner(System.in);

        String columnn=new String("");
        int row=20;
        int column=5;

        boolean finished=false;
        while(finished==false)
        {
            System.out.println("Where would you like to put your weapon?");
            System.out.println("What column?");
            columnn=sc.nextLine();
            System.out.println("What row?");
            row=sc.nextInt();
            sc.nextLine();

            //convert the things
            row=row-1;
            if(columnn.equals("a"))
            {
                column=0;
            }
            if(columnn.equals("b"))
            {
                column=1;
            }
            if(columnn.equals("c"))
            {
                column=2;
            }

            //IS IT VALID??
            if(chart[row][column].equals("x") || chart[row][column].equals("o"))
            {
                System.out.println("That space is already taken. Try again");
            }
            if(chart[row][column].equals(" "))
            {
                finished=true;
            }
        }

        //change it
        chart[row][column]=choice;
        physicalChart(chart);
        return(chart);
    }
    //THIS IS THE THINGY TO EDIT THE PHYSICAL CHART THINGY
    public static String[][] physicalChart(String[][]chart)
    {
        System.out.println("    a   b   c ");
        System.out.println("1   "+chart[0][0]+" | "+chart[0][1]+" | "+chart[0][2]+" ");
        System.out.println("   ___|___|___");
        System.out.println("2   "+chart[1][0]+" | "+chart[1][1]+" | "+chart[1][2]+" ");
        System.out.println("   ___|___|___");
        System.out.println("3   "+chart[2][0]+" | "+chart[2][1]+" | "+chart[2][2]+" ");

        //return that changed chart
        return(chart);
    }
    //THIS IS THE THINGY FOR THE OPPONENT TO MOVE
    public static void opponent(String[][]chart, String myW)
    {
        System.out.println("My turn!");
        int r=5;
        int c=5;
        //Randomly pick coordinates
        boolean complete=false;
        while(complete==false)
        {        
            r=(int)(3*Math.random());
            c=(int)(3*Math.random());
            if(chart[r][c].equals(" "))
            {
                complete=true;
            }        
        }

        //change it and print it
        chart[r][c]=myW;
        physicalChart(chart);
    }
    //THIS ONE CHECKS IF SOMEONE WON OR NOT
    public static int wonOrNot(String[][]chart, String choice, String myW)
    {
        int yourCount=0;
        int myCount=0;
        //HORIZONTAL
        for(int i=0;i<3;i++)
        {
            yourCount=0;
            myCount=0;
            for(int j=0;j<3;j++)
            {
                if(chart[i][j].equals(choice))
                {
                    yourCount++; 
                }
                if(chart[i][j].equals(myW))
                {
                    myCount++;
                }
                if(yourCount==3)
                {
                    return(1);
                }
                if(myCount==3)
                {
                    return(2);
                }
            }
        }
        //VERTICAL
        for(int j=0;j<3;j++)
        {
            yourCount=0;
            myCount=0;
            for(int i=0;i<3;i++)
            {
                if(chart[i][j].equals(choice))
                {
                    yourCount++; 
                }
                if(chart[i][j].equals(myW))
                {
                    myCount++;
                }
                if(yourCount==3)
                {
                    return(1);
                }
                if(myCount==3)
                {
                    return(2);
                }
            }
        }
        //DIAGONAL
        yourCount=0;
        myCount=0;
        for(int i=0;i<3;i++)
        {
            if(chart[i][i].equals(choice))
            {
                yourCount++;
            }
            if(chart[i][i].equals(myW))
            {
                myCount++;
            }
            if(yourCount==3)
            {
                return(1);
            }
            if(myCount==3)
            {
                return(2);
            }
        }
        yourCount=0;
        myCount=0;
        if(chart[2][0].equals(choice)&&chart[1][1].equals(choice)&&chart[0][2].equals(choice))
        {
            return(1);
        }
        if(chart[2][0].equals(myW)&&chart[1][1].equals(myW)&&chart[0][2].equals(myW))
        {
            return(2);
        }
        return(0);
    }
}

import java.util.*;
public class Poker
{
    public static int main(int wallet, int wager)
    {
        Scanner sc=new Scanner(System.in);

        //SET UP THE DARN HANDS
        DeckOCardz deck=new DeckOCardz();
        deck.shuffle();
        ArrayList<Cardz> hand=new ArrayList<Cardz>();

        //DEAL THE DARN HANDS
        System.out.println("This is your hand");
 
        hand.add(deck.pickCard());
        hand.add(deck.pickCard());
        hand.add(deck.pickCard());
        hand.add(deck.pickCard());
        hand.add(deck.pickCard());
        hand=sort(hand);
        System.out.println(hand);        

        //DO THEY WANNA DEEM CARDS AS TRASH?
        System.out.println("Would you like to deem some cards as trash? [yes/no]");
        String choice=sc.nextLine();
        if(choice.equals("yes"))
        {
            hand=deemedTrash(hand, deck);
            hand=sort(hand);
            System.out.println(hand);
        }
      
        
        //NOW WE CHECK THE DARN WINS
        int newWager=0;
        while(newWager==0)
        {
            newWager=royalFlush(wager, hand);
            if(newWager!=0)
                break;
            newWager=straightFlush(wager, hand);
            if(newWager!=0)
                break;
            newWager=fullHouse(wager, hand);
            if(newWager!=0)
                break;
            newWager=flush(wager, hand);
            if(newWager!=0)
                break;
            newWager=straight(wager, hand);
            if(newWager!=0)
                break;
            newWager=fourOKind(wager, hand);
            if(newWager!=0)
                break;
            newWager=threeOKind(wager, hand);
            if(newWager!=0)
                break;
            newWager=twoPair(wager, hand);
            if(newWager!=0)
                break;
            newWager=onePair(wager, hand);
            if(newWager!=0)
                break; 
            newWager=(-wager);
        }
        System.out.println(whichOne(newWager, wager));
        wallet=wallet+newWager;
        return wallet;
    }

    public static ArrayList<Cardz> sort(ArrayList<Cardz> hand)
    {
        ArrayList<Cardz> sorted=new ArrayList<Cardz>();
        Cardz min=hand.get(0);
        int mark=0;
        for(int i=0;i<5;i++)
        {   //to provide a constant
            min=hand.get(0);
            mark=0;
            for(int j=0;j<hand.size();j++)
            {   //to go through hand
                if(hand.get(j).getValue()<min.getValue())
                {
                    min=hand.get(j);
                    mark=j;
                }
            }
            sorted.add(min);
            hand.remove(mark);
        }
        return sorted;
    }

    public static ArrayList<Cardz> deemedTrash(ArrayList<Cardz> hand, DeckOCardz deck)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("How many cards do you want to deem trash?");
        int num=sc.nextInt();
        sc.nextLine();
        int [] chosen=new int[num];
        for(int i=0;i<num;i++)
        {
            System.out.println("List the cards you want to deem trash 1 by 1 and press ENTER between them.");
            System.out.println("Pick [1],[2],[3],[4], or [5]");
            int trash=sc.nextInt();
            sc.nextLine();
            chosen[i]=trash;
        }
        for(int i=num-1;i>=0;i--)
        {
            hand.remove(chosen[i]-1);
        }
        for(int i=0;i<num;i++)
        {
            hand.add(deck.pickCard());
        }
        System.out.println("You have thrown out the trash cards and gained new ones.");
        System.out.println("This is your new hand.");
        return hand;
    }

    public static int onePair(int wager, ArrayList<Cardz> hand)
    {   
        //one pair
        boolean found=false;
        for(int i=0;i<hand.size()-1;i++)
        {
            if(hand.get(i).getValue()==hand.get(i+1).getValue())
            {
                found=true;
            }
        }
        if(found==false)
        {
            return 0; 
        }
        else 
        {
            return wager;
        }
    }

    public static int twoPair(int wager,ArrayList<Cardz> hand)
    {
        int count=0;
        //count pairs found
        if(onePair(wager,hand)==wager)
        {
            for(int i=0;i<hand.size()-1;i++)
            {
                if(hand.get(i).getValue()==hand.get(i+1).getValue())
                {
                    count++;
                }
            }
            if(count==2)
            {    
                 return 2*wager;
            }
        }
        return 0;
    }

    public static int threeOKind(int wager,ArrayList<Cardz> hand) 
    {
        for(int i=0;i<3;i++)
        {
            if(hand.get(i).getValue()==hand.get(i+1).getValue() &&
            hand.get(i+1).getValue()==hand.get(i+2).getValue())
            {
               return 3*wager;
            }
        }
        return 0;
    }
    
    public static int fourOKind(int wager,ArrayList<Cardz> hand)  
    {
        for(int i=0;i<2;i++)
        {
            if(hand.get(i).getValue()==hand.get(i+1).getValue() &&
            hand.get(i+1).getValue()==hand.get(i+2).getValue()&&
            hand.get(i+2).getValue()==hand.get(i+3).getValue())
               return 25*wager; 
        }
        return 0;
    }

    public static int straight(int wager,ArrayList<Cardz> hand) 
    {
        int og=0;
        int next=0;
        for(int i=0; i<hand.size()-1 ; i++)
        {
            og=hand.get(i).getValue();
            next=hand.get(i+1).getValue();
            if(og==1 && next==10)
            {}
            else if(next-og!=1)
            {
                return 0;
            }
        }
        //if it makes it through without returning 0
        return 4*wager;
    }

    public static int flush(int wager, ArrayList<Cardz> hand)
    {
        String suit=hand.get(0).getSuit();
        for(int i=0;i<hand.size();i++)
        { 
            if(!suit.equals(hand.get(i).getSuit()))
                return 0;
        }
        return 6*wager;
    }

    public static int royalFlush(int wager,ArrayList<Cardz> hand)
    {
        //System.out.println("ghubu"+straightFlush(wager,hand));
        if(straightFlush(wager, hand)==50*wager)
        {
            for(Cardz c:hand)
            {
                if(c.getValue()<10 && c.getValue()>1)
                    return 0;
            }
            return 250*wager;
        }
        else 
            return 0;
    } 
    
    public static int fullHouse(int wager,ArrayList<Cardz> hand)
    {
        if(hand.get(0).getValue()==hand.get(1).getValue() &&
            hand.get(1).getValue()==hand.get(2).getValue())
        {
            if((hand.get(3).getValue()==hand.get(4).getValue()))
            {
                return 9*wager;
            }
        }
        if((hand.get(0).getValue()==hand.get(1).getValue()))
        {
            if(hand.get(2).getValue()==hand.get(3).getValue() &&
            hand.get(3).getValue()==hand.get(4).getValue())
            {
                return 9*wager;
            }
        }
        return 0;
    }
    
    public static int straightFlush(int wager,ArrayList<Cardz> hand)
    {
        if(straight(wager,hand)==4*wager && flush(wager,hand)==6*wager)
        {
            return 50*wager;
        }
        else return 0;
    }
        
    public static String whichOne(double newWager, int wager)
    {
        if(newWager==wager)
            return "You got one pair! You won $"+wager;
        else if(newWager==wager*2)
            return "You got two pairs! You won $"+2*wager;
        else if(newWager==wager*3)
            return "You got three of a kind! You won $"+3*wager;
        else if(newWager==wager*25)
            return "You got four of a kind! You won $"+25*wager;
        else if(newWager==wager*4)
            return "You got a straight! You won $"+4*wager;
        else if(newWager==wager*6)
            return "You got a flush! You won $"+6*wager;
        else if(newWager==wager*9)
            return "You got a full house! You won $"+9*wager;
        else if(newWager==wager*50)
            return "You got a straight flush! You won $"+50*wager;
        else if(newWager==wager*250)
            return "You got a royal flush! You won $"+250*wager;
        else 
            return "You done got nothing, fam.";
    }
}
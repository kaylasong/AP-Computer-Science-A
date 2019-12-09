import java.util.*;
public class DeckOCardz
{
    private ArrayList<Cardz> deck=new ArrayList<Cardz>();
    public DeckOCardz()
    {
        {
            //creating the cards
            int suit=1;
            String suitt=new String("");
            for(int i=0;i<4;i++)
            {
                for(int j=1;j<14;j++)
                {
                    if(suit==1)
                        suitt="hearts";
                    if(suit==2)
                        suitt="diamonds";
                    if(suit==3)
                        suitt="spades";
                    if(suit==4)
                        suitt="clubs";
                    Cardz ting=new Cardz(suitt,j);
                    deck.add(ting);
                }
                suit++;
            }
        }  
    }

    public void shuffle()
    {
        ArrayList<Cardz> shuffed=new ArrayList<Cardz>();
        int length=deck.size();
        for(int i=0;i<length;i++)
        {
            int random=(int)(deck.size()*Math.random());
            shuffed.add(deck.get(random));
            deck.remove(random);
        }
        deck=shuffed;
    }

    public Cardz pickCard()
    {
        Cardz chosenOne=deck.get(0);
        deck.remove(0);
        return(chosenOne);
    }

    public void returnCard(Cardz card)
    {
        deck.add(card);
    }
    
    public String toString()
    {
        String string=new String();
        for(Cardz c: deck)
        {
            string=string+"\n"+c;
        }
        return(string);
    }
}

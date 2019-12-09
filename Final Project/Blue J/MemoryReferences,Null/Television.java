public class Television
{
    private int size;
    private String brand;
    
    //constructor
    public Television(int sizeInput, String brandInput)
    {
        size=sizeInput;
        brand=brandInput;
    }
    
    //accessors
    public int getSize()
    {
        return(size);
    }
    public String getBrand()
    {
        return(brand);
    }
    
    //mutator
    public void changeBrand(String newBrand)
    {
        brand=newBrand;
    }
    
    public String toString()
    {
        String ans=new String("Screen size: "+size+"\nBrand: "+brand);
        return(ans);
    }
    
    public boolean equals(Television other)
    {
        if(size==other.getSize() && brand.equals(other.getBrand()))
        {
            return true;
        }
        else 
            return false;
    }
}

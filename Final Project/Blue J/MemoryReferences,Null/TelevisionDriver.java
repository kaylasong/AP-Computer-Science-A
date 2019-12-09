public class TelevisionDriver
{
    public static void main()
    {
        Television charlie=new Television(12,"puppo");
        System.out.println(charlie.getSize());
        System.out.println(charlie.getBrand());
        charlie.changeBrand("puppoe");
        System.out.println(charlie.getBrand());
        
        System.out.println(charlie);
        Television charley=new Television(12,"puppoe");
        System.out.println(charlie.equals(charley));
        charley.changeBrand("puppo");
        System.out.println(charlie.equals(charley));
    }
}

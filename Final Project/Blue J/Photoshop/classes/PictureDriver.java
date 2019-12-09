public class PictureDriver
{
    //cleaned up version of PictureTester
    
    public static void testKeepOnlyBlue()
    {
        Picture komondor = new Picture("komondorsf5.jpg");
        komondor.explore(); //shows original pic
        komondor.keepOnlyBlue();
        komondor.explore(); //shows edited pic
    }
    
    public static void testNegate()
    {
        Picture kirby = new Picture("kirby.jpg");
        kirby.explore(); //shows original pic
        kirby.negate();
        kirby.explore(); //shows edited pic
    }
    
    public static void testGrayscale()
    {
        Picture kirby = new Picture("kirby.jpg");
        kirby.explore(); //shows original pic
        kirby.grayscale();
        kirby.explore(); //shows edited pic
    }
    
    public static void testFixUnderwater()
    {
        Picture water=new Picture("water.jpg");
        water.explore();
        water.fixUnderwater();
        water.explore();
    }
    
    public static void testMirrorVerticalRightToLeft()
    {
        Picture kirby = new Picture("kirby.jpg");
        kirby.explore(); //shows original pic
        kirby.mirrorVerticalRightToLeft();
        kirby.explore(); //shows edited pic
    }
    
    public static void testMirrorHorizontal()
    {
        Picture hertzog = new Picture("hertzog.jpg");
        hertzog.explore(); //shows original pic
        hertzog.mirrorHorizontal();
        hertzog.explore(); //shows edited pic
    }
    
    public static void testMirrorDiagonal()
    {
        Picture d = new Picture("mydoge.jpg");
        d.explore(); //shows original pic
        d.mirrorDiagonal();
        d.explore(); //shows edited pic
    }
    
    public static void testCollageTest()
    {
        Picture d = new Picture("CollageBackgroundtofitmydoge.jpg");
        d.myCollage();
        d.explore();
    }
    
    public static void testEdgeDetection()
    {
        Picture d = new Picture("Kirby.jpg");
        d.edgeDetection(200);
        d.explore();
    }
    
    public static void testDarken()
    {
        Picture d = new Picture("mydoge.jpg");
        d.explore();
        d.darken();
        d.explore();
    }
    
    public static void testBrighten()
    {
        Picture d = new Picture("mydoge.jpg");
        d.explore();
        d.brighten();
        d.explore();
        System.out.println("Gaze upon the beauty of the Holy Doge");
    }
    
    public static void testCrop()
    {
        Picture d = new Picture("mydoge.jpg");
        d.explore();
        d.crop(137,173,163,206);
        d.explore();
    }
    
    public static void testColorBlind()
    {
        Picture d = new Picture("maunakea.jpg");
        d.explore();
        d.colorBlind();
        d.explore();
    }
    
    public static void testJail()
    {
        Picture hertzog = new Picture("hertzog.jpg");
        hertzog.explore();
        hertzog.jail();
        hertzog.explore();
    }
    
    public static void testLookMirror()
    {
        Picture d = new Picture("mydoge.jpg");
        d.explore();
        d.lookMirror();
        d.explore();
    }
    
    public static void testFlipDown()
    {
        Picture d = new Picture("mydoge.jpg");
        d.explore();
        d.flipDown();
        d.explore();
    }
    
    public static void testRotate180()
    {
        Picture d = new Picture("mydoge.jpg");
        d.explore();
        d.rotate180();
        d.explore();
    }
    
    public static void testNoseFinder()
    {
        Picture a=new Picture("shaggy.jpg");
        a.noseFinder();
    }
    
    //to add a nice slash of dogjiery 
    public static void testAddDoge()
    {
        Picture a=new Picture("temple.jpg");
        a.addDoge();
        a.explore();
    }
}
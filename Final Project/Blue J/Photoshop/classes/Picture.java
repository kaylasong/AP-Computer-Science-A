import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments 
     */
    public Picture ()
    {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor 
         */
        super();  
    }

    // my own methods

    //pg 14 Exercises 3 using zeroBlue... 
    //keep only the blue and set everything else to 0
    public void keepOnlyBlue()
    {
        Pixel[][] pixels=this.getPixels2D();
        for(Pixel[] row:pixels)
        {
            for(Pixel obj:row)
            {
                obj.setGreen(0);
                obj.setRed(0);
            }
        }
    }

    //to negate all the pixels in a picture
    public void negate()
    {
        Pixel[][] pixels=this.getPixels2D();
        for(Pixel[] row:pixels)
        {
            for(Pixel obj:row)
            {
                obj.setGreen(255-obj.getGreen());
                obj.setRed(255-obj.getRed());
                obj.setBlue(255-obj.getBlue());
            }
        }
    }

    //to turn it into shades of gray
    public void grayscale()
    {
        Pixel[][] pixels=this.getPixels2D();
        for(Pixel[] row:pixels)
        {
            for(Pixel obj:row)
            {
                int avg=(obj.getRed()+obj.getGreen()+obj.getBlue())/3;
                obj.setGreen(avg);
                obj.setRed(avg);
                obj.setBlue(avg);
            }
        }
    }

    //to see the fish
    public void fixUnderwater()
    {
        Pixel[][] pixels=this.getPixels2D();
        for(Pixel[] row:pixels)
        {
            for(Pixel obj:row)
            {
                obj.setRed(obj.getRed()*4);
            }
        }
    }

    //activity 6: reflecting pictures p.15
    //complete exercises 1,2,4
    //1
    public void mirrorVerticalRightToLeft()
    {
        Pixel[][] pixels=this.getPixels2D();
        Pixel le=pixels[0][0];
        Pixel ri=pixels[0][0];
        int mark=0;
        for(int r=0;r<pixels.length;r++)
        {
            for(int c=pixels[0].length-1;c>pixels[0].length/2;c--)
            {
                ri=pixels[r][c];
                le=pixels[r][mark];
                le.setColor(ri.getColor());
                mark++;
            }
            mark=0;
        }
    }
    //2
    public void mirrorHorizontal()
    {
        Pixel[][] pixels=this.getPixels2D();
        Pixel top=pixels[0][0];
        Pixel bot=pixels[0][0];
        int mark=0;
        for(int r=pixels.length-1;r>pixels.length/2;r--)
        {
            for(int c=0;c<pixels[0].length;c++)
            {
                bot=pixels[r][c];
                top=pixels[mark][c];
                bot.setColor(top.getColor());
            }
            mark++;
        }
    }
    //4 work in a square frame
    public void mirrorDiagonal()
    {
        Pixel[][] pixels=this.getPixels2D();
        //find the smaller bound
        int min=0;
        if(pixels.length<pixels[0].length)
        {
            min=pixels.length;
        }
        else
            min=pixels[0].length;
        //boookmaarkk
        int dia=1;
        int mark=0;
        Pixel[] horiz=null; 
        Pixel[] vert=null;
        int c=1;
        for(int r=0;r<min;r++)
        {
            //for(int c=0;c<r;c++)
            //{
            horiz=new Pixel[dia];
            for(int i=0;i<dia;i++)
            {
                horiz[i]=pixels[r][i];
            }

            vert=new Pixel[dia-1];
            for(int i=0;i<dia-1;i++)
            {
                pixels[i]=pixels[i];
                vert[i]=pixels[i][c];
            }
            //break;
            //}
            for(int i=0;i<vert.length;i++)
            {
                vert[i].setColor(horiz[i].getColor());
            }
            if(dia<min)
            {
                dia++;
            }
            if(c<min-1)
            {
                c++;
            }
        }
    }

    //Activity 98 do exercise 2 on page 22. Make myCollage in Picture and testCollageTest()
    public void myCollage()
    {
        //creating a collage with the three pictures side by side
        //set up the 2D arrays to work with
        Picture beautifuldoge=new Picture("mydoge.jpg");
        Picture beautifuldoge2=new Picture("mydoge.jpg");
        Picture beautifuldoge3=new Picture("mydoge.jpg");
        Picture beautifuldoge4=new Picture("mydoge.jpg");

        Pixel[][] a=beautifuldoge.getPixels2D();
        copy(beautifuldoge,0,0);

        beautifuldoge2.edgeDetection(200);
        copy(beautifuldoge2,a.length,0);

        beautifuldoge3.colorBlind();
        copy(beautifuldoge3,0,a[0].length);

        beautifuldoge4.mirrorDiagonal();
        copy(beautifuldoge4,a.length,a[0].length);
    }

    //Activity 9
    //exerise 1 on page 23. Modify the edgeDetection method that is already written. 
    public void edgeDetection(int edgeDist)
    {
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        Color rightColor = null;
        //my variables
        Pixel botPixel=null;
        Pixel topPixel=null;
        Color topColor=null;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < pixels[0].length-1; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][col+1];
                rightColor = rightPixel.getColor();
                if (leftPixel.colorDistance(rightColor) > 
                edgeDist)
                    leftPixel.setColor(Color.BLACK);
                else
                    leftPixel.setColor(Color.WHITE);
            }
            // my added loop
            for (int col = 0; col < pixels[0].length; col++)
            {
                botPixel = pixels[row][col];
                if(row<pixels.length-1)
                {
                    topPixel = pixels[row+1][col];
                }
                topColor = topPixel.getColor();
                if (botPixel.colorDistance(topColor) > edgeDist)
                    botPixel.setColor(Color.BLACK);
                else
                    botPixel.setColor(Color.WHITE);
            }
        }
    }

    //Activity 10 darken, brighten, colorblind, jail, mirror, flip down, rotate180
    public void darken()
    {
        Pixel[][] pixels=this.getPixels2D();
        for(Pixel[] row:pixels)
        {
            for(Pixel obj:row)
            {
                obj.setGreen(obj.getGreen()/2);
                obj.setRed(obj.getRed()/2);
                obj.setBlue(obj.getBlue()/2);
            }
        }
    }

    public void brighten()
    {
        Pixel[][] pixels=this.getPixels2D();
        for(Pixel[] row:pixels)
        {
            for(Pixel obj:row)
            {
                obj.setGreen(obj.getGreen()*2);
                obj.setRed(obj.getRed()*2);
                obj.setBlue(obj.getBlue()*2);
            }
        }
    }

    public void crop(int topLeftX,int topLeftY, int bottomRightX, int bottomRightY)
    {
        Pixel[][] pixels=this.getPixels2D();
        Pixel a=null;
        for(int c=0;c<pixels.length;c++)
        {
            for(int r=0;r<pixels[0].length;r++)
            {
                if(c<topLeftX || c>bottomRightX || r<topLeftY || r>bottomRightY)
                {
                    a=pixels[c][r];
                    a.setGreen(255);
                    a.setBlue(255);
                    a.setRed(255);
                }
            }
        }
    }

    public void colorBlind()
    {
        Pixel[][] pixels=this.getPixels2D();
        int red=0;
        int green=0;
        for(Pixel[] row:pixels)
        {
            for(Pixel obj:row)
            {
                if(obj.getRed()>obj.getBlue() && obj.getRed()>obj.getGreen())
                {
                    red=obj.getRed();
                    green=obj.getGreen();
                    obj.setGreen(red);
                    obj.setRed(green);
                }
                else if(obj.getGreen()>obj.getBlue() && obj.getGreen()>obj.getRed())
                {
                    red=obj.getRed();
                    green=obj.getGreen();
                    obj.setGreen(red);
                    obj.setRed(green);
                }
            }
        }
    }

    public void jail()
    {
        Pixel[][] pixels=this.getPixels2D();
        boolean bar=true;
        for(int r=0;r<pixels.length;r++)
        {
            for(int c=0;c<pixels[0].length;c++)
            {
                if(c/10%2==1)
                    if(bar==true)
                    {
                        pixels[r][c].setRed(0);
                        pixels[r][c].setGreen(0);
                        pixels[r][c].setBlue(0);
                    }
            }
        }
    }

    public void lookMirror()
    {
        Pixel[][] pixels=this.getPixels2D();
        Pixel le=pixels[0][0];
        Pixel ri=pixels[0][0];
        Color left=null;
        int mark=0;
        for(int r=0;r<pixels.length;r++)
        {
            for(int c=pixels[0].length-1;c>pixels[0].length/2;c--)
            {
                ri=pixels[r][c];
                le=pixels[r][mark];
                left=pixels[r][mark].getColor();
                le.setColor(ri.getColor());
                ri.setColor(left);
                mark++;
            }
            mark=0;
        }
    }

    public void flipDown()
    {
        Pixel[][] pixels=this.getPixels2D();
        Pixel top=pixels[0][0];
        Pixel bot=pixels[0][0];
        Color bott=null;
        int mark=0;
        for(int r=pixels.length-1;r>pixels.length/2;r--)
        {
            for(int c=0;c<pixels[0].length;c++)
            {
                bot=pixels[r][c];
                top=pixels[mark][c];
                bott=pixels[r][c].getColor();
                bot.setColor(top.getColor());
                top.setColor(bott);
            }
            mark++;
        }
    }

    public void rotate180()
    {
        this.lookMirror();
        this.flipDown();
    }

    public void noseFinder()
    {
        System.out.println("I have fail.");
    }
    
    public void addDoge()
    {
        Pixel[][] pixels=this.getPixels2D();
        Picture doge=new Picture("raincoat.jpg");
        Pixel[][] dogge=doge.getPixels2D();
        int count=0;
        int countc=0;
        for(int r=0;r<pixels.length;r++)
        {
            if((r)%(dogge.length)==0 && r>1)
                {
                    count++;
                }
            for(int c=0;c<pixels[0].length;c++)
            {
                Pixel p=pixels[r][c];
                if((c)%(dogge[0].length)==0 && c>1)
                {
                    countc++;
                }
                Pixel d=dogge[r-((dogge.length)*count)][c-((dogge[0].length)*countc)];
                
                int blueavg=(p.getBlue()+d.getBlue())/2;
                int redavg=(p.getRed()+d.getRed())/2;
                int greenavg=(p.getGreen()+d.getGreen())/2;
                
                pixels[r][c].setBlue(blueavg);
                pixels[r][c].setGreen(greenavg);
                pixels[r][c].setRed(redavg);
            }
            countc=0;
        }
    }

    
    // 
    /**
     * Constructor that takes a file name and creates the picture 
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName)
    {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     */
    public Picture(int height, int width)
    {
        // let the parent class handle this width and height
        super(width,height);
    }

    /**
     * Constructor that takes a picture and creates a 
     * copy of that picture
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture)
    {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image)
    {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString()
    {
        String output = "Picture, filename " + getFileName() + 
            " height " + getHeight() 
            + " width " + getWidth();
        return output;

    }

    /** Method to set the blue to 0 */
    public void zeroBlue()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setBlue(0);
            }
        }
    }

    /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from left to right */
    public void mirrorVertical()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < width / 2; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                rightPixel.setColor(leftPixel.getColor());
            }
        } 
    }

    /** Mirror just part of a picture of a temple */
    public void mirrorTemple()
    {
        int mirrorPoint = 276;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();

        // loop through the rows
        for (int row = 27; row < 97; row++)
        {
            // loop from 13 to just before the mirror point
            for (int col = 13; col < mirrorPoint; col++)
            {

                leftPixel = pixels[row][col];      
                rightPixel = pixels[row]                       
                [mirrorPoint - col + mirrorPoint];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }

    /** copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
    public void copy(Picture fromPic, 
    int startRow, int startCol)
    {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 0, toRow = startRow; 
        fromRow < fromPixels.length &&
        toRow < toPixels.length; 
        fromRow++, toRow++)
        {
            for (int fromCol = 0, toCol = startCol; 
            fromCol < fromPixels[0].length &&
            toCol < toPixels[0].length;  
            fromCol++, toCol++)
            {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }   
    }

    /** Method to create a collage of several pictures */
    public void createCollage()
    {
        Picture flower1 = new Picture("flower1.jpg");
        Picture flower2 = new Picture("flower2.jpg");
        this.copy(flower1,0,0);
        this.copy(flower2,100,0);
        this.copy(flower1,200,0);
        Picture flowerNoBlue = new Picture(flower2);
        flowerNoBlue.zeroBlue();
        this.copy(flowerNoBlue,300,0);
        this.copy(flower1,400,0);
        this.copy(flower2,500,0);
        this.mirrorVertical();
        this.write("collage.jpg");
    }

    /** Method to show large changes in color 
     * @param edgeDist the distance for finding edges

    public void edgeDetection(int edgeDist)
    {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
    for (int col = 0; 
    col < pixels[0].length-1; col++)
    {
    leftPixel = pixels[row][col];
    rightPixel = pixels[row][col+1];
    rightColor = rightPixel.getColor();
    if (leftPixel.colorDistance(rightColor) > 
    edgeDist)
    leftPixel.setColor(Color.BLACK);
    else
    leftPixel.setColor(Color.WHITE);
    }
    }
    }*/

    /* Main method for testing - each class in Java can have a main 
     * method 
     */
    public static void main(String[] args) 
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

} // this } is the end of class Picture, put all new methods before this

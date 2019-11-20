
/**
 * Write a description of class GreenChannel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GreenChannel extends Filter
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class GreenChannel
     */
    public GreenChannel(String name)
    {
        // initialise instance variables
        super(name);
    }
    
       /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                int pix = image.getRGB(x,y);
                int g1 = (pix>>24)&0xff;
                int g2 = (pix>>8)&0xff;
                //set new RGB
                pix = (g1<<24)| (0<<16)| (g2<<8) | 0;
                image.setRGB(x,y,pix);
                
            }
        }
    }
    

  
}

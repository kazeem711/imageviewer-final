import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO; 
/**
 * Write a description of class RedChannel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RedChannel extends Filter
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class RedChannel
     */
    public RedChannel(String name)
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
                int red1 = (pix>>24)&0xff;
                int red2 = (pix>>16)&0xff;
                //set new RGB
                pix = (red1<<24)| (red2<<16)| (0<<8) | 0;
                image.setRGB(x,y,pix);
                
            }
        }
    }
}

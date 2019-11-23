
/**
 * Blue Tint: a filter tha gives a image a bright tint of blue.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlueTint extends Filter
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class BlueTint
     */
    public BlueTint(String name)
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
        //convert to blue
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                int pix = image.getRGB(x,y);
                int b1 = (pix>>24)&0xff;
                int b2 = pix&0xff;
                //set new RGB
                pix = (b1<<24)| (0<<16)| (0<<8) | b2;
                image.setRGB(x,y,pix);
                image.setPixel(x, y, image.getPixel(x, y).brighter());
            }
        }
    }

    
}

import java.io.File;
import java.util.Scanner;

/**
 * 
 * @author TuckerKA20
 * @version 5/13/19
 */
public class GenerateRange
{
    public static void main( String args[] )
    {
        Scanner scan = null;
        
        try
        {
            File f = new File( "./src/Range.txt" );
            scan = new Scanner( f );
            
            genRange( scan );
        }
        catch ( Exception e )
        {
            System.out.println( e );
        }
        finally
        {
            if ( scan != null )
            {
                scan.close();
            }
        }
    }
    
    public static void genRange( Scanner scan )
    {
        int first = 0;
        int last = 0;
        
        while ( scan.hasNext() )
        {
            first = scan.nextInt();
            
            last = scan.nextInt();
        }
        
        int random = (int)((Math.random()* last) + first);
        
        System.out.println( random );
        
    }
}

import java.io.IOException;

/*
 *  CLI app that takes in a BMP image and does various transformations on the image.
 *  App takes in three arguments from the command line: input file path, output file path, and the desired transformation.
 *
 *  @author Jeff Borda
 */
public class App {

    public static void main(String[] args) {

        try {

            Bitmap myBitmap = new Bitmap("bmp-images/nice_day.bmp", "bmp-images/init_test.bmp");
            myBitmap.save();

        } catch (IOException e) {

            e.printStackTrace();
            System.out.println("Error reading file. " + e);
        }


    }
}

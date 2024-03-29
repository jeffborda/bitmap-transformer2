import java.io.IOException;

/*
 *  CLI app that takes in a BMP image and does various transformations on the image.
 *  App takes in three arguments from the command line: input file path, output file path, and the desired transformation.
 *
 *  @author Jeff Borda
 */
public class App {

    public static void main(String[] args) {

        String inputFilePath = "bmp-images/" + args[0] + ".bmp";
        String outputFilePath = "bmp-images/" + args[1] + ".bmp";
        String transform = args[2].toLowerCase();
        Bitmap bitmap = null;

        // Try to read in file from CLI argument
        try {
            bitmap = new Bitmap(inputFilePath, outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error reading file. " + e);
        }

        // Perform transform based on CLI argument
        switch (transform) {
            case "flipvertically" : bitmap.flipVertically(); break;
            case "fliphorizontally" : bitmap.flipHorizontally(); break;
            case "addredborder" : bitmap.addRedBorder(); break;
            default : System.out.println("Invalid Transform. Choices are: 'flipVertically', 'flipHorizontally', 'addRedBorder'.");
        }

        // Try to save in file
        try {
            bitmap.save();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error saving file. " + e);
        }


    }
}

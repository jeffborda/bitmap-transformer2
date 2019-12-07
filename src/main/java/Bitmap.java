import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Bitmap {

    private Path bmpOutputPath;
    private BufferedImage bmpData;

    public Bitmap(String inputPath, String outputPath) throws IOException {

        // RE: https://stackoverflow.com/questions/16919501/create-a-path-from-string-in-java7
        Path bmpInputPath = Paths.get(inputPath);
        this.bmpOutputPath = Paths.get(outputPath);
        this.bmpData = ImageIO.read(bmpInputPath.toFile());
    }

    public void flipVertically() {

        int height = bmpData.getHeight() - 1;
        int width = bmpData.getWidth();

        for(int x = 0; x < width; x++) {
            for(int y = 0; y < height / 2; y++) {
                int topColor = bmpData.getRGB(x, y);
                int bottomColor = bmpData.getRGB(x, height - y);
                bmpData.setRGB(x, y, bottomColor);
                bmpData.setRGB(x, height - y, topColor);
            }
        }
    }

    public void flipHorizontally() {

    }

    public void addRedBorder() {

    }

    public void save() throws IOException {

        // RE: https://blog.idrsolutions.com/2018/08/how-to-write-out-bmp-images-in-java/
        ImageIO.write(bmpData, "bmp", bmpOutputPath.toFile());
        System.out.println("Saved file to: " + bmpOutputPath);
    }

    public Path getBmpOutputPath() {
        return bmpOutputPath;
    }

    public BufferedImage getBmpData() {
        return bmpData;
    }
}

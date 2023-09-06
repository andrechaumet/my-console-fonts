package v2.loader;

import v2.fonts.Font;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

/**
 * <head>This class handles fonts loading logic via application/text file content type.</head>
 * @author André Chaumet - github.com/andrechc
 * @version 0.2
 * @since 5th September 2023
 */
public class TxtFileFontLoader implements FontLoader {

    /**
     * <head>Creates a custom Font class object using the given file path data.</head>
     * @param path This is the path where the file containing the data is located.
     */
    public Font load(final Path path) throws IOException {
        final FileReader loadedFile = new FileReader(path.toString());
        final String fileContent = loadedFile.toString();

        loadedFile.close();
        return null;
    }
}

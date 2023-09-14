package v2.loader;

import v2.fonts.Font;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * <head>This class handles fonts loading logic via application/text file content type.</head>
 * @author André Chaumet - github.com/andrechc
 * @version 0.2
 * @since 5th September 2023
 */
//TODO: WIP, ):
public class TxtFileFontLoader implements FontLoader {

    /**
     * <head>Creates a custom Font class object using the given file path data.</head>
     * @param path This is the path where the file containing the data is located.
     */
    public Font load(final Path path) throws IOException {
        BufferedReader reader = Files.newBufferedReader(path);
        final Stream<String> lines = reader.lines();
        return null;
    }

    private String[][] createMatrix(final String content) {
        int keyNumber = 0;
        int valueNumber = 0;
        String[][] matrix = new String[content.length()/2][content.length()];
/*
        for()
*/
        return null;
    }

}

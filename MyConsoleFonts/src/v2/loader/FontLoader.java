package v2.loader;

import v2.fonts.Font;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

//TODO: Do I really want to make this more complex?
@FunctionalInterface
public interface FontLoader {
    Font load(final Path path) throws IOException;
}

package v2;

public interface DrawableFont {
    String getCharRowFragment(char characterKey, int rowNumber);
    int getAmountOfRows();
    int getAmountOfChars();
}

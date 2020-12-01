public class DelimitedCharacterParser implements Parser {

    static final String TAB = "\t";

    public String[] parse(String data, String delimiter) {
        return data.split(delimiter);
    }
}
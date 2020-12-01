public class ParserFactory{
    
    static ParserFactory _instance;
    private ParserFactory(){
    }

    public static ParserFactory getInstance(){
        if(_instance == null) {
        _instance = new ParserFactory();
        }
        return _instance;
    }
    
    public Parser getParser(String type){
        if(type.equals("\t")){
            return new DelimitedCharacterParser();
        }
        return null;
    }
}
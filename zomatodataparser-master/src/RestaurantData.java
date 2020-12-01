
public class RestaurantData {
	public DataObjects getDataObjects(String data, String delimiter) {

	      Parser parser = ParserFactory.getInstance().getParser(DelimitedCharacterParser.TAB);

	      String[] column = parser.parse(data, delimiter);

	        DataObjects info = new DataObjects();
	        info.setUrl(column[0]);
	        info.setName(column[1]);
	        info.setAddress(column[2]);
	        info.setLocation(column[3]);
	        info.setCusine(column[4]);
	        info.setDishes(column[5]);
	        info.setPrice(Float.parseFloat(column[6]));
	       
	        
	        String rating = (String)column[7];
	        if (rating.equals("invalid")) {
	        	rating = "0";
	        }
	        float floatRating = Float.parseFloat(rating);
	        info.setRatings(floatRating);
	        
	        
	        String votes = (String)column[8];
	        if (votes.equals("invalid")) {
	        	votes = "0";
	        }
	        int intVotes = Integer.parseInt(votes);
	        info.setVotes(intVotes);
	        
	        return info;
	}
}

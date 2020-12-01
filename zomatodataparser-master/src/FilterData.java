
public class FilterData {
	
	public void searchData(String dish,String name,String url,float getPrice,float price,float getRating,float rating) {
		if(dish.contains("Biryani") && getPrice <= price && getRating >= rating) {
			System.out.println("URL = \"" + url + "\"\tName = \"" + name + "\"\tDishes = "+ dish+ "\tPrice = \""+getPrice+"\""+ "\tRating = \""+getRating+"\"");
			
		}
	}
}

import java.io.File;
import java.util.Scanner;

public class Main {
	
    public static void main (String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file path");
        String filePath = input.nextLine();
        File tsvFile = new File(filePath);
		Scanner scan = new Scanner(tsvFile);
		while (scan.hasNext()) {
			String row = scan.nextLine();
            RestaurantData restDataManager = new RestaurantData();
            DataObjects restInfo = restDataManager.getDataObjects(row, DelimitedCharacterParser.TAB);
//            System.out.println(restInfo.getName());
            FilterData newSearch = new FilterData();

            newSearch.searchData(restInfo.getDishes(), restInfo.getName(), restInfo.getUrl(), restInfo.getPrice(),700,restInfo.getRatings(),4);
        }
		scan.close();
		
    }
    
    
}

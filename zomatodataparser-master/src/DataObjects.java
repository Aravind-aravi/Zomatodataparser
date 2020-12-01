
public class DataObjects {
	private String url;
	private String name;
	private String address;
	private String location;
	private String cusine;
	private String dishes;
	private float price;
	private float ratings;
	private int votes;

	public DataObjects() {
		
	}
	
	public DataObjects(String url, String name, String address, String location, String cusine, String dishes, float price, float ratings,
			int votes) {
		this.url = url;
		this.name = name;
		this.address = address;
		this.location = location;
		this.cusine = cusine;
		this.dishes = dishes;
		this.price = price;
		this.ratings = ratings;
		this.votes = votes;
	}
	
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCusine() {
		return cusine;
	}

	public void setCusine(String cusine) {
		this.cusine = cusine;
	}

	public String getDishes() {
		return dishes;
	}

	public void setDishes(String dishes) {
		this.dishes = dishes;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

}

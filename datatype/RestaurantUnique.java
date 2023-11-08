class RestaurantUnique
{
	public static void main(String[] args)
	{
		System.out.println("Starting mian in Restaurant");
		Restaurant restaurant=new Restaurant();
		String[] items=new String[5];
		items[0]="jelabi";
		items[1]="jamun";
		items[2]="mysorepak";
		items[3]="peda";
		items[4]="Paysa";
		restaurant.setSpecialItems(items);
		restaurant.displayInfo();
		System.out.println("Ending mian in Restaurant");
	}
}
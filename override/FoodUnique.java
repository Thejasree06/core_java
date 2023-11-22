class FoodUnique
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in foodunique");
		FoodItem foodItem=new FoodItem("AllFood","soop","Chiken",true,500,50,101,"Unique","sugar",12);
		foodItem.spicy();
		foodItem.rice();
		foodItem.dryfood();
		foodItem.jamun();
		foodItem.cake();
		foodItem.salty();
		foodItem.sugar();
		foodItem.cold();
		foodItem.oil();
		foodItem.packing();
		foodItem.mixing();
		
		System.out.println("name:"+foodItem.name);
		System.out.println("veg:"+foodItem.veg);
		System.out.println("nonveg:"+foodItem.nonVeg);
		System.out.println("qulity:"+foodItem.quality);
		System.out.println("cost:"+foodItem.cost);
		System.out.println("heat:"+foodItem.heat);
		System.out.println("no:"+foodItem.no);
		System.out.println("items:"+foodItem.items);
		System.out.println("sweets:"+foodItem.sweets);
		System.out.println("weight:"+foodItem.weight);
		
		System.out.println("--------------------------");
		Vegitbles vegitbles=new Vegitbles("Red",11,"frits","chapati","maton",false,600,40,105,"cold","Chilli",15);
		vegitbles.spicy();
		vegitbles.rice();
		vegitbles.dryfood();
		vegitbles.jamun();
		vegitbles.cake();
		vegitbles.salty();
		vegitbles.sugar();
		vegitbles.cold();
		vegitbles.oil();
		vegitbles.packing();
		vegitbles.mixing();
		
		vegitbles.cutting();
		vegitbles.clean();
		vegitbles.boil();
		vegitbles.roast();
		
		System.out.println("name:"+vegitbles.name);
		System.out.println("veg:"+vegitbles.veg);
		System.out.println("nonveg:"+vegitbles.nonVeg);
		System.out.println("qulity:"+vegitbles.quality);
		System.out.println("cost:"+vegitbles.cost);
		System.out.println("heat:"+vegitbles.heat);
		System.out.println("no:"+vegitbles.no);
		System.out.println("items:"+vegitbles.items);
		System.out.println("sweets:"+vegitbles.sweets);
		System.out.println("weight:"+vegitbles.weight);
		
		System.out.println("color:"+vegitbles.Color);
		System.out.println("size:"+vegitbles.size);
		
		
		
		
		
		
	}
}
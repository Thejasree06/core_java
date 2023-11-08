class CanteenUnique
{
	public static void main(String[] arg)
	{
		System.out.println("Starting main in CanteenUnique");
		Canteen canteen=new Canteen();
		String[] utensils=new String[40];
		
		utensils[0]="spoon";
		utensils[1]="Wooden Spoon";
		utensils[2]="Thermos";
		utensils[3]="Potato Masher";
		utensils[4]="Rolling Pin";
		utensils[5]="Oven Gloves";
		utensils[6]="Scissors";
		utensils[7]="Cleaver";
        utensils[8]="Cup";
        utensils[9]="Whisk";
        utensils[10]="Spatula";
        utensils[11]="Perfo";
        utensils[12]="Thermosated Spoon";
        utensils[13]="Measuring Cup";
        utensils[14]="Corkscrew";
        utensils[15]="Butter Knife";
        utensils[16]="Tongs";
        utensils[17]="Sieve";
        utensils[18]="Peppermill";
        utensils[19]="Lable";
        utensils[20]="colander";		
		utensils[21]="Bottle Opender";
		utensils[22]="Wok";
		utensils[23]="Steak Hammer";
		utensils[24]="Pizza Cutter";
		utensils[25]="Mortar";
		utensils[26]="Deep Fryer";
		utensils[27]="Hot Pot";
		utensils[28]="Peeler";
		utensils[29]="Mixer";
		utensils[30]="jug";
		utensils[31]="Grate";
		utensils[32]="Gas Stove";
		utensils[33]="Refridgerator";
		utensils[34]="Serving Bowl";
		utensils[35]="Kettle";
		utensils[36]="Cutting boards";
		utensils[37]="Egg Slicer";
		utensils[38]="Spice Box";
		utensils[39]="Bowl";
		
		canteen.setType("Veg");
		canteen.setUtensils(utensils);
		canteen.showInfo();
	} 
}
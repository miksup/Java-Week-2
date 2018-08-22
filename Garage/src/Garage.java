import java.util.ArrayList;

public class Garage {
	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

	public int fee(ArrayList<Vehicle> v) {
		int total = 0;
			for (Vehicle ve : v) {
				//CAR
				if(ve instanceof Car) {
					total = 700;
					
					//BodyType
					if ((ve.bodytype == "SUV") || (ve.bodytype == "Minivans")){
						total = total + 2500;
					} else if ((ve.bodytype == "Coupe") || (ve.bodytype == "Hatchback")) {
						total = total + 1500;
					} else if ((ve.bodytype == "Sedan") || (ve.bodytype == "Sports")) {
						total = total + 2000;
					} else {
						total = total + 1000;
					}
					
					//Convertible
					if (((Car) ve).convertible) {
						total = total + 750;
					} else {
						total = total - 100;
					}
					
					//noOfDoors
					if (((Car) ve).noOfDoors == 4) {
						total = total + 400;
					} else {
						total = total + 200;
					}
					
					//EngineSize
					if (ve.engineSizeInCC >= 2000) {
						total = total + 1500;
					} else if ((ve.engineSizeInCC < 2000) && (ve.engineSizeInCC >= 1500)) {
						total = total + 1100;
					} else {
						total = total + 700;
					}
					
					System.out.println("The " + ve.manufacturer + " " + ve.name + " will cost = " + total);
				
				//MOTORCYCLE
				} else if(ve instanceof Motorcycle) {
					total = 400;
					
					//Body type
					if ((ve.bodytype == "Chopper") || (ve.bodytype == "Cruiser")) {
						total = total + 700;
					} else if ((ve.bodytype == "Sports") || (ve.bodytype == "Dirt")) {
						total = total + 500;
					} else {
						total = total + 350;
					}
					
					//Engine Size
					if (ve.engineSizeInCC >= 300) {
						total = total + 1200;
					} else if ((ve.engineSizeInCC < 300) && (ve.engineSizeInCC > 150)) {
						total = total + 800;
					} else {
						total = total + 500;
					}
					
					//Storage
					if (((Motorcycle) ve).addStorage) {
						total = total + 200;
					} else {
						total = total - 100;
					}
					
					System.out.println("The " + ve.manufacturer + " " + ve.name + " will cost = " + total);
					
				//BOAT	
				} else if(ve instanceof Boat) {
					total = 900;
					
					//Body type
					switch(ve.bodytype) {
					case "Yacht":
						total = total + 650000;
						break;
					case "Ferry":
						total = total + 400000;
						break;
					case "Tugboat":
						total = total + 75000;
						break;
					case "Skiff":
						total = total + 10000;
						break;
					default:
						total = total + 6000;
						break;
					}
				
					//Boat Length
					if (((Boat) ve).boatLen >= 40) {
						total = total + (total*10/100);
					}
					
					System.out.println("The " + ve.manufacturer + " " + ve.name + " will cost = " + total);
						
					
				} else {
					total = 0;
				}
			}
					
		return total;
	}
	
	
}
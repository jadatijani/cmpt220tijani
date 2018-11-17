package lab10;
public class TestAppliance {
	public static void main(String[] args) {
		Appliance [] arr = new Appliance [40];
		int k = 0;
		for(int i = 0; i < 40; i++) {
			k = (int)(Math.random() * 3);
			if(k == 0);
			arr[i] = new Toaster (110,"blue","China",45);
			else if (k == 1)
				arr[i] = new Telephone (60,"black","Moscow",95);
			else 
				arr[i] = new TV (220,"black","Japan",750);
		}
		Appliance temp = new Appliance (0,"black","Nowhere",0);
		for(int i = 0; i < 40; j++) {
			if(arr[j].getPrice() > arr[i].getPrice()) {
				temp = arr[i];
				arr[i] = arr [j];
				arr[j] = temp;
			}
		}
	}
	System.out.println(arr[5]);
	System.out.println(arr[19]);
	System.out.println(arr[39]);
}
}
import java.util.Scanner;

public class Program {
	public static void main(String[] args){
		hotels();

	}
	public static void hotels(){
		Scanner s =new Scanner(System.in);
		Hotel[] hotelsAr = new Hotel[2];
		String name;
		String city;
		int rooms;
		int freeRooms;

		for (int i = 0; i < hotelsAr.length; i++) {
			System.out.println("Enter details for hotel |" + (i +1) + "|");
			System.out.print("Enter hotel name: ");
			name = s.nextLine();
			System.out.print("Enter City: ");
			city = s.nextLine();
			System.out.print("Enter Total rooms: ");
			rooms = s.nextInt();
			System.out.print("Enter Free rooms:");
			freeRooms = s.nextInt();

			s.nextLine();

			hotelsAr[i] = new Hotel(name,city,rooms,freeRooms);
		}
		System.out.println("Enter the name of the city for which you would like to search for a hotel: ");
		String nameCity = s.nextLine();

		for (int i = 0; i < hotelsAr.length; i++) {
			if (nameCity.equals(hotelsAr[i].getCity())){
				if (hotelsAr[i].getFree() > 0 ) {
					System.out.println(hotelsAr[i].toString());
				}
			}
		}
		//Bonus stage
		System.out.println("The list of hotels where the number of rooms is higher than 40%: ");
		for (int i = 0; i < hotelsAr.length; i++) {
			if (nameCity.equals(hotelsAr[i].getCity()) && hotelsAr[i].percentFreeRooms() > 40){
				System.out.println(hotelsAr[i].getName());
			}
		}
	}
}

package DataFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import com.mycompany.bdms.Customer;
import com.mycompany.bdms.Login_Details;
import com.mycompany.bdms.Manager;
import com.mycompany.bdms.Personal_Info;
import com.mycompany.bdms.Service_Providers;
import com.mycompany.bdms.Services;

public class ReadUploadData {

	// function to upload provider details
	public static void load_providers_details(ArrayList<Service_Providers> sps) throws FileNotFoundException {

		int id;
		String name, dob,gender,username,password;
		Personal_Info pi;
		Login_Details lg;
		Service_Providers sp;

		File file = new File("C:\\Users\\froch\\Desktop\\New Folder\\BDMS\\src\\main\\java\\DataFiles\\providers.csv");
		Scanner scanner = new Scanner(file);
		// reading file
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] values = line.split(",");

			id=Integer.parseInt(values[0]);
			name=values[1];
			dob=values[2];
			gender=values[3];
			username=values[4];
			password=values[5];

			pi=new Personal_Info(name,dob,gender);
			lg=new Login_Details(username,password);
			sp=new Service_Providers(id,pi,lg);

			// adding service provider to the list
			sps.add(sp);

		}
		scanner.close();

	}

	// function to load services at the start of the program
	public static void upload_services(ArrayList<Services> services) throws FileNotFoundException, ParseException {

		int sp_id;
		String name;
		String contact;
		String duration;
		String district_locality;
		double retail_price;
		double vat;
		String description;
		String start;
		String end;
		Services sv;

		File file = new File("C:\\Users\\froch\\Desktop\\New Folder\\BDMS\\src\\main\\java\\DataFiles\\services.csv");
		Scanner scanner = new Scanner(file);
		// reading file
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] values = line.split(",");
			// process values
			sp_id=Integer.parseInt(values[9]);
			name=values[0];
			contact=values[1];
			duration=values[2];
			district_locality=values[3];
			retail_price=Double.parseDouble(values[4]);
			vat=Double.parseDouble(values[5]);
			description=values[6];
			//SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			start=values[7];
			end=values[8];

			// adding services to the service list
			sv=new Services(name,contact,duration,district_locality,retail_price,vat,description,start,end,sp_id);
			services.add(sv);
		}
		scanner.close();
	}

	// function to load customers details
	public static void load_customers_details(ArrayList<Customer> customers) throws FileNotFoundException {

		int id;
		String name, dob,gender,username,password;
		Personal_Info pi;
		Login_Details lg;
		Customer sp;

		File file = new File("C:\\Users\\froch\\Desktop\\New Folder\\BDMS\\src\\main\\java\\DataFiles\\customers.csv");
		
		// reading file
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] values = line.split(",");

			id=Integer.parseInt(values[0]);
			name=values[1];
			dob=values[2];
			gender=values[3];
			username=values[4];
			password=values[5];

			pi=new Personal_Info(name,dob,gender);
			lg=new Login_Details(username,password);
			sp=new Customer(id,pi,lg);
			// adding customer to the customers list
			customers.add(sp);

		}
		scanner.close();
	}
	
	// function to load manager details
	public static void load_manager_details(ArrayList<Manager> managers) throws FileNotFoundException {

		int id;
		String name, dob,gender,username,password;
		Personal_Info pi;
		Login_Details lg;
		Manager m;

		File file = new File("C:\\Users\\froch\\Desktop\\New Folder\\BDMS\\src\\main\\java\\DataFiles\\manager.csv");
		Scanner scanner = new Scanner(file);
		// reading file
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] values = line.split(",");

			id=Integer.parseInt(values[0]);
			name=values[1];
			dob=values[2];
			gender=values[3];
			username=values[4];
			password=values[5];

			pi=new Personal_Info(name,dob,gender);
			lg=new Login_Details(username,password);
			m=new Manager(id,pi,lg);
			// adding manager to the manager list
			managers.add(m);

		}
		scanner.close();
	}
}
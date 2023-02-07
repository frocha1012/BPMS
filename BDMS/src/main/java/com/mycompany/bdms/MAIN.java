package com.mycompany.bdms;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MAIN {

	// list of customers
	public static ArrayList<Customer> customers=new ArrayList<Customer>();
	// list of service providers
	public static ArrayList<Service_Providers> service_providers=new ArrayList<Service_Providers>();
	// list of managers
	public static ArrayList<Manager> managers=new ArrayList<Manager>();
	public static Admin admin;
	// list of services
	public static ArrayList<Services> services=new ArrayList<Services>();
	public static Login_Details admin_login=new Login_Details("admin","12345");
	public static Personal_Info admin_info=new Personal_Info("admin","11/11/2000","male");
	public static Map<Integer,Order> list_of_orders=new HashMap<Integer, Order>();

	// to input data
	public static Scanner input= new Scanner(System.in);

	// function to display main login menu 
	public static void main_menu() {
		System.out.println("\nLogin as:");
		System.out.println("1) Admin");
		System.out.println("2) Manager");
		System.out.println("3) Service Provider");
		System.out.println("4) Customer");
	}

	// function to display manager menu
	public static void admin_menu() {
		System.out.println("\n1) List Customers");
		System.out.println("2) List Orders");
		System.out.println("3) List Providers");
		System.out.println("4) List Serives");
		System.out.println("5) Create Customer");
		System.out.println("6) Create Providers");
		System.out.println("7) Delete Customer");
		System.out.println("8) Delete Provider");
		System.out.println("9) Delete Service");
		System.out.println("10) Create Manager");
		System.out.println("11) Delete Manager");
		System.out.println("12) Logout");
	}

	// function to display manager menu
	public static void manager_menu() {
		System.out.println("\n1) List Customers");
		System.out.println("2) List Orders");
		System.out.println("3) List Providers");
		System.out.println("4) List Serives");
		System.out.println("5) Create Customer");
		System.out.println("6) Create Providers");
		System.out.println("7) Delete Customer");
		System.out.println("8) Delete Provider");
		System.out.println("9) Delete Service");
		System.out.println("10) Logout");
	}

	// function to display customers menu
	public static void customers_menu() {
		System.out.println("\n1) Make Reservation");
		System.out.println("2) List all my Reservations");
		System.out.println("3) Finish Reservation");
		System.out.println("4) Logout");
	}

	// function to display providers_menu
	public static void providers_menu() {
		System.out.println("\n1) Create Service");
		System.out.println("2) See services provided");
		System.out.println("3) Delete Serive");
		System.out.println("4) Logout");
	}

	// function to take input the choice of the user
	// max choice is the maximum choice option
	public static int choice_input(int max_choice) {
		int choice=0;
		System.out.print("\nEnter your choice: ");
		choice=input.nextInt();
		while(choice<=0 || choice >max_choice) {
			System.out.println("\nInvalid choice.");
			System.out.print("Enter again: ");
			choice=input.nextInt();
		}
		return choice;
	}

	// function to find if customer with entered username and password exists
	public static int customer_login_details(String username, String pwd, ArrayList<Customer> cust) {
		int id=-1;
		for(int i=0;i<cust.size();i++) {
			if(cust.get(i).lg.username.equals(username) && cust.get(i).lg.password.equals(pwd)) {
				id=cust.get(i).getC_id();
				break;
			}
		}
		return id;
	}
	// function to find if manager with entered username and password exists
	public static int manager_login_details(String username, String pwd, ArrayList<Manager> cust) {
		int id=-1;
		//System.out.println(cust.size());
		for(int i=0;i<cust.size();i++) {
			if(cust.get(i).lg.username.equals(username) && cust.get(i).lg.password.equals(pwd)) {
				id=cust.get(i).getM_id();
				break;	// if found
			}
		}
		return id;
	}

	// function to find if providers with wntr username and password exists
	public static int providers_login_details(String username, String pwd, ArrayList<Service_Providers> cust) {
		int id=-1;
		//System.out.println(cust.size());
		for(int i=0;i<cust.size();i++) {
			if(cust.get(i).lg.username.equals(username) && cust.get(i).lg.password.equals(pwd)) {
				id=cust.get(i).getSp_id();
				break;
			}
		}
		return id;
	}

	// function to create a customer order
	public static Services create_services(int id) throws ParseException {
		String name;
		String contact;
		String duration;
		String district_locality;
		double retail_price;
		double vat;
		String description;
		String start=null;
		String end = null;

		// input service data
		System.out.print("\nEnter name: ");
		name=input.next();
		System.out.print("Enter contact: ");
		contact=input.next();
		System.out.println("Enter duration: ");
		duration=input.next();
		System.out.println("Enter district localilty: ");
		district_locality=input.next();
		System.out.print("Enter Retail Price: ");
		retail_price=input.nextDouble();
		System.out.print("Enter VAT: ");
		vat=input.nextDouble();
		System.out.print("Enter Description: ");
		description=input.next();
		System.out.print("Enter start date (dd-MM-yyyy): ");
		start=input.next();
		System.out.print("Enter end date (dd-MM-yyyy): ");
		end=input.next();
		
		// creating new service
		Services s=new Services(name,contact,duration,district_locality,retail_price,vat,description, start,end,id);
		return s;
	}

	// function to make customer
	public static Customer create_customer() {
		Customer c;
		int id;
		String name, dob, gender = null;
		// input customer data
		System.out.print("Enter ID of new Customer: ");
		id=input.nextInt();
		System.out.print("Name: ");
		name=input.next();
		System.out.print("Date of Birth: ");
		dob=input.next();
		System.out.print("Gender: ");
		gender=input.next();

		Personal_Info p=new Personal_Info(name,dob,gender);
		Login_Details lgg=new Login_Details(name, "12345");

		// creating customers
		c=new Customer(id,p,lgg);
		return c;
	}

	// function to create a provider
	public static Service_Providers create_provider() {
		Service_Providers c;
		int id;
		String name, dob, gender = null;
		// input data
		System.out.print("Enter ID of new Service Provider: ");
		id=input.nextInt();
		System.out.print("Name: ");
		name=input.next();
		System.out.print("Date of Birth: ");
		dob=input.next();
		System.out.print("Gender: ");
		gender=input.next();

		Personal_Info p=new Personal_Info(name,dob,gender);
		Login_Details lgg=new Login_Details(name, "12345");

		// creating service provider
		c=new Service_Providers(id,p,lgg);
		return c;
	}

	// function to create a manager
	public static Manager create_manager() {
		Manager c;
		int id;
		String name, dob, gender = null;
		
		// input data
		System.out.print("Enter ID of new Manager: ");
		id=input.nextInt();
		System.out.print("Name: ");
		name=input.next();
		System.out.print("Date of Birth: ");
		dob=input.next();
		System.out.print("Gender: ");
		gender=input.next();

		Personal_Info p=new Personal_Info(name,dob,gender);
		Login_Details lgg=new Login_Details(name, "12345");

		// creating manager
		c=new Manager(id,p,lgg);
		return c;
	}
	
	//-------------------------------------------------------------------------------
	public static void main(String[] args) throws ParseException, IOException {
		System.out.println("Welcome");
		// creating admin
		admin=new Admin(admin_info,admin_login);

		//fetching service providers data
		DataFiles.ReadUploadData.load_providers_details(service_providers);
		// fetching services of the providers
		DataFiles.ReadUploadData.upload_services(services);
		// fetching customers data
		DataFiles.ReadUploadData.load_customers_details(customers);
		// fetching managers data
		DataFiles.ReadUploadData.load_manager_details(managers);
		
		int choice=0;
		String username;
		String password;

		while(true) {
			main_menu();				// displaying menu
			choice=choice_input(4);		// taking input choice

			if(choice==1) {			// admin
				System.out.print("\nEnter username: ");
				username=input.next();
				System.out.print("Enter password: ");
				password=input.next();
				
				// checking if username and password of admin is correct
				if(admin.lg.username.equals(username) && admin.lg.password.equals(password)) {
					
					admin_menu();		// displaying admin menu
					choice=choice_input(12);	// choice input
					while(choice!=12) {
						if(choice==1) {	// list customers
							System.out.println("\nHere are all the customers.");
							for(int i=0;i<customers.size();i++) {
								String s=customers.get(i).display();
								System.out.println(s);
							}
						}
						else if(choice==2) {	// list orders
							System.out.println("\nHere are all the orders.");
							for(int i=0;i<customers.size();i++) {
								customers.get(i).display_customers_orders();
							}
						}
						else if(choice==3) { // list providers
							System.out.println("\nHere are all the providers");
							for(int i=0;i<service_providers.size();i++) {
								String s=service_providers.get(i).display();
								System.out.println(s);
							}
						} 
						else if(choice==4) {	// list services
							System.out.println("\nHere are all the services");
							for(int i=0;i<services.size();i++) {
								services.get(i).display();
							}
						}
						else if(choice==5) { // create customer
							Customer c=create_customer();
							customers.add(c);
							// updating data in file
							DataFiles.WriteSaveData.save_customers(customers);
							System.out.println("\nCustomer created.");
						}
						else if(choice==6) {	// create providers
							Service_Providers spp=create_provider();
							service_providers.add(spp);
							// updating data in file
							DataFiles.WriteSaveData.save_providers(service_providers);
							System.out.println("\nProvider created.");
						}
						else if(choice==7) {	// delete customers
							System.out.println("\nHere are all the customers.");
							for(int i=0;i<customers.size();i++) {
								System.out.println("ID: "+i+customers.get(i).display());
							}
							System.out.print("\nEnter ID of the customer you want to remove: ");
							int id=input.nextInt();
							customers.remove(id);
							// updating data in file
							DataFiles.WriteSaveData.save_customers(customers);
							System.out.println("\nCustomer Removed.");
						}
						else if(choice==8) {	// delete provider
							System.out.println("\nHere are all the providers");
							for(int i=0;i<service_providers.size();i++) {
								System.out.println("ID: "+i+service_providers.get(i).display());
							}
							System.out.print("\nEnter ID of the Provider you want to remove: ");
							int id=input.nextInt();
							service_providers.remove(id);
							// updating data in file
							DataFiles.WriteSaveData.save_providers(service_providers);
							System.out.println("\nProvider Removed.");
						}
						else if(choice==9) {	// delete service
							System.out.println("\nThe provided services.");
							for(int i=0;i<services.size();i++) {
								System.out.println("ID: "+i+" Service Name: "+services.get(i).getName()+" Description: "+services.get(i).getDescription());				
							}
							System.out.print("\nEnter Service ID: ");
							int did=input.nextInt();
							services.remove(did);
							// updating data in file
							DataFiles.WriteSaveData.save_services(services);
						}
						else if(choice==10) {	// create manager
							Manager m=create_manager();
							managers.add(m);
							// updating data in file
							DataFiles.WriteSaveData.save_managers(managers);
							System.out.println("\nManager Created.");
						}
						else if(choice==11) {	// delete manager
							System.out.println("\nHere are all the managers.");
							for(int i=0;i<managers.size();i++) {
								System.out.println("ID: "+i+" Name: "+managers.get(i).getPi().getName());
							}
							System.out.println("\nEnter the ID of the manager you want to remove: ");
							int id=input.nextInt();
							managers.remove(id);
							// updating data in file
							DataFiles.WriteSaveData.save_managers(managers);
							System.out.println("\nManager Removed.");
						}
						else if(choice==12) {	// logout

						}

						admin_menu();
						choice=choice_input(12);
					}
				}
				else {
					System.out.println("\nInvalid details.");
				}
			}
			//------------------------------------------------------------------------------------------------------
			else if(choice==2) {	// manager
				System.out.print("\nEnter username: ");
				username=input.next();
				System.out.print("Enter password: ");
				password=input.next();
				int m_id=manager_login_details(username,password,managers);
				if(m_id>0) {
					manager_menu();		// displaying manager menu
					choice=choice_input(10);
					while(choice!=10) {
						if(choice==1) {	// list customers
							System.out.println("\nHere are all the customers.");
							for(int i=0;i<customers.size();i++) {
								String s=customers.get(i).display();
								System.out.println(s);
							}
						}
						else if(choice==2) {	// list orders
							System.out.println("\nHere are all the orders.");
							for(int i=0;i<customers.size();i++) {
								customers.get(i).display_customers_orders();
							}
						}
						else if(choice==3) { // list providers
							System.out.println("\nHere are all the providers");
							for(int i=0;i<service_providers.size();i++) {
								String s=service_providers.get(i).display();
								System.out.println(s);
							}
						}  
						else if(choice==4) {	// list services
							System.out.println("\nHere are all the services");
							for(int i=0;i<services.size();i++) {
								services.get(i).display();
							}
						}
						else if(choice==5) { // create customer
							Customer c=create_customer();
							customers.add(c);
							// updating data in file
							DataFiles.WriteSaveData.save_customers(customers);
							System.out.println("\nCustomer created.");
						}
						else if(choice==6) {	// create providers
							Service_Providers spp=create_provider();
							service_providers.add(spp);
							// updating data in file
							DataFiles.WriteSaveData.save_providers(service_providers);
							System.out.println("\nProvider created.");
						}
						else if(choice==7) {	// delete customers
							System.out.println("\nHere are all the customers.");
							for(int i=0;i<customers.size();i++) {
								customers.get(i).display();
							}
							System.out.print("\nEnter ID of the customer you want to remove: ");
							int id=input.nextInt();
							customers.remove(id);
							// updating data in file
							DataFiles.WriteSaveData.save_customers(customers);
							System.out.println("\nCustomer Removed.");
						}
						else if(choice==8) {	// delete provider
							System.out.println("\nHere are all the providers");
							for(int i=0;i<service_providers.size();i++) {
								service_providers.get(i).display();
							}
							System.out.print("\nEnter ID of the Provider you want to remove: ");
							int id=input.nextInt();
							service_providers.remove(id);
							// updating data in file
							DataFiles.WriteSaveData.save_providers(service_providers);
							System.out.println("\nProvider Removed.");
						}
						else if(choice==9) {	// delete service
							System.out.println("\nThe provided services.");
							for(int i=0;i<services.size();i++) {
								System.out.println("ID: "+i+" Service Name: "+services.get(i).getName()+" Description: "+services.get(i).getDescription());				
							}
							System.out.print("\nEnter Service ID: ");
							int did=input.nextInt();
							services.remove(did);
							// updating data in file
							DataFiles.WriteSaveData.save_services(services);
						}
						else if(choice==10) {	// logout

						}

						manager_menu();
						choice=choice_input(10);
					}

				}
				else {
					System.out.println("\nInvalid Details");
				}
			}
			//------------------------------------------------------------------------------------------
			else if(choice==3) {	// service provider
				System.out.print("\nEnter username: ");
				username=input.next();
				System.out.print("Enter password: ");
				password=input.next();
				int sp_id=providers_login_details(username,password,service_providers);
				if(sp_id>0) {

					providers_menu();	// displaying service providers menu
					choice=choice_input(4);
					while(choice!=4) {	// logout
						if(choice==1) {		// add service
							Services s=create_services(sp_id);
							services.add(s);
							// updating data in file
							DataFiles.WriteSaveData.save_services(services);
						}
						else if(choice==2) {	// see all services
							System.out.println("\nHere are the provided services.");
							for(int i=0;i<services.size();i++) {
								if(services.get(i).getSupplier_id()==sp_id) {
									System.out.println("Service Name: "+services.get(i).getName()+" Description: "+services.get(i).getDescription());
								}
							}
						}		
						else if(choice==3) {	// remove service
							System.out.println("\nThe provided services.");
							for(int i=0;i<services.size();i++) {
								if(services.get(i).getSupplier_id()==sp_id) {
									System.out.println("ID: "+i+" Service Name: "+services.get(i).getName()+" Description: "+services.get(i).getDescription());
								}						
							}
							System.out.print("\nEnter Service ID: ");
							int did=input.nextInt();
							services.remove(did);
							// updating data in file
							DataFiles.WriteSaveData.save_services(services);
						}
						else if(choice==4) {	// logout

						}
						providers_menu();
						choice=choice_input(4);
					}

				}
				else {
					System.out.println("\nInvalid Details");
				}
			}
			//------------------------------------------------------------------------------------------------
			else if(choice==4) {	// customer
				System.out.print("\nEnter username: ");
				username=input.next();
				System.out.print("Enter password: ");
				password=input.next();
				int cust_id=customer_login_details(username,password,customers);
				if(cust_id>0) {
					customers_menu();		// displaying customer's menu
					choice=choice_input(4);

					while(choice!=4) {	// logout
						if(choice==1) {		// make reservation of a service
							int k=0;
							System.out.println("\nThe provided services.");
							for(int i=0;i<services.size();i++) {
								//if(services.get(i).getSupplier_id()==sp_id) {
								System.out.println("ID: "+i+" Service Name: "+services.get(i).getName());
								//}						
							}
							System.out.print("\nWhich Service you want to use (ID): ");
							k=input.nextInt();
							for(int i=0;i<customers.size();i++) {
								if(customers.get(i).getC_id()==cust_id) {
									customers.get(i).getOrders().getOrders().add(services.get(k));
								}
							}

						}	
						else if(choice==2) {		// see all reservations
							Customer c = null;
							System.out.println("\nHere are your orders");
							for(int i=0;i<customers.size();i++) {
								if(customers.get(i).getC_id()==cust_id) {
									c=customers.get(i);
									break;
								}
							}
							if(c.getOrders().getOrders().size()==0) {
								System.out.println("You are not using any service.");
							}
							for(int i=0;i<c.getOrders().getOrders().size();i++) {
								System.out.println("Service name: "+c.getOrders().getOrders().get(i).getName()+" Description: "+c.getOrders().getOrders().get(i).getDescription());
							}
						}
						else if(choice==3) {	// finish reservation
							Customer c = null;
							System.out.println("\nHere are your orders");

							for(int i=0;i<customers.size();i++) {
								if(customers.get(i).getC_id()==cust_id) {
									c=customers.get(i);
									break;
								}
							}
							for(int i=0;i<c.getOrders().getOrders().size();i++) {
								System.out.println("ID: "+i+" Service name: "+c.getOrders().getOrders().get(i).getName()+" Description: "+c.getOrders().getOrders().get(i).getDescription());
							}
							System.out.print("\nEnter Service ID: ");
							int did=input.nextInt();
							System.out.println("\nYour total charges are: "+c.getOrders().getOrders().get(did).getRetail_price()*c.getOrders().getOrders().get(did).getVat());
							c.getOrders().getOrders().remove(did);
							System.out.print("Rate your service out of 5: ");
							choice=input.nextInt();
							System.out.println("\nThankyou for using the service.");
						}
						else if(choice==4) {	// logout

						}
						customers_menu();
						choice=choice_input(4);
					}

				}
				else {
					System.out.println("\nInvalid Details");
				}

			}
		}

	}	
}

package DataFiles;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.mycompany.bdms.Customer;
import com.mycompany.bdms.Manager;
import com.mycompany.bdms.Service_Providers;
import com.mycompany.bdms.Services;

public class WriteSaveData {

	// function to save services to the services file
	public static void save_services(ArrayList<Services> sp) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\froch\\Desktop\\New Folder\\BDMS\\src\\main\\java\\DataFiles\\services.csv");

		// writing data
		for(int i=0;i<sp.size();i++) {
			fw.write(sp.get(i).getName()+","+sp.get(i).getContact()+",");
			fw.write(sp.get(i).getDuration()+","+sp.get(i).getDistrict_locality()+",");
			fw.write(sp.get(i).getRetail_price()+","+sp.get(i).getVat()+",");
			fw.write(sp.get(i).getDescription()+","+sp.get(i).getStart()+",");
			fw.write(sp.get(i).getEnd()+","+sp.get(i).getSupplier_id()+"\n");
		}

		fw.close();
	}

	// function to save customer to the customer file
	public static void save_customers(ArrayList<Customer> sp) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\froch\\Desktop\\New Folder\\BDMS\\src\\main\\java\\DataFiles\\customers.csv");

		// writing data
		for(int i=0;i<sp.size();i++) {
			fw.write(sp.get(i).getC_id()+","+sp.get(i).getPi().getName()+",");
			fw.write(sp.get(i).getPi().getDob()+","+sp.get(i).getPi().getGender()+",");
			fw.write(sp.get(i).getLg().getUsername()+","+sp.get(i).getLg().getPassword()+"\n");
		}

		fw.close();
	}

	// function to save supplier to the provider file
	public static void save_providers(ArrayList<Service_Providers> sp) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\froch\\Desktop\\New Folder\\BDMS\\src\\main\\java\\DataFiles\\providers.csv");

		// writing data
		for(int i=0;i<sp.size();i++) {
			fw.write(sp.get(i).getSp_id()+","+sp.get(i).getPi().getName()+",");
			fw.write(sp.get(i).getPi().getDob()+","+sp.get(i).getPi().getGender()+",");
			fw.write(sp.get(i).getLg().getUsername()+","+sp.get(i).getLg().getPassword()+"\n");
		}

		fw.close();
	}
	
	// function to save manager data to the manager file
	public static void save_managers(ArrayList<Manager> sp) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\froch\\Desktop\\New Folder\\BDMS\\src\\main\\java\\DataFiles\\manager.csv");

		// writing data
		for(int i=0;i<sp.size();i++) {
			fw.write(sp.get(i).getM_id()+","+sp.get(i).getPi().getName()+",");
			fw.write(sp.get(i).getPi().getDob()+","+sp.get(i).getPi().getGender()+",");
			fw.write(sp.get(i).getLg().getUsername()+","+sp.get(i).getLg().getPassword()+"\n");
		}

		fw.close();
	}

}
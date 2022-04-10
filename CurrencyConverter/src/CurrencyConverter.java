import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.HttpURLConnection;
import java.net.URL;

import java.text.DecimalFormat;

import java.util.HashMap;
import java.util.Scanner;



public class CurrencyConverter {

	public static void main(String[] args) throws IOException {
		
		Boolean running = true;
		do {
			HashMap<Integer, String> currencyCodes = new HashMap <Integer, String>();
			
			//Currency Codes
			currencyCodes.put(1, "USD");
			currencyCodes.put(2, "AUD");
			currencyCodes.put(3, "CAD");
			currencyCodes.put(4, "PLN");
			currencyCodes.put(5, "MXN");
			currencyCodes.put(6, "JPY");
			
			Integer from, to;
			String fromCode;
			String toCode;
//			String input = ""; //used to test if input = int (currently not working 46-53)
			double amount;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Welcome to the currency converter!");
			
			System.out.println("Curency converting FROM?");
			System.out.println("1:USD \t 2:AUD \t 3:CAD \t 4:PLN \t 5:MXN \t 6:JPY");
			from = sc.nextInt();

			/*try {
				from = Integer.parseInt(input); 
				}catch (NumberFormatException e) {
				System.out.println("Input a Valid Num");
				continue;
				}
			It's not working atm...
			*/
			
			while(from < 1 || from >6) {
				System.out.println("Please select a valid currency");
				System.out.println("1:USD \t 2:AUD \t 3:CAD \t 4:PLN \t 5:MXN \t 6:JPY");
				from = sc.nextInt();
			}
			fromCode = currencyCodes.get(from);
			
			
			System.out.println("Curency converting TO?");
			System.out.println("1:USD \t 2:AUD \t 3:CAD \t 4:PLN \t 5:MXN \t 6:JPY");
			to = sc.nextInt();
			while(to < 1 || to >6) {
				System.out.println("Please select a valid currency");
				System.out.println("1:USD \t 2:AUD \t 3:CAD \t 4:PLN \t 5:MXN \t 6:JPY");
				to = sc.nextInt();
			}
			toCode = currencyCodes.get(to);
			
			System.out.println("Amount you wish to convert?");
			amount = sc.nextFloat();
			
			sendHttpGETRequest(toCode, fromCode, amount);
			
			System.out.println("Would you like to make another conversion?");
			System.out.println("1:Yes \t Any other Num: No");
			if(sc.nextInt() != 1) {
				running = false;
			}
		} while(running);
		
		System.out.println("Thank you for using the curency Converter");
		
	}
	
	private static void sendHttpGETRequest(String toCode, String fromCode, double amount) throws IOException {
		
		DecimalFormat f = new DecimalFormat(".00");
		
		String ApiURL = ("https://api.exchangerate.host/convert?from=" + toCode + "&to=" + fromCode);
		URL url = new URL(ApiURL);
		HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
		httpURLConnection.setRequestMethod("GET");
		int responseCode = httpURLConnection.getResponseCode();
		
		if(responseCode == HttpURLConnection.HTTP_OK) {
			BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}in.close();
			
			JSONObject obj = new JSONObject(response.toString());
			Double exchangeRate = obj.getJSONObject("info").getDouble("rate");
			System.out.println(obj.getJSONObject("info"));
			System.out.println(exchangeRate);
			System.out.println();
			System.out.println(f.format(amount) + fromCode + " = " + f.format(amount/exchangeRate) + toCode);
		}
		
		else {
			System.out.println("Get request failed!");
		}
		
	}

}

/*

Bugs:
	input != int --> Exception error
	Solution?
		try {
		from = Integer.parseInt(int); //sc is the input, but because sc != string, I get an error...
		}catch (NumberFormatException e) {
		System.out.println("Input a Valid Num");
		}
			//





*/


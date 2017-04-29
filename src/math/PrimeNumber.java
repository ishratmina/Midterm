package math;

import java.util.ArrayList;

import databases.ConnectDB;

public class PrimeNumber {

	public static void main(String[] args) throws Exception {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		
		ArrayList<Object> myList = new ArrayList<Object>();
		
		for (int i=2; i<=1000000
				; i++){
			boolean myResult = primeNumberCheck(i);
				if (myResult==true) myList.add(i); 	
		}
		
		for (int j=0;j<myList.size();j++)
			System.out.println(myList.get(j));
	
		ConnectDB connect = new ConnectDB();
		connect.InsertDataFromArrayListToMySql(myList, "PrimeNumber", "value");
		
		String query = "SELECT * FROM PrimeNumber";
		connect.directDatabaseQueryExecute(query, "value");
	}
	
	public static boolean primeNumberCheck(int i){
		
		for (int j=2; j<i; j++){
			if (i%j==0) {
				return false;
			}
		}
		return true;
	}
	
}

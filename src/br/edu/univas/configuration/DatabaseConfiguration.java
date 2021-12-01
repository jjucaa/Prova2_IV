package br.edu.univas.configuration;

public class DatabaseConfiguration {

	private static final String HOST = "192.168.1.1";
	private static final String PORT = "4321";
	private static final String DATABASE = "mydatabase";

	private static DatabaseConfiguration dbInst;
	
	private DatabaseConfiguration DatabaseConfiguration() {
		
		return new DatabaseConfiguration();
		
	}
	
	public static DatabaseConfiguration getInstance( ) {
		
		if(dbInst == null) {
			
			dbInst = new DatabaseConfiguration();
			return dbInst;
			
		} else {
			
			return dbInst;
		}
	}
	
	public String getConfiguration() {
		return "jdbc:postgresql://" + HOST + ":" + PORT + "/" + DATABASE;
	}
}

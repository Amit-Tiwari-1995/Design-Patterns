package PROXY_PATTERN;

interface DataBaseExecuter {
	public void executeDatabase(String query) throws Exception;

}

class DataBaseExecuterImpl implements DataBaseExecuter {

	public void executeDatabase(String query) {
		System.out.println("Going to execute query: " + query);
	}

}

class DataBaseExecuterProxy implements DataBaseExecuter {
	boolean isAdmin;
	DataBaseExecuterImpl dbExecuter;

	public DataBaseExecuterProxy(String userName, String pass) {

		if (userName.equals("admin") && pass.equals("admin@123")) {
			isAdmin = true;
			dbExecuter = new DataBaseExecuterImpl();

		}

	}

	public void executeDatabase(String query) throws Exception {
		if (isAdmin) {
			dbExecuter.executeDatabase(query);
		} else if (query.equals("DELETE")) {
			throw new Exception("DELETE not allowed for non-admin user");
		} else {
			dbExecuter = new DataBaseExecuterImpl();
			dbExecuter.executeDatabase(query);
		}

	}

}

public class ProxyPatternExample {

	public static void main(String[] args) throws Exception {

		DataBaseExecuter proxy = new DataBaseExecuterProxy("admin", "admin@123");
		proxy.executeDatabase("DELETE");

		DataBaseExecuter proxy2 = new DataBaseExecuterProxy("user", "admin@123");
		proxy2.executeDatabase("UPDATE");

		DataBaseExecuter proxy3 = new DataBaseExecuterProxy("user", "admin@123");
		proxy3.executeDatabase("DELETE");

	}

}

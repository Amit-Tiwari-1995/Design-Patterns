package FACADE_PATTERN;

import java.sql.Driver;

class FireFox {
	public static Driver getFireFoxDriver() {
		return null;
	}

	public static void generateHtmlReport(String test, Driver driver) {
		System.out.println("Generating HTML report for firefox driver");
	}

	public static void generateJunitReport(String test, Driver driver) {
		System.out.println("Generating JUNIT report for firefox driver");
	}

}

class Chrome {
	public static Driver getChromeDriver() {
		return null;
	}

	public static void generateHtmlReport(String test, Driver driver) {
		System.out.println("Generating HTML report for chrome driver");
	}

	public static void generateJunitReport(String test, Driver driver) {
		System.out.println("Generating JUNIT report for chrome driver");
	}

}

class WebExplorerHelperFacade {
	public static void generateReport(String browser, String report, String test) {
		Driver driver = null;

		switch (browser) {
		case "firefox":
			driver = FireFox.getFireFoxDriver();
			switch (report) {
			case "html":

				FireFox.generateHtmlReport(test, driver);
				break;

			case "junit":
				FireFox.generateJunitReport(test, driver);
				break;
			}
			break;

		case "chrome":
			driver = Chrome.getChromeDriver();
			switch (report) {
			case "html":

				Chrome.generateHtmlReport(test, driver);
				break;

			case "junit":
				Chrome.generateJunitReport(test, driver);
				break;
			}

			break;

		}

	}

}

public class FacadePatternExample {

	public static void main(String[] args) {

		String test = "checkElementPresent";
		WebExplorerHelperFacade.generateReport("chrome", "html", test);

		WebExplorerHelperFacade.generateReport("chrome", "junit", test);

		WebExplorerHelperFacade.generateReport("firefox", "html", test);

		WebExplorerHelperFacade.generateReport("firefox", "junit", test);

	}

}

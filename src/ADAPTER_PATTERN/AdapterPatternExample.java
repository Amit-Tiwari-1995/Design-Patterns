package ADAPTER_PATTERN;

interface WebDriver {
	public void getElement();

	public void selectElement();
}

class ChromeDriver implements WebDriver {

	public void getElement() {
		System.out.println("Get elements from Chrome Driver");
	}

	public void selectElement() {
		System.out.println("Select elements from Chrome Driver\"");
	}

}

class IeDriver {

	public void findElement() {
		System.out.println("Find element from IeDriver");
	}

	public void clickElement() {
		System.out.println("Click element from IeDriver");
	}

}

class WebDriverAdapter implements WebDriver {
	IeDriver ieDriver;

	public WebDriverAdapter(IeDriver ieDriver) {

		this.ieDriver = ieDriver;
	}

	public void getElement() {

		this.ieDriver.findElement();
	}

	@Override
	public void selectElement() {

		this.ieDriver.clickElement();
	}

}

public class AdapterPatternExample {

	public static void main(String[] args) {

		ChromeDriver cd = new ChromeDriver();
		cd.getElement();
		cd.selectElement();

		IeDriver id = new IeDriver();
		id.clickElement();
		id.findElement();

		WebDriver wd = new WebDriverAdapter(id);
		wd.getElement();
		wd.selectElement();

	}
}

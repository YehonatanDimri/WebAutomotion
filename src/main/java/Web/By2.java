package Web;

import org.openqa.selenium.*;

import java.util.List;


public class By2 extends By implements WebElement {

	public By by;
	public String description;


	public By2(String description, By by) {
		this.description = description;
		this.by = by;
	}


	@Override
	public void click() {

	}

	public void submit() {
		this.description = description;
		this.by = by;
	}

	@Override
	public void sendKeys(CharSequence... charSequences) {

	}

	@Override
	public void clear() {

	}

	@Override
	public String getTagName() {
		return null;
	}

	@Override
	public String getAttribute(String s) {
		return null;
	}

	@Override
	public boolean isSelected() {
		return false;
	}

	@Override
	public boolean isEnabled() {
		return false;
	}

	@Override
	public String getText() {
		return null;
	}

	@Override
	public List<WebElement> findElements(By by) {
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		return null;
	}

	@Override
	public boolean isDisplayed() {
		return false;
	}

	@Override
	public Point getLocation() {
		return null;
	}

	@Override
	public Dimension getSize() {
		return null;
	}

	@Override
	public Rectangle getRect() {
		return null;
	}

	@Override
	public String getCssValue(String s) {
		return null;
	}

	@Override
	public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
		return null;
	}

	@Override
	public List<WebElement> findElements(SearchContext searchContext) {
		return null;
	}
}



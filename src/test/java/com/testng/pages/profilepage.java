package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.testng.base.basepage;

public class profilepage extends basepage{

	public profilepage(WebDriver driver) {
		super(driver);
	}
	
	Actions action =  new Actions(driver);
	
	@FindBy(xpath="//img[@title = 'Edit Profile']")
	WebElement contactEditButton;
	
	@FindBy(id="contactInfoContentId")
	WebElement contactiFrame;
	
	@FindBy(xpath="//a[contains(text(),'About')]")
	WebElement abouttab;

	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(xpath="//input[@value = 'Save All']")
	WebElement saveAll;
	
	@FindBy(xpath="//span[text()='Post']")
	WebElement post;

	@FindBy(xpath = "//iframe[@title='Rich Text Editor, publisherRichTextEditor']")
	WebElement postiFrame ;
	
	@FindBy(xpath = "//body[@role='textbox']")
	WebElement posttextbox;
	
	@FindBy(name = "publishersharebutton")
	WebElement sharebutton;
	
	@FindBy(xpath = "//span[text()='File']")
	WebElement FileLink;
	
	@FindBy(id = "chatterUploadFileAction")
	WebElement uploadFromComputer; 
	
	@FindBy(xpath = "//input[@id='chatterFile']")
	WebElement chooseFile;
	
	@FindBy(xpath = "//a[text()='Update']")
	WebElement uploadprofilepic;
	
	@FindBy(xpath = "//iFrame[@id='uploadPhotoContentId']")
	WebElement uploadphotoiFrame; 
	
	@FindBy(xpath = "//input[@class='fileInput']")
	WebElement choosefile;
	
	@FindBy(xpath = "//input[@id='j_id0:uploadFileForm:uploadBtn']")
	WebElement photobeforeuploadsavebutton;
	
	@FindBy(xpath = "//div[@class='imgCrop_dragArea']")
	WebElement img_crop;
	
	@FindBy(xpath="//input[@class = 'btn saveButton']")
	WebElement cropsavebutton;
	

	
	
	public void clickoncontactEditButton() {
		contactEditButton.click();
		switchtocontactiFrame();
	}
	
	public void switchtocontactiFrame() {
		driver.switchTo().frame(contactiFrame);
		
	}
	
	public void switchtodefaultwindow() {
		driver.switchTo().defaultContent();
	}
	
	public void clickonabouttab() {
		abouttab.click();
	}
	
	public void enterintolastname(String lastname) {
		lastName.clear();
		lastName.sendKeys(lastname);
	}
	
	public void clickonsaveAll() {
		saveAll.click();
	}
	
	public void clickonpost() {
		post.click();
	}
	
	public void switchtopostFrame() {
		driver.switchTo().frame(postiFrame);
	}

	public void enterintoposttextbox(String poststr) {
		posttextbox.sendKeys(poststr);
	}
	
	public void clickonsharebutton() {
		sharebutton.click();
	}
	
	public void clickonFilelink() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		FileLink.click();
	}
	
	public void clickonuploadfromcomputer() {
		waitforelement(uploadFromComputer);
		uploadFromComputer.click();
	}
	
	public void sendfilelocation(String filepath) {
	chooseFile.sendKeys(filepath);
	}
	
	public void clickonupdateprofilepic() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		waitforelement(uploadprofilepic);
		action.moveToElement(uploadprofilepic).click().build().perform();
	}
	public void switchtophotoiFrame() {
		driver.switchTo().frame(uploadphotoiFrame);
	}
	public void chooseProfilepicFile(String filepath) {
		//"/Users/geerthanakannan/Documents/smiley.jpeg"
		choosefile.sendKeys(filepath);
	}
	public void clickphotobeforeuploadsave() {
		photobeforeuploadsavebutton.click();
	}
	
	public void img_crop() {
		waitforelement(img_crop);
		action.clickAndHold(img_crop).moveByOffset(298, 298).release().build().perform();
	}
	public void clickoncropsavebutton() {
		cropsavebutton.click();
	}
	
	
}

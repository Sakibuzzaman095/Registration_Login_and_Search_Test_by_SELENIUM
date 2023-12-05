package testOne;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class testone {
    public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.driver.geckodriver","./src/main/resources/geckodriver.exe");
       WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.pickaboo.com");
        driver.navigate().to("https://www.pickaboo.com/login/");
       // driver.navigate().back();

       Dimension size= driver.manage().window().getSize();
       System.out.println("The Dimention of the Window is "+size);
       int height= driver.manage().window().getSize().getHeight();
       System.out.println("The height of the browser is "+height);

       //registration
//       driver.navigate().to("https://www.pickaboo.com/register/");
//       driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[3]/div/center/div/form/div/div[1]/div/input")).sendKeys("Sakibuzzaman");
//       driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[3]/div/center/div/form/div/div[2]/div/input")).sendKeys("Alif");
//       driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[3]/div/center/div/form/div/div[3]/div/div/input")).sendKeys("01765105761");
//       driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[3]/div/center/div/form/div/div[4]/div/input")).sendKeys("2215");
//       //driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[3]/div/center/div/form/div/div[3]/div/button/span[1]")).click();
//       driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[3]/div/center/div/form/div/div[5]/button/span[1]")).click();


       //Login
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[2]/div/center/div/form/div/div[1]/div/input")).sendKeys("01765105761");
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[2]/div/center/div/form/div/div[2]/div/div/input")).sendKeys("Sakib69***");
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[2]/div/center/div/form/div/div[3]/button/span[1]")).click();

        String ex_title="Customer Login";
        String Act_title=driver.getTitle();
        if (ex_title.equals(Act_title)==true){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }




        //Accepting Cookies
       // driver.findElement(By.xpath("//*[@id=\"rcc-confirm-button\"]")).click();

       // Search products
        driver.findElement(By.xpath("/html/body/div[2]/section[1]/div[2]/div/div[2]/form/input")).sendKeys("SmartPhone");
        driver.findElement(By.xpath("/html/body/div[2]/section[1]/div[2]/div/div[2]/form/button")).click();


        String ex_title1="Search Result for \"SmartPhone\"";
        String Act_title1=driver.getTitle();
        if (ex_title1.equals(Act_title1)==true){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }

        driver.findElement(By.xpath("/html/body/div[2]/main/section/div[2]/div/div[1]/section/div/div[1]/h2/button")).click();

        String ex_title2="Shop the Best Smartphones at Pickaboo: Samsung, iPhone, realme & More";
        String Act_title2=driver.getTitle();
        if (ex_title2.equals(Act_title2)==true){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }



        //Thread.sleep(3000);
        //driver.quit();
    }
}

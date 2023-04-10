package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultBrowserTest {
    static String browser = "chrome";

    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        }else {
            System.out.println("Wrong browser requested");
        }

        driver.get(baseUrl);

//        3. Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

//        4. Print the current url
        System.out.println(driver.getCurrentUrl());

//        5. Print the page source
        System.out.println(driver.getPageSource());

//        6. Enter the email to email field
        WebElement email = driver.findElement(By.id("user[email]"));
        email.sendKeys("XYZabc@hotmail.com");


//        7. Enter the password to password field
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("abc1234");


//        8. Close the browser
        driver.close();

    }
}

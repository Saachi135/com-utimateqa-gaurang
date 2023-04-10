package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
//        1. Setup chrome browser
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

//        2. Open URL
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

//        3. Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

//        4. Print the current url
        System.out.println(driver.getCurrentUrl());

//        5. Print the page source
        System.out.println(driver.getPageSource());

//        6. Enter the email to email field
        WebElement emailid = driver.findElement(By.id("user[email]"));
        emailid.sendKeys("ABCDEF@gmail.com");

//        7. Enter the password to password field
        WebElement passWord = driver.findElement(By.name("user[password]"));
        passWord.sendKeys("12345abc");
//        8. Close the browser

        driver.close();
    }
}

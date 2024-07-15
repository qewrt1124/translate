package com.example.translate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://translate.google.com/?sl=ja&tl=ko&op=images";

        driver.get(baseUrl); 

        driver.findElement(By.cssSelector("input[type='file']")).sendKeys("/Users/yang/Downloads/mang/001.jpeg");
        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(1000000);

        driver.findElement(By.xpath("//button[@jsname='hRZeKc']"));

        System.out.println("Hello, World!");
    }
}

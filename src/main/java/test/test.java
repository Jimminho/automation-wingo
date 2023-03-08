package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class test
{

    private static Select chev;

    public static void main (String[]args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aspaj\\IdeaProjects\\prueba automatizacion\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wingo.com/");
        System.out.println(driver.getTitle());

        //Origen
        driver.findElement(By.className("styledSelectOrigen")).click();
        driver.findElement(By.className("searchSelectIbe")).sendKeys("BOG");
        List<WebElement> allValues = driver.findElements(By.className("optionsOrigen"));
        allValues.get(0).click();
        Thread.sleep(1000);

        //Destino
        driver.findElement(By.id("inputDestino")).click();
        driver.findElement(By.id("inputDestino")).sendKeys("CLO");
        List<WebElement> allValues1 = driver.findElements(By.className("optionsDestino"));
        allValues1.get(0).click();
        Thread.sleep(1000);

        //Fecha inicial
        driver.findElement(By.cssSelector("#inputOutboundDate > div.cont-calendar > div.cont-months > div > div > div > div > table.month1 > tbody > tr:nth-child(5) > td:nth-child(4) > div")).click();

        //Fecha Final
        driver.findElement(By.xpath("//*[@id=\"date-window-container\"]/div/div/div/div/table[2]/thead/tr[1]/th[3]/span")).click();
        driver.findElement(By.cssSelector("#date-window-container > div > div > div > div > table.month2 > tbody > tr:nth-child(4) > td:nth-child(4) > div")).click();

        //Sumar Pasajeros
        driver.findElement(By.id("tPasajeros")).click();
        driver.findElement(By.xpath("//*[@id=\"selectPassenger\"]/div[1]/div[2]/div[2]")).click();
        Thread.sleep(1000);

        //Buscar Vuelo
        driver.findElement(By.xpath("//*[@id=\"ibeTab\"]/div[1]/div/div/div[3]/div/div[2]/div/div[5]/div")).click();

    }

}
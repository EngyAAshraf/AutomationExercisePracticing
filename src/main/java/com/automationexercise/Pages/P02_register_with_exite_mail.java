package com.automationexercise.Pages;

import com.automationexercise.Utilities.LogUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.automationexercise.Utilities.Utility.*;

public class P02_register_with_exite_mail {

    //constructor
    private final WebDriver driver;
    public P02_register_with_exite_mail(WebDriver driver)
    {
        this.driver=driver;
    }

    private  final By signup_Login_button =By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
    private final By name_field =By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
   private final By email_address_field =By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
   private final  By signup_button =By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
   private final By new_user_signup_message=By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2");
   private final By error_msg =By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p");



//Action
public P02_register_with_exite_mail click_On_signup_Login_Button() {
    clicking(driver, signup_Login_button);
    return this;
}
public void click()
{
    clicking(driver, signup_Login_button);
}
    public P02_register_with_exite_mail enter_signup_Info(String name, String email) {
        sendData(driver, name_field, name);
        LogUtils.info("Email: " + email);
        sendData(driver, email_address_field, email);
        return this;
    }
    public P02_register_with_exite_mail click_On_signup_Button() {
        clicking(driver, signup_button);
        return this;
    }
    //Validations
public boolean assert_on_error_message(String expectedText)
{
   return verifyEquals(error_msg,  expectedText);

}
    public boolean assert_on_new_user_signup_message(String expectedText)
    {
        return verifyEquals(new_user_signup_message,  expectedText);

    }

}
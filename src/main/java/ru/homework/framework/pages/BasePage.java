package ru.homework.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.homework.framework.managers.InitManager;
import ru.homework.framework.managers.ManagerPages;

import static ru.homework.framework.managers.DriverManager.getDriver;

public class BasePage {
    protected ManagerPages app = ManagerPages.getManagerPages();

    protected WebDriverWait wait = new WebDriverWait(getDriver(), 10, 1000);

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }


}

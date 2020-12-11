package ru.homework.framework.basetest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import ru.homework.framework.managers.InitManager;
import ru.homework.framework.managers.ManagerPages;

public class BaseTest {
    protected ManagerPages app = ManagerPages.getManagerPages();

    @BeforeClass
    public static void before() {
        InitManager.initFramework();
    }

    @AfterClass
    public static void after() {
        InitManager.quitFramework();
    }
}

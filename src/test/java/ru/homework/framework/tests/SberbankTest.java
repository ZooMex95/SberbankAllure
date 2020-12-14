package ru.homework.framework.tests;

import org.junit.Test;
import ru.homework.framework.basetest.BaseTest;

public class SberbankTest extends BaseTest {

    @Test
    public void test() throws InterruptedException {
        app.getStartPage()
        .selectBaseMenu("Ипотека")
        .selectSubMenu("Ипотека на готовое жильё")
        .fillInputFields("Стоимость недвижимости", "5180000")
        .fillInputFields("Первоначальный взнос", "3058000")
        .fillInputFields("Срок кредита", "30")
        .buttonGetOff("Страхование жизни")
        .buttonGetOn("Молодая семья")
        .checkSum("Сумма кредита")
        .checkSum("Ежемесячный платеж")
        .checkSum("Необходимый доход")
        .checkSum("Процентная ставка");
    }

}

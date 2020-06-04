package tests;

import com.codeborne.selenide.Selectors;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import static io.qameta.allure.Allure.step;


@Epic("QA.GURU automation course")
@Story("Google tests")
@Tag("google")
class GoogleTests {

    @Test
    @DisplayName("неудачный поиск в Гугл")
    @Description("Positive test with testid")
    void successfulSearch() {
        step("Открываем поисковик", () -> {
            open("http://google.com");
        });
        step("Вводим поисковый запрос",() -> {
            $(byName("q")).val("lepra").pressEnter();
        });
        step("Находим результат", () -> {
            $("html").shouldHave(text("Лепрозорий: вход"));
        });

    }


    @Test
    @DisplayName("успешный поиск в Яндекс")
    @Description("Positive test with testid")
    void search() {
        step("Открываем поисковик",() -> {open("http://yandex.ru");
        });
        step("Вводим поисковый запрос", () ->{$(byName("text")).val("lepra").pressEnter();
        });
        step("Находим результат", () ->{
            $("html").shouldHave(text("Лепрозорий: вход"));});

    }
}
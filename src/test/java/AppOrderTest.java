import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

public class AppOrderTest {
    @Test
    public void appOrderTest(){
        open("http://localhost:9999");
        $("span[data-test-id=name] input").setValue("Александр Ткаченко");
        $("span[data-test-id=phone] input").setValue("+79876543210");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("p[data-test-id=order-success]").shouldHave(exactText("  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }

}
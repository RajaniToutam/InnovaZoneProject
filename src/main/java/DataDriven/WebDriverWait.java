package DataDriven;

import org.openqa.selenium.WebDriver;

import java.time.chrono.ChronoLocalDate;
import java.time.temporal.Temporal;

public abstract class WebDriverWait implements ChronoLocalDate, Temporal {
    public WebDriverWait(WebDriver driver, int i) {
    }
}

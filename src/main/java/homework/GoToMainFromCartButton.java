package homework;

import io.appium.java_client.AppiumDriver;
import homework.screens.CartScreen;
import io.appium.java_client.android.AndroidDriver;

public class GoToMainFromCartButton implements GoToMainScreenStrategy {
    AppiumDriver<?> driver;
    public GoToMainFromCartButton(AppiumDriver<?> driver){

        this.driver = driver;
    }


    @Override
    public void goToMain() {
        CartScreen cartScreen = new CartScreen( driver);
        cartScreen.goToMainScreen();

    }
}

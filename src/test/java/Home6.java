import homework.GoToMainFromCartButton;
import homework.screens.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Home6 extends BaseTest{


    @Test
    public void homeTest(){
        MainScreen mainScreen = new MainScreen(driver);
        mainScreen.getLogotypeIcon().isDisplayed();
        Tabbar tabbar = new Tabbar(driver);
        tabbar.goToLists();
        ListsScreen listsScreen = new ListsScreen(driver);
        listsScreen.showCatalog();
        CatalogScreen catalogScreen = new CatalogScreen( driver);
        catalogScreen.openSmartphonesAndGadgets();
        catalogScreen.getSamsungTitle().isDisplayed();
        tabbar.goToProfile();
        ProfileScreen profileScreen = new ProfileScreen(driver);
        profileScreen.chooseCity();
        ChooseCityScreen chooseCityScreen = new ChooseCityScreen(driver);
        chooseCityScreen.back();
        tabbar.goToCart();
        CartScreen cartScreen = new CartScreen( driver);
        cartScreen.goToMainScreenByStrategy(new GoToMainFromCartButton(driver));
        assertEquals("Я в магазине", mainScreen.getStoreMainTitleText());

    }

}

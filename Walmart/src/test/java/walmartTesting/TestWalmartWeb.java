package walmartTesting;

import org.testng.annotations.Test;
import page.searchPage;

public class TestWalmartWeb extends searchPage {
    @Test
    public void testHome(){
        searchItems();
    }
}

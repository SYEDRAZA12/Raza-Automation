package page;

import base.CommonAPI;


public class searchPage extends CommonAPI {

    public void searchItems (){

        System.out.println(driver.getTitle());
        typeByCss("#global-search-input","Mac Book");
        clickByXpath("//*[@id=\"global-search-form\"]/div/div[3]/button/span[1]");
        clearInput("#global-search-input");
       /* typeByCss("#global-search-input","iphone");
        clickByXpath("//*[@id=\"global-search-form\"]/div/div[3]/button/span[1]");
        //clickByCss("//*[@id=\"global-search-form\"]/div/div[3]/button");
        clearInput("#global-search-input");
        typeByCss("#global-search-input","Onion");
        clickByXpath("//*[@id=\"global-search-form\"]/div/div[3]/button/span[1]");
       // clickByCss("//*[@id=\"global-search-form\"]/div/div[3]/button");
        clearInput("#global-search-input");
        typeByCss("#global-search-input","Java Book");
        clickByXpath("//*[@id=\"global-search-form\"]/div/div[3]/button/span[1]");
        //clickByCss("//*[@id=\"global-search-form\"]/div/div[3]/button");
        clearInput("#global-search-input");
        typeByCss("#global-search-input","Love");*/
    }


}

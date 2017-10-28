package core;

import java.util.TreeMap;

public class TestDataStorage {

    private static final TreeMap<String, String> elemList = createMap();

    // URL url = new URL("http://alex.academy/ebay.xml");

    private static TreeMap<String, String> createMap() {
	TreeMap<String, String> elemList = new TreeMap<String, String>();
	elemList.put("element_01", "orig-kw");
	elemList.put("element_02", "engine");
	elemList.put("element_03", "kadu-version");
	elemList.put("element_04", "response-time");
	elemList.put("element_05", "deals");
	return elemList;
    }

    public static TreeMap<String, String> getElemlist() {
	return elemList;
    }

    public static String[] getTC() {
	return tc;
    }

    private static String tc[] = { "Key Word: \t ", "Engine: \t ", "Version: \t ", "Response time: \t ",
	    "Number of deals: ", "Store Url: \t ", "Merchant Phone:  ", "Amount of bids:  ", "Phone \t\t ",
	    "Displayed items: ", "Merchants: \t ", "Products: \t " };

}

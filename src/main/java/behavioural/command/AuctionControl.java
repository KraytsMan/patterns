package behavioural.command;

import java.util.HashMap;
import java.util.Map;

public class AuctionControl {

    private Map<String, AuctionItem> auctionItems = new HashMap<String, AuctionItem>();

    public void setAuctionItem(String itemKey, AuctionItem auctionItem) {
        auctionItems.put(itemKey, auctionItem);
    }

    public void presentItem(String itemKey) {
        AuctionItem auctionItem = auctionItems.get(itemKey);
        auctionItem.sell();
    }

}
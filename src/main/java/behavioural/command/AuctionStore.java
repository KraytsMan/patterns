package behavioural.command;

public class AuctionStore {

    public static void main(String args[]) {

        AuctionControl auctionControl = new AuctionControl();
        auctionControl.setAuctionItem("FURN", new AuctionFurniture());
        auctionControl.setAuctionItem("VASE", new AuctionVase());
        auctionControl.setAuctionItem("JEWL", new AuctionJewel());

        auctionControl.presentItem("FURN");
        auctionControl.presentItem("JEWL");
    }
}

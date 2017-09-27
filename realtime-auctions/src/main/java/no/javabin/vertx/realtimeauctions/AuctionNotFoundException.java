package no.javabin.vertx.realtimeauctions;

public class AuctionNotFoundException extends RuntimeException {
    public AuctionNotFoundException(String auctionId) {
        super("Auction not found: " + auctionId);
    }
}

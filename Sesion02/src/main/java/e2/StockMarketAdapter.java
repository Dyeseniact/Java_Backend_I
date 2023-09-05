package e2;

public class StockMarketAdapter implements StockMarketReport{
    private StockMarket stockMarket;

    public StockMarketAdapter() {
        stockMarket = new StockMarket();
    }
    @Override
    public String download() {
        String xml = stockMarket.download();
        return null;
    }

    public String covertToJson (String xml) {
        String json = "";
        System.out.println("Convirtiendo la infomación XML a JSON...");
        return json;
    }
}

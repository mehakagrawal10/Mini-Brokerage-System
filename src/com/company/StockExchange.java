package com.company;
import java.util.*;

public class StockExchange {

    //two arraylists for NSE and BSE each
    static ArrayList<Stock> NSE = new ArrayList<>();
    ArrayList<Stock> BSE = new ArrayList<>();

    //StockExchange constructor
    StockExchange(){
    }

    //method to add stocks
    public static void addStocks(String ticker, String type, double O, double H, double L, double C) {
        NSE.add(new Stock(ticker, type, O, H, L, C));
    }

    //method to print stocks in NSE
    public void print(){
        for(Stock i: NSE){
            System.out.println(i.toString());
        }
    }
    //method to delete stocks
    public void delStocks(Stock stock) {
        for (int i = 0; i < NSE.size(); i++) {
            if (stock.ticker.equals(NSE.get(i).ticker)){
                NSE.remove(stock);
            }
        }
    }

    //method to get all stocks in stock market
    public void getAllStocks() {
        for (Stock i : NSE) {
            System.out.println(i);
        }
        for (Stock i : BSE) {
            System.out.println(i);
        }
    }

    //method to get stocks sectorwise
    public void getStockBySector(String sector) {
        for (int i = 0; i < NSE.size(); i++) {
            if (NSE.get(i).type.equals(sector))
                System.out.println(NSE.get(i));
        }
    }

    //method to check ticker and returning the stock if ticker matches
    public boolean checkTicker(String scrip){
        for(int i =0;i<NSE.size();i++)
        {
            if(scrip.equals(NSE.get(i).ticker))
                return true;
        }
        return false;
    }
}

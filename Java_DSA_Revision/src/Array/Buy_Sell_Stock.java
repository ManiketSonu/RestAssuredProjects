package Array;

public class Buy_Sell_Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[] = {7,1,5,3,6,4};
		System.out.println(buySellStock(prices));
	}
	public static int buySellStock(int prices[])
	{
		int buyPrice = Integer.MAX_VALUE;
		int maxProfit=0;
		
		for(int i=0;i<prices.length;i++)
		{
			if(buyPrice<prices[i])
			{
				int profit = prices[i] - buyPrice;
				maxProfit=Math.max(maxProfit, profit);
			}
			else
			{
				buyPrice=prices[i];
			}
		}
		return maxProfit;
	}
}

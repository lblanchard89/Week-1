
public class Booleans {

	public static void main(String[] args) {
	boolean isHotOutside = true;
	boolean isWeekday = true;
	boolean hasMoneyInPocket = false;
	double costOfMilk = 2.75;
	double moneyInWallet = 87.65;
	int thirstLevel = 9;
	boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
	boolean willGoSwimming = isHotOutside && !isWeekday;
	boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
	boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= (costOfMilk * 2));
	}

}

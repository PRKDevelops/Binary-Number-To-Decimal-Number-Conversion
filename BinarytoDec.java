
public class BinarytoDec {
	
		public static void BinToDec(int BinNum){
			int pow = 0;
			int decNum = 0;
			
			while(BinNum > 0){
				int lastDigit = BinNum % 10;
				decNum = (decNum + (lastDigit *(int) Math.pow(2,pow)));
			
				pow++;
				BinNum = BinNum/10;
			}
			System.out.println("Decimal Of "+BinNum +"="+ decNum);
		}
		public static void main(String args[]){
			BinToDec(10010101);
		}
	}


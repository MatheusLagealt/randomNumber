
public class randomNumber {
	public static void main(String[] args){
		Boolean bol = true;
		if(bol == true){
			while(bol == true){
				int random = (int) (Math.random() * 100);
				System.out.println(random);
			}
		}
		else {
			System.out.print("disabled");
		}
	}
}

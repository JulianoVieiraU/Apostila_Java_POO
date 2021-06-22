
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//continue
		for(int i = 0; i < 100; i++) {
			if(i > 50 && i < 60) {
				continue;
			}
			
			System.out.println(i);
		}
		
		//while
		int x = 0;
		while(x < 10) {
			System.out.println(x);
			x++;
		}
		
		//do while
		x = 0;
		do {
			System.out.println(x);
			x++;
		}while(x < 10);
		
		x = 2;
		switch(x) {
			case 1:
				System.out.println("X = 1");
			break;
			case 2:
				System.out.println("X = 2");
			break;
		}
		
		//labeled loops
		for (int i = 0; i < 10; i++) {
			inner:
			for (int j = 0; j < 10; j++) {
				if ( i == 5 )
					break inner;
				else if ( i == 4 )
					break;
			}
			System.out.println("The break will end up here!");
		}
		System.out.println("The break FINDBIGGER will end up here!");
	}

}

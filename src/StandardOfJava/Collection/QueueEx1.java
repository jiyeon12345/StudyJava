package StandardOfJava.Collection;

import java.util.*;

public class QueueEx1 {
	static Queue q= new LinkedList();
	static final int MAX_SIZE = 5;

	public static void main(String[] args) {
		System.out.println("you can see description when input 'help'");
		
		while(true) {
			System.out.println(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				}else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - show description ");
					System.out.println(" q or Q - exit program ");
					System.out.println(" history - show recently you input data" + MAX_SIZE + "size.");
				}else if(input.equalsIgnoreCase("history")) {
					int i = 0;
					save(input);
					
					LinkedList tmp = (LinkedList) q;
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext()) {
						System.out.println(++i+"."+it.next());
					}
				} else {
					save(input);
					System.out.println(input);
				}
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("input error");
			}
		}
	}

	private static void save(String input) {
		// TODO Auto-generated method stub
		if(!"".equals(input)) {
			q.offer(input);
		}
		
		if(q.size() > MAX_SIZE) 
			q.remove();
	}

}

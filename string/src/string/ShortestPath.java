package string;

public class ShortestPath {

	public static float path(String str){
		int x = 0, y = 0;
		for(int i = 0;i<str.length();i++){
			char dir = str.charAt(i);
			
			//south
			if(dir == 'S'){
				y--;
			}
			else if(dir == 'N'){
				y++;
			}
			else if(dir == 'W'){
				x--;
			}
			else{
				x++;
			}
			
		}
		int X2 = x*x; // x sqaure = (x2 - x1)^2
		int Y2 = y*y; // y sqaure = (y2 - y1)^2
		return (float)Math.sqrt(X2 + Y2);
	}
	public static void main(String[] args) {
		String str = "WNEENESENNN";
		System.out.println("Shortest path = "+path(str));

	}

}

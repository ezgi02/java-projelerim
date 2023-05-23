import java.util.Scanner;
import java.util.Random;
public class MayinTarlasi {
	int rownumber,colnumber,size;
	int[][]  map;
	int[][] board;
	boolean game=true;
	Random rand=new Random();
	Scanner scan=new Scanner(System.in);
	MayinTarlasi(int rownumber,int colnumber ){
		this.rownumber=rownumber;
		this.colnumber=colnumber;
		this.map=new int[rownumber][colnumber];
		this.board=new int[rownumber][colnumber];
		this.size=rownumber*colnumber;
	}
	public void run() {
		int row,col;
		prepareGame();
		print(map);
		System.out.println("Oyun basladi");
		while(game) {
			print(board);
			System.out.println("Row:");
			row=scan.nextInt();
			System.out.println("sutun");
			col=scan.nextInt();
			if(map[row][col]!=-1) {
				check(row,col);
			}
			else {
				game=false;
				System.out.println("Game Over");
			}
			
		}

	}
	public void check(int r,int c) {
		if(map[r][c]==0) {
			if((c<colnumber-1)&& (map[r][c+1]==-1)) {
			board[r][c+1]++;
			}
			if((r<rownumber-3)&& (map[r+1][c]==-1)) {
				board[r+1][c]++;
			}
			if((r>0)&&(map[r-1][c]==-1)) {
				board[r-1][c]++;
			}
			if((c>0)&&(map[r][c-1]==-1)) {
				board[r][c-1]++;
			}
			if(board[r][c]==0) {
				board[r][c]=-2;
			}
		}
		
		
	}
	public void prepareGame() {
		int ranRow,ranCol,count=0;
		while(count!=(size/4)) {
			ranRow=rand.nextInt(rownumber);
			ranCol=rand.nextInt(colnumber);
			if(map[ranRow][ranCol]!=-1) {
				map[ranRow][ranCol]=-1;
				count++;
			}
		}
	}
	public void print(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]>=0)
					System.out.print(" ");
			System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
	}
}

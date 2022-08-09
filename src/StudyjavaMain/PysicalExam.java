package StudyjavaMain;

import java.util.Scanner;

public class PysicalExam {
	
	static final int VMAX = 21;
	
	static class pyscData{
		String name;
		int height;
		double vision;
		
		pyscData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	static double aveHeight(pyscData[] data) {
		double sum = 0;
		for(int i = 0 ; i<data.length; i++) {
			sum += data[i].height;
		}
		
		return sum/data.length;
	}
	
	static void distVision(pyscData[] data, int[] dist) {
		for(int i = 0 ; i < data.length ; i++) {
			if((int)(data[i].vision*10) > 0 && (int)(data[i].vision*10) <= VMAX)
			dist[(int)(data[i].vision*10)]++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		pyscData[] data = {
				new pyscData("인", 147, 0.2),
				new pyscData("홍", 137, 0.1),
				new pyscData("박", 177, 0.1),
				new pyscData("김", 197, 0.6),
		};
		
		int[] vdist = new int[VMAX];
		
		System.out.printf("신체검사 리스트\n 이름    키   시력\n------------------\n");
		
		for(int i = 0 ; i < data.length ; i++) {
			System.out.printf("%s %d %2f\n", data[i].name, data[i].height, data[i].vision);
		}
		
		System.out.printf("평균키 : %2.2f cm \n", aveHeight(data));
		
		distVision(data, vdist);
		
		System.out.println("시력분포");
		for(int i = 0 ; i < VMAX; i++) {
			System.out.printf("%2.2f ~ : ", i/10.0);
			for(int j= 0 ; j < vdist[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}



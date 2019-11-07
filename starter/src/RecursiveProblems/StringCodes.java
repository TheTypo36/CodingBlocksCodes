package RecursiveProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class StringCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner sc=new Scanner(System.in);
				int num=sc.nextInt();
				String str=Integer.toString(num);
				System.out.println(returnCodes(str));
	}
			public static ArrayList returnCodes(String str){

		        if(str.length()<=0){
					ArrayList<String> br=new ArrayList<>();
					br.add("");
					return br;
				}

				char cc=str.charAt(0);
				String rest=str.substring(1);

				ArrayList<String> recurResult=returnCodes(rest);
				ArrayList<String> myResult=new ArrayList<>();
				
				char newCh=(char)(cc + 48);
				for(String i:recurResult){
					myResult.add(newCh+i);
				}

				if(str.length()>=2){
					
					String cc2=str.substring(0,2);
					String rest2=str.substring(2);

					if(Integer.parseInt(cc2)<=26){
						char newCh2=(char)(Integer.parseInt(cc2)+ 96);
						ArrayList<String>recurResult2=returnCodes(rest2);
						for(String i: recurResult2){
							myResult.add(newCh2+i);
						}
					}

				}
				return myResult;

			}



		}


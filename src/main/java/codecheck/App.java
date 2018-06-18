package codecheck;

public class App {
	public static void main(String[] args) {
		//配列に引数の内容を詰める。
		String[] array =new String [args.length];
		String[] fizzbuzzArray=new String [args.length / 2+1];
		int[] kazuArray=new int [args.length / 2+1];


		for (int i = 0, l = args.length; i < l; i++) {
			array[i] = args[i];
		}

		//割る数を取得する
		int wararerukazu =Integer.parseInt(args[args.length - 1]);

		for (int i = 0, l = args.length/2+1; i < l; i++) {
			String aaa = args[i];
			kazuArray[i] = Integer.parseInt (aaa.substring(0,1));
			fizzbuzzArray[i]= aaa.substring(2);
		}

		 String hyouji = fizzbuzz(wararerukazu,fizzbuzzArray,kazuArray);

		 System.out.println(hyouji);
}
		static String fizzbuzz(int wararerukazu,String[]fizzbuzzArray, int[]kazuArray) {
		int nanko = kazuArray.length;
		if(nanko == 1) {
			if (wararerukazu % kazuArray[0] == 0) return fizzbuzzArray[0];
			return String.valueOf(wararerukazu);
			}
		if(nanko == 2) {
			if (wararerukazu % kazuArray[0]== 0 &&wararerukazu %kazuArray[1] == 0) return fizzbuzzArray[0]+fizzbuzzArray[1];

			if (wararerukazu % kazuArray[0] == 0) return fizzbuzzArray[0];
			if (wararerukazu % kazuArray[1] == 0) return fizzbuzzArray[1];
			return String.valueOf(wararerukazu);
			}
		if(nanko == 3) {
			if (wararerukazu % kazuArray[0]== 0 &&wararerukazu %kazuArray[1] == 0&&wararerukazu %kazuArray[2] == 0) return fizzbuzzArray[0]+fizzbuzzArray[1]+fizzbuzzArray[2];

			if (wararerukazu % kazuArray[0] == 0) return fizzbuzzArray[0];
			if (wararerukazu % kazuArray[1] == 0) return fizzbuzzArray[1];
			if (wararerukazu % kazuArray[2] == 0) return fizzbuzzArray[2];

			return String.valueOf(wararerukazu);
			}else {
				if (wararerukazu % kazuArray[0]== 0 &&wararerukazu %kazuArray[1] == 0&&wararerukazu %kazuArray[2] == 0&&wararerukazu %kazuArray[3] == 0) return fizzbuzzArray[0]+fizzbuzzArray[1]+fizzbuzzArray[2]+fizzbuzzArray[3];
			if (wararerukazu % kazuArray[0] == 0) return fizzbuzzArray[0];
			if (wararerukazu % kazuArray[1] == 0) return fizzbuzzArray[1];
			if (wararerukazu % kazuArray[2] == 0) return fizzbuzzArray[2];
			if (wararerukazu % kazuArray[3] == 0) return fizzbuzzArray[3];
			return String.valueOf(wararerukazu);
			}
		}
}

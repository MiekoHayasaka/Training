import java.util.*;
public class MethodLesson9{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("体重を入力してください(kg)>");
		double w = s.nextDouble();
		System.out.print("身長を入力してください(cm)>");
		double h = s.nextDouble();
		double bmi = calcBMI(w,h);
		System.out.printf("体重:%.1fkg, 身長:%.1fcmのBMIは%.1fです。",w,h,bmi);
	}

	static double calcBMI(double weightKg,double heightCm){
		double heightM = heightCm / 100;
		return weightKg/(heightM*heightM);
	}
}

package utility;

import model.User;

public class EligibilityCheck extends BasicEligibility implements EligibilityInterface{

	@Override
	public boolean checkUser(User user) {
		int age = user.getAge();
		System.out.println("age = "+age);
		int height = user.getHeight();
		System.out.println("height = "+height);
		int weight = user.getWeight();
		System.out.println("weight = "+weight);
		String country = user.getCountry();
		System.out.println("country = "+country);
		if((age>=18 && age<=35) && (height>=155 && height<=170) && (weight>=55 && weight<=90) && (country.equals("ProGrad"))) {
			System.out.println("ok eligible");
			return true;			
		}
		else {
			System.out.println("not eligible");
			return false;
		}
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		int pts = Integer.parseInt(points);
		if(pts>80)
			return true;
		else
			return false;
	}

	@Override
	public boolean basicEligibilityCheck(User user) {
		if(checkUser(user))
			return true;
		else
			return false;
	}
	
}
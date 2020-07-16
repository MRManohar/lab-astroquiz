package utility;

import model.User;

interface EligibilityInterface {
	boolean checkUser (User user);
	boolean checkQuizAnswer (String points);
}
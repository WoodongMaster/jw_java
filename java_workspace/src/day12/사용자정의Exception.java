package day12;

public class 사용자정의Exception {

	public static void main(String[] args) {
	/*	passwordException
	 * 	- 비밀번호는 null일 수 없다
	 * 	- 비밀번호의 길이는 5자 이상
	 * 	- 문자+숫자나 특수문자 포함.
	 */
		PasswordTest test = new PasswordTest();
		String password = "asd++++"; 
		try {
			test.setPassword(password);
			System.out.println(test.getPassword());
		}catch(PasswordException e){
			System.out.println(e.getMessage());
		}
	}

}

class PasswordTest{
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordException {
		if(password == null) {
			throw new PasswordException("비밀번호는 NULL일 수 없습니다.");
		}
		else if(password.length()<5) {
			throw new PasswordException("비밀번호는 5자 이상이어야 합니다");
		}
		else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("문자로만 이루어진 비밀번호는 설정할 수 없습니다.");
		}
		this.password = password;
	}
	
	
}
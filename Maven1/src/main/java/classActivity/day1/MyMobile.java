package classActivity.day1;

public class MyMobile {

	public static void main(String[] args) {
		Mobile mob = new Mobile();
		System.out.println("Year of mobile launch is " +mob.YearOfLaunch());
		mob.ModelName();
		System.out.println("Brand is currently active in market - " +mob.IsActive() );
		mob.MobColor();
		int year1 = mob.year+1;
		System.out.println("Next model launch is on " +year1);
	}

}

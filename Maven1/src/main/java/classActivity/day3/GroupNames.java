package classActivity.day3;

public class GroupNames {

	public static void main(String[] args) {
		String [] team = {"Oliver","Barry","Kara","John","Cisco","Iris","Caitlin","Thea","Mia","William"};
		for(int i=0;i<team.length;i++) {
			if(team[i].startsWith("S")) {
				System.out.println(team[i]);
			}
			else if(team[i].endsWith("a")) {
				System.out.println((team[i]));
			}
		}

	}

}

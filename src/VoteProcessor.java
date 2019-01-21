import java.util.ArrayList;

public class VoteProcessor {
	//String Edward = null;
	//String Pope = null;
	int Pope = 0;
	int Edward = 0;
	public String calculateElectionWinner(ArrayList<String> votes) {
		for(int i = 0; i < votes.size(); i++) {
			if(votes.get(i).contains("p") || votes.get(0).contains("P")) {
				Pope++;
			}
			else if(votes.get(i).contains("w") || votes.get(i).contains("W")) {
				Edward++;
			}
		}
		if(Pope > Edward) {
			return "pope francis";	
		}
		else if(Edward > Pope) {
			return "edward Snowden";
		}
		else {
			return "TIE";
		}
	}

	

}

import twitter4j.Trends;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class DialogueTwitter {

	private Twitter twitter = new TwitterFactory().getInstance();

	// Permet de nous identifier � notre compte Twitter d�veloppeur pour avoir acc�s aux donn�es de Twitter 
	public void identification() {
		twitter.setOAuthConsumer("hoCmn6JJf1O0G8OrrfEhgNSVd",
				"XqRPkpG1fEJMBllBYt63YjdygEAFbt8DC3ZWCpAUzG9gVLXB1j");
		twitter.setOAuthAccessToken(new AccessToken(
				"2867128532-IqEpOMHnSXipHDNvSWZsETgqLE87TrKRsHmWSAQ",
				"pqao9pf7RIZDzW2lgFk2Kvf8zDnCcTUhHbdVoq22YrIDz"));
	}

	// Permet de r�cup�rer et d'afficher les 10 Trends Topics
	public Trends recupTends(int position) {
		try {
			Trends trends = twitter.getPlaceTrends(position);
			for (int i = 0; i < trends.getTrends().length; i++) {
				System.out.println(trends.getTrends()[i].getName());
			}
			return trends;
		} catch (TwitterException e) {
			System.out.println("Erreur");
			return null;
		}	
	}
}

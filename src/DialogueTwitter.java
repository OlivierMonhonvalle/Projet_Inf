import twitter4j.Trends;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class DialogueTwitter {

	private Twitter twitter;
	private Trends trends;

	// Permet de nous identifier � notre compte Twitter d�veloppeur pour avoir
	// acc�s aux donn�es de Twitter
	public DialogueTwitter() {
		twitter = new TwitterFactory().getInstance();
		twitter.setOAuthConsumer("hoCmn6JJf1O0G8OrrfEhgNSVd",
				"XqRPkpG1fEJMBllBYt63YjdygEAFbt8DC3ZWCpAUzG9gVLXB1j");
		twitter.setOAuthAccessToken(new AccessToken(
				"2867128532-IqEpOMHnSXipHDNvSWZsETgqLE87TrKRsHmWSAQ",
				"pqao9pf7RIZDzW2lgFk2Kvf8zDnCcTUhHbdVoq22YrIDz"));
	}

	// Permet de r�cup�rer et d'afficher les 10 Trends Topics
	public void recupTends(int position) {
		try {
			trends = twitter.getPlaceTrends(position);
			for (int i = 0; i < trends.getTrends().length; i++) {
				System.out.println(trends.getTrends()[i].getName());
			}
		} catch (TwitterException e) {
			System.out.println("Erreur");
		}
	}

	public Trends getTrendsTopics() {
		return trends;
	}

}

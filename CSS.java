import java.util.Scanner; 

public class CSS {
	
	public static void main (String args[]) {
		// Main variables
		String logo = "___  __ _______ _______ ___ ______ ______ ___   __\n| |  || | |  || | |  || | | _____/ | |  | | |   ||\n| |  || | |  || | |  || | |     /  | |  | | |\\  ||\n| |__|| | |  || | |  || | |    /   | |  | | |\\\\ ||\n| |__|| | |  || | |____ | |   /    | |  | | | \\\\||\n| |  || | |  || | | \\\\  | |  /     | |  | | |  \\||\n| |  || | |  || | |  \\\\ | | /____  | |  | | |   \\|\n___  __ _______ ___   _ ___ _____  ______ ___   __\n\n\n                      ______ ____ ______  ____\n                           |   ||     ||    ||\n                      _____|   ||    _||    ||\n                      ||       ||     ||    ||\n                      ||____   __     __    __\n\n\n\n\n                AstraleK/ATTSSystem\n                \u00a9All rights reserved\n\n\n\n                Tapez 'START' puis Entrée";
		Scanner sc = new Scanner(System.in);
		int chap = 1;
		String temp;
		String name;
		int status[] = {0, 0, 0, 0, 0, 0, 0}; // choice boolean, humanity, relationship, network state, humanity display, relationship display, network state display
		String chap1 = "Vous regardez autour de vous.\nDes hommes… Non, pas des hommes. Vous regardez plus \nattentivement. Des robots. Des humanoïdes. Aucune\némotion sur leurs visages. Ils circulent, se croisent,\ns’arrêtent, repartent, leurs regards dans le vide, fixés devant\neux. Pas un bruit, personne ne se parle. Ce sont des\nSans-Voix comme votre communauté les appelle. Des\nhommes dépourvus d’humanité. Et vous, vous êtes en train de\ntraverser ce tableau singulier au pas de course. Quatre\nSans-Voix vous encerclent. Ce sont eux qui vous obligent à\nmarcher si vite. Vous regardez devant vous : votre course\nsemble vous mener devant un large bâtiment blanc\nrectangulaire, sans volumes, sans aspérité, juste un pavé,\nposé là, sans relief et sans vie, à l’image des quatre\nSans-Voix qui vous encerclent. Ce n’est pas la première fois\nque vous venez là. L’ombre du bâtiment vous engloutit. Les\nquatre Sans-Voix s’arrêtent une fois rentrés seulement. Vous\nen profitez pour reprendre votre souffle. Les quatre\nSans-Voix restent stoïques autour de vous. Même si les\nSans-Voix sont là, il ne semblent pas faire attention à vous.\nVous êtes alors confronté à un choix : 'FUIR' ou 'RESTER'";
		String chap2 = "Vous en profitez pour regarder autour de vous. Rien n’a\nchangé depuis que vous êtes venu la dernière fois. C’est\nune pièce blanche, vide, froide. Seule une porte, large\net lourde se tient devant vous. Sans prévenir, les\nSans-Voix se remettent en marche, vous poussant vers\nl’avant. Pourquoi si soudainement ? A quel signal\ninvisible répondent-ils ? Vous franchissez la grande\nporte et vous retrouvez, sans surprise, dans une\npetite pièce sombre. Au milieu de cette pièce sombre, un\npupitre. Devant ce pupitre, un mur. Sans réfléchir vous\nvous avancez et prenez place derrière le pupitre comme vous\nl’avez si souvent fait.\n3 min. Vous savez très bien pourquoi vous êtes là.\nRévolutionnaire, Sans-Puce depuis votre plus jeune âge,\nvous avez été surpris à placarder des affiches\n“anti-puces” sur les murs blancs immaculés de la\nville. A quoi bon puisque les Sans-Voix ne regardent\njamais plus loin que le bout de leur chaussures ?\n5 min. La Puce. Aujourd’hui celle-ci est implantée dès la\nnaissance aux nouveau nés, les privant de faire le choix de\nleur humanité. Vous avez toujours refusé de vous la faire\nimplanter. On vous qualifie donc de Sans-Puce. Vous\nêtes en marge de la société. Vous êtes même bannis\nde celle-ci. Votre maigre communauté survit dans les\ncoins reclus des villes.\n7 min. Les Sans-voix ignorent les Sans-puce... Sauf les\nchanteurs. A croire que les Sans-Voix n’ont vraiment pas\nde voix. Seulement les Sans-voix imposent un rythme de\nvie tellement intense aux Sans-puce chanteurs, que\nceux-ci ne survivent jamais plus de 18 mois. Par\nconséquent, vous n’êtes pas chanteur.\n9 min. Quelle va être votre sentence cette fois ? Vous n’avez\npas peur. Coller des affiches est beaucoup moins\ngrave que diffuser des messages sonores. ça, les\nSans-Voix détestent. Le dernier Sans-puce qui s’y est\nessayé est mort décapité dans les 5 secondes. Mieux\nvaut ne pas s’y risquer.\n10 min. Pas une seconde de plus, exactement comme toutes\nles dernières fois. C’est qu’ils sont consciencieux les\nSans-Voix. Un message est apparu devant vous, comme\nun hologramme.";
		
		// Main menu
		System.out.println(logo);
		temp = sc.next();
		clearScreen();
		chap = chapter(chap);
		
		// Name choice
		
		System.out.print("Comment vous appelez-vous ?>");
		name = sc.next();
		clearScreen();
		
		// Story block (just copy for each step)
		System.out.println("Soif...");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
		System.out.println("Faim...");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
		System.out.println("Mal aux jambes...");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
		System.out.println("Rythme effréné...");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
		System.out.println("Respiration douloureuse...");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
		status = storyBlock(chap1, "RESTER", "FUIR", 0, 0, 0, 0, 0, 0, status, chap, sc);
		if(status[0] == 2) {
			System.out.println("Vous n’avez pas le temps d’esquisser deux pas que le\nSans-Voix à votre gauche vous retient par le bras dans un\nmouvement mécanique d’une rapidité insoupçonnable.\nSans brusquerie mais non sans fermeté,\nvous vous retrouvez à votre place initiale. Toujours\nsans un mot ni un regard.\n");
		}
		status = storyBlock(chap2, "", "", 0, 0, 0, 0, 0, 0, status, chap, sc);
		clearScreen();
	}
	
	// Story block (just copy for each step)
	public static int[] storyBlock(String script, String choice1, String choice2, int humanity1, int relationship1, int networkStatus1, int humanity2, int relationship2, int networkStatus2 , int[] status, int chap, Scanner sc) {
		Scanner story = new Scanner (script);
		story.useDelimiter("\n");
		boolean loop = true;
		String input = "";
		String error = "";
		
		
		// Shows status bars ("Humanité", "Relation", "État du réseau");
		if(status[4] == 1) {
			System.out.print("                                                                     Humanité       [");
			for(int i = 0; i < 20; i++) {
				if(i < status[1]) {
					System.out.print("=");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("]");
		}
		if(status[5] == 1) {
			System.out.print("                                                                     Relation       [");
			for(int i = 0; i < 20; i++) {
				if(i < status[2]) {
					System.out.print("=");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("]");
		}
		if(status[6] == 1) {
			System.out.print("                                                                     État du réseau [");
			for(int i = 0; i < 20; i++) {
				if(i < status[3]) {
					System.out.print("=");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("]");
		}
		
		// Story loop (loop in case of wrong input)
		while(loop) {
			while(story.hasNext()){
				System.out.println(story.next());
				try{
					Thread.sleep(250);
				}catch(InterruptedException ex){
					Thread.currentThread().interrupt();
				}
			}
			System.out.println(error);
			input = sc.next();
			// Update status bars
			if(input.equals(choice1)) {
				loop = false;
				status[0] = 1;
				status[1] += humanity1;
				status[2] += relationship1;
				status[3] += networkStatus1;
				System.out.println();
			}else if(input.equals(choice2)) {
				loop = false;
				status[0] = 2;
				status[1] += humanity2;
				status[2] += relationship2;
				status[3] += networkStatus2;
				System.out.println();
			}else {
				error = "Votre réponse n'est pas recevable, réessayez";
			}
		}
		return status;
	}
	
	public static void clearScreen() {  
		for(int i = 0; i < 30; i++) {
			System.out.println();
		}
	}
	
	public static int chapter(int chap) {
		System.out.println();
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("                                             HORIZON 2171 : "+chap);
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		return chap++;
	}
}

import java.util.Scanner; 

public class CSS {
	
	public static void main (String args[]) {
		// Main variables
		String logo = "___  __ _______ _______ ___ ______ ______ ___   __\n| |  || | |  || | |  || | | _____/ | |  | | |   ||\n| |  || | |  || | |  || | |     /  | |  | | |\\  ||\n| |__|| | |  || | |  || | |    /   | |  | | |\\\\ ||\n| |__|| | |  || | |____ | |   /    | |  | | | \\\\||\n| |  || | |  || | | \\\\  | |  /     | |  | | |  \\||\n| |  || | |  || | |  \\\\ | | /____  | |  | | |   \\|\n___  __ _______ ___   _ ___ _____  ______ ___   __\n\n\n                      ______ ____ ______  ____\n                           |   ||     ||    ||\n                      _____|   ||    _||    ||\n                      ||       ||     ||    ||\n                      ||____   __     __    __\n\n\n\n\n                AstraleK/ATTSSystem\n                \u00a9All rights reserved\n\n\n\n                Tapez 'START' puis Entrée";
		Scanner sc = new Scanner(System.in);
		int chap = 1;
		String temp;
		String name;
		int status[] = {0, 0, 0, 20, 1, 1, 0, 1}; // choice boolean, humanity, relationship, network state, humanity display, relationship display, network state display, chapter
		String chap1 = "Vous regardez autour de vous.\nDes hommes… Non, pas des hommes. Vous regardez plus \nattentivement. Des robots. Des humanoïdes. Aucune\némotion sur leurs visages. Ils circulent, se croisent,\ns’arrêtent, repartent, leurs regards dans le vide, fixés devant\neux. Pas un bruit, personne ne se parle. Ce sont des\nSans-Voix comme votre communauté les appelle. Des\nhommes dépourvus d’humanité. Et vous, vous êtes en train de\ntraverser ce tableau singulier au pas de course. Quatre\nSans-Voix vous encerclent. Ce sont eux qui vous obligent à\nmarcher si vite. Vous regardez devant vous : votre course\nsemble vous mener devant un large bâtiment blanc\nrectangulaire, sans volumes, sans aspérité, juste un pavé,\nposé là, sans relief et sans vie, à l’image des quatre\nSans-Voix qui vous encerclent. Ce n’est pas la première fois\nque vous venez là. L’ombre du bâtiment vous engloutit. Les\nquatre Sans-Voix s’arrêtent une fois rentrés seulement. Vous\nen profitez pour reprendre votre souffle. Les quatre\nSans-Voix restent stoïques autour de vous. Même si les\nSans-Voix sont là, il ne semblent pas faire attention à vous.\nVous êtes alors confronté à un choix : 'FUIR' ou 'RESTER'";
		String chap1_choice = "Vous n’avez pas le temps d’esquisser deux pas que le\nSans-Voix à votre gauche vous retient par le bras dans un\nmouvement mécanique d’une rapidité insoupçonnable.\nSans brusquerie mais non sans fermeté,\nvous vous retrouvez à votre place initiale. Toujours\nsans un mot ni un regard.\n";
		String chap2_1 = "Vous en profitez pour regarder autour de vous. Rien n’a\nchangé depuis que vous êtes venu la dernière fois. C’est\nune pièce blanche, vide, froide. Seule une porte, large\net lourde se tient devant vous. Sans prévenir, les\nSans-Voix se remettent en marche, vous poussant vers\nl’avant. Pourquoi si soudainement ? A quel signal\ninvisible répondent-ils ? Vous franchissez la grande\nporte et vous retrouvez, sans surprise, dans une\npetite pièce sombre. Au milieu de cette pièce sombre, un\npupitre. Devant ce pupitre, un mur. Sans réfléchir vous\nvous avancez et prenez place derrière le pupitre comme vous\nl’avez si souvent fait.\n3 min. Vous savez très bien pourquoi vous êtes là.\nRévolutionnaire, Sans-Puce depuis votre plus jeune âge,\nvous avez été surpris à placarder des affiches\n“anti-puces” sur les murs blancs immaculés de la\nville. A quoi bon puisque les Sans-Voix ne regardent\njamais plus loin que le bout de leur chaussures ?\n5 min. La Puce. Aujourd’hui celle-ci est implantée dès la\nnaissance aux nouveau nés, les privant de faire le choix de\nleur humanité. Vous avez toujours refusé de vous la faire\nimplanter. On vous qualifie donc de Sans-Puce. Vous\nêtes en marge de la société. Vous êtes même bannis\nde celle-ci. Votre maigre communauté survit dans les\ncoins reclus des villes.\n \n7 min. Les Sans-voix ignorent les Sans-puce... Sauf les\nchanteurs. A croire que les Sans-Voix n’ont vraiment pas\nde voix. Seulement les Sans-voix imposent un rythme de\nvie tellement intense aux Sans-puce chanteurs, que\nceux-ci ne survivent jamais plus de 18 mois. Par\nconséquent, vous n’êtes pas chanteur.\n";
		String chap2_2 = "9 min. Quelle va être votre sentence cette fois ? Vous n’avez\npas peur. Coller des affiches est beaucoup moins\ngrave que diffuser des messages sonores. ça, les\nSans-Voix détestent. Le dernier Sans-Puce qui s’y est\nessayé est mort décapité dans les 5 secondes. Mieux\nvaut ne pas s’y risquer.\n10 min. Pas une seconde de plus, exactement comme toutes\nles dernières fois. C’est qu’ils sont consciencieux les\nSans-Voix. Un message est apparu devant vous, comme\nun hologramme.\n\"Sujet_ Sans-puce n°00168_\nInterpellé pour avoir collé des affiches de type \"anti-puces\" sur\n la voie publique_\nAu vue du nombre de récidives d’actes opposants (48 à ce\n jour_ le 25/05/2171) une consigne particulière va être\n appliquée_\nSanction_ Le sujet va être placé sous surveillance constante_\nMission effectuée par Puce n°008714577_\"\n.Instantanément, une gigantesque porte s'ouvrit dans votre\n dos. Vous étiez libre, en quelque sorte. Une simple\n surveillance, c’est qu’ils seraient à cours d’idée ! Peu importe,\n vous deviez maintenant rentrer. Les Sans-Voix vous\n laissèrent passer sans histoire, toujours sans une once\n d'émotion sur le visage. S'agissait-il seulement de \nvisages encore humain ? Perplexe, vous quittez le bâtiment.\n Sur la route de la CRAF vous êtes interrompu par \nl’appel  d’un ancien ami sans puces, vous aviez coupé \ncontact avec toutes vos connaissances depuis un moment \nmais vous hésitez :\n";
		String chap2_choice = "\"Salut ! J'ai su pour ton arrestation... Tu devrais arrêter tout\n ça...\" Cette remarque attendait sûrement une réponse mais\n vous ne faisiez qu’écouter sans bruit \"... Tu ne peux pas tout\nmettre sur le dos de ces puces, ta mère les avait créé\npour une bonne raison et tu le sais\" BIP, BIP, BIP, vous aviez\nraccroché, vous détestez que l’on évoque votre famille...";
		String chap3 = "Sur la route du retour vous vous sentez suivi. En un coup\n d'oeil, vous identifiez la présence d'une jeune femme. Une\n belle jeune femme. Parfaite en tout point. D’une beauté et\n d’une perfection qui met mal à l’aise. Exactement comme la\n majorité des femmes de votre époque. Elle regarde dans votre\n direction, et vous suit de loin. Pourtant, elle ne semble\n pas vous voir. Ses yeux sont vides. Une Sans-voix.\n La Puce n°008714577. Sa présence vous agace déjà. Elle ne\n va quand même pas vous suivre jusqu'à la porte des\n toilettes ? Vous pensez avec amertume qu'il est fort possible\n qu'elle n'ait jamais besoin d'aller aux toilettes elle-même. La\n technologie actuelle est capable de beaucoup de prouesses.\n Formidable. Vous tournez maintenant à gauche et empruntez\n une rue plus sombre. Elle reste sur vos pas. Vous\n voyez rouge. Vous décidez alors de :";
		String chap3_choice = "Elle va bien finir par se lasser. Vous accélérez le pas. A droite,\n gauche, encore à gauche. Toujours là. Ce n’est plus\n possible. Vous décidez de lui demander des explications.";
		String chap4 = "Vous faites volte-face et vous vous dirigez vers elle d’un pas\n décidé. Vous voulez mettre les choses au clair : vous n’avez\n pas besoin d’un petit chien qui vous suit partout. De toutes\n façons, ça fait bientôt 30 ans que les chiens ont disparu de\n cette planète, remplacés par des robots. Bien plus dociles et\n bien moins coûteux en nourriture organique. Elle se tenait\n toujours devant vous, son visage sans expression tourné dans\n votre direction. De quoi vous mettre encore plus en\n rogne. Vous vous décidez alors de la stratégie à suivre : ";
		String chap4_choice = "Cette partie n’ayant pas encore été écrite, nous vous\n demandons de ‘RESTER CALME’. Nous\n mettrons bientôt tout cela à jour pour la V2 !";
		String chap5_1 = "_La barre en haut à droite de l’écran est la barre ‘relation’. Celle-ci\n est susceptible d’évoluer selon vos décisions en jeu.\nVotre choix a eu une influence sur la relation que vous entretenez\n avec la Sans-Voix._\n\nVous décidez de respirer un bon coup pour vous calmer. Vous\n avez toujours pensé que l’agressivité ne réglait rien.\n Après tout, il y a avait bien un coeur derrière ce tas de chair\n génétiquement modifié. C’est la première fois que vous vous\n adressez directement à une Sans-Voix. Vous allez pouvoir\n vérifier l'existence de ce coeur par vous même. Vous vous\n adressez à elle d’une voix la plus posée possible. Commencer\n par être poli. Ils sont surement polis les\n Sans-Voix entre eux ?\n“Bonjour, j’ai vu que vous me suiviez, vous avez besoin de\n quelque chose ?”\nPas de réponse. Pas d’expression. Pas de mouvement.\n“Vous êtes la puce n°008751.. machin chose ? Celle qui est\n censée me surveiller ?”\nPas de réponse. Vous commencez à vous impatienter. Vous\n vous apprêter à vous énerver quand soudain, votre\n “interlocutrice” bat des paupières. Waw, on avance. Vous\n répétez votre question :\n“On vous a engagé pour me surveiller ?”\nMouvement imperceptible. Elle venait de hocher la tête. Cela\n vous parut tellement pas naturel que vous avez presque envie\n de rire. C’était comme si elle venait d’apprendre dans\n l’instant à comprendre le Français et à utiliser le\n langage corporel.\n “Et vous comptez me suivre jusqu’où comme ça ?”\nNouveau battement de paupière. Ses lèvres s'entrouvrent\n mais aucun son n’en sort. Est-ce qu’elle se moque de vous ?\n“Jusqu’à chez moi ?”\nNouveau hochement de tête. c'en était trop.\n";
		String chap5_2 = "“V-vous n’avez pas le droit !”\nBattement de paupière. \n“Je vous interdit de me suivre jusqu’à chez moi, je vous\n préviens, les Sans-Puce détestent les Sans-Voix tels que\n vous, ils vous tueront !”\nC’était faux. Pour la grande majorité, les Sans-Puce ne sont\n jamais sortis de la CRAF et ne connaissent pas le monde des\n Sans-Voix. Vous êtes l’un des seuls à vous battre contre\n la Puce. Et par crainte de représailles, ils n’oseraient\n pas aller jusqu’à la tuer. Vous la regardez avec\n dégoût et vous retournez.\nHors de vous, vous vous mettez à courir. Elle semble tellement\n amorphe et sans vie qu'elle ne pourra pas vous\n suivre. Enfin ça, c'est ce que vous pensiez. Au détour d'un\n carrefour, vous jetez un œil derrière vous : votre course\n semble être pour elle une promenade de santé. Que\n mange-t-elle le matin pour être dans une si grande forme ?\n Vous vous rappelez que si les Sans-voix n'ont pas besoin\n d'aller aux toilettes, ils n'ont certainement pas besoin de\n manger. Vous arrivez alors jusqu'à un croisement. Vous\n connaissez très bien cet endroit : à gauche, vous pouvez\n accéder aux souterrains de la CRAF, et rejoindre votre\n communauté des Sans-puce. À droite, vous retournez sur la\n Grande Avenue. Cette avenue est toujours pleine à craquer de\n Sans-voix. Vous choisissez : ";
		// Main menu
		System.out.println(logo);
		temp = sc.next();
		clearScreen();
		
		// Name choice
		
		System.out.print("Comment vous appelez-vous ?>");
		name = sc.next();
		clearScreen();
		
		// Story block 
		status = chapter(status);
		System.out.println("Soif...");
		pause(2000);
		System.out.println("Faim...");
		pause(2000);
		System.out.println("Mal aux jambes...");
		pause(2000);
		System.out.println("Rythme effréné...");
		pause(2000);
		System.out.println("Respiration douloureuse...");
		pause(2000);
		status = storyBlock(chap1, "RESTER", "FUIR", 0, 0, 0, 0, 0, 0, status, sc);
		status = chapter(status);
		if(status[0] == 2) {
			noChoiceStory(chap1_choice, sc);
		}
		noChoiceStory(chap2_1, sc);
		storyBlock(chap2_2, "REPONDRE", "IGNORER", 0, 0, 0, 0, 0, 0, status, sc);
		status = chapter(status);
		if(status[0] == 1) {
			noChoiceStory(chap2_choice, sc);
		}
		storyBlock(chap3, "CONTINUER", "RENCONTRE", 0, 0, 0, 0, 0, 0, status, sc);
		status = chapter(status);
		if(status[0] == 1) {
			noChoiceStory(chap3_choice, sc);
		}
		storyBlock(chap4, "AGGRESSIF", "CALME", 0, 0, 0, 0, 2, 0, status, sc);
		status = chapter(status);
		if(status[0] == 1) {
			noChoiceStory(chap4_choice, sc);
		}
		status[1] =+ 2;
		noChoiceStory(chap5_1, sc);
		storyBlock(chap5_2, "DROITE", "GAUCHE", 0, 0, 0, 0, 2, 0, status, sc);
	}
	
	
	
	
	
	
	// No choice story function
	public static void noChoiceStory(String script, Scanner sc) {
		Scanner story = new Scanner (script);
		story.useDelimiter("\n");
		while(story.hasNext()){
			System.out.println(story.next());
			pause(250);
		}
		next(sc);
	}
	
	// Story function (just copy for each step)
	public static int[] storyBlock(String script, String choice1, String choice2, int humanity1, int relationship1, int networkStatus1, int humanity2, int relationship2, int networkStatus2 , int[] status, Scanner sc) {
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
				pause(150);
			}
			System.out.println(error);
			System.out.print(choice1+" ou "+choice2+">");
			input = sc.next();
			// Update status bars
			if(input.equals(choice1)) {
				loop = false;
				status[0] = 1;
				status[1] += humanity1;
				status[2] += relationship1;
				status[3] -= networkStatus1;
				System.out.println();
			}else if(input.equals(choice2)) {
				loop = false;
				status[0] = 2;
				status[1] += humanity2;
				status[2] += relationship2;
				status[3] -= networkStatus2;
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
	
	public static void pause(int ms) {
		try
		{
			Thread.sleep(ms);
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	public static void next(Scanner sc) {
		System.out.println("\n Tapez \"s\" puis Entrée pour lire la suite");
		sc.next();
	}
	
	public static int[] chapter(int[] status) {
		System.out.println();
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("                                             HORIZON 2171 : "+status[7]);
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		
		status[7] ++;
		
		return status;
	}
}

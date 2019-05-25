import java.util.Scanner; 

public class CSS {
	
	public static void main (String args[]) {
		// Main variables
		Scanner sc = new Scanner(System.in);
		int status[] = {0, 0, 0, 0};
		String chap1 = "Soif...\nFaim...\nMal au jambes...\nRythme effrene...\nRespiration douloureuse…\nVous regardez autour de vous.\nDes hommes... Non, pas des hommes. Vous regardez plus attentivement. Des robots. Des humanoïdes.\n Aucune émotion sur leurs visages. Ils circulent, se croisent, s’arrêtent, repartent, leurs regards dans le vide,\n fixés devant eux. Pas un bruit, personne ne se parle. Ce sont des Sans-Voix comme votre communauté les appelle.\n Des hommes dépourvus d’humanité. Et vous, vous êtes en train de traverser ce tableau singulier au pas de course.\n Quatre Sans-Voix vous encerclent. Ce sont eux qui vous obligent à marcher si vite. Vous regardez devant vous :\n votre course semble vous mener devant un large bâtiment blanc rectangulaire, sans volumes, sans aspérité, juste un pavé,\n posé là, sans relief et sans vie, à l’image des quatre Sans-Voix qui vous encercle. Ce n’est pas la première fois que vous venez là.\n L’ombre du bâtiment vous engloutit. Les quatre Sans-Voix s’arrêtent une fois rentrés seulement. Vous en profitez pour reprendre votre souffle.\n Les 4 Sans-Voix restent stoïques autour de vous. Même si les Sans-Voix sont là, il ne semblent pas faire attention à vous. Vous êtes alors confronté à un choix :";
		String chap2 = "Vous en profitez pour regarder autour de vous. Rien n’a changé depuis que vous êtes venu la dernière fois. C’est une pièce blanche, vide, froide. Seule une porte, large et lourde se tient devant vous. Sans prévenir, les Sans-voix se remettent en marche, vous poussant vers l’avant. Pourquoi si soudainement ? A quel signal invisible répondent-ils ? Vous franchissez la grande porte et vous retrouvez, sans surprise, dans une petite pièce sombre. Au milieu de cette pièce sombre, un pupitre. Devant ce pupitre, un mur. Sans réfléchir vous vous avancez et prenez place derrière le pupitre comme vous l’avez si souvent fait.\n3 min. Vous savez très bien pourquoi vous êtes là. Révolutionnaire, Sans-puce depuis votre plus jeune âge, vous avez été surpris à placarder des affiches 'anti-puces' sur les murs blancs immaculés de la ville. A quoi bon puisque les Sans-voix ne regardent jamais plus loin que le bout de leur chaussures ?\n5 min. La Puce. Aujourd’hui celle-ci est implantée dès la naissance aux nouveau nés, les privant de faire le choix de leur humanité. Vous avez toujours refusé de vous la faire implanter. On vous qualifie donc de Sans-puce. Vous êtes en marge de la société. Vous êtes même bannis de celle-ci. Votre maigre communauté survit dans les coins reclus des villes. \n7 min. Les Sans-voix ignorent les Sans-puce... Sauf les chanteurs. A croire que les Sans-voix n’ont vraiment pas de voix. Seulement les Sans-voix imposent un rythme de vie tellement intense aux Sans-puce chanteurs, que ceux-ci ne survivent jamais plus de 18 mois. Par conséquent, vous n’êtes pas chanteur.\n9 min. Quelle va être votre sentence cette fois ? Vous n’avez pas peur. Coller des affiches est beaucoup moins grave que diffuser des messages sonores. ça, les Sans-voix détestent. Le dernier Sans-puce qui s’y est essayé est mort décapité dans les 5 secondes. Mieux vaut ne pas s’y risquer.\n10 min. Pas une seconde de plus, exactement comme toutes les dernières fois. C’est qu’ils sont consciencieux les Sans-voix. Un message est apparu devant vous, comme un hologramme.\n“Sujet_ Sans-puce n°0168_\nInterpellé pour avoir collé des affiches de type 'anti-puces' sur la voie publique_\nAu vue du nombre de récidives d’actes opposants (48 à ce jour_ le 25/05/2171) une consigne particulière va être appliquée_\nSanction_ Le sujet va être placé sous surveillance constante_\nMission effectuée par Puce n°008714577_";
		
		// Story block (just copy for each step)
		status = storyBlock(chap1, "RESTER", "FUIR", 0, 0, 0, 0, 0, 0, status, sc);
		if(status[0] == 2) {
			System.out.println("Vous n’avez pas le temps d’esquisser deux pas que le Sans-voix à votre gauche vous retient par le bras\n dans un mouvement mécanique d’une rapidité insoupçonnable. Sans brusquerie\n mais non sans fermeté, vous vous retrouvez à votre place initiale. Toujours sans un mot ni un regard.");
		}
		status = storyBlock(chap2, "", "", 0, 0, 0, 0, 0, 0, status, sc);
	}
	
	// Story block (just copy for each step)
	public static int[] storyBlock(String script, String choice1, String choice2, int humanity1, int relationship1, int networkStatus1, int humanity2, int relationship2, int networkStatus2 , int[] status, Scanner sc) {
		boolean loop = true;
		String input = "";
		String error = "";
		
		// Shows status bars ("Humanité", "Relation", "État du réseau");
		System.out.print("Humanite       [");
		for(int i = 0; i < 20; i++) {
			if(i < status[1]) {
				System.out.print("=");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println("]");
		System.out.print("Relation       [");
		for(int i = 0; i < 20; i++) {
			if(i < status[2]) {
				System.out.print("=");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println("]");
		System.out.print("Etat du reseau [");
		for(int i = 0; i < 20; i++) {
			if(i < status[3]) {
				System.out.print("=");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println("]");
		
		// Story loop (loop in case of wrong input)
		while(loop) {
			System.out.println(script);
			System.out.println("\n"+error);
			input = sc.next();
			if(input.equals(choice1)) {
				loop = false;
				status[0] = 1;
				status[1] += humanity1;
				status[2] += relationship1;
				status[3] += networkStatus1;
			}else if(input.equals(choice2)) {
				loop = false;
				status[0] = 2;
				status[1] += humanity2;
				status[2] += relationship2;
				status[3] += networkStatus2;
			}else {
				error = "Votre reponse n'est pas recevable, reessayez";
			}
		}
		return status;
	}
}


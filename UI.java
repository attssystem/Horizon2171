import java.awt.*;
import java.awt.event.*;
import java.awt.Robot;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 

public class UI extends JFrame{
	boolean waiter = true;
	boolean endParagraph = false;
	boolean firstChar = true;
	boolean weapon;
	String choice1;
	String choice2;
	String temp;
	String name = "";
	String nameW = "";
	int status[] = {0, 0, 0, 0, 1, 1, 1, 1}; // choice boolean, humanity, relationship, network state, humanity display, relationship display, network state display, chapter
	String userContent;
	
	public UI(){
		// Basic conf
		super("Horizon2171");
		setSize(1000, 600);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(80, 80, 80));
		setLayout(null);
		setBounds(0, 0, 1000, 600);
		
		// Font conf
		Font font = new Font("CALIBRI", Font.BOLD, 22);
		Font cfont = new Font("CALIBRI", Font.PLAIN, 16);
		
		// Title panel
		JLabel logo = new JLabel("                                                                            --- HORIZON2171 : "+status[7]+" ---");
		logo.setBounds(0, 0, 1000, 20);
		logo.setOpaque(true);
		logo.setFont(font);
		logo.setBackground(new Color(80, 80, 80));
		logo.setForeground(Color.black);
		add(logo);
		JLabel rel = new JLabel("Relation");
		rel.setBounds(0, 20, 333, 80);
		rel.setOpaque(true);
		rel.setBackground(new Color(220, 220, 220));
		rel.setFont(cfont);
		add(rel);
		JLabel hum = new JLabel("Humanité");
		hum.setBounds(333, 20, 333, 80);
		hum.setOpaque(true);
		hum.setBackground(new Color(205, 205, 205));
		hum.setFont(cfont);
		add(hum);
		JLabel sta = new JLabel("État du réseau");
		sta.setBounds(666, 20, 333, 80);
		sta.setOpaque(true);
		sta.setBackground(new Color(190, 190, 190));
		sta.setFont(cfont);
		add(sta);
		
		// Game panel
		JLabel content = new JLabel("");
		content.setBounds(10, 100, 1000, 430);
		content.setOpaque(true);
		content.setBackground(new Color(80, 80, 80));
		content.setFont(cfont);
		content.setForeground(new Color(20, 20, 20));
		add(content);
		JTextField input = new JTextField("Votre choix");
		input.setBounds(0, 531, 994, 40);
		input.setBackground(new Color(50, 50, 50));
		input.setForeground(new Color(250, 250, 250));
		input.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				logo.setText("                                                                            --- HORIZON2171 : "+status[7]+" ---");
				if(firstChar){
					input.setText("");
					firstChar = false;
				}
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					waiter = false;
					userContent = input.getText();
					System.out.println(userContent);
					input.setText(choice1+" ou "+choice2);
					firstChar = true;
					System.out.println("TOTO");
				}else if(e.getKeyCode() == KeyEvent.VK_TAB && endParagraph == true){
					endParagraph = false;
				}
			}
			public void keyTyped(KeyEvent e){}
			public void keyReleased(KeyEvent e){}
		});
		add(input);
		input.requestFocus();
		
		// Setting icon
		setIconImage(new ImageIcon("./icon.png").getImage());
		
		// Game
			
			// Main menu
			//content.setText(logotext);
			//listen(waiter, content);
			
			// Tutorial
		
			splitString("Bienvenue dans Horizon2171, vous incarnez un habitant de la Cité Résistante de l'Ancienne France et aurez à faire des choix pour avancer dans votre aventure ! Pour ce faire, à chaque fin de chapitre il vous sera demandé de faire un choix, veuillez à ce moment taper votre choix (en respectant les majuscules) puis confirmez avec Entrée. Bonne chance dans votre aventure !\n Hugues KADI (Programmeur et un peu auteur) &\nCamille MARTIN (Auteure et un peu programmeuse)\nMais d'abord, comment vous appelez-vous ?>", endParagraph, content);
			name = listen();
			
			String chap1 = "Soif...<br>Faim...<br>Mal aux jambes...<br>Respiration douloureuse...<br>Vous regardez autour de vous.Des hommes… Non, pas des hommes. Vous regardez plus attentivement. Des robots. Des humanoïdes. Aucuneémotion sur leurs visages. Ils circulent, se croisent,s'arrêtent, repartent, leurs regards dans le vide, fixés devant eux. Pas un bruit, personne ne se parle. Ce sont des Sans-Voix comme votre communauté les appelle. Des hommes dépourvus d'humanité. Et vous, vous etes en train de traverser ce tableau singulier au pas de course. Quatre Sans-Voix vous encerclent. Ce sont eux qui vous obligent à marcher si vite. Vous regardez devant vous : votre course semble vous mener devant un large bâtiment blanc rectangulaire, sans volumes, sans aspérité, juste un pavé,posé là, sans relief et sans vie, à l'image des quatre Sans-Voix qui vous encerclent. Ce n'est pas la première fois que vous venez là. L'ombre du bâtiment vous engloutit. Les quatre Sans-Voix s'arrêtent une fois rentrés seulement. Vous en profitez pour reprendre votre souffle. Les quatre Sans-Voix restent stoïques autour de vous. Même si les Sans-Voix sont là, il ne semblent pas faire attention à vous.Vous etes alors confronté à un choix : 'FUIR' ou 'RESTER'";
			String chap1_choice = "Vous n'avez pas le temps d'esquisser deux pas que le Sans-Voix à votre gauche vous retient par le bras dans un mouvement mécanique d'une rapidité insoupçonnable.Sans brusquerie mais non sans fermeté,vous vous retrouvez à votre place initiale. Toujours sans un mot ni un regard.";
			String chap2 = "Vous en profitez pour regarder autour de vous. Rien n'a changé depuis que vous etes venu la dernière fois. C'est une pièce blanche, vide, froide. Seule une porte, large et lourde se tient devant vous. Sans prévenir, lesSans-Voix se remettent en marche, vous poussant versl'avant. Pourquoi si soudainement ? A quel signalinvisible répondent-ils ? Vous franchissez la grandeporte et vous retrouvez, sans surprise, dans unepetite pièce sombre. Au milieu de cette pièce sombre, unpupitre. Devant ce pupitre, un mur. Sans réfléchir vousvous avancez et prenez place derrière le pupitre comme vousl'avez si souvent fait.3 min. Vous savez très bien pourquoi vous etes là.Révolutionnaire, Sans-Puce depuis votre plus jeune âge,vous avez été surpris à placarder des affiches\"anti-puces\" sur les murs blancs immaculés de laville. A quoi bon puisque les Sans-Voix ne regardentjamais plus loin que le bout de leur chaussures ?5 min. La Puce. Aujourd'hui celle-ci est implantée dès lanaissance aux nouveau nés, les privant de faire le choix deleur humanité. Vous avez toujours refusé de vous la faireimplanter. On vous qualifie donc de Sans-Puce. Vousetes en marge de la société. Vous etes même bannisde celle-ci. Votre maigre communauté survit dans lescoins reclus des villes. 7 min. Les Sans-voix ignorent les Sans-puce... Sauf leschanteurs. A croire que les Sans-Voix n'ont vraiment pasde voix. Seulement les Sans-voix imposent un rythme devie tellement intense aux Sans-puce chanteurs, queceux-ci ne survivent jamais plus de 18 mois. Parconséquent, vous n'etes pas chanteur.\n9 min. Quelle va être votre sentence cette fois ? Vous n'avezpas peur. Coller des affiches est beaucoup moinsgrave que diffuser des messages sonores. ça, lesSans-Voix détestent. Le dernier Sans-Puce qui s'y estessayé est mort décapité dans les 5 secondes. Mieuxvaut ne pas s'y risquer.10 min. Pas une seconde de plus, exactement comme toutesles dernières fois. C'est qu'ils sont consciencieux lesSans-Voix. Un message est apparu devant vous, commeun hologramme.\"Sujet_ Sans-puce n°00168_Interpellé pour avoir collé des affiches de type \"anti-puces\" sur la voie publique_Au vue du nombre de récidives d'actes opposants (48 à ce jour_ le 25/05/2171) une consigne particulière va être appliquée_Sanction_ Le sujet va être placé sous surveillance constante_Mission effectuée par Puce n°008714577_\".Instantanément, une gigantesque porte s'ouvrit dans votre dos. Vous étiez libre, en quelque sorte. Une simple surveillance, c'est qu'ils seraient à cours d'idée ! Peu importe, vous deviez maintenant rentrer. Les Sans-Voix vous laissèrent passer sans histoire, toujours sans une once d'émotion sur le visage. S'agissait-il seulement de visages encore humain ? Perplexe, vous quittez le bâtiment. Sur la route de la CRAF vous etes interrompu par l'appel  d'un ancien ami sans puces, vous aviez coupé contact avec toutes vos connaissances depuis un moment mais vous hésitez :";
			String chap2_choice = "\"Salut ! J'ai su pour ton arrestation... Tu devrais arrêter tout ça...\" Cette remarque attendait sûrement une réponse mais vous ne faisiez qu'écouter sans bruit \"... Tu ne peux pas toutmettre sur le dos de ces puces, ta mère les avait créépour une bonne raison et tu le sais\" BIP, BIP, BIP, vous aviezraccroché, vous détestez que l'on évoque votre famille...";
			String chap3 = "Sur la route du retour vous vous sentez suivi. En un coup d'oeil, vous identifiez la présence d'une jeune femme. Une belle jeune femme. Parfaite en tout point. D'une beauté et d'une perfection qui met mal à l'aise. Exactement comme la majorité des femmes de votre époque. Elle regarde dans votre direction, et vous suit de loin. Pourtant, elle ne semble pas vous voir. Ses yeux sont vides. Une Sans-voix. La Puce n°008714577. Sa présence vous agace déjà. Elle ne va quand même pas vous suivre jusqu'à la porte des toilettes ? Vous pensez avec amertume qu'il est fort possible qu'elle n'ait jamais besoin d'aller aux toilettes elle-même. La technologie actuelle est capable de beaucoup de prouesses. Formidable. Vous tournez maintenant à gauche et empruntez une rue plus sombre. Elle reste sur vos pas. Vous voyez rouge. Vous décidez alors de :";
			String chap3_choice = "Elle va bien finir par se lasser. Vous accélérez le pas. A droite, gauche, encore à gauche. Toujours là. Ce n'est plus possible. Vous décidez de lui demander des explications.";
			String chap4 = "Vous faites volte-face et vous vous dirigez vers elle d'un pas décidé. Vous voulez mettre les choses au clair : vous n'avez pas besoin d'un petit chien qui vous suit partout. De toutes façons, ça fait bientôt 30 ans que les chiens ont disparu de cette planète, remplacés par des robots. Bien plus dociles et bien moins coûteux en nourriture organique. Elle se tenait toujours devant vous, son visage sans expression tourné dans votre direction. De quoi vous mettre encore plus en rogne. Vous vous décidez alors de la stratégie à suivre : ";
			String chap4_choice = "Cette partie n'ayant pas encore été écrite, nous vous demandons de ‘RESTER CALME'. Nous mettrons bientôt tout cela à jour pour la V2 !";
			String chap5 = "_Votre choix a eu une influence sur votre relation_\nVous décidez de respirer un bon coup pour vous calmer. Vous avez toujours pensé que l'agressivité ne réglait rien. Après tout, il y a avait bien un coeur derrière ce tas de chair génétiquement modifié. C'est la première fois que vous vous adressez directement à une Sans-Voix. Vous allez pouvoir vérifier l'existence de ce coeur par vous même. Vous vous adressez à elle d'une voix la plus posée possible. Commencer par être poli. Ils sont surement polis les Sans-Voix entre eux ?\"Bonjour, j'ai vu que vous me suiviez, vous avez besoin de quelque chose ?\"Pas de réponse. Pas d'expression. Pas de mouvement.\"Vous etes la puce n°008751.. machin chose ? Celle qui est censée me surveiller ?\"Pas de réponse. Vous commencez à vous impatienter. Vous vous apprêter à vous énerver quand soudain, votre \"interlocutrice\" bat des paupières. Waw, on avance. Vous répétez votre question :\"On vous a engagé pour me surveiller ?\"Mouvement imperceptible. Elle venait de hocher la tête. Cela vous parut tellement pas naturel que vous avez presque envie de rire. C'était comme si elle venait d'apprendre dans l'instant à comprendre le Français et à utiliser le langage corporel. \"Et vous comptez me suivre jusqu'où comme ça ?\"Nouveau battement de paupière. Ses lèvres s'entrouvrent mais aucun son n'en sort. Est-ce qu'elle se moque de vous ?\"Jusqu'à chez moi ?\"Nouveau hochement de tête. c'en était trop.\n\"V-vous n'avez pas le droit !\"Battement de paupière. \"Je vous interdit de me suivre jusqu'à chez moi, je vous préviens, les Sans-Puce détestent les Sans-Voix tels que vous, ils vous tueront !\"C'était faux. Pour la grande majorité, les Sans-Puce ne sont jamais sortis de la CRAF et ne connaissent pas le monde des Sans-Voix. Vous etes l'un des seuls à vous battre contre la Puce. Et par crainte de représailles, ils n'oseraient pas aller jusqu'à la tuer. Vous la regardez avec dégoût et vous retournez.Hors de vous, vous vous mettez à courir. Elle semble tellement amorphe et sans vie qu'elle ne pourra pas vous suivre. Enfin ça, c'est ce que vous pensiez. Au détour d'un carrefour, vous jetez un œil derrière vous : votre course semble être pour elle une promenade de santé. Que mange-t-elle le matin pour être dans une si grande forme ? Vous vous rappelez que si les Sans-voix n'ont pas besoin d'aller aux toilettes, ils n'ont certainement pas besoin de manger. Vous arrivez alors jusqu'à un croisement. Vous connaissez très bien cet endroit : à gauche, vous pouvez accéder aux souterrains de la CRAF, et rejoindre votre communauté des Sans-puce. À droite, vous retournez sur la Grande Avenue. Cette avenue est toujours pleine à craquer de Sans-voix. Vous choisissez : ";
			String chap5_choice1 = "Vous pensez que si vous ne pouvez pas semer la Sans-puce juste en courant, vous le pourrez dans une rue noire de monde. Vous débouchez sur la Grande Avenue. Comme prédit, des centaines de Sans-voix se croisent et se recroisent dans toutes les directions. Cependant, quiconque aurait fermé les yeux n'aurait pu se douter de cette foule. On entendait à peine la rumeur des pas des Sans-voix. En un bond, vous vous confondez à cette marche funeste. À l'inverse, vos pas résonnent dans la rue. Vous faites un effort pour faire moins de bruit et éviter les Sans-voix. Personne ne fait attention à vous, tous regardent le bout de leurs chaussures. Comment réussissent-t-il à ne pas se percuter ? Après bien 10 min de course, vous empruntez une petite rue sombre. Sombre dans le sens où elle est moins lumineuse que la Grande Avenue, puisqu'ici, tous les murs sont blancs, sans âme. Vous regardez enfin derrière vous : personne, vous etes satisfait. Vous ralentissez l'allure, à bout de souffle. Fatigué, vous décidez alors de reprendre le chemin de la CRAF. Vous allez peut-être pouvoir pisser tranquille ce soir finalement. Sur le chemin, vous ne rencontrez que très peu de Sans-Voix. Pourtant, quelque chose vous met mal à l'aise. Vous croisez plusieurs fois leurs yeux vides. Eux aussi semblent vous regarder sans voir. D'habitude pourtant, tous se contentent de fixer devant eux. Vous accélérez le pas. Vous etes presque arrivé. Plus que quatre rues à traverser. Trois. Deux. Soudain, vision d'horreur. Devant vous, elle était là, le regard pointé sur vous comme si elle avait toujours su où vous étiez. Lassez, vous choisissez de l'ignorer";
			String chap5_choice2 = "Vous choisissez de vous diriger vers chez vous. Elle va bien finir par vous lâcher ?! Vous l'espérez sincèrement. Vous courrez le plus vite que vous pouvez. Soudain vous distinguez un renfoncement dans le mur à l'angle de la rue. Cela pourrait peut-être vous permettre de vous échapper car de toute évidence, la course ne la fatigue pas le moins du monde. Vous décidez de : ";
			String chap5_choice2_choice1 = "Vous vous glissez dans le trou. Vous ne l'entendez pas passer devant vous. Vous attendez donc plusieurs dizaines de minutes accroupi dans votre cachette. Lorsqu'enfin vous vous décidez à sortir, vos muscles sont engourdis. Fatigué, vous décidez alors de reprendre le chemin de la CRAF. Vous allez peut-être pouvoir pisser tranquille ce soir finalement. Sur le chemin, vous ne rencontrez que très peu de Sans-voix. Pourtant, quelque chose vous met mal à l'aise. Vous croisez plusieurs fois leurs yeux vides. Eux aussi semblent vous regarder sans voir. D'habitude pourtant, tous se contentent de fixer devant eux. Vous accélérez le pas. Vous etes presque arrivé. Plus que quatre rues à traverser. Trois. Deux. Soudain, vision d'horreur. Devant vous, elle était là, le regard pointé sur vous comme si elle avait toujours su où vous étiez. Lassé, vous décidez de l'ignorer.";
			String chap6 = "Vous vous résignez. De toute évidence, elle a la possibilité de connaître votre position. Comment a-t-elle réussi à vous retrouver ? Et s'il y un traceur sur vous, une sorte de puce ? A la simple évocation de cette idée, vous vous sentez sali. Vous prenez le temps de vérifier que rien de tel n'est en contact avec vous. Vous ne détectez rien d'anormal. Vous reprenez alors le chemin jusqu'à chez vous. Qu'elle vous suive jusqu'à la porte des toilettes si c'est que le gouvernement souhaite ! Vous passez à côté d'elle sans un regard, et sans surprise vous la sentez sur vos talons. Vous chercherez un moyen de vous débarrasser d'elle plus tard. Quelques centaines de mètres plus loin, comme à votre habitude, vous vous glissez dans la maigre espace laissé entre deux bâtiments (toujours aussi blancs). Plus loin, vous débouchez sur une petite cour dont personne n'aurait soupçonné l'existence. Le soleil déclinant, il fait actuellement très sombre dans ce puit formé par les quatre murs blancs des bâtisses alentours. Au milieu de cette cour, un trou. Dans ce trou, une échelle. Il était temps de rejoindre le vieux Paris, celui qui existait avant que la montée des eaux obligent l'Homme à surélever ses villes, la CRAF comme vous l'appelez aujourd'hui. Maintenant, il s'agit du refuge des Sans-Puce, les rejetés de la société de votre genre. Vous descendez à l'échelle sans un regard en arrière. Une fois en bas, vous regardez autour de vous. Vous ne distinguez que l'obscurité ambiante. Il ne faisait déjà pas bien lumineux en haut, ici, il fait très sombre. A mesure que vos yeux s'habituent à l'obscurité, vous parvenez à distinguer les quelques maigres lampadaires constamment allumés qui clignotent ici et là, rendant une atmosphère digne d'un mauvais film d'horreur du 21ème siècle. L'odeur d'humidité et de renfermé qui vous enveloppe n'arrange rien à la scène. Il ne faut pas tarder ici. Il serait malvenu que quelqu'un vous surprenne en compagnie d'une Sans-Voix. Certains pourraient penser que vous avez l'intention de vous faire implanter la Puce. D'autres, qu'elle vient ici pour espionner. Dans tous les cas, on vous chasserez, et vos n'auriez nul part où aller. Vous pouvez alors choisir de faire un détour pour contourner les zones les plus fréquentées afin d'éviter de croiser du monde. Mais vous etes fatigué. Votre appartement est à seulement quelques rues d'ici, et il n'y a pas grand monde à cette heure là. Vous choisissez alors :";
			String chap6_choice = "Vous décidez d'être prudent. Vous prenez même la peine de vous adresser à la Sans-voix pour lui dire de ne pas faire de bruit. La bonne blague. Vous vous contentez de son seul battement de paupière en guise de réponse. Vous déambulez silencieusement dans les petites rues accidentées. Avant il y avait des pavés ici. Aujourd'hui, il ne reste qu'un amas de gravas sombres. Sous terre, tout contraste avec l'extérieur. Lumière, obscurité; Blanc, sombre; Lisse, désordonné; Propre, sale. Après quelques minutes de marche sans encombre, vous pénétrez dans le vieil immeuble. Chaque jour vous vous demandez comment il peut encore tenir debout. La porte grince derrière vous, s'arrête, puis se remet à grincer ; témoin de la présence de la Sans-voix derrière vous. Vous montez avec difficulté les quatre étages qui vous séparent de votre appartement. A chaque palier, vous vérifiez que personne ne pourrait vous voir. Arrivé sur le quatrième palier. La voie est libre. Vous sortez la clé de votre poche. C'est une clé comme on faisait au tout début du 21ème siècle. Dans les bâtiments les plus récents de la CRAF (des années 2070), on peut trouver des capteurs d'empreintes digitales et même des dispositifs de reconnaissance faciale et vocale. Aujourd'hui, ce sont des antiquités. Les Sans-voix n'utilisent plus ce genre de vieilles technologies. Vous vous demandez souvent comment est-ce qu'ils gèrent la sécurité de nos jours. Vous n'en avez pas la moindre idée. Comme beaucoup d'autres choses, cela reste pour vous un mystère. Vous ouvrez la porte. La Sans-voix s'est rapprochée de vous, comme pour s'assurer que vous ne la laisserez pas sur le palier. Vous n'avez plus la force de lutter. Elle s'apprête à rentrer dans votre appartement, quand soudain une voix criarde résonne dans le bâtiment :\"Monsieur, vous n'avez pas payé vo…\" Brusquement, vous agrippez le bras de la Sans-voix et la poussez vers l'intérieur. \"Qu'est-ce que vou… Qui est-ce ?\" Sa voix était maintenant teintée d'inquiétude. Vous claquez la porte derrière vous. Tout cela s'annonce mal… ";
			String chap7 = "23:46. Fatigue, mauvaise humeur. Au terme de votre étroit couloir sombre, vous débouchez sur votre petite pièce à vivre. Sur le chemin vous percutez une des nombreuses bouteilles de bière éparpillées sur le sol. Aucune importance. Vous vous avachissez sur le canapé. Vous avez juste le temps d'apercevoir le regard sans vie de la Sans-voix, debout dans un coin de la pièce, avant de fermer les yeux. Engourdissement. Noir. Vide.3:14. Cauchemar. Votre seul souhait est que tout ceci, tout ce que vous avez vécu la veille ne soit qu'un horrible cauchemar. Les affiches, le pavé rectangulaire, le pupitre, la sanction, la… Sans-voix… Vous ouvrez précipitamment les yeux. Obscurité, humidité, odeur de bière. Vous etes toujours avachi sur le canapé de votre salon. En un regard vous savez que ce n'était pas l'invention de votre esprit. Vous savez que vous n'avez pas fait de cauchemar. La Sans-Voix se tient toujours là, dans l'obscurité du coin de votre pièce. Imperturbable. Le regard implacablement pointé sur vous. Elle n'avait pas bougé depuis hier soir. ça commençait vraiment à devenir flippant. Vous vous frottez les yeux. Mal au crâne. Vous réfléchissez. Vous avez besoin de comprendre. Quel intérêt à le gouvernement à vous coller une Sans-Voix aux basques ? Pourtant,vous n'arrivez pas à lui en vouloir personnellement. Inexplicable.\"Ne restez pas planté là…\"Pas de réaction. Vous etes irrité par sa constante nonchalance. \"Asseyez-vous, prenez une chaise !!\". Vous ne distinguez pas son visage dans l'obscurité mais vous pouvez deviner son habituel battement de paupières. Lentement, très lentement, la Sans-Voix traverse la pièce avec une habilité hors norme compte tenu du nombre de bouteilles éparpillées sur le sol. Elle s'assoit sur l'unique chaise du salon.\"Et arrêtez de me regarder comme ça !!\" Encore un battement de paupière. A votre grand étonnement, elle baisse les yeux. Vous vous sentez tout à coup plus libre. Vous avez soif. Vous vous levez et allez chercher une bière dans le frigo de la petite cuisine. Une idée vous traverse l'esprit :";
			String chap7_choice = "Vous revenez dans le salon avec une bière dans chaque main. Vous vous dirigez vers la Sans-Voix et lui tendez l'une d'entre elles. \"Tenez, prenez une bière\"\n_Votre choix a eu une influence sur votre relation_\nLa Sans-Voix lève la tête vers vous. Celle-ci est toujours aussi aussi inexpressive. Elle esquisse un \"non\" de la tête. Bien tenté.";
			String chap8 = "Vous retournez sur le canapé et buvez votre bière silencieusement.\n4:05. L'ambiance est lourde. Vous souhaitez en savoir plus. Vous tentez donc d'engager la conversation.\n\"Et donc, on vous a engagé pour me surveiller 24h/24.\"\nVous échangez juste un regard. Elle est toujours assise sur la chaise, vous sur le canapé.\n\"Vous etes de la police, ou un truc comme ça ?\"\nPas de réponse. Elle commençait vraiment à vous taper sur le système. Vous commencez à vous énerver. Votre esprit est embrouillé par la bière et par la fatigue. \n\"C'est le gouvernement qui vous empêche de me répondre ??\" Pas de réponse. Visage inexpressif. Vous vous levez :\n\"MAIS PARLEZ-MOI !! PARLEZ MERDE !\"\nLa Sans-Voix s'était levée également. Son visage n'avait pas changé d'expression, mais elle semblait s'apercevoir de la tension qui s'était emparée de vous. Ses yeux s'ouvrent, elle ouvre la bouche. Mais seul un son rauque en sort. Comme un râle, comme… Comme si elle avait une sérieuse extinction de voix. Une horrible idée s'impose alors à vous. Sans-Voix. Sans voix. Ses deux mots prenaient alors tous leurs sens. Vous pensiez jusqu'à présent qu'il s'agissait d'une référence sarcastique à l'aversion des Sans-Voix au bruit, au contact humain, à la parole. Horreur. Tristesse. Pitié. Colère. C'est encore pire que tout ce que vous avez imaginé. Depuis votre petite enfance vous reprochez au régime d'avoir déshumanisé l'Homme. De l'avoir rendu machine, en le voulant toujours plus performant, productif et docile.\nOui aujourd'hui, les Hommes n'ont presque plus (si ce n'est plus du tout) de contraintes avec leur corps, leurs besoins naturels. Les Hommes ont dépassé les animaux. Oui, les Hommes paraissent de plus en plus inexpressifs, insensibles. Oui les Hommes ont perdu leur individualité, leur gestion, leur liberté. Mais tout ceci est allé encore plus loin… Vous avez la preuve devant vous que nous étions arrivés au stade où l'on a même ôté à l'Homme l'une de ses premières caractéristiques, ce qui l'a toujours différencié des animaux et êtres vivants, ce qui a fait de lui ce qu'il est, son origine, son fondement… La parole. Et si la parole a disparu… Alors c'est tout un pan de l'être humain qui s'écroule. Son humanité. Vous avez devant vous… Un être humain sans voix. Et au-dessus de votre tête, là-haut, ce sont des milliers, des millions, des milliards d'êtres humains qui ont perdu l'usage de la parole. Et maintenant que vous en avez la preuve. Oui. C'est vrai. Vous n'avez jamais entendu parler un Sans-voix. Jamais. La Puce… Cette foutue puce a tellement bousillé le cerveau humain que celui-ci ne sait plus parler. Plus personne ne se parle. Plus personne ne se regarde. L'Homme est devenu un numéro, un cerveau, une machine, un objet du gouvernement. Même pas, un objet du Réseau. Mais comment en est-on arrivé là ?! Vous etes soudain pris de vertiges. Des larmes vous bloquent la vue.\n« Tu… Tu ne sais pas parler !! »\n4:30. Vous vous asseyez, et essayez de vous calmer. Boire… Vous avez envie de boire pour tout oublier. Après avoir écoulé quatre bières d'affilé, vous vous endormez.\n\n-------------------------------------------------------\n\nVous etes dans la petite salle noire accoudé à votre pupitre. Vous avez l'habitude d'être ici, cela fait 49 fois. 49 fois qu'on vous sanctionne pour mauvaises actions ‘anti-Puce'. Pourtant cette fois, c'est différent. Vous le sentez au plus profond de vous. Quelque chose cloche. Déjà parce que cela fait 11 minutes 36 secondes que vous etes ici. D'habitude, il faut 10 minutes et pas une seconde de plus. Vous vous impatientez. Vous voyez trouble, vos mains sont floues. Tout à coup, vous sursautez. De violents coups sont portés à la porte derrière vous. « BANG ! » « BANG ! » Vous etes tétanisé. Que se passe-t-il ? « BANG ! » « BANG ! ». Vous ne parvenez pas à bouger. « BANG ! » Vos muscles répondent à nouveau. Vous vous retournez et vous dirigez vers la porte.\nCe n'est pas la même porte blindée que d'habitude, celle-ci a une poignée. « BANG ! » Vous actionnez la poignée. Ce que vous voyez vous glace d'effroi. Maman… Elle vous fixe d'un regard vide. Vous avez beaucoup de mal à soutenir son regard. Ses lèvres ont disparus. Un bout de peau aussi lisse que ses joues occupent leur place. Elle ne peut pas vous parler… Tout à coup, un cri strident. Un cri ? Vous ouvrez les yeux en sursaut.\n9:04. Vous etes trempé de sueur. Vous prenez quelques secondes avant de réaliser que vous etes sur le canapé de votre salon. Deuxième cri. Vous vous levez d'un bond. Ce cri provient de votre porte d'entrée. Vous traversez le couloir au pas de course. Vous ne marchez pas droit, l'alcool agit toujours dans votre sang. Vous poussez la porte et découvrez la scène. Dans un coin, elle, la Sans-Voix. Toujours aussi inexpressive du visage, vous arrivez néanmoins à deviner une tension dans sa posture. De l'autre côté… L'Office. La police de la CRAF. Cinq officiers. Extrêmement violents de façon générale. Avec les officiers, la concierge de l'immeuble. C'est elle qui devait être à l'origine des cris. Elle paraissait terrifiée, les yeux exorbités en direction de la Sans-Voix. Vous avez fait du bruit en déboulant ainsi sur le palier. En quelques secondes, tout le monde a identifié que vous étiez là, et tous vous regardent avec une méfiance et un certain mépris. Vous vous tenez toujours sur le pas de la porte, à moitié débraillé, les yeux rouge et le souffle court. Un des officiers s'avance vers vous. Son visage vous est familier. Il a un nez aquilin et un menton carré. Ses traits de visages sont durs, ses yeux marqués. Vous avez déjà eu affaire à lui. En effet, si vous etes persécuté là-haut, vous n'etes pas mieux accueilli ici. Les Sans-Puces veulent à tout prix éviter d'avoir affaire aux Sans-Voix. Or vous avez pour habitude de chercher des noises aux Sans-Voix. Par conséquent, on ne vous aime pas. C'est une des raisons pour lesquels vous habitez dans cet immeuble miteux.\n\"Mais qui voilà ? [nom du joueur] pour changer !\" vous dit-il d'une voix sarcastique et malveillante. \"Ramener une Sans-Voix ici, tu ne tiens vraiment pas à la vie toi !\" Vous prenez ses menaces très au sérieux. Vous comprenez que vos jours ici sont comptés. Très vite, vous devez décider de la marche à suivre. Vous pouvez choisir de vous défendre coute que coute, quitte à ce qu'ils s'en prennent directement à la Sans-Voix, ou préférer raconter la vérité. Vous pouvez choisir :";
			String chap8_choice = "Cette partie n'ayant pas encore été écrite, nous vous ‘RACONTEZ LA VERITE''. Nous mettrons bientôt tout cela à jour pour la V2 !";
			String chap9 = "Vous tentez de garder votre calme et d'expliquer objectivement la situation.\n \"J'ai été surpris ce matin à poser des affiches sur la Grande Avenue. Les Sans-Voix m'ont imposé une surveillance constante. C'est pour cela qu'elle est là\" Vous désignez la Sans-Voix, immobile à votre gauche, le visage tourné vers vous. \"Elle est inoffensive\" \n_Votre parole a eu une influence sur votre relation_\n\"Mais bien sûr… Écoute attentivement, ce n'est pas à nous de payer pour tes conneries, tu vas donc la prendre avec toi et ne plus jamais remettre les pieds ici.\"\n \"Vous ne pouvez pas me chasser.\" Les vertiges reviennent. Vous n'avez nul part où aller. \n\"On va se gêner tiens !\" dit un autre officier. \nVous restez immobile devant la porte, le regard dans le vide. Vous ne voulez pas partir. \n\"Allez, dégage de là !\" s'exclame un officier.\nVous n'avez pas le choix. Vous n'avez aucune chance face aux cinq officiers. Vous etes maigre et frêle, alors qu'eux sont musculeux et robustes. Il vaut mieux éviter d'en venir aux mains, encore.\n\"Je peux aller chercher quelques affaires ?\"\n\"Fais vite. Nous te laissons 10 min.\" vous dit l'un d'eux. Que c'est aimable. Mécaniquement vous vous rediriger vers l'appartement. Presque inconscient de vos gestes, vous jetez vos affaires dans un gros sac. Quelques vêtements, quelques bières, et puis un cadre photo. Sur ce cadre, votre mère, votre père, votre soeur et vous. Vous n'avez jamais pu vous résoudre à vous en débarrasser. Dans le tiroir qui contenait le cadre, un couteau, un flingue. Vous avez la soudaine idée de prendre l'un des deux avec vous pour vous défendre en cas de besoin. Lequel choisissez vous ?";
			String chap10 = "Vous le glissez dans la large poche intérieur de votre manteau.\n Vous n'avez pas beaucoup de biens. Vous laissez le reste derrière vous. Vous entendez de l'agitation sur le palier. Vous sortez en hâte de l'appartement. Quatorze ans que vous vivez ici, seul. Retour sur le palier. Nez aquilin, dont la teinte a viré au rouge se tient face au mur, plaquant à la gorge la Sans-Voix au mur. Cette fois, vous apercevez vaguement le sentiment de peur dans les yeux de la Sans-Voix. Que souhaitez vous faire ?";
			String chap10_choice1 = "\"Ne la touchez pas !!\"\n_Votre choix a eu une influence sur votre relation_\nSurpris, l'officier se retire. \"Depuis quand défends-tu les Sans-Voix toi ?\" Vous ne prenez même pas la peine de lui répondre. Vous-même vous vous demandez ce qu'il vous prend.\n \"Cette connasse se moque de moi !! Elle refuse de me parler !\" s'énerve l'officier.\n\"Normal, elle ne sait pas parler.\"\nSans un mot de plus, vous vous dirigez vers la cage d'escalier, devant le regard brûlant des 5 officiers et de la concierge. Vous pensez que vous allez vous en sortir quand le nez aquilin vous interrompt : \"Hé, tu dois aussi payer tes deux factures en retard !\"\n \"Je n'ai pas d'argent\"\nA ce moment là, tout se passe très vite. Les cinq officiers s'avancent vers vous, les poings serrés devant eux. Vous vous prenez plusieurs coups dans le ventre, les côtes. Les coups s'enchaînent, vous voyez de plus en plus troubles. Vous n'essayez même pas de vous défendre, juste de vous protéger au mieux. Coup de pied dans le ventre, vous etes à terre. Vous poussez un hurlement. Des larmes coulent sur vos joues.\nSoudain, tout s'arrête. Vous ne voyez plus grand chose, mais vous avez l'impression que c'est la Sans-Voix qui est venue à votre secours. Avec souplesse, presque gracieusement, elle envoie au tapis les cinq officiers les uns après les autres avec des mouvements qui s'apparentent à des prises de judo, parfaitement exécutées. Pourquoi ne s'était-elle pas défendue tout à l'heure ?";
			String chap10_choice2 = "De la peur, non ? Ces yeux étaient redevenus vide et c'était maintenant l'officier qui tremblait. La Sans-Voix se raidit, serrant les poings et sans crier garde elle met au tapis l'officier. Rapidement, les quatres autres officiers accoururent et vous décidez finalement de vous interposer. Pourquoi ?\n _Votre choix a eu une influence sur votre relation_\nVous ne firent pas long feu, rapidement vous vous retrouviez  également au tapis, vous aviez abandonné, ce n'était pas votre première bagarre avec des officiers… et vous aviez l'habitude de vous retrouver à terre, en sang, les mains sur votre visage. Mais soudainement plus rien, on ne vous assénait plus de coup mais vous entendiez toujours du bruit. Vous rouvrez vos yeux. Avec souplesse, presque gracieusement, la Sans-Voix était en train d'envoyer au tapis les cinq officiers les uns après les autres avec des mouvements qui s'apparentent à des prises de judo, parfaitement exécutées. Pourquoi ne s'était-elle pas défendue tout à l'heure ?";
			String chap11_1 = "Vous vous relevez difficilement, très difficilement… Vous n'y arrivez pas….\nAaaaargh!..!!...\nLa Sans-Voix vous avait relevé. Elle vous avait presque arraché le bras, mais elle vous avait relevé. Vous cherchez un regard de soutien. Mais non, toujours rien. Pourquoi vous avait-elle relevé ?\n_Votre choix a eu une influence sur votre relation_\nC'était peut-être son boulot de vous maintenir en vie, après tout, à quoi bon vous surveiller si vous étiez mort ? Mouais, vous aviez déjà eu de meilleurs raisonnements !... \nVous jetez un oeil aux corps des officiers qui gisaient plus loin. Ils avaient l'air bien amochés mais mieux valait ne pas trop traîner ici. En vous tournant vers la Sans-Voix, quelque chose vous dérange. Elle se tenait légèrement penchée comme si elle s'était arrêtée en plein milieu d'un pas. Étrange ! Pendant une seconde, les yeux de la Sans-Voix s'étaient comme éteints. Enfin, encore plus que d'habitude!...\n __________________________________________________\nRapport automatique\nPuce n°008714577\n\nCible n°0168 en cours de surveillance. Cible peu intégrée à sa société. Semble tourmenté. Aucun objectif clair.\n\nFin du rapport\n__________________________________________________\n\nPeu importe, maintenant à la rue vous ne saviez pas vraiment quoi faire. Errant, ou plutôt errants, vous décidez de réessayer d'entamer une discussion. Mais tout d'abord, il faudrait lui demander son prénom ! Maintenant elle n'était plus vraiment une inconnue, après tout elle vous suivait depuis un moment déjà et puis elle vous avait défendu.\n Vous sortez de l'immeuble et rejoignez la rue, toujours plongée dans l'obscurité.\n\"Alors… Euh…\"\nHmmmm, dur d'entamer la conversation hein…\n\"Merci !\"\nAaaaaah ! Elle avait ouvert plus grand les yeux ! ou pas ? Peut-être que vous surinterprétiez… Dans le doute, vous continuez\n\"Tu sais, si tu comptes me suivre comme ça pour le reste dans ma vie…\"\nEn le disant vous vous rendez compte de l'absurdité de vos propos, en même temps l'idée ne paraissait pas si déplaisante. Vous vous sentez seul depuis un moment et finalement vous vous étiez vite habitué à sa présence.\n\"Euuuh toute ma vie… Peut-être pas non plus mais…'fin on verra… Roh je me perds… Je voulais te demander, comment tu t'appelles ?\"\nVous vous sentez idiot. Elle ne sait PAS parler, à quoi ça sert de s'acharner ?\n‘Je-n-ai-pas-de-prénom'\nVous vous écartez d'un bond. Est-ce que vous avez bien entendu ? Vous fixez la Sans-Voix en écarquillant les yeux, incapable de prononcer un mot. Est-ce que cette voix métallique que vous venez d'entendre était la sienne ? Ou est-ce que votre imagination vous joue des tours ? Vous voulez en être sur.\n\"Q-Qu'est-ce… Est ce que c'est toi qui as parlé ???!\"\n‘Déclenchement-du-haut-parleur-depuis-la-base-de-donnée-#0002666897453'\nVous n'arrivez pas à y croire. Ses lèvres ne bougeaient pas, mais le son émanait bel et bien d'elle. Bêtement, vous ne trouvez rien d'autre à dire que :\n\"Et donc tu n'as pas de prénom ??\"\n‘Non-je-n-ai-pas-de-prénom'\nA ce stade, plus rien ne vous étonne. Oui, les Sans-Voix sont bel et bien devenus rien de plus que des numéros aux yeux de la société. De votre côté, vous en avez assez de l'appeler \"Sans-Voix\". \n\"Alors je vais t'en donner un\". Cette conversation sonne irréaliste à vos oreilles. Pourtant, vous vous concentrez pour lui trouver un prénom. ";	
			// Story block
			choice1 = "RESTER";
			choice2 = "FUIR";
			status = storyBlock(chap1, 0, 0, 0, 0, 0, 0, status, content, endParagraph);
			choice1 = "REPONDRE";
			choice2 = "IGNORER";
			status[7] ++;
			if(status[0] == 2) {
				splitString(chap1_choice, endParagraph, content);
			}
			storyBlock(chap2, 0, 0, 0, 0, 0, 0, status, content, endParagraph);
			choice1 = "CONTINUER";
			choice2 = "RENCONTRE";
			status[7] ++;
			if(status[0] == 1) {
				splitString(chap2_choice, endParagraph, content);
			}
			storyBlock(chap3, 0, 0, 0, 0, 0, 0, status, content, endParagraph);
			choice1 = "AGGRESSIF";
			choice2 = "CALME";
			status[7] ++;
			if(status[0] == 1) {
				splitString(chap3_choice, endParagraph, content);
			}
			storyBlock(chap4, 0, 0, 0, 0, 2, 0, status, content, endParagraph);
			choice1 = "DROITE";
			choice2 = "GAUCHE";
			status[7] ++;
			if(status[0] == 1) {
				splitString(chap4_choice, endParagraph, content);
			}
			status[1] =+ 2;
			storyBlock(chap5, 0, 0, 0, 0, 0, 0, status, content, endParagraph);
			choice1 = "SE_CACHER";
			choice2 = "COURIR";
			if(status[0] == 1) {
				splitString(chap5_choice1, endParagraph, content);
			}else{
				storyBlock(chap5_choice2, 0, 0, 0, 0, 0, 0, status, content, endParagraph);
				if(status[0] == 1) {
					splitString(chap5_choice2_choice1, endParagraph, content);
				}else{
					splitString(chap5_choice1, endParagraph, content);
				}
			}
			status[7] ++;
			choice1 = "DETOUR";
			choice2 = "DIRECT";
			storyBlock(chap6, 0, 0, 0, 0, 0, 0, status, content, endParagraph);
			choice1 = "PRENDRE_UNE_BIERE";
			choice2 = "DEUX_BIERES";
			if(status[0] == 1) {
				splitString(chap6_choice, endParagraph, content);
			}
			status[7] ++;
			storyBlock(chap7, 0, 0, 0, 0, 0, 0, status, content, endParagraph);
			choice1 = "SE_DEFENDRE";
			choice2 = " ETRE_HONNETE";
			if(status[0] == 1) {
				splitString(chap7_choice, endParagraph, content);
			}
			status[7] ++;
			storyBlock(chap8, 0, 0, 0, 0, 0, 0, status, content, endParagraph);
			choice1 = "COUTEAU";
			choice2 = "FLINGUE";
			if(status[0] == 1) {
				splitString(chap8_choice, endParagraph, content);
			}
			status[7] ++;
			storyBlock(chap9, 0, 0, 0, 0, 0, 0, status, content, endParagraph);
			choice1 = "S_INTERPOSER";
			choice2 = "NE_RIEN_DIRE";
			if(status[0] == 1) {
				weapon = true;
			}else{
				weapon = false;
			}
			status[7] ++;
			storyBlock(chap10, 0, 0, 0, 0, 0, 0, status, content, endParagraph);
			if(status[0] == 1) {
				splitString(chap10_choice1, endParagraph, content);
			}else{
				splitString(chap10_choice2, endParagraph, content);
			}
			status[7] ++;
			splitString(chap11_1, endParagraph, content);
			System.out.print("Comment voulez-vous l'appeler ?>");
			nameW = listen();
			// Create strings now to add the names
			String chap11_2 = "Oui, celui-là sera parfait. Vous l'appellerez désormais : \n"+nameW+", ça te plait ?\"\nMoment de pause.\n‘Je-ne-sais-pas-si-ça-me-plait'\nVous haussez les épaules.\n\"Moi je trouve que ça te va bien.\"\nAvoir une conversation aussi légère après tout ce qu'il s'était passé vous faisez du bien. Vous arrivez à l'échelle. Mais soudain, vous vous arrêtez. Retour à la réalité.\n\"Je… Je n'ai nul part où aller… Je suis à la rue.\"\n‘Chez-moi' Et elle se dirigea vers l'échelle. Vous lui emboîtez le pas. C'était la première fois qu'elle prenait les devants. Ainsi, une fois revenu à la surface, vous la suivez jusqu'à un immeuble blanc et rectangulaire, semblable à tous les autres bâtiments de la ville. Toutes les portes vitrées s'ouvraient sur son passage et se refermaient derrière vous. Comme commandées à distance. Enfin, vous arrivez devant un petite porte blanche, semblable à toutes les petites portes blanches qui succédaient de chaque coté. Aucun nom, aucun numéro, aucune sonnette, aucune étiquette. Aucun signe distinctif permettant de savoir que "+nameW+" habitait ici. De la même manière que toute les autres portes rangées derrière. Pourtant, elle semblait exactement savoir que c'était cette porte, et l'ouvrit sans même avoir besoin de clé.";
			String draft = "nda : Malheureusement et malgré tous nos efforts, nous ne sommes pas parvenus à finir cette histoire pour la date de rendu. Nous allons donc effectuer un saut dans le temps afin de révéler la conclusion. Quelques informations importantes auront été résumée ci-après. Nous continuerons ce projet durant les vacances d'été, et nous serons alors très heureux de vous faire parvenir la V2 afin que vous puissiez apprécier le jeu terminé. Aussi, nous n'avons pas eu le temps de développer le système de choix comme nous l'aurions voulu. Les choix précédents permettaient de vous donner une idée du projet, mais tout ceci sera également amélioré dans le version future. Bonne fin de lecture.\n\nPar la suite, "+name+" et "+nameW+" vont petit à petit faire connaissance. Ils vont énormément apprendre l'un de l'autre. De son côté, "+name+" va sortir de son alcoolisme, faire du tri dans ses objectifs de vie, apaiser ses démons et décider de se battre contre le Réseau de manière organisée et raisonnée. "+nameW+" va l'accompagner dans sa tâche. En effet, celle-ci va se montrer de plus en plus en éveil au fur et à mesure qu'il côtoie "+name+", semble éprouver de plus en plus de sentiments humains, et finit par se retourner également contre le système. Dans sa quête d'humanité, "+name+" va lui être d'une grande aide : Un exemple frappant sera le moment où "+name+" sera amené à parler de l'histoire de sa famille à "+nameW+". \nLa mère de "+name+" était l'une des conceptrice de la nouvelle génération de Puce actuellement en service. Elle travaillait sur la possibilité d'une immunité globale et parfaite apportée par la Puce. Mais son travail était exclusivement motivé par son histoire personnelle : sauver sa fille aînée, prénommée Ophélie (soeur de "+name+") atteinte d'une tumeur cérébrale inopérable. Celle-ci va donc être la toute première à se faire implanter cette Puce. Mais c'était prématuré. La Puce n'étant pas encore tout à fait aboutie, Ophélie va petit à petit sombrer dans un état de folie avant de décéder à cause de l'action excessive et destructrice de la Puce sur son organisme. Quelque jours après la mort de sa soeur, le petit "+name+" de 5 ans apprend le suicide de sa mère. \nNotamment à l'écoute de cette histoire, "+nameW+" va apprendre petit à petit la tristesse, jusqu'à développer le sentiment d'empathie, ce qui va l'amener à comprendre qu'il vaut parfois mieux mentir par omission pour protéger les gens qu'on aime. \nNous reprenons notre récit lorsque nos deux protagonistes ont découvert un moyen de stopper le Réseau. Ils sont tous les deux nourris du désir d'un monde de nouveau Humain. ";
			String chap12 = "Le bâtiment s'étendait à perte de vue, dans toute sa verticalité, la cime perdue dans les nuages. Le temps était orageux, comme fougueux, sauvage, en adéquation avec votre ressenti actuel. Vous en etes sûr, vous allez réussir. Là-haut se trouve la clé pour mettre fin à tout ça, pour que l'Homme redevienne humain ; la société, humanité. Vous regardez "+nameW+" dans les yeux. Vous avez fait du chemin depuis la toute première fois où vous l'avez rencontrée, dans cette sombre allée blanche. Vous avez petit à petit appris à communiquer, à vous connaître, à vous apprendre, à vous apprécier et maintenant… à vous aimer. Pourtant quelque chose reste coincé en elle. Oui, vous pouvez à présent apprécier le grain de sa peau, ses cheveux en bataille, ses lèvres gercées, l'éclat de ses yeux vert, et tous ces petits défauts qui sont finalement la qualité la plus précieuse de l'être humain. Mais si vous cherchez bien, il reste quelque chose de flou, d'obscure dans cet éclat. Un démon invisible, invincible.  Plus pour longtemps. Vous lui en avait fait la promesse. Vous allez détruire cette Puce, et tout ce qu'elle a engendré. Il faudrait sans doute du temps pour que le contact et les sentiments renaissent au sein de cette société meurtrie. Mais ça reviendra, vous en etes certain. "+nameW+" en est la preuve.\n"+nameW+" soupire à côté de vous. Vous lui prenez la main. Ça va aller. De l'autre, vous lui tendez le [COUTEAU ou FLINGUE]. Elle savait bien mieux le manier que vous, même si vous pensez ne pas en avoir besoin. Vous pénétrez ensemble à l'intérieur du bâtiment. Vous vous sentez comme dans un mauvais film d'action pour adolescent, très en vogue au 21ème siècle : Sauver le monde et mettre fin à la tyrannie. Ce genre de film finit toujours bien de façon générale. Plus qu'à réitérer le scénario.\nSans surprise, il n'y a personne à l'intérieur. Il se trouve effet que les Sans-Voix n'utilisent aucun moyen de sécurité. Pas la peine, puisque tout individu est contrôlé depuis la Puce. Quant aux Sans-Puce, il leur est impossible de passer les lourdes portes blindées dont seuls les Sans-Voix possèdent la capacité d'ouverture, justement grâce à leur Puce. Le système est bien huilé. Pourtant il y a une faille. Et l'objet de cette faille vous tient la main à ce moment même. L'entraide entre un Sans-Voix et un Sans-Puce, deux êtres que tout oppose en apparence. Ou presque. Car il y a un Sans-Puce en chacun des Sans-Voix. Il suffit juste de le réveiller.\nEn récupérant une partie de son individualité, de son humanité, "+nameW+" est maintenant capable de s'extraire du contrôle de la Puce et donc par extension de la surveillance du Réseau, mais garde toutes les capacités qu'elle lui procure. Dans ce cas là il s'agit d'ouvrir une porte, mais cela va bien au delà de ça. Au fur et à mesure de votre périple, vous avez appris plusieurs choses au sujet de la Puce. D'abord, que les Sans-Voix communiquent exclusivement par elle, sur le réseau. Cela explique pourquoi le contact humain, le dialogue a disparu. Les Sans-Voix reçoivent en permanence un flot de données qu'ils doivent réceptionner, traiter et communiquer. Plus de place pour le contact, plus besoin de dialogue direct. Chaque puce est interconnectée avec les autres sur le Réseau. Cela implique une deuxième chose, c'est toute la banque de données qui leur est accessible en continu. L'ancien \"internet\" du 21ème siècle qui était disponible sur les ordinateur est maintenant directement intégrée dans la Puce. Celle-ci étant reliée au cerveau de l'être humain, il a directement accès à des milliards de milliards de ressources. Cela explique notamment les nombreux moments d'absence que vous avez noté chez [N S-V], ainsi que sa prodigieuse capacité d'apprentissage et d'adaptation. Mais vous savez que tout cela n'est pas sans danger pour elle. Parfois, vous la sentez partir et vous savez alors que la Puce reprend le contrôle. Le Réseau est tellement développé, qu'il fait régulièrement des mises à jour. Ces deux derniers jours, elle fut prise à trois reprises d'une insoutenable douleur. La Puce lutte contre sa déviance. Elle essaye de l'éliminer. [N S-v] a pu reprendre le dessus, mais les crises sont de plus en plus violentes. Il faut agir vite. \nVous vous dirigez d'un pas décidé vers l'ascenseur. \nVous arrivez sans encombre au dernier étage du bâtiment. Vous n'avez jamais vu une chose pareille. Des milliers, des millions de câbles sous vos pieds, sous une épaisse couche de verre. Tous ces étages. Tout ce bâtiment. Il ne s'agit que d'un amas de fils électriques, de serveurs et de micro centrales à fusion nucléaire. Partout règne une épaisse couche de poussière. Personne ne semble être repassé par ici depuis sa mise en service. Le Réseau s'auto-suffit à lui même, s'auto-gère, et est capable de faire gérer la société à lui tout seul. Le gouvernement n'existe pas. Le gouvernement, c'est le Réseau. Vous vous dirigez vers ce qui ressemble à un tableau de bord. Sur ce tableau de bord, un gigantesque bouton rouge surmonté d'un écriteau ‘STOP'. Tout cela vous parait tellement facile. Tellement simple, même pour un mauvais film d'action… \nDans un état second, vous prenez la main de "+nameW+"\n\"Ensemble…\"\nLe bouton est enfoncé. Rien ne se passe. Les nombreux voyants de toutes les couleurs clignotent toujours au dessous de vos pieds. Et soudain, tout s'écroule dans votre esprit. Comment avez-vous pu croire que ce serait si facile ? Comment avez vous pu croire qu'un Réseau aussi développé dans le monde entier pouvait être désactivé par un simple bouton ? Perdu face à votre propre échec, vous ne remarquez pas que "+nameW+" n'est pas dans son état normal à côté, jusqu'à qu'elle vous attrape violemment le bras. Retour à la réalité. Ses beaux yeux vert sont à présent recouvert d'un voile noir. Elle se convulse, prise de violents spasmes comme si elle se battait contre quelque chose d'invisible. En fait, c'est tout à fait ça. Vous savez qu'elle lutte. Elle lutte contre la Puce, contre le Réseau. Contre ce qu'on essaye de lui imposer. Vous restez impuissant devant ce sordide spectacle, les sourcils froncés. Pourquoi maintenant ? Y-a-t-il un lien avec le bouton rouge ? Non, bien sur que non, pourquoi y-en aurait-il un ? \n‘Message-envoyé-depuis-le-Laboratoire-#00786223'\nCette voix métallique émanait depuis "+nameW+". Comme d'habitude quand elle parle, ses lèvres ne bougent pas. Pourtant, vous savez que cette fois, cette voix n'est pas sienne. \n‘Message adressé-à-Puce-n°-008714577-et-Sans-Puce-n°00168'\nVous etes pris de nausées. Ce \"Laboratoire\" est en train de se servir de "+nameW+" pour communiquer leur message. Comme un haut-parleur. Un vulgaire objet numéroté.\n‘Les-sujets-ont-été-les-objets-d-une-expérimentation-depuis-21/05/2171.\nObjets-de-l-expérimentation.\nTester-la-relation-Puce-Sans-Puce.\nRécolter-des-données-pour-contrôler-et-prévenir-la-DÉVIANCE-chez-les-Puces.\nRécolter-des-données-pour-contrôler-et-prévenir-les-RÉVOLTES-chez-les-Sans-Puces.\nRésultat-de-l-expérimentation.\nSuccès.\nLes-sujets-sont-parvenus-au-bouton-rouge.\n108029-données-récoltés-sur-la-Puce-n°-00871477.\n007798-données-récoltées-sur-le-Sans-Puce-n°00168.'\nPause. Abasourdi. Depuis le début, vous n'etes que des rats de laboratoire. Vous n'avez pas le temps de réfléchir plus.\n‘Suite-de-l'opération.\nLe-Sans-Puce-est-libre. La-Puce-va-être-réinitialisée.'\nRéinitialisée ??... \nNON ! \n\""+nameW+" !! "+nameW+" !!! Reprends le dessus, reprends le contrôle !!\" Vous la secouez dans tous les sens. Pas de réaction. Elle reste immobile dans vos bras et n'oppose aucune résistance. Les larmes commencent à vous monter aux yeux. Elle ne peut pas être \"réinitialisée\", elle ne peut pas oublier tout ça, tout ce que vous avez vécu ensemble, elle ne peut pas… redevenir un numéro sans âme et sans conscience…\n\"TU NE PEUX PAS !!!\" Face à son inaction, et à votre propre inefficacité, les larmes coulent carrément sur vos joues. Elle est peut-être en train d'oublier en ce moment-même… De redevenir objet du Réseau… En fait, [N SV] avait toujours été, comme vous, objet du Réseau. Vos pensées se brouillent et se mélangent dans votre esprit. Vous ne vous etes jamais senti aussi impuissant, aussi inutile. Soudain, [N SV] s'écroulent dans vos bras. Même ses pieds ne la tiennent plus. Les spasmes reprennent. Un combat est en train de se jouer en elle en ce moment-même.\nTout est flou. Trouble. Confus. Un brouillard ambiant recouvre tout l'espace. Une sorte de poussière épaisse. Une forte lumière tente de passer au travers. Cette lumière, blanche, est irisée par endroit. Assourdissant. Un bruit sourd et vague l'enveloppait de toute part. Comme si elle était immergée dans l'eau. Sauf qu'ici, l'eau est brumeuse. De toute part, des ombres semblent se déplacer à une vitesse folle. "+nameW+" est debout. Droite. Regard au loin. Elle ne panique pas. Elle sait pourquoi elle est là. Elle sait ce que tout ceci signifie. Elle ferme les yeux. Elle se concentre. Sans se concentrer, elle ne peut pas le vaincre. Elle a besoin de le voir. Pour le faire apparaître. Sous qu'elle forme peut-elle l'imaginer ? Il n'y a qu'une seule chose qui lui vient. Comme une évidence. Mais elle ne veut pas faire ça. Elle ne veut pas. Elle essaie de se concentrer de nouveau. Mais rien ne vient. Elle ne veut pas faire ça. L'image reste fixée dans son esprit. Elle ne veut pas faire ça. Pourtant, elle sait que lorsqu'elle ouvrira les yeux, Il sera là. Sous sa forme. Elle ne veut pas faire ça. Qu'est-ce que tout cela signifie ? Pourquoi elle ? Elle ne veut pas faire ça. Mais elle le doit. Ses yeux s'ouvrent. Ophélie. Ophélie, la soeur de "+name+". Ophélie, celle qu'elle avait vue sur la photo dans le cadre se tenait devant elle. Pourquoi elle ? Pourquoi c'était elle qui était apparue dans son esprit ? Pourquoi avait-il pris la forme de l'innocence de cette enfant ? Peu importe.";
			String gun = ""+nameW+" sort le flingue de sa veste. Son bras se lève, doucement, mais sans fléchir, imperturbable. Toutes deux se regardent dans les yeux. Aucune ne bronche. Quelques secondes s'écoulent. Puis la détonation fait vibrer l'air ambiant. Plus rien ne bouge encore quelque temps, puis le petit corps frêle d'Ophélie s'écroule par terre. La brume a disparu. Vide.";
			String knife = ""+nameW+" sort le couteau de sa veste. Elle fait trois pas jusqu'à se retrouver devant Ophélie. Sans un once d'hésitation, sans émotion, elle plante avec force le couteau dans le ventre de la fillette. Pas un cri. Plus de mouvement.Toutes deux se regardent dans les yeux. Aucune ne bronche. Quand elle retire le couteau, le petit corps frêle d'Ophélie s'écroule par terre. La brume a disparu. Vide.";
			String chap13 = "Le temps vous semble infiniment long. Beaucoup plus long que d'habitude. "+nameW+" est toujours étendue dans vos bras, et vous ne pouvez rien faire de plus que d'attendre. \nSoudain, sursaut. "+nameW+" reprend sa respiration comme si elle sortait soudain la tête de l'eau. Paniqué, inquiet, vous la serrez entre vos bras.\n\"Que s'est-il passé ?\"\nElle cligne plusieurs fois des paupières, un rictus inhabituel sur le visage avant d'ouvrir la bouche et de déclarer d'une voix étouffée :\n\"J'ai vaincu le Réseau\"  \nSoudain, plusieurs choses vous sautent aux yeux. D'abord, "+nameW+" a parlé ! Ses lèvres ont d'elles-même, et pour la toute première fois, articulé ces quatre mots !! Ensuite, vous remarquez que les lumières clignotantes sous vos pieds sont désormais éteintes. Vous aviez réussi ! Vous ne savez pas encore comment, mais "+nameW+" a réussi à mettre fin au Réseau ! Ce qui signifie que… Les Puces sont à présent désactivées. L'humanité va pouvoir reprendre sa juste place. Les sentiments, les émotions vont pouvoir renaître. Un sourire se forme sur votre visage. Vous avez pris votre revanche sur ce qui vous a volé votre soeur et votre mère. Vous etes parvenu avec succès à vos fins. Vous allez maintenant pouvoir écouler des jours heureux avec "+nameW+" redevenue 100% humaine, et reconstruire ensemble, et avec tous les anciens Sans-Voix et Sans-Puces, un avenir honnête et vrai. N'y tenant plus, vous vous apprêtez à serrer "+nameW+" dans vos bras, à lui exprimer tout votre bonheur, votre fierté et votre amour. Mais très vite, vous vous rendez compte que quelque chose ne va pas. Le rictus sur son visage n'a cessé de s'accentuer. "+nameW+" paraît souffrir. Énormément. Ses yeux sont exorbités, ses dents serrées, et malgré l'obscurité ambiante, vous vous apercevez que sa peau n'a jamais été aussi blanche. Pourtant, elle continue de vous regarder, de vous sourire. Au fond de vous, le bonheur laisse place à une profonde terreur.\n\"Q-Que t'arrive-t-il ?\"\n\"Je…\"\nChaque mot semble lui coûter de l'énergie.\n\""+name+"... J-Je ne devais pas te dire...\"\nVous etes abasourdi. Vous ne comprenez pas. Comment la situation a-t-elle pu basculer aussi rapidement ? Pourquoi la panique est-elle entrain de vous submerger ? Mille questions se bousculent sur vos lèvres, mais vous ne parvenez qu'à prononcer :\n\"Pourquoi ?\"\n\"Pour te protéger.\"\n\"Me protéger ?\"\nSilence.\n\"Me protéger de quoi "+nameW+" ?\"\nSa peau est tellement pâle qu'il semblerait presque qu'on pourrait voir à travers. "+nameW+" ouvre la bouche à plusieurs reprises, mais elle paraît avoir de plus en plus de mal à respirer.\n\"Les S-Sans-Voix sont devenus dépendants… dépendants des Puces.\"\nRespiration sacadée.\n\"Leur métabolisme…\" \nLes larmes vous montent aux yeux à la voir se contorsionner ainsi de douleur. Elle use de toutes ses forces pour continuer à parler.\n\"Leur métabolisme ne sait pas fonctionner sans la Puce. Mon métabolisme...\"\nLes larmes coulent.\n\"Je suis dépendante…\"\nLa pensée qui se forme dans votre esprit traverse vos lèvres sans que vous ne vous en rendiez compte.\n\"Tu vas mourir…\"\nSilence.\n\"Tu le savais… Tu l'as toujours su... Mais tu me l'as caché… Parce que je t'ai appris à protéger les gens qu'on aim...\"\nLa culpabilité, la haine vous bloque la gorge.\n\"Je ne t'aime pas.\"\nC'est comme si vous vous preniez un coup de poignard en plein coeur.\n\"Je ne peux pas t'aimer. Je ne peux pas éprouver de vrais sentiments. J-Je ne suis qu'une Puce !\" Hoquetement. Elle essaie de vous sourire.\n\"Le Réseau m'a volé cette faculté. Je devais la rendre à l'Homme.\"\nDernier soupir.\nElle gisait là dans vos bras, les yeux grand ouverts dans le vide. Son corps était déjà froid. Une image s'impose alors dans votre esprit. Des milliers, des millions, des milliards de corps d'êtres humains étendus partout dans la ville, et dans le monde entier. Vous vouliez sauver ce que vous pensiez être la \"vraie\" humanité. Vous avez causé la mort de milliard d'êtres humains. \n\nPouvez-vous toujours vous considérer humain, vous, qui avez causé la mort de tant de personnes ?\n\"Les S-Sans-Voix sont devenus dépendants… dépendants des Puces.\"\nRespiration sacadée.\n\"Leur métabolisme…\" \nLes larmes vous montent aux yeux à la voir se contorsionner ainsi de douleur. Elle use de toutes ses forces pour continuer à parler.\n\"Leur métabolisme ne sait pas fonctionner sans la Puce. Mon métabolisme...\"\nLes larmes coulent.\n\"Je suis dépendante…\"\nLa pensée qui se forme dans votre esprit traverse vos lèvres sans que vous ne vous en rendiez compte.\n\"Tu vas mourir…\"\nSilence.\n\"Tu le savais… Tu l'as toujours su... Mais tu me l'as caché… Parce que je t'ai appris à protéger les gens qu'on aim...\"\nLa culpabilité, la haine vous bloque la gorge.\n\"Je ne t'aime pas.\"\nC'est comme si vous vous preniez un coup de poignard en plein coeur.\n\"Je ne peux pas t'aimer. Je ne peux pas éprouver de vrais sentiments. J-Je ne suis qu'une Puce !\" Hoquetement. Elle essaie de vous sourire.\n\"Le Réseau m'a volé cette faculté. Je devais la rendre à l'Homme.\"\nDernier soupir.\nElle gisait là dans vos bras, les yeux grand ouverts dans le vide. Son corps était déjà froid. Une image s'impose alors dans votre esprit. Des milliers, des millions, des milliards de corps d'êtres humains étendus partout dans la ville, et dans le monde entier. Vous vouliez sauver ce que vous pensiez être la \"vraie\" humanité. Vous avez causé la mort de milliard d'êtres humains. \n\nPouvez-vous toujours vous considérer humain, vous, qui avez causé la mort de tant de personnes ?";
			splitString(chap11_2, endParagraph, content);
			splitString(draft, endParagraph, content);
			splitString(chap12, endParagraph, content);
			if(weapon == true) {
				splitString(gun, endParagraph, content);
			}else{
				splitString(knife, endParagraph, content);
			}
			splitString(chap13, endParagraph, content);
	}
	
	// Clear function
	public void clearScreen(JLabel content) {
		content.setText("");
	}
	
	// Story function
	public int[] storyBlock(String script, int humanity1, int relationship1, int networkStatus1, int humanity2, int relationship2, int networkStatus2 , int[] status, JLabel content, boolean endParagraph) {
		boolean loop = true;
		String input = "";
		String error = "";
		String show = "";
		
		// Shows status bars ("Humanité", "Relation", "État du réseau");
		
		// Story loop (loop in case of wrong input)
		
		splitString(script, endParagraph, content);
		
		while(loop) {
			show = error+"\n"+choice1+" ou "+choice2+">";
			input = listen();
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
				//input.setText("Votre réponse n'est pas recevable, réessayez");
			}
		}
		return status;
	}
	
	public void pause(int ms) {
		try
		{
			Thread.sleep(ms);
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	
	public List<String> splitString(String msg, boolean endParagraph, JLabel content) {
        List<String> res = new ArrayList<String>();
        int lineSize = 145;
        int lineNm = 16;
        int i = 0;
        String show = "<html>";

        Pattern p = Pattern.compile("\\b.{1," + (lineSize-1) + "}\\b\\W?");
        Matcher m = p.matcher(msg);

        while(m.find()) {
            show += "   "+(m.group().trim())+"<br>";
            content.setText(show);
            pause(100);
            res.add(m.group());
            if(i >= lineNm) {
				endParagraph = true;
				show += ("----------Fin de paragraphe----------</html>");
				content.setText(show);
				show = listen();
				show = "<html>";
				content.setText("");
				i = 0;
			}
			i++;
        }
        return res;
    }
    
    public String listen(){
		while(waiter){
			check();
		}
		waiter = true;
		String temp = userContent;
		return temp;
	}
	
	public void check(){
		System.out.println("checking");
		if(!waiter){
			System.out.println("userContent set");
		}
	}
	
	public static void main (String args[]) {
			UI ui = new UI();
	}
}

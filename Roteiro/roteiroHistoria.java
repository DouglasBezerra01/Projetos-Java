package Roteiro;

import java.util.Scanner;

public class roteiroHistoria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int alt;
        String nome = "fulano";

        System.out.print("Era uma vez em um reino distante chamado Eldoria, onde duas figuras extraordinárias estavam\n"
        + "destinadas a moldar o futuro do reino.\n"
        + "Você tem a opção de escolher entre dois personagens:\n"
        + "um é um jovem guerreiro, enquanto o outro é uma talentosa feiticeira. Ambos têm um objetivo em comum:\n"
        + "proteger o reino e derrotar uma força malévola que ameaça a paz de Eldoria.\n");

        System.out.print("[0] Para escolher a classe guerreiro\n"
        + "[1] Para escolher a classe feiticeiro\n");
        System.out.print("- ");
        alt = repetidorErro(leitor);

        if (alt == 0) { // História do guerreiro
            System.out.println("\nO guerreiro " + nome + " era um habilidoso guerreiro treinado nas artes da espada desde tenra idade.\n"
            + "Com sua armadura reluzente e sua espada afiada, ele era conhecido por sua força e coragem.\n"
            + "Sua determinação em proteger Eldoria era inabalável. O rei do reino o convocou para uma audiência real\n"
            + "e confiou-lhe a missão de encontrar a lendária Espada da Luz, capaz de destruir o mal que assolava o reino.\n"
            + nome + " partiu em sua jornada em busca do artefato lendário.\n");

            System.out.print("[0] Procurar entrada para uma antiga caverna\n"
            + "[1] Procurar templo sagrado nas monstanhas\n");
            System.out.print("- ");
            alt = repetidorErro(leitor);
            
            if (alt == 0){ // História 1 do guerreiro
                System.out.println("\nApós dias de busca incansável, " + nome + " finalmente encontrou a entrada para uma antiga caverna.\n"
                + "Dentro da caverna, enfrentou diversos desafios e criaturas místicas, mas sua coragem não o abandonou.\n"
                + "No coração da caverna, encontrou a lendária Espada da Luz, que irradiava um brilho divino.\n"
                + nome + " empunhou a espada e sentiu um poder inigualável percorrer seu corpo.\n"
                + "Agora, com a Espada da Luz em mãos, ele está pronto para enfrentar o mal e proteger Eldoria.\n");
                
                System.out.print("[0] Procurar pela fortaleza\n"
                + "[1] Lutar valentemente\n");
                System.out.print("- ");
                alt = repetidorErro(leitor);

                if (alt == 0){ // Final 1.1 guerreiro
                    System.out.println("\nApós enfrentar batalhas épicas e superar todos os obstáculos, o guerreiro, nomeado herói de Eldoria,\n"
                    +"finalmente localiza a fortaleza do mal. Ele confronta o vilão em uma batalha intensa e,\n"
                    +"com a ajuda da Espada da Luz, derrota o mal e restaura a paz em Eldoria. O guerreiro é celebrado\n"
                    +"como o protetor do reino e vive o resto de seus dias como um símbolo de esperança e coragem.");
                
                } else { // Final 1.2 guerreiro
                    System.out.println("\nO guerreiro luta valentemente contra as forças do mal, mas é derrotado na batalha final.\n"
                    +"Ele sacrifica sua própria vida para proteger Eldoria, deixando um legado de coragem e inspiração\n"
                    +"para as gerações futuras. Embora seu corpo tenha perecido, seu espírito permanece vivo nos\n"
                    +"corações do povo de Eldoria, que se unem para honrar sua memória e continuar a luta contra o mal.");
                }
      
            } else { // História 2 do guerreiro
                System.out.println("\nDepois de meses de busca, " + nome + " finalmente chegou ao templo sagrado escondido nas montanhas.\n"
                + "Lá, ele foi recebido pelos monges guardiões do templo, que reconheceram sua coragem e determinação.\n"
                + "Eles revelaram a ele a localização da lendária Espada da Luz, que estava selada dentro de um santuário.\n"
                + "Com a benção dos monges, " + nome + " adentrou o santuário e, enfrentando armadilhas perigosas, alcançou a espada.\n"
                + "Ao empunhar a Espada da Luz, sentiu um poder divino fluir através de seu corpo, fortalecendo sua determinação em proteger Eldoria.\n"
                + "Agora, equipado com a espada lendária, ele está pronto para enfrentar qualquer desafio que surja em seu caminho.\n");
                
                System.out.print("[0] Para escolher a classe guerreiro\n"
                + "[1] Para escolher a classe feiticeiro\n");
                System.out.print("- ");
                alt = repetidorErro(leitor);

                if (alt == 0){ // Final 2.1 guerreiro
                    System.out.println("\nAo enfrentar inúmeras adversidades, o guerreiro finalmente encontra o líder das forças malignas\n"
                    +"e o desafia em um duelo decisivo. Com sua habilidade e determinação, ele derrota o vilão e\n"
                    +"destrói o mal que assolava Eldoria. O guerreiro retorna como um herói aclamado,\n"
                    +"recebendo honrarias e gratidão de todo o reino.");
                } else { // Final 2.2 guerreiro
                    System.out.println("\nO guerreiro enfrenta o líder das forças malignas em uma batalha épica, mas suas forças são superadas.\n"
                    +"Ele é derrotado e capturado pelo vilão, que usa sua energia para alimentar sua maldade.\n"
                    +"Eldoria cai nas mãos do mal e enfrenta uma era sombria. O guerreiro é lembrado como um mártir corajoso,"
                    +"mas o reino sofre sob o domínio tirânico do vilão.");
                }
                
            }



        } else { // História da feiticeira
            System.out.println("\nA feiticeira " + nome + " possuía uma conexão profunda com as forças mágicas do reino.\n"
            + "Seus poderes eram vastos e ela era respeitada por seu conhecimento e habilidades.\n"
            + "Quando soube da ameaça que pairava sobre Eldoria, ela se ofereceu para ajudar a proteger o reino.\n"
            + "A rainha do reino, impressionada com seu talento, confiou a ela uma missão crucial: recuperar o Cetro da Sabedoria.\n"
            + nome + " partiu em busca desse artefato mágico para utilizar seu poder em prol da justiça.\n");
            System.out.print("[0] Pesquisar em registros antigos\n"
            + "[1] Usar leituras de visão\n");
            System.out.print("- ");
            alt = repetidorErro(leitor);

            if (alt == 0){ // História 1 da feiticeira
                System.out.println("\nApós uma intensa pesquisa nos antigos registros mágicos, " + nome + " descobriu que o Cetro da Sabedoria\n"
                + "estava guardado em uma torre encantada no coração da Floresta Proibida. Armada com seus conhecimentos e feitiços,\n"
                + nome + " adentrou a floresta sombria, enfrentando criaturas místicas e desvendando enigmas mágicos para chegar à torre.\n"
                + "No topo da torre, encontrou o Cetro da Sabedoria, emanando uma luz brilhante e poderosa.\n"
                + "Ao segurar o cetro, " + nome + " sentiu um fluxo de energia mágica percorrer seu corpo, capacitando-a com um poder além de sua imaginação.\n"
                + "Agora, com o Cetro da Sabedoria em mãos, ela está pronta para enfrentar as trevas e proteger Eldoria.\n");
                
                System.out.print("[0] Lutar diretamente com o vilão no covil\n"
                + "[1] Esgeuirar-se pelo covil para emboscar o vilão\n");
                System.out.print("- ");
                alt = repetidorErro(leitor);

                if (alt == 0){ // Final 1.1 feiticeira
                    System.out.println("\nA feiticeira usa sua magia poderosa e conhecimento místico para superar os desafios e encontrar o caminho até o covil do mal.\n"
                    +"Lá, ela enfrenta o vilão em um duelo de poderes. Com sua sabedoria e habilidades, ela consegue derrotá-lo e selar sua existência para sempre.\n"
                    +"A feiticeira retorna a Eldoria como a protetora do reino, usando seus poderes para trazer prosperidade e harmonia.");
                } else { // Final 1.2 feiticeira
                    System.out.println("\nAo se aventurar pelo covil do mal, a feiticeira é enfeitiçada por uma armadilha astuta. Seus poderes são aprisionados,\n"
                    +"ela se torna impotente diante do vilão. Eldoria cai nas mãos do mal e a feiticeira, sem seus poderes, é condenada a viver\n"
                    +"uma vida de desespero e arrependimento. Seu destino serve como um lembrete trágico dos perigos da ambi\u00E7\u00E3o desmedida.");
                }

            } else { // História 2 da feiticeira
                System.out.println("\nGuiada por visões místicas, " + nome + " embarcou em uma jornada até as Montanhas Celestiais,\n"
                + "um lugar sagrado onde o conhecimento ancestral estava preservado. Lá, ela enfrentou os desafios do labirinto mágico,\n"
                + "com armadilhas e testes de sabedoria.\n"
                + "Após superar cada obstáculo, " + nome + " chegou ao Templo da Ascensão, onde a sabedoria cósmica estava guardada.\n"
                + "No coração do templo, encontrou o Cetro da Sabedoria, irradiando uma luz divina.\n"
                + "Ao segurar o cetro, " + nome + " sentiu uma conexão profunda com o cosmos, seus poderes se ampliaram e sua determinação foi reforçada.\n"
                + "Agora, com o Cetro da Sabedoria em mãos, ela está pronta para enfrentar qualquer desafio e proteger Eldoria com sua magia.\n");

                System.out.print("[0] Lutar diretamente com o vilão no covil\n"
                + "[1] Esgeuirar-se pelo covil para emboscar o vilão\n");
                System.out.print("- ");
                alt = repetidorErro(leitor);

                if (alt == 0){
                    System.out.println("\nA feiticeira, guiada por visões cósmicas, se torna uma aprendiz dos mestres da magia nas Montanhas Celestiais.\n"
                    +"Ela aprimora seus poderes e recebe ensinamentos ancestrais. Com o Cetro da Sabedoria como sua ferramenta,\n"
                    +"ela retorna a Eldoria e usa sua magia para eliminar as forças do mal. O reino floresce sob sua proteção,\n"
                    +"enquanto ela continua sua jornada como a guardiã da magia.");
                } else {
                    System.out.println("\nA feiticeira embarca em uma jornada perigosa para dominar seu novo poder com o Cetro da Sabedoria.\n"
                    +"No entanto, a busca pelo conhecimento proibido a consome, e ela se deixa levar pela escuridão.\n"
                    +"Ela se torna uma feiticeira maligna, espalhando caos e destruição em Eldoria. O reino é mergulhado em trevas,\n"
                    +"seu nome se torna sinônimo de medo e desespero.");
                }
            }
        }
    }





    public static int repetidorErro(Scanner leitor) { 
        int alt; //método para repetir a pergunta em caso resposta inválida

        do {
            alt = leitor.nextInt();

            if (alt != 0 && alt != 1) {
                System.out.println("Tente novamente. Lembre-se, apenas [ 0 ] ou [ 1 ].");
                System.out.print("- ");
            }
            leitor.nextLine();
        } while (alt != 0 && alt != 1);
        return alt;
    }
}

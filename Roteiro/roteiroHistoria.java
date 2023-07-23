package Roteiro;

import java.util.Scanner;

public class roteiroHistoria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Personagem jogador = new Personagem();
        jogador.setNome("Fulano");

        Capitulo cap00 = new Capitulo(leitor, jogador);
        cap00.roteiro = "Era uma vez em um reino distante chamado Eldoria, onde duas figuras extraordinárias estavam\n"
                + "destinadas a moldar o futuro do reino.\n"
                + "Você tem a opção de escolher entre dois personagens:\n"
                + "um é um jovem guerreiro, enquanto o outro é uma talentosa feiticeira. Ambos têm um objetivo em comum:\n"
                + "proteger o reino e derrotar uma força malévola que ameaça a paz de Eldoria.\n";
        //cap00.escolhas[0] = "Para escolher a classe guerreiro\n";
        //cap00.escolhas[1] = "Para escolher a classe feiticeiro\n";
        //cap00.mostrar(jogador);

        //if (cap00.escolha(leitor) == 0) { // História do guerreiro

        Capitulo capG01 = new Capitulo(leitor, jogador);
        capG01.roteiro = "\nO guerreiro " + jogador.getNome()
                    + " era um habilidoso guerreiro treinado nas artes da espada desde tenra idade.\n"
                    + "Com sua armadura reluzente e sua espada afiada, ele era conhecido por sua força e coragem.\n"
                    + "Sua determinação em proteger Eldoria era inabalável. O rei do reino o convocou para uma audiência real\n"
                    + "e confiou-lhe a missão de encontrar a lendária Espada da Luz, capaz de destruir o mal que assolava o reino.\n"
                    + jogador.getNome() + " partiu em sua jornada em busca do artefato lendário.\n";
            //capG01.escolhas[0] = "Procurar entrada para uma antiga caverna\n";
            //capG01.escolhas[1] = "Procurar templo sagrado nas monstanhas\n";
            //capG01.mostrar(jogador);

         Capitulo capG02 = new Capitulo(leitor, jogador);
         capG02.roteiro = "\nApós dias de busca incansável, " + jogador.getNome()
                        + " finalmente encontrou a entrada para uma antiga caverna.\n"
                        + "Dentro da caverna, enfrentou diversos desafios e criaturas místicas, mas sua coragem não o abandonou.\n"
                        + "No coração da caverna, encontrou a lendária Espada da Luz, que irradiava um brilho divino.\n"
                        + jogador.getNome() + " empunhou a espada e sentiu um poder inigualável percorrer seu corpo.\n"
                        + "Agora, com a Espada da Luz em mãos, ele está pronto para enfrentar o mal e proteger Eldoria.\n";

              // capG02.escolhas[0] = "Procurar pela fortaleza\n";
              //  capG02.escolhas[1] = "Lutar valentemente\n";
              //  capG02.mostrar(jogador);

              //  if (capG02.escolha(leitor) == 0) { // Final 1.1 guerreiro
              //      System.out.println(
        Capitulo capG021 = new Capitulo(leitor, jogador);
        capG021.roteiro = "\nApós enfrentar batalhas épicas e superar todos os obstáculos, o guerreiro, nomeado herói de Eldoria,\n" 
                                    + "finalmente localiza a fortaleza do mal. Ele confronta o vilão em uma batalha intensa e,\n"
                                    + "com a ajuda da Espada da Luz, derrota o mal e restaura a paz em Eldoria. O guerreiro é celebrado\n"
                                    + "como o protetor do reino e vive o resto de seus dias como um símbolo de esperança e coragem.";

        Capitulo capG022 = new Capitulo(leitor, jogador);
        capG022.roteiro = "\nO guerreiro luta valentemente contra as forças do mal, mas é derrotado na batalha final.\n"
                                    + "Ele sacrifica sua própria vida para proteger Eldoria, deixando um legado de coragem e inspiração\n"
                                    + "para as gerações futuras. Embora seu corpo tenha perecido, seu espírito permanece vivo nos\n"
                                    + "corações do povo de Eldoria, que se unem para honrar sua memória e continuar a luta contra o mal.";
        

            //} else { // História 2 do guerreiro
                Capitulo capG03 = new Capitulo(leitor, jogador);
                capG03.roteiro = "\nDepois de meses de busca, " + jogador.getNome()
                        + " finalmente chegou ao templo sagrado escondido nas montanhas.\n"
                        + "Lá, ele foi recebido pelos monges guardiões do templo, que reconheceram sua coragem e determinação.\n"
                        + "Eles revelaram a ele a localização da lendária Espada da Luz, que estava selada dentro de um santuário.\n"
                        + "Com a benção dos monges, " + jogador.getNome()
                        + " adentrou o santuário e, enfrentando armadilhas perigosas, alcançou a espada.\n"
                        + "Ao empunhar a Espada da Luz, sentiu um poder divino fluir através de seu corpo, fortalecendo sua determinação em proteger Eldoria.\n"
                        + "Agora, equipado com a espada lendária, ele está pronto para enfrentar qualquer desafio que surja em seu caminho.\n";

                //capG03.escolhas[0] = "Enfrentar os inimigos menores primeiro\n";
                //capG03.escolhas[1] = "Lutar de frente com o líder maligno\n";
                //capG03.mostrar(jogador);

                //if (capG03.escolha(leitor) == 0) { // Final 2.1 guerreiro
                    System.out.println(
                            "\nAo enfrentar inúmeras adversidades, o guerreiro finalmente encontra o líder das forças malignas\n"
                                    + "e o desafia em um duelo decisivo. Com sua habilidade e determinação, ele derrota o vilão e\n"
                                    + "destrói o mal que assolava Eldoria. O guerreiro retorna como um herói aclamado,\n"
                                    + "recebendo honrarias e gratidão de todo o reino.");
                //} else { // Final 2.2 guerreiro
                    System.out.println(
                            "\nO guerreiro enfrenta o líder das forças malignas em uma batalha épica, mas suas forças são superadas.\n"
                                    + "Ele é derrotado e capturado pelo vilão, que usa sua energia para alimentar sua maldade.\n"
                                    + "Eldoria cai nas mãos do mal e enfrenta uma era sombria. O guerreiro é lembrado como um mártir corajoso,"
                                    + "mas o reino sofre sob o domínio tirânico do vilão.");
                }
            }

        //} else { // História da feiticeira
            Capitulo capF01 = new Capitulo(leitor, jogador);
            capF01.roteiro = "\nA feiticeira " + jogador.getNome()
                    + " possuía uma conexão profunda com as forças mágicas do reino.\n"
                    + "Seus poderes eram vastos e ela era respeitada por seu conhecimento e habilidades.\n"
                    + "Quando soube da ameaça que pairava sobre Eldoria, ela se ofereceu para ajudar a proteger o reino.\n"
                    + "A rainha do reino, impressionada com seu talento, confiou a ela uma missão crucial: recuperar o Cetro da Sabedoria.\n"
                    + jogador.getNome()
                    + " partiu em busca desse artefato mágico para utilizar seu poder em prol da justiça.\n";
            capF01.escolhas[0] = "Pesquisar em registros antigos\n";
            capF01.escolhas[1] = "Usar leituras de visão\n";
            capF01.mostrar(jogador);

            //if (capF01.escolha(leitor) == 0) { // História 1 da feiticeira
                Capitulo capF02 = new Capitulo(leitor, jogador);
                capF02.roteiro = "\nApós uma intensa pesquisa nos antigos registros mágicos, " + jogador.getNome()
                        + " descobriu que o Cetro da Sabedoria\n"
                        + "estava guardado em uma torre encantada no coração da Floresta Proibida. Armada com seus conhecimentos e feitiços,\n"
                        + jogador.getNome()
                        + " adentrou a floresta sombria, enfrentando criaturas místicas e desvendando enigmas mágicos para chegar à torre.\n"
                        + "No topo da torre, encontrou o Cetro da Sabedoria, emanando uma luz brilhante e poderosa.\n"
                        + "Ao segurar o cetro, " + jogador.getNome()
                        + " sentiu um fluxo de energia mágica percorrer seu corpo, capacitando-a com um poder além de sua imaginação.\n"
                        + "Agora, com o Cetro da Sabedoria em mãos, ela está pronta para enfrentar as trevas e proteger Eldoria.\n";

                //capF02.escolhas[0] = "Lutar diretamente com o vilão no covil\n";
                //capF02.escolhas[1] = "Esgueirar-se pelo covil para emboscar o vilão\n";
                //capF02.mostrar(jogador);

                //if (capF02.escolha(leitor) == 0) { // Final 1.1 feiticeira
                    System.out.println(
                            "\nA feiticeira usa sua magia poderosa e conhecimento místico para superar os desafios e encontrar o caminho até o covil do mal.\n"
                                    + "Lá, ela enfrenta o vilão em um duelo de poderes. Com sua sabedoria e habilidades, ela consegue derrotá-lo e selar sua existência para sempre.\n"
                                    + "A feiticeira retorna a Eldoria como a protetora do reino, usando seus poderes para trazer prosperidade e harmonia.");
                //} else { // Final 1.2 feiticeira
                    System.out.println(
                            "\nAo se aventurar pelo covil do mal, a feiticeira é enfeitiçada por uma armadilha astuta. Seus poderes são aprisionados,\n"
                                    + "ela se torna impotente diante do vilão. Eldoria cai nas mãos do mal e a feiticeira, sem seus poderes, é condenada a viver\n"
                                    + "uma vida de desespero e arrependimento. Seu destino serve como um lembrete trágico dos perigos da ambi\u00E7\u00E3o desmedida.");
                }

            //} else { // História 2 da feiticeira
                Capitulo capF03 = new Capitulo(leitor, jogador);
                capF03.roteiro = "\nGuiada por visões místicas, " + jogador.getNome()
                        + " embarcou em uma jornada até as Montanhas Celestiais,\n"
                        + "um lugar sagrado onde o conhecimento ancestral estava preservado. Lá, ela enfrentou os desafios do labirinto mágico,\n"
                        + "com armadilhas e testes de sabedoria.\n"
                        + "Após superar cada obstáculo, " + jogador.getNome()
                        + " chegou ao Templo da Ascensão, onde a sabedoria cósmica estava guardada.\n"
                        + "No coração do templo, encontrou o Cetro da Sabedoria, irradiando uma luz divina.\n"
                        + "Ao segurar o cetro, " + jogador.getNome()
                        + " sentiu uma conexão profunda com o cosmos, seus poderes se ampliaram e sua determinação foi reforçada.\n"
                        + "Agora, com o Cetro da Sabedoria em mãos, ela está pronta para enfrentar qualquer desafio e proteger Eldoria com sua magia.\n";

                //capF03.escolhas[0] = "Lutar diretamente com o vilão no covil\n";
                //capF03.escolhas[1] = "Esgueirar-se pelo covil para emboscar o vilão\n";
                //capF03.mostrar(jogador);

                //if (capF03.escolha(leitor) == 0) {
                    System.out.println(
                            "\nA feiticeira, guiada por visões cósmicas, se torna uma aprendiz dos mestres da magia nas Montanhas Celestiais.\n"
                                    + "Ela aprimora seus poderes e recebe ensinamentos ancestrais. Com o Cetro da Sabedoria como sua ferramenta,\n"
                                    + "ela retorna a Eldoria e usa sua magia para eliminar as forças do mal. O reino floresce sob sua proteção,\n"
                                    + "enquanto ela continua sua jornada como a guardiã da magia.");
                //} else {
                    System.out.println(
                            "\nA feiticeira embarca em uma jornada perigosa para dominar seu novo poder com o Cetro da Sabedoria.\n"
                                    + "No entanto, a busca pelo conhecimento proibido a consome, e ela se deixa levar pela escuridão.\n"
                                    + "Ela se torna uma feiticeira maligna, espalhando caos e destruição em Eldoria. O reino é mergulhado em trevas,\n"
                                    + "seu nome se torna sinônimo de medo e desespero.");
                }
            }
        }

        //Continua
        cap00.escolhas.add(new Escolha("Procurar entrada para uma antiga caverna\n",capG01);
        cap00.escolhas.add(new Escolha("Procurar templo sagrado nas monstanhas\n",capF01);        

        //Rodar jogo
        cap00.executar()
    }
}

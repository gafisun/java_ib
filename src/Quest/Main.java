package Quest;

import java.util.*;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main(String[] args) {




























        // ===================== SPOILERS ============================
        HashMap<Integer, Block> list_action = new HashMap<>();
        list_action.put(1, new Block("Action_Double","Попытаться отвлечь внимание стражи сопровождающую Гая.", 4, 3));
        list_action.put(2, new Block("Action_End", "Взорвать мост с помощью бочек пороха оставшихся после прошлой ночи.", 1, 1));
        list_action.put(4, new Block("Action","Перекрыть движение создав аварию с помощью телег.", 1, 1));
        list_action.put(3, new Block("Action","Одна из дам вашей группы  может сымитировать попадание под колеса кареты.", 2, 1));
        list_action.put(5, new Block("Action", "Попробовать сразиться со стражей.", 5, 1));
        list_action.put(6, new Block("Action", "Попробовать взломать замок сдерживающий дверцу тюремной кареты. На вид кажется проще простого.", 4, 1));
        list_action.put(7, new Block("Action", "Попробовать взломать замок сдерживающий дверцу тюремной кареты. На вид кажется проще простого.", 4, 1));
        list_action.put(8, new Block("Action_End","Вы полностью уверены в себе и нападаете на охрану.", 31, 1));
        list_action.put(9, new Block("Action_End", "Вы в отчаянии взрываете мост.", 1, 1));
        list_action.put(10, new Block("Action_End", "Вы бросаете Гая Фокса.", 2, 1));
        list_action.put(11, new Block("Action_Double","Вы можете решить сразу увести карету.", 12, 13));
        list_action.put(12, new Block("Action","У вас есть выбор скрыться в городе или ...", 6, 1));
        list_action.put(13, new Block("Action", "...в лесу.", 11, 1));
        list_action.put(14, new Block("Action_End","Вы не хотите рисковать заново.", 41, 1));
        list_action.put(15, new Block("Action_End","Вы решаетесь отомстить королю.", 9, 1));
        list_action.put(16, new Block("Action_End","Вы не можете жить без главнокомандующего.", 32, 1));
        list_action.put(17, new Block("Action_End"," Вы оставляете Гая Фокса в карете, а сами пускаетесь в бега.", 8, 1));
        list_action.put(18, new Block("Action_Double", "Вы можете отыскать ключи у охраны, но это может занять много времени.", 19, 20));
        list_action.put(19, new Block("Action", "Вы думаете, что пойти пешком будет лучшим решением.", 10, 1));
        list_action.put(20, new Block("Action_Double","Вы решаете бежать на карете.", 21, 22));
        list_action.put(21, new Block("Action","У вас есть выбор скрыться в городе или...", 10, 11));
        list_action.put(22, new Block("Action","...в лесу.", 7, 1));
        list_action.put(23, new Block("Action_End", "Вы не хотите рисковать заново.", 42, 1));
        list_action.put(24, new Block("Action_End","Вы решаетесь отомстить королю.", 13, 1));

        HashMap<Integer, Block> list_event = new HashMap<>();
        list_event.put(1, new Block("Event","Охранники увидев аварию решили разобраться. У них займет -это какое-то время.", 8, 7));
        list_event.put(2, new Block("Event","Охранники решают помочь. Часть из них уходит.", 6, 5));
        list_event.put(4, new Block("Event", "Взломать замок не удалось. Вы привлекаете охрану.", 9, 10));
        list_event.put(5, new Block("Event","Вы разгромили всю стражу. Они будут уволены. Но в городе уже об этом знают.", 18, 11));
        list_event.put(6, new Block("Event", "Гай фокс решает закончить начатое. Он хочет взорвать парламент.", 14, 15));
        list_event.put(7, new Block("Event","В лесу ваша телега наезжает на камень и ломается. Из города подоспела полиция", 16, 17));
        list_event.put(10, new Block("Event","Гай фокс решает закончить начатое. Он хочет взорвать парламент.", 23, 24));
        list_event.put(11, new Block("Event","В лесу ваша телега наезжает на камень и ломается. Из города подоспела полиция. Вы не смогли убежать.", 16, 17));

        HashMap<Integer, Block> list_end = new HashMap<>();
        list_end.put(1, new Block("End", ANSI_RED+"Вы плохо взрываете. Вы умираете."+ ANSI_RESET, 0, 0));
        list_end.put(2, new Block("End", ANSI_RED+"Вы оставляете Гая Фокса в телеге в городе. Ваша попытка провальная. Гая фокс остается грустить в телеге. Но не надолго."+ ANSI_RESET, 0, 0));
        list_end.put(31, new Block("End", ANSI_RED+"Вы преоценили свои силы. Вы никудышные бойцы. Вы проведете остатки жизни в тюрьме."+ ANSI_RESET, 0, 0));
        list_end.put(32, new Block("End", ANSI_RED+"Вы слишком любите своего господина. За что и отправляетесь в тюрьму."+ ANSI_RESET, 0, 0));
        list_end.put(41, new Block("End", ANSI_PURPLE+"Вы решаете, что ваша свобода важнее, чем замысел безумца."+ ANSI_RESET, 0, 0));
        list_end.put(42, new Block("End", ANSI_PURPLE+"Гай Фокс взорвал парламент вместе с собой. Вы решаете, что хорошо горит. И радуетесь, что вас там нет."+ ANSI_RESET, 0, 0));
        list_end.put(9, new Block("End",ANSI_GREEN+"Вы взрываете парламент и обедаете свежим прожаренным королевским мясом."+ ANSI_RESET, 0, 0));
        list_end.put(8, new Block("End", ANSI_PURPLE+"Вы скрываетесь и решаете убежать в Россию. Вам удалось скрыться в россии и вы закупаетесь валенками."+ ANSI_RESET, 0, 0));
        list_end.put(13, new Block("End",ANSI_GREEN+"Вы взрываете парламент и обедаете свежим прожаренным королевским мясом. Вы скрываетесь и решаете убежать в Россию. Вам удалось скрыться в России и вы закупаетесь валенками."+ ANSI_RESET, 0, 0));

        ArrayList<Integer> unique_end = new ArrayList<>();
        unique_end.add(1);
        unique_end.add(2);
        unique_end.add(31);
        unique_end.add(32);
        unique_end.add(41);
        unique_end.add(42);
        unique_end.add(9);
        unique_end.add(8);
        unique_end.add(13);

        System.out.println(ANSI_CYAN+"Ночь Гая Фокса\n" +
                "В эту ночь, пятую после Хэллоуина, отмечается провал Порохового заговора, когда группа католиков-заговорщиков попыталась взорвать Парламент Великобритании в Лондоне. Uай Фокс пытался поджечь в подвале Вестминстерского дворца бочки с порохом. \n" +
                "Но это закончилось провалом!\n" +
                "\n" +
                "На следующий день Гай был арестован и должен был быть отвезён в Тауэр.\n" +
                "\n" +
                "Но был ли?\n" +
                "\n" +
                "Сегодня вы выступите в роли единомышленников Гая Фокса\n" +
                "\n" +
                "Ваша задача:\n" +
                "Избежать заключение Гая и вас самих\n" +
                "\n" +
                "От ваших действий будет зависеть судьба ваших героев\n" +
                "\n" +
                "На данный момент заговорщика перевозят в карете по мосту с усиленной охраной.\n" +
                "Ваши действия:\n"+ANSI_RESET);
        Boolean game = true;
        Integer end_count = 0;
        while (game){
            Boolean finish = true;
            System.out.println(ANSI_BLUE + "================================================"+ ANSI_RESET);
            System.out.println("[1]");
            System.out.println(list_action.get(1).value);
            System.out.println("[2]");
            System.out.println(list_action.get(2).value);
            System.out.println(ANSI_BLUE + "================================================"+ ANSI_RESET);
            Scanner input = new Scanner(System.in);
            Integer in = input.nextInt();
            Integer next = in;
            Integer past = 0;
            if (in == 1){
                System.out.println(ANSI_BLUE + "================================================"+ ANSI_RESET);
                System.out.println("[1]");
                System.out.println(list_action.get(4).value);
                System.out.println("[2]");
                System.out.println(list_action.get(3).value);
                System.out.println(ANSI_BLUE + "================================================"+ ANSI_RESET);
                in = input.nextInt();
                if (in == 1){
                    next = 1;
                    past = 4;
                } else if (in == 2){
                    next = 2;
                    past = 3;
                }
            } else if (in == 2 ){
                System.out.println("  _______ _            ______           _   \n" +
                        " |__   __| |          |  ____|         | |  \n" +
                        "    | |  | |__   ___  | |__   _ __   __| |  \n" +
                        "    | |  | '_ \\ / _ \\ |  __| | '_ \\ / _` |  \n" +
                        "    | |  | | | |  __/ | |____| | | | (_| |_ \n" +
                        "    |_|  |_| |_|\\___| |______|_| |_|\\__,_(_)");
                System.out.println(list_end.get(1).value);
                finish = false;
                if (unique_end.contains(1)){
                    end_count += 1;
                    System.out.println("Вы разблокировали " + end_count + " из 9 возможных концовок.");
                    unique_end.remove(unique_end.indexOf(1));
                } else {
                    System.out.println("Вы не разблокировали ещё  " + (9-end_count) + " из 9 возможных концовок.");
                }
                System.out.println("Начать заново?");
                System.out.println("<Нажмите на цифру 1> для перезагрузки игры");
                System.out.println("<Нажмите на цифру 0> для выхода из программы");
                in = input.nextInt();
                if(in == 0){
                    game = false;
                }
            }
            while(finish){
                if (list_action.get(past).type.equals("Action")){
                    System.out.println(ANSI_BLUE + "================================================"+ ANSI_RESET);
                    System.out.println(list_event.get(next).value);
                    System.out.println("");
                    System.out.println("Ваши действия:");
                    System.out.println("[1]");
                    System.out.println(list_action.get(list_event.get(next).index_1).value);
                    System.out.println("[2]");
                    System.out.println(list_action.get(list_event.get(next).index_2).value);
                    System.out.println(ANSI_BLUE + "================================================"+ ANSI_RESET);
                    in = input.nextInt();
                    if (in == 1 && !list_action.get(list_event.get(next).index_1).type.equals("Action_Double")){
                        past = list_event.get(next).index_1;
                        next = list_action.get(past).index_1;
                    } else if (in == 2 && !list_action.get(list_event.get(next).index_2).type.equals("Action_Double")){
                        past = list_event.get(next).index_2;
                        next = list_action.get(past).index_1;
                    } else if (in == 1){
                        past = list_event.get(next).index_1;
                        next = past;
                    } else if (in == 2){
                        past = list_event.get(next).index_2;
                        next = past;
                    }
                } else if (list_action.get(past).type.equals("Action_End"))
                {
                    System.out.println("  _______ _            ______           _   \n" +
                            " |__   __| |          |  ____|         | |  \n" +
                            "    | |  | |__   ___  | |__   _ __   __| |  \n" +
                            "    | |  | '_ \\ / _ \\ |  __| | '_ \\ / _` |  \n" +
                            "    | |  | | | |  __/ | |____| | | | (_| |_ \n" +
                            "    |_|  |_| |_|\\___| |______|_| |_|\\__,_(_)");
                    System.out.println(list_end.get(list_action.get(past).index_1).value);
                    finish = false;
                    if (unique_end.contains(list_action.get(past).index_1)){
                        end_count += 1;
                        System.out.println("Вы разблокировали " + end_count + " из 9 возможных концовок.");
                        unique_end.remove(unique_end.indexOf(list_action.get(past).index_1));
                    } else {
                        System.out.println("Вы не разблокировали ещё  " + (9-end_count) + " из 9 возможных концовок.");
                    }
                    System.out.println("Начать заново?");
                    System.out.println("<Нажмите на цифру 1> для перезагрузки игры");
                    System.out.println("<Нажмите на цифру 0> для выхода из программы");
                    in = input.nextInt();
                    if(in == 0){
                        game = false;
                    }

                } else if (list_action.get(past).type.equals("Action_Double")){
                    System.out.println(ANSI_BLUE + "================================================"+ ANSI_RESET);
                    System.out.println("");
                    System.out.println("Ваши действия:");
                    System.out.println("[1]");
                    System.out.println(list_action.get(list_action.get(past).index_1).value);
                    System.out.println("[2]");
                    System.out.println(list_action.get(list_action.get(past).index_2).value);
                    System.out.println(ANSI_BLUE + "================================================"+ ANSI_RESET);
                    in = input.nextInt();
                    if (in == 1){
                        past = list_action.get(past).index_1;
                        next = list_action.get(past).index_1;
                    } else if (in == 2){
                        past = list_action.get(past).index_2;
                        next = list_action.get(past).index_1;
                    }
                }
            }
        }

    }
}
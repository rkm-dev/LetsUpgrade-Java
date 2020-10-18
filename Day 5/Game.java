package com.letsupgrade.java;

public class Game {

    Question[] question = new Question[5];
    Player player = new Player();

    //Initializing and loading game components
    public void initGame() {
        //QOA : Question, Options, Answer(option number)
        String [][] QOA = new String[5][6];

        //Ques and Opt Database
        QOA[0][0]="Who among the following is the Strongest Avenger?";
        QOA[0][1]="Iron Man";
        QOA[0][2]="Thor";
        QOA[0][3]="Captain America";
        QOA[0][4]="Hulk";
        QOA[0][5]="4";

        QOA[1][0]="Who sells Ultron, the Vibranium?";
        QOA[1][1]="Umar Klaus";
        QOA[1][2]="Claus Walker";
        QOA[1][3]="Ulysses Klaue";
        QOA[1][4]="N'Jobu";
        QOA[1][5]="3";

        QOA[2][0]="Name The Actor Who Played Ultron?";
        QOA[2][1]="James Spader";
        QOA[2][2]="James Earl Jones";
        QOA[2][3]="Earl Mathews";
        QOA[2][4]="Will Spenser";
        QOA[2][5]="1";

        QOA[3][0]="Which Character among the following has first denied an invitation to join the Avengers?";
        QOA[3][1]="Ant-Man";
        QOA[3][2]="Spider-Man";
        QOA[3][3]="Hawkeye";
        QOA[3][4]="War Machine";
        QOA[3][5]="2";

        QOA[4][0]="who created Mjolnir?";
        QOA[4][1]="Odin";
        QOA[4][2]="Thor";
        QOA[4][3]="Eitir";
        QOA[4][4]="Hiemdall";
        QOA[4][5]="3";

        for(int i=0;i<5;i++) {
            question[i]=new Question(
                    QOA[i][0],
                    QOA[i][1],
                    QOA[i][2],
                    QOA[i][3],
                    QOA[i][4],
                    QOA[i][5]);
        }
    }

    //Activate game play
    public void play() {
        System.out.println("Avengers Quiz");
        System.out.println("------------------------------------");
        player.getDetails();
        System.out.println("\n\t\tPlay Now");
        System.out.println("------------------------------------");
        for (int i=0;i<5;i++) {
            if(question[i].askQues()) {
                player.score++;
                System.out.println("\t\t\t--> Right Answer, Excellent");
            } else {
                System.out.println("\t\t\t--> Sorry, Wrong Answer");
            }
            System.out.println("---------------------------------------------");
        }
        System.out.println("\n\t\t\tFinal Score");
        System.out.println("---------------------------------------");
        System.out.println(player.name+", your total score is : "+player.score);
    }
}

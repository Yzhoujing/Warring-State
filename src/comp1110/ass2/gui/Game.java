package comp1110.ass2.gui;

import comp1110.ass2.WarringStatesGame;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class Game extends Application {
    private static final int BOARD_WIDTH = 933;
    private static final int BOARD_HEIGHT = 700;
    private static final int SQUARE_SIZE = 100;
    /* color the underlying board */
    private static final Paint SUBBOARD_FILL = Color.WHITESMOKE;
    private static final Paint SUBBOARD_STROKE = Color.BLACK;
    public static final String[] PLACEMENTS = {
            "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"
    };

    TextField textField;
    /* where to find media assets */
    private static final String URI_BASE = "assets/";
    /* node groups */
    private final Group root = new Group();
    private final Group controls = new Group();
    private final Group score = new Group();
    private final Group flag = new Group();
    private int n;
    private String placement;
    private String setup;
    private String moveSequence = "";
    private int numPlayers;
    private double mouseX;
    private double mouseY;
    private char zyLoca;
    private void numInput() {
        Label label1 = new Label("Player Number");
        textField = new TextField();
        textField.setPrefWidth(30);
        Button button = new Button("Confirm");
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                numPlayers=Integer.parseInt(textField.getText());
                scoreGener(Integer.parseInt(textField.getText()));
                textField.clear();
                makePlacement(setup);
            }
        });
        HBox hb = new HBox();
        hb.getChildren().addAll(label1, textField, button);
        hb.setSpacing(10);
        hb.setLayoutX(130);
        hb.setLayoutY(BOARD_HEIGHT  - 50);
        controls.getChildren().add(hb);
    }


    /**
     * Authority:Zhoujing Yang
     */
    private void ZyMove(){
        root.setOnMouseClicked(new EventHandler<MouseEvent>() {     //
            @Override
            public void handle(MouseEvent event) {
                mouseX = event.getSceneX();
                mouseY = event.getSceneY();
                zyLoca=getMove(mouseX,mouseY);//get the position of mouseclick
                if (WarringStatesGame.isMoveLegal(placement,getMove(mouseX,mouseY))){
                    moveSequence=moveSequence+getMove(mouseX,mouseY);               //Build moveSequence
                    placement=WarringStatesGame.changeBoard(placement,zyLoca);//get new board placement
                    score.getChildren().clear();//clear previous board setting
                    makePlacement(placement);//change board
                    viewSupporters();
                    flag.getChildren().clear();
                    viewFlags();
                }else{
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Warning");
                    alert.setHeaderText("Invalid move!");
                    alert.showAndWait();
                }
                if (noValidMove(placement)){
                    Text endGame = new Text();
                    int winner = WarringStatesGame.determineTheWinner(setup,moveSequence,numPlayers);
                    endGame.setText("PLAYER " + winner + " WINS THE GAME!!!");
                    endGame.setFill(Color.MAROON);
                    endGame.setFont(Font.font("Tahoma", FontWeight.BOLD, 45));
                    endGame.setX(100);
                    endGame.setY(350);
                    root.getChildren().addAll(endGame);
                }
            }

        });


    }
    //Authority: Zhoujing Yang
    public char getMove(double x, double y){
        int m=0;
        int n=0;
        char zy;
        for (int j=0;j<6;j++){
            if (x>105*j&&x<105*(j+1)){
                m=j;
                for (int k=0;k<6;k++){
                    if (y>105*k&&y<105*(k+1)){
                        n=k;
                        break;
                    }
                }
            }
        }
        char[][]coOrdin={{'4','5','6','7','8','9'},{'Y','Z','0','1','2','3'},{'S','T','U','V','W','X'},{'M','N','O','P','Q','R'},{'G','H','I','J','K','L'},{'A','B','C','D','E','F'}};
        zy=coOrdin[m][n];
        return zy;
    }              //zy's move position

    /**
     * Authority: Zhoujing Yang
     * @param player
     */
    private void scoreGener(int player){
        Rectangle scoreboard=new Rectangle();
        Rectangle tiTle = new Rectangle(633,0,300,41);
        tiTle.setFill(Color.LIGHTBLUE);
        Text titLe = new Text();
        Text P1 = new Text(650,54,String.valueOf(0));
        Text P2 = new Text(800,54,String.valueOf(1));
        Text P3 = new Text(650,410,String.valueOf(2));
        Text P4 = new Text(800,410,String.valueOf(3));
        titLe.setText("Score Board");
        titLe.setFont(Font.font("Tahoma", FontWeight.BOLD, 25));
        titLe.setX(700);
        titLe.setY(33);
        for (int i=0;i<2;i++){
            scoreboard = new Rectangle(633+150*i,46,145,350);
            scoreboard.setFill(Color.LIGHTGRAY);
            root.getChildren().addAll(scoreboard);}
        for (int i=0;i<2;i++){
            scoreboard = new Rectangle(633+150*i,400,145,300);
            scoreboard.setFill(Color.LIGHTGRAY);
            root.getChildren().addAll(scoreboard);}
        root.getChildren().addAll(tiTle,titLe,P1,P2,P3,P4);
    }

    //Authority :Zhoujing Yang
    private void makePlacement(String placement) {
        char[] y1={'4','5','6','7','8','9'};
        char[] y2={'Y','Z','0','1','2','3'};
        char[] y3={'S','T','U','V','W','X'};
        char[] y4={'M','N','O','P','Q','R'};
        char[] y5={'G','H','I','J','K','L'};
        char[] y6={'A','B','C','D','E','F'};//X axis
        char[] x1={'4','Y','S','M','G','A'};
        char[] x2={'5','Z','T','N','H','B'};
        char[] x3={'6','0','U','O','I','C'};
        char[] x4={'7','1','V','P','J','D'};
        char[] x5={'8','2','W','Q','K','E'};
        char[] x6={'9','3','X','R','L','F'};//Y axis
        String[] qin={"秦\nDuke Xiao\n孝公","秦\nShang Yang\n商鞅","秦\nKing Hui\n惠文王","秦\nKing Zhaoxiang\n昭襄王","秦\nLadyMi\n羋八子","秦\nBai Qi\n白起","秦\nLady Zhao\n趙姬","秦\nKing Zheng\n政王"};
        String[] qi={"齊\nKing Xuan\n宣王","齊\nZhong Wuyan\n鍾無艷","齊\nLord Menchang\n孟嘗君","齊\nKing Xiang\n襄王","齊\nQueen Junwang\n君王后","齊\nKing Jian\n建王","齊\nSun Bin\n孫臏"};
        String[] chu={"楚\nWu Qi\n吳起","楚\nKing Kaolie\n考烈王","楚\nKing You\n幽王","楚\nQu Yuan\n屈原","楚\nFuchu\n負芻","楚\nLord Chunshen\n春申君"};
        String[] zhao={"趙\nKing Wuling\n武靈王","趙\nLord Pingyuan\n平原君","趙\nKing Xiaocheng\n孝成王","趙\nLi Mu\n李牧","趙\nLian Po\n廉頗"};
        String[] han={"韓\nMarquess Ai\n韩哀侯","韓\nKing Huanhui\n桓惠王","韓\nKing An\n安王","韓\nHan Fei\n韓非"};
        String[] wei={"魏\nMarquess Wen\n魏文侯","魏\nLord Xinling\n信陵君","魏\nKing Anxi\n安僖王"};
        String[] yan={"燕\nKing Xi\n喜王","燕\nPrince Dan\n太子丹"};
        String[] zhang={"张仪\nZhangyi"};
        for (int i=0;i<placement.length();i=3+i) {
            StackPane stack = new StackPane();
            switch (placement.charAt(i)) {
                case 'a':
                    Rectangle square = new Rectangle(0, 0, 100, 100);
                    square.setFill(Color.RED);
                    int j=Character.getNumericValue(placement.charAt(i+1));
                    Text ooh = new Text();
                    ooh.setText(qin[j]);
                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 11));
                    int x = 0;
                    int y = 0;
                    for (int k=0;k<6;k++){
                        if (y1[k]==placement.charAt(i+2)){
                            x=0;
                        }if (y2[k]==placement.charAt(i+2)){
                            x=105;
                        }if (y3[k]==placement.charAt(i+2)){
                            x=210;
                        }if (y4[k]==placement.charAt(i+2)){
                            x=315;
                        }if (y5[k]==placement.charAt(i+2)){
                            x=420;
                        }if (y6[k]==placement.charAt(i+2)){
                            x=525;
                        }if (x1[k]==placement.charAt(i+2)){
                            y=0;
                        }if (x2[k]==placement.charAt(i+2)){
                            y=105;
                        }if (x3[k]==placement.charAt(i+2)){
                            y=210;
                        }if (x4[k]==placement.charAt(i+2)){
                            y=315;
                        }if (x5[k]==placement.charAt(i+2)){
                            y=420;
                        }if (x6[k]==placement.charAt(i+2)){
                            y=525;
                        }
                    }
                    square.setX(x);
                    square.setY(y);
                    ooh.setX(x+10);
                    ooh.setY(y+40);
                    score.getChildren().addAll(square,ooh);
                    break;
                case'b':
                    square = new Rectangle(0, 0, 100, 100);
                    square.setFill(Color.ORANGE);
                    j=Character.getNumericValue(placement.charAt(i+1));
                    ooh = new Text(qi[j]);
                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 11));
                    x=0;
                    y=0;
                    for (int k=0;k<6;k++){

                        if (y1[k]==placement.charAt(i+2)){
                            x=0;
                        }if (y2[k]==placement.charAt(i+2)){
                            x=105;
                        }if (y3[k]==placement.charAt(i+2)){
                            x=210;
                        }if (y4[k]==placement.charAt(i+2)){
                            x=315;
                        }if (y5[k]==placement.charAt(i+2)){
                            x=420;
                        }if (y6[k]==placement.charAt(i+2)){
                            x=525;
                        }if (x1[k]==placement.charAt(i+2)){
                            y=0;
                        }if (x2[k]==placement.charAt(i+2)){
                            y=105;
                        }if (x3[k]==placement.charAt(i+2)){
                            y=210;
                        }if (x4[k]==placement.charAt(i+2)){
                            y=315;
                        }if (x5[k]==placement.charAt(i+2)){
                            y=420;
                        }if (x6[k]==placement.charAt(i+2)){
                            y=525;
                        }
                    }
                    square.setX(x);
                    square.setY(y);
                    ooh.setX(x+10);
                    ooh.setY(y+40);
                    score.getChildren().addAll(square,ooh);
                    break;
                case 'c':
                    square = new Rectangle(300, 0, 100, 100);
                    square.setFill(Color.YELLOW);
                    j=Character.getNumericValue(placement.charAt(i+1));
                    ooh = new Text(chu[j]);
                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 11));
                    score.getChildren().addAll(square,ooh);
                    x=0;
                    y=0;
                    for (int k=0;k<6;k++){
                        if (y1[k]==placement.charAt(i+2)){
                            x=0;
                        }if (y2[k]==placement.charAt(i+2)){
                            x=105;
                        }if (y3[k]==placement.charAt(i+2)){
                            x=210;
                        }if (y4[k]==placement.charAt(i+2)){
                            x=315;
                        }if (y5[k]==placement.charAt(i+2)){
                            x=420;
                        }if (y6[k]==placement.charAt(i+2)){
                            x=525;
                        }if (x1[k]==placement.charAt(i+2)){
                            y=0;
                        }if (x2[k]==placement.charAt(i+2)){
                            y=105;
                        }if (x3[k]==placement.charAt(i+2)){
                            y=210;
                        }if (x4[k]==placement.charAt(i+2)){
                            y=315;
                        }if (x5[k]==placement.charAt(i+2)){
                            y=420;
                        }if (x6[k]==placement.charAt(i+2)){
                            y=525;
                        }}
                    square.setX(x);
                    square.setY(y);
                    ooh.setX(x+10);
                    ooh.setY(y+40);
                    break;
                case'd':
                    square = new Rectangle(180, 0, 100, 100);
                    square.setFill(Color.GREEN);
                    j=Character.getNumericValue(placement.charAt(i+1));
                    ooh = new Text(zhao[j]);
                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 11));
                    x=0;
                    y=0;
                    for (int k=0;k<6;k++){
                        if (y1[k]==placement.charAt(i+2)){
                            x=0;
                        }if (y2[k]==placement.charAt(i+2)){
                            x=105;
                        }if (y3[k]==placement.charAt(i+2)){
                            x=210;
                        }if (y4[k]==placement.charAt(i+2)){
                            x=315;
                        }if (y5[k]==placement.charAt(i+2)){
                            x=420;
                        }if (y6[k]==placement.charAt(i+2)){
                            x=525;
                        }if (x1[k]==placement.charAt(i+2)){
                            y=0;
                        }if (x2[k]==placement.charAt(i+2)){
                            y=105;
                        }if (x3[k]==placement.charAt(i+2)){
                            y=210;
                        }if (x4[k]==placement.charAt(i+2)){
                            y=315;
                        }if (x5[k]==placement.charAt(i+2)){
                            y=420;
                        }if (x6[k]==placement.charAt(i+2)){
                            y=525;
                        }
                    }
                    square.setX(x);
                    square.setY(y);
                    ooh.setX(x+10);
                    ooh.setY(y+40);
                    score.getChildren().addAll(square,ooh);
                    break;
                case 'e':
                    square = new Rectangle(0, 0, 100, 100);
                    square.setFill(Color.OLIVE);
                    j=Character.getNumericValue(placement.charAt(i+1));
                    ooh = new Text(han[j]);
                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 11));
                    score.getChildren().addAll(square,ooh);
                    x=0;
                    y=0;
                    for (int k=0;k<6;k++){
                        if (y1[k]==placement.charAt(i+2)){
                            x=0;
                        }if (y2[k]==placement.charAt(i+2)){
                            x=105;
                        }if (y3[k]==placement.charAt(i+2)){
                            x=210;
                        }if (y4[k]==placement.charAt(i+2)){
                            x=315;
                        }if (y5[k]==placement.charAt(i+2)){
                            x=420;
                        }if (y6[k]==placement.charAt(i+2)){
                            x=525;
                        }if (x1[k]==placement.charAt(i+2)){
                            y=0;
                        }if (x2[k]==placement.charAt(i+2)){
                            y=105;
                        }if (x3[k]==placement.charAt(i+2)){
                            y=210;
                        }if (x4[k]==placement.charAt(i+2)){
                            y=315;
                        }if (x5[k]==placement.charAt(i+2)){
                            y=420;
                        }if (x6[k]==placement.charAt(i+2)){
                            y=525;
                        }
                    }
                    square.setX(x);
                    square.setY(y);
                    ooh.setX(x+10);
                    ooh.setY(y+40);
                    break;
                case 'f':
                    square = new Rectangle(0, 0, 100, 100);
                    square.setFill(Color.BLUE);
                    j=Character.getNumericValue(placement.charAt(i+1));
                    ooh = new Text(wei[j]);
                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 11));
                    x=0;
                    y=0;
                    for (int k=0;k<6;k++){
                        if (y1[k]==placement.charAt(i+2)){
                            x=0;
                        }if (y2[k]==placement.charAt(i+2)){
                            x=105;
                        }if (y3[k]==placement.charAt(i+2)){
                            x=210;
                        }if (y4[k]==placement.charAt(i+2)){
                            x=315;
                        }if (y5[k]==placement.charAt(i+2)){
                            x=420;
                        }if (y6[k]==placement.charAt(i+2)){
                            x=525;
                        }if (x1[k]==placement.charAt(i+2)){
                            y=0;
                        }if (x2[k]==placement.charAt(i+2)){
                            y=105;
                        }if (x3[k]==placement.charAt(i+2)){
                            y=210;
                        }if (x4[k]==placement.charAt(i+2)){
                            y=315;
                        }if (x5[k]==placement.charAt(i+2)){
                            y=420;
                        }if (x6[k]==placement.charAt(i+2)){
                            y=525;
                        }
                    }
                    square.setX(x);
                    square.setY(y);
                    ooh.setX(x+10);
                    ooh.setY(y+40);
                    score.getChildren().addAll(square,ooh);
                    break;
                case 'g':
                    square = new Rectangle(0, 0, 100, 100);
                    square.setFill(Color.PURPLE);
                    j=Character.getNumericValue(placement.charAt(i+1));
                    ooh = new Text(yan[j]);
                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 11));
                    x=0;
                    y=0;
                    for (int k=0;k<6;k++){
                        if (y1[k]==placement.charAt(i+2)){
                            x=0;
                        }if (y2[k]==placement.charAt(i+2)){
                            x=105;
                        }if (y3[k]==placement.charAt(i+2)){
                            x=210;
                        }if (y4[k]==placement.charAt(i+2)){
                            x=315;
                        }if (y5[k]==placement.charAt(i+2)){
                            x=420;
                        }if (y6[k]==placement.charAt(i+2)){
                            x=525;
                        }if (x1[k]==placement.charAt(i+2)){
                            y=0;
                        }if (x2[k]==placement.charAt(i+2)){
                            y=105;
                        }if (x3[k]==placement.charAt(i+2)){
                            y=210;
                        }if (x4[k]==placement.charAt(i+2)){
                            y=315;
                        }if (x5[k]==placement.charAt(i+2)){
                            y=420;
                        }if (x6[k]==placement.charAt(i+2)){
                            y=525;
                        }
                    }
                    square.setX(x);
                    square.setY(y);
                    ooh.setX(x+10);
                    ooh.setY(y+40);
                    score.getChildren().addAll(square,ooh);
                    break;
                case 'z':
                    square=new Rectangle(0,0,100,100);
                    square.setFill(Color.BLACK);
                    j=Character.getNumericValue(placement.charAt(i+1));
                    ooh = new Text(zhang[0]);
                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 11));
                    ooh.setFill(Color.WHITE);
                    x=0;
                    y=0;
                    for (int k=0;k<6;k++){
                        if (y1[k]==placement.charAt(i+2)){
                            x=0;
                        }if (y2[k]==placement.charAt(i+2)){
                            x=105;
                        }if (y3[k]==placement.charAt(i+2)){
                            x=210;
                        }if (y4[k]==placement.charAt(i+2)){
                            x=315;
                        }if (y5[k]==placement.charAt(i+2)){
                            x=420;
                        }if (y6[k]==placement.charAt(i+2)){
                            x=525;
                        }if (x1[k]==placement.charAt(i+2)){
                            y=0;
                        }if (x2[k]==placement.charAt(i+2)){
                            y=105;
                        }if (x3[k]==placement.charAt(i+2)){
                            y=210;
                        }if (x4[k]==placement.charAt(i+2)){
                            y=315;
                        }if (x5[k]==placement.charAt(i+2)){
                            y=420;
                        }if (x6[k]==placement.charAt(i+2)){
                            y=525;
                        }
                    }
                    square.setX(x);
                    square.setY(y);
                    ooh.setX(x+10);
                    ooh.setY(y+40);
                    score.getChildren().addAll(square,ooh);
                    break;}}}
    //Authority : Ruimin Chu
    private void viewSupporters (){
        String[] qin={"秦   Duke Xiao","秦   Shang Yang","秦   King Hui","秦   King Zhaoxiang","秦   LadyMi","秦   Bai Qi","秦   Lady Zhao","秦   King Zheng"};
        String[] qi={"齊   King Xuan","齊   Zhong Wuyan","齊   Lord Menchang","齊   King Xiang","齊  Queen Junwang","齊   King Jian","齊   Sun Bin"};
        String[] chu={"楚   Wu Qi","楚   King Kaolie","楚   King You","楚  Qu Yuan","楚   Fuchu","楚  Lord Chunshen"};
        String[] zhao={"趙   King Wuling","趙   Lord Pingyuan","趙   King Xiaocheng","趙   Li Mu","趙   Lian Po"};
        String[] han={"韓   Marquess Ai","韓   King Huanhui","韓   King An","韓   Han Fei"};
        String[] wei={"魏  Marquess Wen","魏   Lord Xinling","魏   King Anxi"};
        String[] yan={"燕   King Xi","燕   Prince Dan"};
        for ( int i = 0; i < numPlayers; i++){
            String supporters = WarringStatesGame.getSupporters(setup,moveSequence,numPlayers,i);
            int x1 = 633;
            int y1 = 56;
            if (i % 2 == 1){
                x1 = x1 + 150;
            }
            if (i >1){
                y1 = y1 + 344;
            }
            for ( int j = 0; j < supporters.length(); j+=2){
                Rectangle square = new Rectangle(x1, y1, 145, 20);
                int z=Character.getNumericValue(supporters.charAt(j+1));
                if (supporters.charAt(j)=='a'){
                    square.setFill(Color.RED);
                    Text temp = new Text(x1,y1+15,qin[z]);
                    temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 11.5));
                    root.getChildren().addAll(square,temp);
                    y1+=20;
                } else if (supporters.charAt(j)=='b'){
                    square.setFill(Color.ORANGE);
                    Text temp = new Text(x1,y1+15,qi[z]);
                    temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 11.5));
                    root.getChildren().addAll(square,temp);
                    y1+=20;
                }  else if (supporters.charAt(j)=='c'){
                    square.setFill(Color.YELLOW);
                    Text temp = new Text(x1,y1+15,chu[z]);
                    temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 11.5));
                    root.getChildren().addAll(square,temp);
                    y1+=20;
                }  else if (supporters.charAt(j)=='d') {
                    square.setFill(Color.GREEN);
                    Text temp = new Text(x1,y1+15,zhao[z]);
                    temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 11.5));
                    root.getChildren().addAll(square, temp);
                    y1 += 20;
                }  else if (supporters.charAt(j)=='e') {
                    square.setFill(Color.OLIVE);
                    Text temp = new Text(x1,y1+15,han[z]);
                    temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 11.5));
                    root.getChildren().addAll(square, temp);
                    y1 += 20;
                }  else if (supporters.charAt(j)=='f') {
                    square.setFill(Color.BLUE);
                    Text temp = new Text(x1,y1+15,wei[z]);
                    temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 11.5));
                    root.getChildren().addAll(square, temp);
                    y1 += 20;
                }  else if (supporters.charAt(j)=='g') {
                    square.setFill(Color.PURPLE);
                    Text temp = new Text(x1,y1+15,yan[z]);
                    temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 11.5));
                    root.getChildren().addAll(square, temp);
                    y1 += 20;
                }
            }
        }
    }

    /**
     *
     * @param placement
     * @return true if there is no valid move on the board
     *
     * Authority: Ruimin Chu
     */
    public static boolean noValidMove(String placement){
        for ( int i = 2; i<placement.length(); i += 3){
            if (WarringStatesGame.isMoveLegal(placement,placement.charAt(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * show the flags on score board
     *
     * Authority: Ruimin Chu
     */
    private void viewFlags(){
        int[] flags  = WarringStatesGame.getFlags(setup,moveSequence,numPlayers);
        for (int i = 0; i < numPlayers; i++){
            int x2 = 633;
            int y2 = 375;
            if (i % 2 == 1){
                x2 = x2 + 150;
            }
            if (i > 1){
                y2 = y2 + 300;
            }
            for (int j = 0; j < flags.length; j++){
                Rectangle square = new Rectangle(x2, y2, 20, 20);
                if ( flags[j] == i){
                    if ( j ==0 ){
                        square.setFill(Color.RED);
                        Text temp = new Text(x2,y2+15,"Qin");
                        temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 10));
                        flag.getChildren().addAll(square, temp);
                        flag.toFront();
                        x2 += 20;
                    } else if ( j == 1 ){
                        square.setFill(Color.ORANGE);
                        Text temp = new Text(x2,y2+15,"Qi");
                        temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 10));
                        flag.getChildren().addAll(square, temp);
                        flag.toFront();
                        x2 += 20;
                    } else if ( j == 2 ){
                        square.setFill(Color.YELLOW);
                        Text temp = new Text(x2,y2+15,"Chu");
                        temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 10));
                        flag.getChildren().addAll(square, temp);
                        flag.toFront();
                        x2 += 20;
                    } else if ( j == 3 ){
                        square.setFill(Color.GREEN);
                        Text temp = new Text(x2,y2+15,"Zhao");
                        temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 10));
                        flag.getChildren().addAll(square, temp);
                        flag.toFront();
                        x2 += 20;
                    } else if ( j == 4 ){
                        square.setFill(Color.OLIVE);
                        Text temp = new Text(x2,y2+15,"Han");
                        temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 10));
                        flag.getChildren().addAll(square, temp);
                        flag.toFront();
                        x2 += 20;
                    } else if ( j == 5 ){
                        square.setFill(Color.BLUE);
                        Text temp = new Text(x2,y2+15,"Wei");
                        temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 10));
                        flag.getChildren().addAll(square, temp);
                        flag.toFront();
                        x2 += 20;
                    } else if ( j == 6 ){
                        square.setFill(Color.PURPLE);
                        Text temp = new Text(x2,y2+15,"Yan");
                        temp.setFont(Font.font("Tahoma", FontWeight.BOLD, 10));
                        flag.getChildren().addAll(square, temp);
                        flag.toFront();
                        x2 += 20;
                    }
                }
            }
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Warring States ");
        Random rand = new Random();
        n = rand.nextInt(19);
        setup=PLACEMENTS[n];
        placement=setup;
        root.getChildren().add(flag);
        root.getChildren().add(score);
        root.getChildren().add(controls);
        ZyMove();
        Scene scene = new Scene(root,BOARD_WIDTH, BOARD_HEIGHT );
        numInput();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}




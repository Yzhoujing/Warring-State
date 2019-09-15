package comp1110.ass2.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * A very simple viewer for card layouts in the Warring States game.
 * <p>
 * NOTE: This class is separate from your main game class.  This
 * class does not play a game, it just illustrates various card placements.
 *
 * authority: Zhoujing Yang
 */
public class Viewer extends Application {

    private static final int VIEWER_WIDTH = 933;
    private static final int VIEWER_HEIGHT = 700;

    private static final String URI_BASE = "assets/";

    private final Group root = new Group();
    private final Group controls = new Group();
    TextField textField;

    /**
     * Draw a placement in the window, removing any previously drawn one
     *
     * @param placement A valid placement string
     */
    void makePlacement(String placement) {
        // FIXME Task 4: implement the simple placement viewer
        char[] y1={'4','5','6','7','8','9'};
        char[] y2={'Y','Z','0','1','2','3'};
        char[] y3={'S','T','U','V','W','X'};
        char[] y4={'M','N','O','P','Q','R'};
        char[] y5={'G','H','I','J','K','L'};
        char[] y6={'A','B','C','D','E','F'};//X轴坐标
        char[] x1={'4','Y','S','M','G','A'};
        char[] x2={'5','Z','T','N','H','B'};
        char[] x3={'6','0','U','O','I','C'};
        char[] x4={'7','1','V','P','J','D'};
        char[] x5={'8','2','W','Q','K','E'};
        char[] x6={'9','3','X','R','L','F'};//Y轴坐标
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
                ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 11.5));
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
                root.getChildren().addAll(square,ooh);
                break;
                case'b':
                    square = new Rectangle(0, 0, 100, 100);
                    square.setFill(Color.ORANGE);
                    j=Character.getNumericValue(placement.charAt(i+1));
                    ooh = new Text(qi[j]);
                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
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
                    root.getChildren().addAll(square,ooh);
                    break;
                case 'c':
                    square = new Rectangle(300, 0, 100, 100);
                    square.setFill(Color.YELLOW);
                    j=Character.getNumericValue(placement.charAt(i+1));
                    ooh = new Text(chu[j]);
                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
                    root.getChildren().addAll(square,ooh);
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
                    ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
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
                        root.getChildren().addAll(square,ooh);
                        break;
                 case 'e':
                square = new Rectangle(0, 0, 100, 100);
                square.setFill(Color.OLIVE);
                j=Character.getNumericValue(placement.charAt(i+1));
                ooh = new Text(han[j]);
                ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 11.5));
                     root.getChildren().addAll(square,ooh);
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
                ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
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
                     root.getChildren().addAll(square,ooh);
                     break;
                 case 'g':
                square = new Rectangle(0, 0, 100, 100);
                square.setFill(Color.PURPLE);
                j=Character.getNumericValue(placement.charAt(i+1));
                ooh = new Text(yan[j]);
                ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
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
                     root.getChildren().addAll(square,ooh);
                     break;
                 case 'z':
                     square=new Rectangle(0,0,100,100);
                     square.setFill(Color.BLACK);
                     j=Character.getNumericValue(placement.charAt(i+1));
                     ooh = new Text(zhang[0]);
                     ooh.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
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
                     root.getChildren().addAll(square,ooh);
             break;}}}




    /**
     * Create a basic text field for input and a refresh button.
     */
    private void makeControls() {
        Label label1 = new Label("Placement:");
        textField = new TextField();
        textField.setPrefWidth(300);
        Button button = new Button("Refresh");
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                makePlacement(textField.getText());
                textField.clear();
            }
        });
        HBox hb = new HBox();
        hb.getChildren().addAll(label1, textField, button);
        hb.setSpacing(10);
        hb.setLayoutX(130);
        hb.setLayoutY(VIEWER_HEIGHT - 50);
        controls.getChildren().add(hb);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Warring States Viewer");
        Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);
        root.getChildren().add(controls);

        makeControls();

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

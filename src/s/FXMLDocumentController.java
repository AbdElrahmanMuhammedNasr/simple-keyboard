package s;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private HBox v1, v2, v3, v4, v31;    
    
    @FXML
    private JFXButton capsLock,tab,space,shift,shift2;
    
    @FXML
    private JFXButton bq, bw, be, br, bt, by, bu, bi, bo, bp,ba, bs, bd, bf, bg, bh, bj, bk, bl,bz, bx, bc, bv, bb, bn, bm,
            b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;  

    
    @FXML
    private JFXTextArea text;
    
    @FXML
    public JFXButton[] ar ;
    
    public void initializeButtonArray() {        
        
        ar = new JFXButton[36];        
        ar[0] = bq;  ar[1] = bw;   ar[2] = be;    ar[3] = br;
        ar[4] = bt;  ar[5] = by;   ar[6] = bu;    ar[7] = bi;
        ar[8] = bo;  ar[9] = bp;   ar[10] = ba;   ar[11] = bs;
        ar[12]= bd;  ar[13] = bf;  ar[14] = bg;   ar[15] = bh;
        ar[16]= bj;  ar[17] = bk;  ar[18] = bl;   ar[19] = bz;  ar[20] = bx;
        ar[21] = bc; ar[22] = bv;  ar[23] = bb;   ar[24] = bn;  ar[25] = bm;
        
        ar[26] = b1; ar[27] = b2;  ar[28] = b3;   ar[29] = b4;  ar[30] = b5;
        ar[31] = b6; ar[32] = b7;  ar[33] = b8;   ar[34] = b9;  ar[35] = b0;
    }    
    
    boolean cpa = true;
    boolean ta = true;
    
    @FXML
    void cont(MouseEvent event) {
        if (event.getSource() == capsLock) {
            if (cpa == true) {
                capsLock.setBackground(new Background(new BackgroundFill(Color.GREENYELLOW, new CornerRadii(0), new Insets(0))));
                for(int i=0; i<26; i++){
                    ar[i].setText(ar[i].getText().substring(0,1).toUpperCase());
                }
                cpa = false;
            } else {
                capsLock.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(0), new Insets(0))));
                 for(int i=0; i<26; i++){
                    ar[i].setText(ar[i].getText().toLowerCase());
                }
                cpa = true;
            }
        } 
        
        else if(event.getSource()==shift || event.getSource()==shift2){
            if (ta == true) {
                shift.setBackground(new Background(new BackgroundFill(Color.GREENYELLOW, new CornerRadii(0), new Insets(0))));
                shift2.setBackground(new Background(new BackgroundFill(Color.GREENYELLOW, new CornerRadii(0), new Insets(0))));
                ta = false;
            } else {
                shift.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(0), new Insets(0))));
                shift2.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(0), new Insets(0))));
                ta = true;
            }
        }
        
        else if(event.getSource()==tab){
            text.setText(text.getText()+"\t");
        }
        else if(event.getSource()==space){
            text.setText(text.getText()+" ");   
        }
        
        
        else {
            for (int i = 0; i < 35; i++) {
                if (event.getSource() == ar[i]) {
                    text.setText(text.getText() + ar[i].getText());
                    
                }
            }
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        v1.setSpacing(10);
        v2.setSpacing(10);
        v3.setSpacing(10);
        v4.setSpacing(10);
        v31.setSpacing(10);
        initializeButtonArray();
        
    }    
    
}

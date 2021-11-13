/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.isu.cs.cs2263;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage stage)throws Exception{
        Scene sc = new Scene(buildGrid(stage));
        stage.setScene(sc);
        stage.show();
    }

    private GridPane buildGrid(Stage stage){
        stage.setTitle("Acquire");
        //Labels for Letters
        Label aLabel = new Label ("A");
        Label bLabel = new Label ("B");
        Label cLabel = new Label ("C");
        Label dLabel = new Label ("D");
        Label eLabel = new Label ("E");
        Label fLabel = new Label ("F");
        Label gLabel = new Label ("G");
        Label hLabel = new Label ("H");
        Label iLabel = new Label ("I");
        //Labels for Numbers
        Label oneLabel = new Label ("1");
        oneLabel.setMinWidth(25);
        oneLabel.setAlignment(Pos.CENTER);
        Label twoLabel = new Label ("2");
        twoLabel.setMinWidth(25);
        twoLabel.setAlignment(Pos.CENTER);
        Label threeLabel = new Label ("3");
        threeLabel.setMinWidth(25);
        threeLabel.setAlignment(Pos.CENTER);
        Label fourLabel = new Label ("4");
        fourLabel.setMinWidth(25);
        fourLabel.setAlignment(Pos.CENTER);
        Label fiveLabel = new Label ("5");
        fiveLabel.setMinWidth(25);
        fiveLabel.setAlignment(Pos.CENTER);
        Label sixLabel = new Label ("6");
        sixLabel.setMinWidth(25);
        sixLabel.setAlignment(Pos.CENTER);
        Label sevenLabel = new Label ("7");
        sevenLabel.setMinWidth(25);
        sevenLabel.setAlignment(Pos.CENTER);
        Label eightLabel = new Label ("8");
        eightLabel.setMinWidth(25);
        eightLabel.setAlignment(Pos.CENTER);
        Label nineLabel = new Label ("9");
        nineLabel.setMinWidth(25);
        nineLabel.setAlignment(Pos.CENTER);
        Label tenLabel = new Label ("10");
        tenLabel.setMinWidth(25);
        tenLabel.setAlignment(Pos.CENTER);
        Label elevenLabel = new Label ("11");
        elevenLabel.setMinWidth(25);
        elevenLabel.setAlignment(Pos.CENTER);
        Label twelveLabel = new Label ("12");
        twelveLabel.setMinWidth(25);
        twelveLabel.setAlignment(Pos.CENTER);
        //Labels for Literally Everything
        Label aOneLabel = new Label("A1");
        aOneLabel.setMinSize(25,20);
        aOneLabel.setAlignment(Pos.CENTER);

        Label aTwoLabel = new Label("A2");
        aTwoLabel.setMinSize(25,20);
        aTwoLabel.setAlignment(Pos.CENTER);

        Label aThreeLabel = new Label("A3");
        aThreeLabel.setMinSize(25,20);
        aThreeLabel.setAlignment(Pos.CENTER);

        Label aFourLabel = new Label("A4");
        aFourLabel.setMinSize(25,20);
        aFourLabel.setAlignment(Pos.CENTER);

        Label aFiveLabel = new Label("A5");
        aFiveLabel.setMinSize(25,20);
        aFiveLabel.setAlignment(Pos.CENTER);

        Label aSixLabel = new Label("A6");
        aSixLabel.setMinSize(25,20);
        aSixLabel.setAlignment(Pos.CENTER);

        Label aSevenLabel = new Label("A7");
        aSevenLabel.setMinSize(25,20);
        aSevenLabel.setAlignment(Pos.CENTER);

        Label aEightLabel = new Label("A8");
        aEightLabel.setMinSize(25,20);
        aEightLabel.setAlignment(Pos.CENTER);

        Label aNineLabel = new Label("A9");
        aNineLabel.setMinSize(25,20);
        aNineLabel.setAlignment(Pos.CENTER);

        Label aTenLabel = new Label("A10");
        aTenLabel.setMinSize(25,20);
        aTenLabel.setAlignment(Pos.CENTER);

        Label aElevenLabel = new Label("A11");
        aElevenLabel.setMinSize(25,20);
        aElevenLabel.setAlignment(Pos.CENTER);

        Label aTwelveLabel = new Label("A12");
        aTwelveLabel.setMinSize(25,20);
        aTwelveLabel.setAlignment(Pos.CENTER);


        Label bOneLabel = new Label("B1");
        bOneLabel.setMinSize(25,20);
        bOneLabel.setAlignment(Pos.CENTER);

        Label bTwoLabel = new Label("B2");
        bTwoLabel.setMinSize(25,20);
        bTwoLabel.setAlignment(Pos.CENTER);

        Label bThreeLabel = new Label("B3");
        bThreeLabel.setMinSize(25,20);
        bThreeLabel.setAlignment(Pos.CENTER);

        Label bFourLabel = new Label("B4");
        bFourLabel.setMinSize(25,20);
        bFourLabel.setAlignment(Pos.CENTER);

        Label bFiveLabel = new Label("B5");
        bFiveLabel.setMinSize(25,20);
        bFiveLabel.setAlignment(Pos.CENTER);

        Label bSixLabel = new Label("B6");
        bSixLabel.setMinSize(25,20);
        bSixLabel.setAlignment(Pos.CENTER);

        Label bSevenLabel = new Label("B7");
        bSevenLabel.setMinSize(25,20);
        bSevenLabel.setAlignment(Pos.CENTER);

        Label bEightLabel = new Label("B8");
        bEightLabel.setMinSize(25,20);
        bEightLabel.setAlignment(Pos.CENTER);

        Label bNineLabel = new Label("B9");
        bNineLabel.setMinSize(25,20);
        bNineLabel.setAlignment(Pos.CENTER);

        Label bTenLabel = new Label("B10");
        bTenLabel.setMinSize(25,20);
        bTenLabel.setAlignment(Pos.CENTER);

        Label bElevenLabel = new Label("B11");
        bElevenLabel.setMinSize(25,20);
        bElevenLabel.setAlignment(Pos.CENTER);

        Label bTwelveLabel = new Label("B12");
        bTwelveLabel.setMinSize(25,20);
        bTwelveLabel.setAlignment(Pos.CENTER);


        Label cOneLabel = new Label("C1");
        cOneLabel.setMinSize(25,20);
        cOneLabel.setAlignment(Pos.CENTER);

        Label cTwoLabel = new Label("C2");
        cTwoLabel.setMinSize(25,20);
        cTwoLabel.setAlignment(Pos.CENTER);

        Label cThreeLabel = new Label("C3");
        cThreeLabel.setMinSize(25,20);
        cThreeLabel.setAlignment(Pos.CENTER);

        Label cFourLabel = new Label("C4");
        cFourLabel.setMinSize(25,20);
        cFourLabel.setAlignment(Pos.CENTER);

        Label cFiveLabel = new Label("C5");
        cFiveLabel.setMinSize(25,20);
        cFiveLabel.setAlignment(Pos.CENTER);

        Label cSixLabel = new Label("C6");
        cSixLabel.setMinSize(25,20);
        cSixLabel.setAlignment(Pos.CENTER);

        Label cSevenLabel = new Label("C7");
        cSevenLabel.setMinSize(25,20);
        cSevenLabel.setAlignment(Pos.CENTER);

        Label cEightLabel = new Label("C8");
        cEightLabel.setMinSize(25,20);
        cEightLabel.setAlignment(Pos.CENTER);

        Label cNineLabel = new Label("C9");
        cNineLabel.setMinSize(25,20);
        cNineLabel.setAlignment(Pos.CENTER);

        Label cTenLabel = new Label("C10");
        cTenLabel.setMinSize(25,20);
        cTenLabel.setAlignment(Pos.CENTER);

        Label cElevenLabel = new Label("C11");
        cElevenLabel.setMinSize(25,20);
        cElevenLabel.setAlignment(Pos.CENTER);

        Label cTwelveLabel = new Label("C12");
        cTwelveLabel.setMinSize(25,20);
        cTwelveLabel.setAlignment(Pos.CENTER);


        Label dOneLabel = new Label("D1");
        dOneLabel.setMinSize(25,20);
        dOneLabel.setAlignment(Pos.CENTER);

        Label dTwoLabel = new Label("D2");
        dTwoLabel.setMinSize(25,20);
        dTwoLabel.setAlignment(Pos.CENTER);

        Label dThreeLabel = new Label("D3");
        dThreeLabel.setMinSize(25,20);
        dThreeLabel.setAlignment(Pos.CENTER);

        Label dFourLabel = new Label("D4");
        dFourLabel.setMinSize(25,20);
        dFourLabel.setAlignment(Pos.CENTER);

        Label dFiveLabel = new Label("D5");
        dFiveLabel.setMinSize(25,20);
        dFiveLabel.setAlignment(Pos.CENTER);

        Label dSixLabel = new Label("D6");
        dSixLabel.setMinSize(25,20);
        dSixLabel.setAlignment(Pos.CENTER);

        Label dSevenLabel = new Label("D7");
        dSevenLabel.setMinSize(25,20);
        dSevenLabel.setAlignment(Pos.CENTER);

        Label dEightLabel = new Label("D8");
        dEightLabel.setMinSize(25,20);
        dEightLabel.setAlignment(Pos.CENTER);

        Label dNineLabel = new Label("D9");
        dNineLabel.setMinSize(25,20);
        dNineLabel.setAlignment(Pos.CENTER);

        Label dTenLabel = new Label("D10");
        dTenLabel.setMinSize(25,20);
        dTenLabel.setAlignment(Pos.CENTER);

        Label dElevenLabel = new Label("D11");
        dElevenLabel.setMinSize(25,20);
        dElevenLabel.setAlignment(Pos.CENTER);

        Label dTwelveLabel = new Label("D12");
        dTwelveLabel.setMinSize(25,20);
        dTwelveLabel.setAlignment(Pos.CENTER);


        Label eOneLabel = new Label("E1");
        eOneLabel.setMinSize(25,20);
        eOneLabel.setAlignment(Pos.CENTER);

        Label eTwoLabel = new Label("E2");
        eTwoLabel.setMinSize(25,20);
        eTwoLabel.setAlignment(Pos.CENTER);

        Label eThreeLabel = new Label("E3");
        eThreeLabel.setMinSize(25,20);
        eThreeLabel.setAlignment(Pos.CENTER);

        Label eFourLabel = new Label("E4");
        eFourLabel.setMinSize(25,20);
        eFourLabel.setAlignment(Pos.CENTER);

        Label eFiveLabel = new Label("E5");
        eFiveLabel.setMinSize(25,20);
        eFiveLabel.setAlignment(Pos.CENTER);

        Label eSixLabel = new Label("E6");
        eSixLabel.setMinSize(25,20);
        eSixLabel.setAlignment(Pos.CENTER);

        Label eSevenLabel = new Label("E7");
        eSevenLabel.setMinSize(25,20);
        eSevenLabel.setAlignment(Pos.CENTER);

        Label eEightLabel = new Label("E8");
        eEightLabel.setMinSize(25,20);
        eEightLabel.setAlignment(Pos.CENTER);

        Label eNineLabel = new Label("E9");
        eNineLabel.setMinSize(25,20);
        eNineLabel.setAlignment(Pos.CENTER);

        Label eTenLabel = new Label("E10");
        eTenLabel.setMinSize(25,20);
        eTenLabel.setAlignment(Pos.CENTER);

        Label eElevenLabel = new Label("E11");
        eElevenLabel.setMinSize(25,20);
        eElevenLabel.setAlignment(Pos.CENTER);

        Label eTwelveLabel = new Label("E12");
        eTwelveLabel.setMinSize(25,20);
        eTwelveLabel.setAlignment(Pos.CENTER);


        Label fOneLabel = new Label("F1");
        fOneLabel.setMinSize(25,20);
        fOneLabel.setAlignment(Pos.CENTER);

        Label fTwoLabel = new Label("F2");
        fTwoLabel.setMinSize(25,20);
        fTwoLabel.setAlignment(Pos.CENTER);

        Label fThreeLabel = new Label("F3");
        fThreeLabel.setMinSize(25,20);
        fThreeLabel.setAlignment(Pos.CENTER);

        Label fFourLabel = new Label("F4");
        fFourLabel.setMinSize(25,20);
        fFourLabel.setAlignment(Pos.CENTER);

        Label fFiveLabel = new Label("F5");
        fFiveLabel.setMinSize(25,20);
        fFiveLabel.setAlignment(Pos.CENTER);

        Label fSixLabel = new Label("F6");
        fSixLabel.setMinSize(25,20);
        fSixLabel.setAlignment(Pos.CENTER);

        Label fSevenLabel = new Label("F7");
        fSevenLabel.setMinSize(25,20);
        fSevenLabel.setAlignment(Pos.CENTER);

        Label fEightLabel = new Label("F8");
        fEightLabel.setMinSize(25,20);
        fEightLabel.setAlignment(Pos.CENTER);

        Label fNineLabel = new Label("F9");
        fNineLabel.setMinSize(25,20);
        fNineLabel.setAlignment(Pos.CENTER);

        Label fTenLabel = new Label("F10");
        fTenLabel.setMinSize(25,20);
        fTenLabel.setAlignment(Pos.CENTER);

        Label fElevenLabel = new Label("F11");
        fElevenLabel.setMinSize(25,20);
        fElevenLabel.setAlignment(Pos.CENTER);

        Label fTwelveLabel = new Label("F12");
        fTwelveLabel.setMinSize(25,20);
        fTwelveLabel.setAlignment(Pos.CENTER);



        Label gOneLabel = new Label("G1");
        gOneLabel.setMinSize(25,20);
        gOneLabel.setAlignment(Pos.CENTER);

        Label gTwoLabel = new Label("G2");
        gTwoLabel.setMinSize(25,20);
        gTwoLabel.setAlignment(Pos.CENTER);

        Label gThreeLabel = new Label("G3");
        gThreeLabel.setMinSize(25,20);
        gThreeLabel.setAlignment(Pos.CENTER);

        Label gFourLabel = new Label("G4");
        gFourLabel.setMinSize(25,20);
        gFourLabel.setAlignment(Pos.CENTER);

        Label gFiveLabel = new Label("G5");
        gFiveLabel.setMinSize(25,20);
        gFiveLabel.setAlignment(Pos.CENTER);

        Label gSixLabel = new Label("G6");
        gSixLabel.setMinSize(25,20);
        gSixLabel.setAlignment(Pos.CENTER);

        Label gSevenLabel = new Label("G7");
        gSevenLabel.setMinSize(25,20);
        gSevenLabel.setAlignment(Pos.CENTER);

        Label gEightLabel = new Label("G8");
        gEightLabel.setMinSize(25,20);
        gEightLabel.setAlignment(Pos.CENTER);

        Label gNineLabel = new Label("G9");
        gNineLabel.setMinSize(25,20);
        gNineLabel.setAlignment(Pos.CENTER);

        Label gTenLabel = new Label("G10");
        gTenLabel.setMinSize(25,20);
        gTenLabel.setAlignment(Pos.CENTER);

        Label gElevenLabel = new Label("G11");
        gElevenLabel.setMinSize(25,20);
        gElevenLabel.setAlignment(Pos.CENTER);

        Label gTwelveLabel = new Label("G12");
        gTwelveLabel.setMinSize(25,20);
        gTwelveLabel.setAlignment(Pos.CENTER);


        Label hOneLabel = new Label("H1");
        hOneLabel.setMinSize(25,20);
        hOneLabel.setAlignment(Pos.CENTER);

        Label hTwoLabel = new Label("H2");
        hTwoLabel.setMinSize(25,20);
        hTwoLabel.setAlignment(Pos.CENTER);

        Label hThreeLabel = new Label("H3");
        hThreeLabel.setMinSize(25,20);
        hThreeLabel.setAlignment(Pos.CENTER);

        Label hFourLabel = new Label("H4");
        hFourLabel.setMinSize(25,20);
        hFourLabel.setAlignment(Pos.CENTER);

        Label hFiveLabel = new Label("H5");
        hFiveLabel.setMinSize(25,20);
        hFiveLabel.setAlignment(Pos.CENTER);

        Label hSixLabel = new Label("H6");
        hSixLabel.setMinSize(25,20);
        hSixLabel.setAlignment(Pos.CENTER);

        Label hSevenLabel = new Label("H7");
        hSevenLabel.setMinSize(25,20);
        hSevenLabel.setAlignment(Pos.CENTER);

        Label hEightLabel = new Label("H8");
        hEightLabel.setMinSize(25,20);
        hEightLabel.setAlignment(Pos.CENTER);

        Label hNineLabel = new Label("H9");
        hNineLabel.setMinSize(25,20);
        hNineLabel.setAlignment(Pos.CENTER);

        Label hTenLabel = new Label("H10");
        hTenLabel.setMinSize(25,20);
        hTenLabel.setAlignment(Pos.CENTER);

        Label hElevenLabel = new Label("H11");
        hElevenLabel.setMinSize(25,20);
        hElevenLabel.setAlignment(Pos.CENTER);

        Label hTwelveLabel = new Label("H12");
        hTwelveLabel.setMinSize(25,20);
        hTwelveLabel.setAlignment(Pos.CENTER);


        Label iOneLabel = new Label("I1");
        iOneLabel.setMinSize(25,20);
        iOneLabel.setAlignment(Pos.CENTER);

        Label iTwoLabel = new Label("I2");
        iTwoLabel.setMinSize(25,20);
        iTwoLabel.setAlignment(Pos.CENTER);

        Label iThreeLabel = new Label("I3");
        iThreeLabel.setMinSize(25,20);
        iThreeLabel.setAlignment(Pos.CENTER);

        Label iFourLabel = new Label("I4");
        iFourLabel.setMinSize(25,20);
        iFourLabel.setAlignment(Pos.CENTER);

        Label iFiveLabel = new Label("I5");
        iFiveLabel.setMinSize(25,20);
        iFiveLabel.setAlignment(Pos.CENTER);

        Label iSixLabel = new Label("I6");
        iSixLabel.setMinSize(25,20);
        iSixLabel.setAlignment(Pos.CENTER);

        Label iSevenLabel = new Label("I7");
        iSevenLabel.setMinSize(25,20);
        iSevenLabel.setAlignment(Pos.CENTER);

        Label iEightLabel = new Label("I8");
        iEightLabel.setMinSize(25,20);
        iEightLabel.setAlignment(Pos.CENTER);

        Label iNineLabel = new Label("I9");
        iNineLabel.setMinSize(25,20);
        iNineLabel.setAlignment(Pos.CENTER);

        Label iTenLabel = new Label("I10");
        iTenLabel.setMinSize(25,20);
        iTenLabel.setAlignment(Pos.CENTER);

        Label iElevenLabel = new Label("I11");
        iElevenLabel.setMinSize(25,20);
        iElevenLabel.setAlignment(Pos.CENTER);

        Label iTwelveLabel = new Label("I12");
        iTwelveLabel.setMinSize(25,20);
        iTwelveLabel.setAlignment(Pos.CENTER);

        //Buttons
        Button loadButton = new Button("Load Game");
        Button saveButton = new Button("Save Game");
        Button hotelButton = new Button("Hotels");
        Button stocksButton = new Button("Stocks");
        Button infoButton = new Button("Info");
        //Player Info
        Label pLabel = new Label("PLAYER INFO:");

        Label tLabel = new Label("TILES: 1.-- 2.-- 3.-- 4.-- 5.-- 6.--");

        Label mLabel = new Label("MONEY: $----");
        //grid setup
        GridPane gp = new  GridPane();
        gp.add(oneLabel,1,0);
        gp.add(twoLabel,2,0);
        gp.add(threeLabel,3,0);
        gp.add(fourLabel,4,0);
        gp.add(fiveLabel,5,0);
        gp.add(sixLabel,6,0);
        gp.add(sevenLabel,7,0);
        gp.add(eightLabel,8,0);
        gp.add(nineLabel,9,0);
        gp.add(tenLabel,10,0);
        gp.add(elevenLabel,11,0);
        gp.add(twelveLabel,12,0);

        gp.add(aLabel,0,1);
        gp.add(aOneLabel,1,1);
        gp.add(aTwoLabel,2,1);
        gp.add(aThreeLabel,3,1);
        gp.add(aFourLabel,4,1);
        gp.add(aFiveLabel,5,1);
        gp.add(aSixLabel,6,1);
        gp.add(aSevenLabel,7,1);
        gp.add(aEightLabel,8,1);
        gp.add(aNineLabel,9,1);
        gp.add(aTenLabel,10,1);
        gp.add(aElevenLabel,11,1);
        gp.add(aTwelveLabel,12,1);

        gp.add(bLabel,0,2);
        gp.add(bOneLabel,1,2);
        gp.add(bTwoLabel,2,2);
        gp.add(bThreeLabel,3,2);
        gp.add(bFourLabel,4,2);
        gp.add(bFiveLabel,5,2);
        gp.add(bSixLabel,6,2);
        gp.add(bSevenLabel,7,2);
        gp.add(bEightLabel,8,2);
        gp.add(bNineLabel,9,2);
        gp.add(bTenLabel,10,2);
        gp.add(bElevenLabel,11,2);
        gp.add(bTwelveLabel,12,2);


        gp.add(cLabel,0,3);
        gp.add(cOneLabel,1,3);
        gp.add(cTwoLabel,2,3);
        gp.add(cThreeLabel,3,3);
        gp.add(cFourLabel,4,3);
        gp.add(cFiveLabel,5,3);
        gp.add(cSixLabel,6,3);
        gp.add(cSevenLabel,7,3);
        gp.add(cEightLabel,8,3);
        gp.add(cNineLabel,9,3);
        gp.add(cTenLabel,10,3);
        gp.add(cElevenLabel,11,3);
        gp.add(cTwelveLabel,12,3);

        gp.add(dLabel,0,4);
        gp.add(dOneLabel,1,4);
        gp.add(dTwoLabel,2,4);
        gp.add(dThreeLabel,3,4);
        gp.add(dFourLabel,4,4);
        gp.add(dFiveLabel,5,4);
        gp.add(dSixLabel,6,4);
        gp.add(dSevenLabel,7,4);
        gp.add(dEightLabel,8,4);
        gp.add(dNineLabel,9,4);
        gp.add(dTenLabel,10,4);
        gp.add(dElevenLabel,11,4);
        gp.add(dTwelveLabel,12,4);

        gp.add(eLabel,0,5);
        gp.add(eOneLabel,1,5);
        gp.add(eTwoLabel,2,5);
        gp.add(eThreeLabel,3,5);
        gp.add(eFourLabel,4,5);
        gp.add(eFiveLabel,5,5);
        gp.add(eSixLabel,6,5);
        gp.add(eSevenLabel,7,5);
        gp.add(eEightLabel,8,5);
        gp.add(eNineLabel,9,5);
        gp.add(eTenLabel,10,5);
        gp.add(eElevenLabel,11,5);
        gp.add(eTwelveLabel,12,5);

        gp.add(fLabel,0,6);
        gp.add(fOneLabel,1,6);
        gp.add(fTwoLabel,2,6);
        gp.add(fThreeLabel,3,6);
        gp.add(fFourLabel,4,6);
        gp.add(fFiveLabel,5,6);
        gp.add(fSixLabel,6,6);
        gp.add(fSevenLabel,7,6);
        gp.add(fEightLabel,8,6);
        gp.add(fNineLabel,9,6);
        gp.add(fTenLabel,10,6);
        gp.add(fElevenLabel,11,6);
        gp.add(fTwelveLabel,12,6);

        gp.add(gLabel,0,7);
        gp.add(gOneLabel,1,7);
        gp.add(gTwoLabel,2,7);
        gp.add(gThreeLabel,3,7);
        gp.add(gFourLabel,4,7);
        gp.add(gFiveLabel,5,7);
        gp.add(gSixLabel,6,7);
        gp.add(gSevenLabel,7,7);
        gp.add(gEightLabel,8,7);
        gp.add(gNineLabel,9,7);
        gp.add(gTenLabel,10,7);
        gp.add(gElevenLabel,11,7);
        gp.add(gTwelveLabel,12,7);

        gp.add(hLabel,0,8);
        gp.add(hOneLabel,1,8);
        gp.add(hTwoLabel,2,8);
        gp.add(hThreeLabel,3,8);
        gp.add(hFourLabel,4,8);
        gp.add(hFiveLabel,5,8);
        gp.add(hSixLabel,6,8);
        gp.add(hSevenLabel,7,8);
        gp.add(hEightLabel,8,8);
        gp.add(hNineLabel,9,8);
        gp.add(hTenLabel,10,8);
        gp.add(hElevenLabel,11,8);
        gp.add(hTwelveLabel,12,8);

        gp.add(iLabel,0,9);
        gp.add(iOneLabel,1,9);
        gp.add(iTwoLabel,2,9);
        gp.add(iThreeLabel,3,9);
        gp.add(iFourLabel,4,9);
        gp.add(iFiveLabel,5,9);
        gp.add(iSixLabel,6,9);
        gp.add(iSevenLabel,7,9);
        gp.add(iEightLabel,8,9);
        gp.add(iNineLabel,9,9);
        gp.add(iTenLabel,10,9);
        gp.add(iElevenLabel,11,9);
        gp.add(iTwelveLabel,12,9);

        GridPane buttonPane = new GridPane();
        buttonPane.add(loadButton,0,1);
        buttonPane.add(saveButton,1,1);
        buttonPane.add(tLabel,2,1);
        buttonPane.add(mLabel,3,1);
        buttonPane.add(hotelButton,4,1);
        buttonPane.add(stocksButton,5,1);
        buttonPane.add(infoButton,6,1);
        buttonPane.add(pLabel,2,0);
        gp.add(buttonPane,0,16,13,2);

        return gp;





    }







}

    /*//Start App
        Game g = new Game();
        int PlayerID = g.determineFirst();

        //Play a Tile
        Player p = new Player(99,"Free");
        g.playTile(new Tile(1,1));
        List<Tile> testFound = g.playTile(new Tile(2,1));
        g.foundHotel(0, 0, testFound);
        g.playTile(new Tile(1,2));

        //Buy Stock
        g.buyStock(1,0,3);

        //Save Game
        //g.saveGame("test.txt");

        //Load Game
        g.loadGame("test.txt");

        Player pp = new Player(99,"Free");*/

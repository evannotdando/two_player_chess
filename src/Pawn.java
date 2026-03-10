import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Pawn {
    private boolean isWhite;
    private boolean firstTurn = true;
    private int row;
    private int col;
    private ImageIcon pieceImage;


    public Pawn(boolean isWhite, int row, int col) {
        this.isWhite = isWhite;
        this.firstTurn = firstTurn;
        this.row = row;
        this.col = col;
        try {
            if (isWhite) {
                // ImageIO will force a loud error if the path is wrong or the file is unreadable
                Image img = ImageIO.read(new File("assets/LightPawn.png"));
                Image scaledImage = img.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                this.pieceImage = new ImageIcon(scaledImage);
            }
        } catch (IOException e) {
            System.out.println("🚨 ERROR LOADING IMAGE:");
            e.printStackTrace(); // This prints the exact reason it failed
        }
        try {
            if (!isWhite) {
                Image img = ImageIO.read(new File("/home/evannotdando/IdeaProjects/two_player_chess/assets/DarkPawn.png"));
                Image scaledImage = img.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                this.pieceImage = new ImageIcon(scaledImage);
            }
        } catch (IOException e) {
            System.out.println("Error LOADING IMAGE:");
            e.printStackTrace();
        }
    }

    public void setFirstTurn(boolean firstTurn) {
        this.firstTurn = firstTurn;
    }

    public void setisWhite(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setPieceImage(ImageIcon pieceImage) {
        this.pieceImage = pieceImage;
    }

    public boolean getisWhite() {
        return isWhite;
    }

    public boolean getisFirstTurn() {
        return firstTurn;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public ImageIcon getPieceImage() {
        return pieceImage;
    }
}

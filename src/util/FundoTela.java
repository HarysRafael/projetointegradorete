package util;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import view.Principal;

public class FundoTela extends JDesktopPane {

    private Image imagem;

    public FundoTela(String imagem) {
        this.imagem = new ImageIcon(Principal.class.getResource(imagem)).getImage();
    }

 
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(imagem, 0, 0, getWidth(), getHeight(), this);
    }
}
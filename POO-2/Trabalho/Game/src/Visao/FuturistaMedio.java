package Visao;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controle.Controle;
import Controle.Macro;
import Controle.MoverBaixo;
import Controle.MoverCima;
import Controle.MoverDir;
import Controle.MoverEsq;
import Visao.FuturistaFacil.MyKeyListener;
import futurista.AdvancedFuturista;
import futurista.FabricaFuturista;
import futurista.ObservadorFuturista;
import futurista.PersonagemFuturista;
import main.AtaqueFraco;
import main.NPC;

public class FuturistaMedio extends JPanel{
	
	//ATRIBUTOS
	private PersonagemFuturista personagem;
	private ObservadorFuturista o1;
	private ObservadorFuturista o2;
	private static Controle c; //invoker
	
	//CONSTRUTOR
	public FuturistaMedio() {
	}
	
	
	public void paint(Graphics g) {
		
        super.paint(g); //The call to "super.paint(g)", cleans the screen 

        Graphics2D g2d = (Graphics2D) g;
        //The instruction; "g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)" makes the borders of the figures smoother

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.BLACK);
        g2d.fillOval(personagem.getX(), personagem.getY(), 20, 20);

        g2d.setColor(Color.PINK);        
        g2d.fillOval(o1.getX(), o1.getY(), 20, 20);
        
        g2d.setColor(Color.PINK);        
        g2d.fillOval(o1.getX(), o2.getY(), 20, 20);
        
        
        if(o1.getLife() <= 0) {
        	g2d.setColor(Color.RED);        
            g2d.fillOval(o1.getX(), o1.getY(), 20, 20);
        }
        if(o2.getLife() <= 0) {
        	g2d.setColor(Color.RED);        
            g2d.fillOval(o2.getX(), o2.getY(), 20, 20);
        }
        
	}
	
	//Cria o painel do jogo
    public void jogar(FuturistaMedio game, PersonagemFuturista p) throws InterruptedException {
    	
    	int x = 728;
        int y = 409;
    	
    	KeyListener listener = new MyKeyListener();
        addKeyListener(listener);
        setFocusable(true);
        
        ImageIcon background = new ImageIcon("../Fut_medio.jpg");

        JLabel label = new JLabel();
        
        label.setBounds(0, 0, x, y);
        label.setIcon(background);

        game.setLayout(null);
        game.add(label);
        
    	JFrame frame = new JFrame("Game"); 
        frame.getContentPane().add(game);
        frame.setSize(x, y);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        FabricaFuturista f = AdvancedFuturista.getInstancia();
        
        
        personagem = p;
        personagem.setPos(250,250);
        
        o1 = f.criaInimigos();
        o1.setPos(10,85);
        o1.setAtaque(new AtaqueFraco());
        o1.setLife(3);
        
        o2 = f.criaInimigos();
        o2.setPos(30,200);
        o2.setAtaque(new AtaqueFraco());
        o2.setLife(3);
          
        personagem.addObserver(o1);
        personagem.addObserver(o2);
        
        NPC npc = personagem;
        
        c = new Controle();
        c.setCommand(new MoverEsq(npc),0);
        c.setCommand(new MoverDir(npc),1);
        
        c.setCommand(new MoverCima(npc),2);
        c.setCommand(new MoverBaixo(npc),3);
        
        Macro m = new Macro();
        m.add(new MoverEsq(npc));
        m.add(new MoverEsq(npc));
        m.add(new MoverEsq(npc));
        m.add(new MoverEsq(npc));
        m.add(new MoverEsq(npc));
        m.add(new MoverEsq(npc));
        
        c.setCommand(m,5);
     
        //Chamamos a tela com as estat?sticas do jogo (vida e inimigos).
        String str = String.valueOf(personagem.getLife());
        String str2 = String.valueOf(personagem.countObservers());
        Estatisticas tela = new Estatisticas(str, str2);
        tela.setVisible(true);
        
        while (personagem.getLife() > 0 && (o1.getLife() > 0 || o2.getLife() > 0)) {
        	personagem.show(); 
            
        	str = String.valueOf(personagem.getLife());
            str2 = String.valueOf(personagem.countObservers());
            
            tela.atualiza(str,str2);
            game.repaint();
            Thread.sleep(50);
        }
        frame.dispose();
        tela.dispose();
       
        
    }
    
    public class MyKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            //System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));

            if (e.getKeyCode() == KeyEvent.VK_LEFT){                
                c.pressionar(0);    
            }
            
            if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                c.pressionar(1);    
               
            if (e.getKeyCode() == KeyEvent.VK_UP)
                c.pressionar(2);    
            
            if (e.getKeyCode() == KeyEvent.VK_DOWN)
                c.pressionar(3);    
               
            if (e.getKeyCode() == KeyEvent.VK_SPACE)
                c.pressionar(4);    

            if (e.getKeyCode() == KeyEvent.VK_ENTER)
                c.pressionar(5);    

            if (e.getKeyCode() == KeyEvent.VK_R)
                c.replay();    
                
        }

        @Override
        public void keyReleased(KeyEvent e) {
            //System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
        }
    }

}

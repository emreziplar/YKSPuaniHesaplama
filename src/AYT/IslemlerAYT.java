
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class IslemlerAYT 
{

    
   public void verileriSifirla(JPanel AYTpuanPanel)
    {
        int deger = 0;
        for (Component c:AYTpuanPanel.getComponents())
        {
            if(c instanceof JTextField)
                ((JTextField) c).setText(String.valueOf(deger));
        }
    }
   
   public void allKeyTyped(JPanel AYTpuanPanel)
   {
       for(Component c:AYTpuanPanel.getComponents())
       {
           if(c instanceof JTextField)
           {
               c.addKeyListener(new KeyAdapter() 
               {
                   @Override
                   public void keyTyped(KeyEvent evt) {
                       char k = evt.getKeyChar();
                       
                       if(!Character.isDigit(k))
                           evt.consume();
                   }
                   
               });
           }
       }
   }
    
}

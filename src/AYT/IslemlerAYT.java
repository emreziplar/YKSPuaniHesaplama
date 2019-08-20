
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class IslemlerAYT 
{
    private int dogru,yanlis;
    public void dogruYanlisGonder(JTextField dogruField , JTextField yanlisField)
    {
        String dogruAlani = dogruField.getText();
        String yanlisAlani = yanlisField.getText();
        
        if (!dogruAlani.equals("") && !yanlisAlani.equals(""))
        {
            dogru = Integer.valueOf(dogruAlani);
            yanlis = Integer.valueOf(yanlisAlani);      
        }
        else if (!dogruAlani.equals("") &&  yanlisAlani.equals(""))
        {
            dogru = Integer.valueOf(dogruAlani);
            yanlis = 0;            
        }
        else if (dogruAlani.equals("") && !yanlisAlani.equals(""))
        {
            dogru = 0;
            yanlis = Integer.valueOf(yanlisAlani);           
        }
        else 
        {
            dogru = 0;
            yanlis = 0;            
        }        
    }

    public int getDogru() {
        return dogru;
    }


    public int getYanlis() {
        return yanlis;
    }


    
    
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

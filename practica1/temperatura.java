import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class temperatura extends Applet  implements ActionListener
{
Button ck;
Button kc;
Label resultado;
TextField grados;
double calculo=0;
public void init()
{
	ck = new Button("CALCULAR");
	kc = new Button("CALCULAR");
	resultado = new Label("             ");
	grados = new TextField(30);
	add(grados);
	add(ck);
	add(kc);
	add(resultado);
	ck.addActionListener(this);
	kc.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
  Button b = (Button)e.getSource();
  if(b == ck)
     calculo = Integer.parseInt(grados.getText()) + 273.15;
  if(b == kc)
     calculo = Integer.parseInt(grados.getText()) - 273.15;  
	resultado.setText(""+calculo);
}
}





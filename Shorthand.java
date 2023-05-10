import java.awt.*;
import java.awt.event.*;
class Shorthand
{
    public static void main(String Arg[])
    {
        Frame fobj=new Frame("Marvellous");
        fobj.setSize(300,300);
        fobj.setVisible(true);
        Button bobj=new Button("OK");
        fobj.add(bobj);

        bobj.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent aobj)
            {
                System.out.println("button Pressed");

            }
        });

    }
}
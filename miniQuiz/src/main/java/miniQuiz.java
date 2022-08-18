import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;

package com.mycompany.miniquiz;

public class miniQuiz extends JFrame implements ActionListener
{
	JLabel label;
	JRadioButton radioButtons[]= new JRadioButton[4];
	JButton btnResult;
	ButtonGroup bg;
	int count=0, current=0, x=1, y=1, now=0;
	int m[]= new int[5];
	
	
	miniQuiz(String s){
		super(s);
		label= new JLabel();
		add(label);
		bg= new ButtonGroup();
		for(int i=0; i<5; i++) {
			radioButtons[i]= new JRadioButton();
			add(radioButtons[i]);
			bg.add(radioButtons[i]);
		}
		btnResult= new JButton("Yanıtla");
		btnResult.setVisible(false);
		btnResult.addActionListener(this);
		add(btnResult);
		setData();
		label.setBounds(30,40,450,20);
		radioButtons[0].setBounds(50,80,450,20);
		radioButtons[1].setBounds(50,110,200,20);
		radioButtons[2].setBounds(50,140,200,20);
		radioButtons[3].setBounds(50,170,200,20);
		btnResult.setBounds(270,240,100,30);
		setDefaultCloseOpreation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisibile(true);
		setSize(600,350);

	}

	boolean setData() {
		radioButtons[4].setSelected(true);
		if (current==0) {
			label.setText("Soru 1: Android geliştirmenin resmi dili hangisidir?");
			radioButtons[0].setText("Java");
			radioButtons[1].setText("Phyton");
			radioButtons[2].setText("C#");
			radioButtons[3].setText("Kotlin");
			
		if (current==1) {
			label.setText("Soru 2: 'Class' nedir?");
			radioButtons[0].setText("Görünürlüğü temsil eden bir erişim değiştiricisidir.");
			radioButtons[1].setText("Metodun dönüş türüdür.");
			radioButtons[2].setText("Bir sınıf bildirmek için kullanılır.");
			radioButtons[3].setText("Programın başlangıç noktasını temsil eder.");
				
		if (current==2) {
			label.setText("Soru 3: System.out.println() deyimi ne için kullanılır?");
			radioButtons[0].setText("Ekrandan veri okur.");
			radioButtons[1].setText("Veriyi ekrana yazdırır.");
			radioButtons[2].setText("Alt satıra geçer.");
			radioButtons[3].setText("Kullanıcıdan veri ister.");
		if (current==3) {
			label.setText("Soru 4: Derleme zamanında ne olur?");
			radioButtons[0].setText("Java kodunu bayt koduna dönüştürür.");
			radioButtons[1].setText("Bayt kodunu Java koduna dönüştürür.");
			radioButtons[2].setText("Yasadışı kod için kod parçalarını kontrol eder");
			radioButtons[3].setText("Hepsi");
						
		if (current==4) {
			label.setText("Soru 5: Aşağıdakilerden hangisi Java'daki değişkenlerden değildir?");
			radioButtons[0].setText("Yerel");
			radioButtons[1].setText("Instance");
			radioButtons[2].setText("Statik");
			radioButtons[3].setText("Dinamik");
		}
		label.setBounds(30,40,450,20);
		
		for(int i=0,j=0; i<=90; i+=30,j++) {
			radioButtons[j].setBounds(50,80+i,200,20);
			
		}
			
	}
	
		boolean checkAns()
                {
			if(current==0) {
				return(radioButtons[0].isSelected());
			}
			if(current==1) {
				return(radioButtons[2].isSelected());
			}
			if(current==2) {
				return(radioButtons[1].isSelected());
			}
			if(current==3) {
				return(radioButtons[0].isSelected());
			}
			if(current==4) {
				return(radioButtons[3].isSelected());
			}
			return false;
		}
	
	public static void main(String[] args) {
		new miniQuiz("Mini Quiz App");

	}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDefaultCloseOpreation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setVisibile(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

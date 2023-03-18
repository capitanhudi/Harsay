package harsay;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class harsay extends JFrame {

	private JPanel contentPane;
	private JTextField ekran;
	private JButton a;
	private JButton b;
	private JButton c;
	private JButton d;
	private JButton e;
	private JButton c2;
	private JButton f;
	private JButton g;
	private JButton g2;
	private JButton h;
	private JButton i1;
	private JButton i2;
	private JButton j;
	private JButton k;
	private JButton l;
	private JButton m;
	private JButton n;
	private JButton o1;
	private JButton o2;
	private JButton p;
	private JButton r;
	private JButton s;
	private JButton s2;
	private JButton t;
	private JButton u;
	private JButton u2;
	private JButton v;
	private JButton y;
	private JButton z;
	private JButton clean;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					harsay frame = new harsay();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public harsay() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\asus\\Pictures\\ben\\bnebu.PNG"));
		setTitle("HarSay");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ekran = new JTextField();
		ekran.setText(" HarSay\u0131n\u0131z:");
		ekran.setEditable(false);
		ekran.setBounds(10, 275, 437, 70);
		contentPane.add(ekran);
		ekran.setColumns(10);
		
		a = new JButton("A");
		a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"1");
			}
		});
		a.setBounds(10, 11, 89, 23);
		contentPane.add(a);
		
		b = new JButton("B");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"2");
			}
		});
		b.setBounds(121, 11, 89, 23);
		contentPane.add(b);
		
		c = new JButton("C");
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"3");
			}
		});
		c.setBounds(233, 11, 89, 23);
		contentPane.add(c);
		
		d = new JButton("D");
		d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"5");
			}
		});
		d.setBounds(10, 37, 89, 23);
		contentPane.add(d);
		
		e = new JButton("E");
		e.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"6");
			}
		});
		e.setBounds(121, 37, 89, 23);
		contentPane.add(e);
		
		c2 = new JButton("\u00C7");
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"4");
			}
		});
		c2.setBounds(358, 11, 89, 23);
		contentPane.add(c2);
		
		f = new JButton("F");
		f.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"7");
			}
		});
		f.setBounds(233, 37, 89, 23);
		contentPane.add(f);
		
		g = new JButton("G");
		g.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"8");
			}
		});
		g.setBounds(358, 37, 89, 23);
		contentPane.add(g);
		
		g2 = new JButton("\u011E");
		g2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"9");
			}
		});
		g2.setBounds(10, 67, 89, 23);
		contentPane.add(g2);
		
		h = new JButton("H");
		h.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"10");
			}
		});
		h.setBounds(121, 67, 89, 23);
		contentPane.add(h);
		
		i1 = new JButton("I");
		i1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"11");
			}
		});
		i1.setBounds(233, 67, 89, 23);
		contentPane.add(i1);
		
		i2 = new JButton("\u0130");
		i2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"12");
			}
		});
		i2.setBounds(358, 67, 89, 23);
		contentPane.add(i2);
		
		j = new JButton("J");
		j.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"13");
			}
		});
		j.setBounds(10, 94, 89, 23);
		contentPane.add(j);
		
		k = new JButton("K");
		k.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"14");
			}
		});
		k.setBounds(121, 94, 89, 23);
		contentPane.add(k);
		
		l = new JButton("L");
		l.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"15");
			}
		});
		l.setBounds(233, 94, 89, 23);
		contentPane.add(l);
		
		m = new JButton("M");
		m.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"16");
			}
		});
		m.setBounds(358, 94, 89, 23);
		contentPane.add(m);
		
		n = new JButton("N");
		n.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"17");
			}
		});
		n.setBounds(10, 128, 89, 23);
		contentPane.add(n);
		
		o1 = new JButton("O");
		o1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"18");
			}
		});
		o1.setBounds(121, 128, 89, 23);
		contentPane.add(o1);
		
		o2 = new JButton("\u00D6");
		o2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"19");
			}
		});
		o2.setBounds(233, 128, 89, 23);
		contentPane.add(o2);
		
		p = new JButton("P");
		p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"20");
			}
		});
		p.setBounds(358, 128, 89, 23);
		contentPane.add(p);
		
		r = new JButton("R");
		r.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"21");
			}
		});
		r.setBounds(10, 162, 89, 23);
		contentPane.add(r);
		
		s = new JButton("S");
		s.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"22");
			}
		});
		s.setBounds(121, 162, 89, 23);
		contentPane.add(s);
		
		s2 = new JButton("\u015E");
		s2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"23");
			}
		});
		s2.setBounds(233, 162, 89, 23);
		contentPane.add(s2);
		
		t = new JButton("T");
		t.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"24");
			}
		});
		t.setBounds(358, 162, 89, 23);
		contentPane.add(t);
		
		u = new JButton("U");
		u.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"25");
			}
		});
		u.setBounds(10, 195, 89, 23);
		contentPane.add(u);
		
		u2 = new JButton("\u00DC");
		u2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"26");
			}
		});
		u2.setBounds(121, 196, 89, 23);
		contentPane.add(u2);
		
		v = new JButton("V");
		v.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"27");
			}
		});
		v.setBounds(233, 196, 89, 23);
		contentPane.add(v);
		
		y = new JButton("Y");
		y.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"28");
			}
		});
		y.setBounds(358, 196, 89, 23);
		contentPane.add(y);
		
		z = new JButton("Z");
		z.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"29");
			}
		});
		z.setBounds(10, 229, 89, 23);
		contentPane.add(z);
		
		clean = new JButton("Ekran\u0131 TEM\u0130ZLE");
		clean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText("");
				ekran.setText(ekran.getText()+" HarSayınız:");
			}
		});
		clean.setBackground(Color.GRAY);
		clean.setBounds(190, 242, 204, 23);
		contentPane.add(clean);
	}
}

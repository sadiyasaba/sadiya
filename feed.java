package JavaApplication1;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.JOptionPane;

public class Feed{

	public JFrame frame;
	JLabel sub;
        public int[]a;
   public int[]c1;
   public int[]c2;
   public int[]c3;
   public int[]c4;
   public int[]c5;
   public int[]c6;
   public int[]c7;
   public int[]c8;
   public int[]c9;
   public int[]c10;
   public int[]c11;
   public int[]c12;
   public int[]c13;
   public int[]c14;
   public int[]c15;
   public int[]c16;
   public int[]c17;
   public int[]c18;
   public int[]c19;
   public int[]c20;
   public int[]c21;
   public int[]c22;
   public int[]c23;
   public int[]c24;
   public int[]c25;
   public int[]c26;
   public int[]c27;
   public int[]c28;
   public int[]c29;
   public int[]c30;
   public int[]c31;
   public int[]c32;
   public int[]c33;
   public int[]c34;
   public int[]c35;
   public int[]c36;
   public int[]c37;
   public int[]c38;
   public int[]c39;
   public int[]c40;
   int a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23,a24,a25,a26,a27,a28,a29,a30,a31,a32,a33,a34,a35,a36,a37,a38,a39,a40;
   int[] subar1;
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
                    try {
                        Feed window = new Feed();
                        window.frame.setVisible(true);
                    } catch (Exception e) {
                    }
                });
	}
	
        @SuppressWarnings("Convert2Lambda")
	public Feed() {
        @SuppressWarnings("LocalVariableHidesMemberVariable")
		final JLabel sub = new JLabel("");
		frame = new JFrame();
		subar1=new int[5];
		for(int i=0;i<5;i++){
			subar1[i]=0;
		}
		c1=new int[5];
		
		frame.setBounds(400,600,800,100);
               
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
                JLabel j1=new JLabel("teacher name=Ms.Tina  subject=CN");
                j1.setBounds(770, 55, 500, 20);
                j1.setVisible(true);
		frame.add(j1);
                
                JLabel j2=new JLabel("teacher name=Ms.Rashmi  subject=JAVA");
                j2.setBounds(1080, 55, 500, 20);
                j2.setVisible(true);
		frame.add(j2);
                
                 JLabel j3=new JLabel("teacher name=Ms.Sushma  subject=FACD");
                j3.setBounds(1380, 55, 500, 20);
                j3.setVisible(true);
		frame.add(j3);
                
                 JLabel j4=new JLabel("teacher name=Ms.Mansa  subject=SNA");
                j4.setBounds(1680, 55, 500, 20);
                j4.setVisible(true);
		frame.add(j4);
                
                
                JLabel l1=new JLabel("Student Name");
                frame.add(l1);
                l1.setBounds(110,14,110,10);
                
                JTextField t1=new JTextField();
                frame.add(t1);
                t1.setBounds(200,10,140,20);
                
                JLabel l2=new JLabel("Student USN");
                frame.add(l2);
                l2.setBounds(110,40,140,20);
                
                JTextField t2=new JTextField();
                frame.add(t2);
                t2.setBounds(200,40,140,20);
                

               JRadioButton r1 = new JRadioButton("1");
		r1.addActionListener((ActionEvent arg0) -> {
                    c1[1]=1;
            });
		
		JLabel lblexecellent = new JLabel("1-Poor    2-Average      3-Good       4-Very Good");
		lblexecellent.setBounds(1100, 17, 423, 23);
		frame.getContentPane().add(lblexecellent);
		r1.setBounds(780, 89, 44, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2= new JRadioButton("2");
		r2.addActionListener((ActionEvent e) -> {
                    c1[2]=2;
            });
		r2.setBounds(826, 89, 44, 23);
		frame.getContentPane().add(r2);
		
		
		JRadioButton r3 = new JRadioButton("3");
		r3.addActionListener((ActionEvent e) -> {
                    c1[3]=3;
            });
		r3.setBounds(872, 89, 44, 23);
		frame.getContentPane().add(r3);
		
		JRadioButton r4 = new JRadioButton("4");
		r4.addActionListener((ActionEvent e) -> {
                    c1[4]=4;
            });
		r4.setBounds(918, 89, 44, 23);
		frame.getContentPane().add(r4);
		final ButtonGroup group1=new ButtonGroup();
		group1.add(r1);
		group1.add(r2);
		group1.add(r3);
		group1.add(r4);
		
		
		
		JRadioButton r5 = new JRadioButton("1");
		r5.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent arg0) {
                           
                            c2=new int[5];
				c2[1]=1;
			}
		});
		r5.setBounds(780, 115, 44, 23);
		frame.getContentPane().add(r5);
		
		JRadioButton r6 = new JRadioButton("2");
		r6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c2[2]=2;
			}
		});
		r6.setBounds(826, 115, 44, 23);
		frame.getContentPane().add(r6);
		
		JRadioButton r7 = new JRadioButton("3");
		r7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c2[3]=3;
			}
		});
		r7.setBounds(872, 115, 44, 23);
		frame.getContentPane().add(r7);
		
		JRadioButton r8 = new JRadioButton("4");
		r8.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent arg0) {
				c2[4]=4;
			}
		});
		r8.setBounds(918, 115, 45, 23);
		frame.getContentPane().add(r8);
		final ButtonGroup group2=new ButtonGroup();
		group2.add(r5);
		group2.add(r6);
		group2.add(r7);
		group2.add(r8);
		
		JRadioButton r9 = new JRadioButton("1");
		r9.addActionListener(new ActionListener() {
                        @SuppressWarnings("override")
			public void actionPerformed(ActionEvent arg0) {
                            c3=new int[5];
				c3[1]=1;
			}
		});
		r9.setBounds(780, 141, 44, 23);
		frame.getContentPane().add(r9);
		
		JRadioButton r10 = new JRadioButton("2");
		r10.addActionListener(new ActionListener() {
                        @SuppressWarnings("override")
			public void actionPerformed(ActionEvent arg0) {
				c3[2]=2;
			}
		});
		r10.setBounds(826, 141, 44, 23);
		frame.getContentPane().add(r10);
		
		JRadioButton r11 = new JRadioButton("3");
		r11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c3[3]=3;
			}
		});
		r11.setBounds(872, 141, 44, 23);
		frame.getContentPane().add(r11);
		
		JRadioButton r12 = new JRadioButton("4");
		r12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c3[4]=4;
			}
		});
		r12.setBounds(918, 141, 44, 23);
		frame.getContentPane().add(r12);
		final ButtonGroup group3=new ButtonGroup();
		group3.add(r9);
		group3.add(r10);
		group3.add(r11);
		group3.add(r12);
		
		JRadioButton r13 = new JRadioButton("1");
		r13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c4=new int[5];
				c4[1]=1;
			}
		});
		r13.setBounds(780, 169, 44, 23);
		frame.getContentPane().add(r13);
		
		JRadioButton r14 = new JRadioButton("2");
		r14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c4[2]=2;
			}
		});
		r14.setBounds(826, 169, 44, 23);
		frame.getContentPane().add(r14);
		
		JRadioButton r15 = new JRadioButton("3");
		r15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c4[3]=3;
			}
		});
		r15.setBounds(872, 169, 44, 23);
		frame.getContentPane().add(r15);
		
		JRadioButton r16 = new JRadioButton("4");
		r16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c4[4]=4;
			}
		});
		r16.setBounds(918, 169, 44, 23);
		frame.getContentPane().add(r16);
		final ButtonGroup group4=new ButtonGroup();
		group4.add(r13);
		group4.add(r14);
		group4.add(r15);
		group4.add(r16);
		
		JRadioButton r17 = new JRadioButton("1");
		r17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c5=new int[5];
				c5[1]=1;
			}
		});
		r17.setBounds(780, 195, 44, 23);
		frame.getContentPane().add(r17);
		
		JRadioButton r18 = new JRadioButton("2");
		r18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c5[2]=2;
			}
		});
		r18.setBounds(826, 195, 44, 23);
		frame.getContentPane().add(r18);
		
		JRadioButton r19 = new JRadioButton("3");
		r19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c5[3]=3;
			}
		});
		r19.setBounds(872, 195, 44, 23);
		frame.getContentPane().add(r19);
		
		JRadioButton r20 = new JRadioButton("4");
		r20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c5[4]=4;
			}
		});
		r20.setBounds(918, 195, 44, 23);
		frame.getContentPane().add(r20);
		final ButtonGroup group5=new ButtonGroup();
		group5.add(r17);
		group5.add(r18);
		group5.add(r19);
		group5.add(r20);
		
		JRadioButton r21 = new JRadioButton("1");
		r21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c6=new int[5];
				c6[1]=1;
			}
		});
		r21.setBounds(780, 221, 44, 23);
		frame.getContentPane().add(r21);
		
		JRadioButton r22 = new JRadioButton("2");
		r22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c6[2]=2;
			}
		});
		r22.setBounds(826, 221, 44, 23);
		frame.getContentPane().add(r22);
		
		JRadioButton r23 = new JRadioButton("3");
		r23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c6[3]=3;
			}
		});
		r23.setBounds(876, 221, 44, 23);
		frame.getContentPane().add(r23);
		
		JRadioButton r24 = new JRadioButton("4");
		r24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c6[4]=4;
			}
		});
		r24.setBounds(918, 221, 44, 23);
		frame.getContentPane().add(r24);
		final ButtonGroup group6=new ButtonGroup();
		group6.add(r21);
		group6.add(r22);
		group6.add(r23);
		group6.add(r24);
		
		JRadioButton r25 = new JRadioButton("1");
		r25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c7=new int[5];
				c7[1]=1;
			}
		});
		r25.setBounds(780, 247, 44, 23);
		frame.getContentPane().add(r25);
		
		JRadioButton r26 = new JRadioButton("2");
		r26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c7[2]=2;
			}
		});
		r26.setBounds(826, 247, 44, 23);
		frame.getContentPane().add(r26);
		
		JRadioButton r27 = new JRadioButton("3");
		r27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c7[3]=3;
			}
		});
		r27.setBounds(872, 247, 44, 23);
		frame.getContentPane().add(r27);
		
		JRadioButton r28 = new JRadioButton("4");
		r28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c7[4]=4;
			}
		});
		r28.setBounds(918, 247, 44, 23);
		frame.getContentPane().add(r28);
		final ButtonGroup group7=new ButtonGroup();
		group7.add(r25);
		group7.add(r26);
		group7.add(r27);
		group7.add(r28);
		
		JRadioButton r29 = new JRadioButton("1");
		r29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c8=new int[5];
				c8[1]=1;
			}
		});
		r29.setBounds(780, 273, 44, 23);
		frame.getContentPane().add(r29);
		
		JRadioButton r30 = new JRadioButton("2");
		r30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c8[2]=2;
			}
		});
		r30.setBounds(826, 273, 44, 23);
		frame.getContentPane().add(r30);
		
		JRadioButton r31 = new JRadioButton("3");
		r31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c8[3]=3;
			}
		});
		r31.setBounds(872, 273, 44, 23);
		frame.getContentPane().add(r31);
		
		JRadioButton r32 = new JRadioButton("4");
		r32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c8[4]=4;
			}
		});
		r32.setBounds(918, 273, 44, 23);
		frame.getContentPane().add(r32);
		final ButtonGroup group8=new ButtonGroup();
		group8.add(r29);
		group8.add(r30);
		group8.add(r31);
		group8.add(r32);
		
		JRadioButton r33 = new JRadioButton("1");
		r33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c9=new int[5];
				c9[1]=1;
			}
		});
		r33.setBounds(780, 299, 44, 23);
		frame.getContentPane().add(r33);
		
		JRadioButton r34 = new JRadioButton("2");
		r34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c9[2]=2;
			}
		});
		r34.setBounds(826, 299, 44, 23);
		frame.getContentPane().add(r34);
		
		JRadioButton r35 = new JRadioButton("3");
		r35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c9[3]=3;
			}
		});
		r35.setBounds(872, 299, 44, 23);
		frame.getContentPane().add(r35);
		
		JRadioButton r36 = new JRadioButton("4");
		r36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c9[4]=4;
			}
		});
		r36.setBounds(918, 299, 44, 23);
		frame.getContentPane().add(r36);
		final ButtonGroup group9=new ButtonGroup();
		group9.add(r33);
		group9.add(r34);
		group9.add(r35);
		group9.add(r36);
		
		JRadioButton r37 = new JRadioButton("1");
		r37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c10=new int[5];
				c10[1]=1;
			}
		});
		r37.setBounds(780, 325, 44, 23);
		frame.getContentPane().add(r37);
		
		JRadioButton r38 = new JRadioButton("2");
		r38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c10[2]=2;
			}
		});
		r38.setBounds(826, 325, 44, 23);
		frame.getContentPane().add(r38);
		
		JRadioButton r39 = new JRadioButton("3");
		r39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c10[3]=3;
			}
		});
		r39.setBounds(872, 325, 44, 23);
		frame.getContentPane().add(r39);
		
		JRadioButton r40 = new JRadioButton("4");
		r40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c10[4]=4;
			}
		});
		r40.setBounds(918, 325, 44, 23);
		frame.getContentPane().add(r40);
		final ButtonGroup group10=new ButtonGroup();
		group10.add(r37);
		group10.add(r38);
		group10.add(r39);
		group10.add(r40);
		
				
		
		JLabel lblmyTeacherIs = new JLabel("1.  The teacher is punctual to the class");
		lblmyTeacherIs.setBounds(10, 93, 999, 14);
		frame.getContentPane().add(lblmyTeacherIs);
		
		JLabel lbliUnderstandEasily = new JLabel("2.  Can understand easily what the teacher is teaching");
		lbliUnderstandEasily.setBounds(10, 119, 999, 14);
		frame.getContentPane().add(lbliUnderstandEasily);
		
		JLabel lblmyTeacherIs_1 = new JLabel("3.  The teacher is well prepared for the class at all Lectures");
		lblmyTeacherIs_1.setBounds(10, 145, 999, 14);
		frame.getContentPane().add(lblmyTeacherIs_1);
		
		JLabel lblmyTeacherCommunicates = new JLabel("4.  The teacher communicates clearly");
		lblmyTeacherCommunicates.setBounds(10, 173, 999, 14);
		frame.getContentPane().add(lblmyTeacherCommunicates);
		
		JLabel lblmyTeacherMakes = new JLabel("5.  The teacher makes good use of example and illustrations");
		lblmyTeacherMakes.setBounds(10, 195, 999, 23);
		frame.getContentPane().add(lblmyTeacherMakes);
		
		JLabel lblmyTeacherIs_2 = new JLabel("6.  The teacher is actively helpful when academic difficulties");
		lblmyTeacherIs_2.setBounds(10, 225, 999, 14);
		frame.getContentPane().add(lblmyTeacherIs_2);
		
		JLabel lblmyTeacherCompletes = new JLabel("7.  The teacher completes the syllabus on time during the semester");
		lblmyTeacherCompletes.setBounds(10, 251, 999, 14);
		frame.getContentPane().add(lblmyTeacherCompletes);
		
		JLabel lblmyTeacherIs_4 = new JLabel("8.  The teacher is fair to all stduents in evalution/grading");
		lblmyTeacherIs_4.setBounds(10, 277, 999, 19);
		frame.getContentPane().add(lblmyTeacherIs_4);
		
		JLabel lblmyTeacherIs_5 = new JLabel("9.  The teacher is available during practical/Lab hours and is helpful");
		lblmyTeacherIs_5.setBounds(10, 303, 999, 14);
		frame.getContentPane().add(lblmyTeacherIs_5);
		
		JLabel lblmyTeacherCreates = new JLabel("10.  The teacher creates awareness of recent development in the subject");
		lblmyTeacherCreates.setBounds(10, 329, 999, 14);
		frame.getContentPane().add(lblmyTeacherCreates);
                
                c11=new int[5];
	       JRadioButton r41 = new JRadioButton("1");
		r41.addActionListener((ActionEvent arg0) -> {
                    c11[1]=1;
            });
		r41.setBounds(1110, 89, 44, 23);
		frame.getContentPane().add(r41);
		
		JRadioButton r42= new JRadioButton("2");
		r42.addActionListener((ActionEvent e) -> {
                    c11[2]=2;
            });
		r42.setBounds(1156, 89, 44, 23);
		frame.getContentPane().add(r42);
		
		
		JRadioButton r43 = new JRadioButton("3");
		r43.addActionListener((ActionEvent e) -> {
                    c11[3]=3;
            });
		r43.setBounds(1202, 89, 44, 23);
		frame.getContentPane().add(r43);
		
		JRadioButton r44 = new JRadioButton("4");
		r44.addActionListener((ActionEvent e) -> {
                    c11[4]=4;
            });
		r44.setBounds(1248, 89, 44, 23);
		frame.getContentPane().add(r44);
		final ButtonGroup group11=new ButtonGroup();
		group11.add(r41);
		group11.add(r42);
		group11.add(r43);
		group11.add(r44);
		
		
		
		JRadioButton r45 = new JRadioButton("1");
		r45.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent arg0) {
                            c12=new int[5];
				c12[1]=1;
                                r45.getAction();
			}
		});
		r45.setBounds(1110, 115, 44, 23);
		frame.getContentPane().add(r45);
		
		JRadioButton r46 = new JRadioButton("2");
		r46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c12[2]=2;
			}
		});
		r46.setBounds(1156, 115, 44, 23);
		frame.getContentPane().add(r46);
		
		JRadioButton r47 = new JRadioButton("3");
		r47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c12[3]=3;
			}
		});
		r47.setBounds(1202, 115, 44, 23);
		frame.getContentPane().add(r47);
		
		JRadioButton r48 = new JRadioButton("4");
		r48.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent arg0) {
				c12[4]=4;
			}
		});
		r48.setBounds(1248, 115, 45, 23);
		frame.getContentPane().add(r48);
		final ButtonGroup group12=new ButtonGroup();
		group12.add(r45);
		group12.add(r46);
		group12.add(r47);
		group12.add(r48);
		
		JRadioButton r49 = new JRadioButton("1");
		r49.addActionListener(new ActionListener() {
                        @SuppressWarnings("override")
			public void actionPerformed(ActionEvent arg0) {
                            c13=new int[5];
				c13[1]=1;
			}
		});
		r49.setBounds(1110, 141, 44, 23);
		frame.getContentPane().add(r49);
		
		JRadioButton r50 = new JRadioButton("2");
		r50.addActionListener(new ActionListener() {
                        @SuppressWarnings("override")
			public void actionPerformed(ActionEvent arg0) {
				c13[2]=2;
			}
		});
		r50.setBounds(1156, 141, 44, 23);
		frame.getContentPane().add(r50);
		
		JRadioButton r51 = new JRadioButton("3");
		r51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c13[3]=3;
			}
		});
		r51.setBounds(1202, 141, 44, 23);
		frame.getContentPane().add(r51);
		
		JRadioButton r52 = new JRadioButton("4");
		r52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c13[4]=4;
			}
		});
		r52.setBounds(1248, 141, 44, 23);
		frame.getContentPane().add(r52);
		final ButtonGroup group13=new ButtonGroup();
		group13.add(r49);
		group13.add(r50);
		group13.add(r51);
		group13.add(r52);
		
		JRadioButton r53 = new JRadioButton("1");
		r53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c14=new int[5];
				c14[1]=1;
			}
		});
		r53.setBounds(1110, 169, 44, 23);
		frame.getContentPane().add(r53);
		
		JRadioButton r54 = new JRadioButton("2");
		r54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c14[2]=2;
			}
		});
		r54.setBounds(1156, 169, 44, 23);
		frame.getContentPane().add(r54);
		
		JRadioButton r55 = new JRadioButton("3");
		r55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c14[3]=3;
			}
		});
		r55.setBounds(1202, 169, 44, 23);
		frame.getContentPane().add(r55);
		
		JRadioButton r56 = new JRadioButton("4");
		r56.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c14[4]=4;
			}
		});
		r56.setBounds(1248, 169, 44, 23);
		frame.getContentPane().add(r56);
		final ButtonGroup group14=new ButtonGroup();
		group14.add(r53);
		group14.add(r54);
		group14.add(r55);
		group14.add(r56);
		
		JRadioButton r57 = new JRadioButton("1");
		r57.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                         c15=new int[5];
				c15[1]=1;
			}
		});
		r57.setBounds(1110, 195, 44, 23);
		frame.getContentPane().add(r57);
		
		JRadioButton r58 = new JRadioButton("2");
		r58.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c15[2]=2;
			}
		});
		r58.setBounds(1156, 195, 44, 23);
		frame.getContentPane().add(r58);
		
		JRadioButton r59 = new JRadioButton("3");
		r59.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c15[3]=3;
			}
		});
		r59.setBounds(1202, 195, 44, 23);
		frame.getContentPane().add(r59);
		
		JRadioButton r60 = new JRadioButton("4");
		r60.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c15[4]=4;
			}
		});
		r60.setBounds(1248, 195, 44, 23);
		frame.getContentPane().add(r60);
		final ButtonGroup group15=new ButtonGroup();
		group15.add(r57);
		group15.add(r58);
		group15.add(r59);
		group15.add(r60);
		
		JRadioButton r61 = new JRadioButton("1");
		r61.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c16=new int[5];
				c16[1]=1;
			}
		});
		r61.setBounds(1110, 221, 44, 23);
		frame.getContentPane().add(r61);
		
		JRadioButton r62 = new JRadioButton("2");
		r62.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c16[2]=2;
			}
		});
		r62.setBounds(1156, 221, 44, 23);
		frame.getContentPane().add(r62);
		
		JRadioButton r63 = new JRadioButton("3");
		r63.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c16[3]=3;
			}
		});
		r63.setBounds(1202, 221, 44, 23);
		frame.getContentPane().add(r63);
		
		JRadioButton r64 = new JRadioButton("4");
		r64.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c16[4]=4;
			}
		});
		r64.setBounds(1248, 221, 44, 23);
		frame.getContentPane().add(r64);
		final ButtonGroup group16=new ButtonGroup();
		group16.add(r61);
		group16.add(r62);
		group16.add(r63);
		group16.add(r64);
		
		JRadioButton r65 = new JRadioButton("1");
		r65.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c17=new int[5];
				c17[1]=1;
			}
		});
		r65.setBounds(1110, 247, 44, 23);
		frame.getContentPane().add(r65);
		
		JRadioButton r66 = new JRadioButton("2");
		r66.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c17[2]=2;
			}
		});
		r66.setBounds(1156, 247, 44, 23);
		frame.getContentPane().add(r66);
		
		JRadioButton r67 = new JRadioButton("3");
		r67.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c17[3]=3;
			}
		});
		r67.setBounds(1202, 247, 44, 23);
		frame.getContentPane().add(r67);
		
		JRadioButton r68 = new JRadioButton("4");
		r68.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c17[4]=4;
			}
		});
		r68.setBounds(1248, 247, 44, 23);
		frame.getContentPane().add(r68);
		final ButtonGroup group17=new ButtonGroup();
		group17.add(r65);
		group17.add(r66);
		group17.add(r67);
		group17.add(r68);
		
		JRadioButton r69 = new JRadioButton("1");
		r69.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c18=new int[5];
				c18[1]=1;
			}
		});
		r69.setBounds(1110, 273, 44, 23);
		frame.getContentPane().add(r69);
		
		JRadioButton r70 = new JRadioButton("2");
		r70.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c18[2]=2;
			}
		});
		r70.setBounds(1156, 273, 44, 23);
		frame.getContentPane().add(r70);
		
		JRadioButton r71 = new JRadioButton("3");
		r71.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c18[3]=3;
			}
		});
		r71.setBounds(1202, 273, 44, 23);
		frame.getContentPane().add(r71);
		
		JRadioButton r72 = new JRadioButton("4");
		r72.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c18[4]=4;
			}
		});
		r72.setBounds(1248, 273, 44, 23);
		frame.getContentPane().add(r72);
		final ButtonGroup group18=new ButtonGroup();
		group18.add(r69);
		group18.add(r70);
		group18.add(r71);
		group18.add(r72);
		
		JRadioButton r73 = new JRadioButton("1");
		r73.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c19=new int[5];
				c19[1]=1;
			}
		});
		r73.setBounds(1110, 299, 44, 23);
		frame.getContentPane().add(r73);
		
		JRadioButton r74 = new JRadioButton("2");
		r74.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c19[2]=2;
			}
		});
		r74.setBounds(1156, 299, 44, 23);
		frame.getContentPane().add(r74);
		
		JRadioButton r75 = new JRadioButton("3");
		r75.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c19[3]=3;
			}
		});
		r75.setBounds(1202, 299, 44, 23);
		frame.getContentPane().add(r75);
		
		JRadioButton r76 = new JRadioButton("4");
		r76.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c19[4]=4;
			}
		});
		r76.setBounds(1248, 299, 44, 23);
		frame.getContentPane().add(r76);
		final ButtonGroup group19=new ButtonGroup();
		group19.add(r73);
		group19.add(r74);
		group19.add(r75);
		group19.add(r76);
		
		JRadioButton r77 = new JRadioButton("1");
		r77.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c20=new int[5];
				c20[1]=1;
			}
		});
		r77.setBounds(1110, 325, 44, 23);
		frame.getContentPane().add(r77);
		
		JRadioButton r78 = new JRadioButton("2");
		r78.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c20[2]=2;
			}
		});
		r78.setBounds(1156, 325, 44, 23);
		frame.getContentPane().add(r78);
		
		JRadioButton r79 = new JRadioButton("3");
		r79.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c20[3]=3;
			}
		});
		r79.setBounds(1202, 325, 44, 23);
		frame.getContentPane().add(r79);
		
		JRadioButton r80 = new JRadioButton("4");
		r80.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c20[4]=4;
			}
		});
		r80.setBounds(1248, 325, 44, 23);
		frame.getContentPane().add(r80);
		final ButtonGroup group20=new ButtonGroup();
		group20.add(r77);
		group20.add(r78);
		group20.add(r79);
		group20.add(r80);
		JRadioButton r81 = new JRadioButton("1");
		r81.addActionListener((ActionEvent arg0) -> {
                    c20=new int[5];
                    c21[1]=1;
            });
		r81.setBounds(1434, 89, 44, 23);
		frame.getContentPane().add(r81);
		
		JRadioButton r82= new JRadioButton("2");
		r82.addActionListener((ActionEvent e) -> {
                    c21[2]=2;
            });
		r82.setBounds(1480, 89, 44, 23);
		frame.getContentPane().add(r82);
		
		
		JRadioButton r83 = new JRadioButton("3");
		r83.addActionListener((ActionEvent e) -> {
                    c21[3]=3;
            });
		r83.setBounds(1526, 89, 44, 23);
		frame.getContentPane().add(r83);
		
		JRadioButton r84 = new JRadioButton("4");
		r84.addActionListener((ActionEvent e) -> {
                    c21[4]=4;
            });
		r84.setBounds(1572, 89, 44, 23);
		frame.getContentPane().add(r84);
		final ButtonGroup group21=new ButtonGroup();
		group21.add(r81);
		group21.add(r82);
		group21.add(r83);
		group21.add(r84);
		
		
		
		JRadioButton r85 = new JRadioButton("1");
		r85.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent arg0) {
                            c22=new int[5];
				c22[1]=1;
			}
		});
		r85.setBounds(1434, 115, 44, 23);
		frame.getContentPane().add(r85);
		
		JRadioButton r86 = new JRadioButton("2");
		r86.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c22[2]=2;
			}
		});
		r86.setBounds(1480, 115, 44, 23);
		frame.getContentPane().add(r86);
		
		JRadioButton r87 = new JRadioButton("3");
		r87.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c22[3]=3;
			}
		});
		r87.setBounds(1526, 115, 44, 23);
		frame.getContentPane().add(r87);
		
		JRadioButton r88 = new JRadioButton("4");
		r88.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent arg0) {
				c22[4]=4;
			}
		});
		r88.setBounds(1572, 115, 45, 23);
		frame.getContentPane().add(r88);
		final ButtonGroup group22=new ButtonGroup();
		group22.add(r85);
		group22.add(r86);
		group22.add(r87);
		group22.add(r88);
		
		JRadioButton r89 = new JRadioButton("1");
		r89.addActionListener(new ActionListener() {
                        @SuppressWarnings("override")
			public void actionPerformed(ActionEvent arg0) {
                            c23=new int[5];
				c23[1]=1;
			}
		});
		r89.setBounds(1434, 141, 44, 23);
		frame.getContentPane().add(r89);
		
		JRadioButton r90 = new JRadioButton("2");
		r90.addActionListener(new ActionListener() {
                        @SuppressWarnings("override")
			public void actionPerformed(ActionEvent arg0) {
				c23[2]=2;
			}
		});
		r90.setBounds(1480, 141, 44, 23);
		frame.getContentPane().add(r90);
		
		JRadioButton r91 = new JRadioButton("3");
		r91.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c23[3]=3;
			}
		});
		r91.setBounds(1526, 141, 44, 23);
		frame.getContentPane().add(r91);
		
		JRadioButton r92 = new JRadioButton("4");
		r92.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c23[4]=4;
			}
		});
		r92.setBounds(1572, 141, 44, 23);
		frame.getContentPane().add(r92);
		final ButtonGroup group23=new ButtonGroup();
		group23.add(r89);
		group23.add(r90);
		group23.add(r91);
		group23.add(r92);
		
		JRadioButton r93 = new JRadioButton("1");
		r93.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c24=new int[5];
				c24[1]=1;
			}
		});
		r93.setBounds(1434, 169, 44, 23);
		frame.getContentPane().add(r93);
		
		JRadioButton r94 = new JRadioButton("2");
		r94.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c24[2]=2;
			}
		});
		r94.setBounds(1480, 169, 44, 23);
		frame.getContentPane().add(r94);
		
		JRadioButton r95 = new JRadioButton("3");
		r95.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c24[3]=3;
			}
		});
		r95.setBounds(1526, 169, 44, 23);
		frame.getContentPane().add(r95);
		
		JRadioButton r96 = new JRadioButton("4");
		r96.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c24[4]=4;
			}
		});
		r96.setBounds(1572, 169, 44, 23);
		frame.getContentPane().add(r96);
		final ButtonGroup group24=new ButtonGroup();
		group24.add(r93);
		group24.add(r94);
		group24.add(r95);
		group24.add(r96);
		
		JRadioButton r97 = new JRadioButton("1");
		r97.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c25=new int[5];
				c25[1]=1;
			}
		});
		r97.setBounds(1434, 195, 44, 23);
		frame.getContentPane().add(r97);
		
		JRadioButton r98 = new JRadioButton("2");
		r98.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c25[2]=2;
			}
		});
		r98.setBounds(1480, 195, 44, 23);
		frame.getContentPane().add(r98);
		
		JRadioButton r99 = new JRadioButton("3");
		r99.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c25[3]=3;
			}
		});
		r99.setBounds(1526, 195, 44, 23);
		frame.getContentPane().add(r99);
		
		JRadioButton r100 = new JRadioButton("4");
		r60.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c25[4]=4;
			}
		});
		r100.setBounds(1572, 195, 44, 23);
		frame.getContentPane().add(r100);
		final ButtonGroup group25=new ButtonGroup();
		group25.add(r97);
		group25.add(r98);
		group25.add(r99);
		group25.add(r100);
		
		JRadioButton r101 = new JRadioButton("1");
		r101.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c26=new int[5];
				c26[1]=1;
			}
		});
		r101.setBounds(1434, 221, 44, 23);
		frame.getContentPane().add(r101);
		
		JRadioButton r102 = new JRadioButton("2");
		r102.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c26[2]=2;
			}
		});
		r102.setBounds(1480, 221, 44, 23);
		frame.getContentPane().add(r102);
		
		JRadioButton r103 = new JRadioButton("3");
		r103.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c26[3]=3;
			}
		});
		r103.setBounds(1526, 221, 44, 23);
		frame.getContentPane().add(r103);
		
		JRadioButton r104 = new JRadioButton("4");
		r104.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c26[4]=4;
			}
		});
		r104.setBounds(1572, 221, 44, 23);
		frame.getContentPane().add(r104);
		final ButtonGroup group26=new ButtonGroup();
		group26.add(r101);
		group26.add(r102);
		group26.add(r103);
		group26.add(r104);
		
		JRadioButton r105 = new JRadioButton("1");
		r105.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c27=new int[5];
				c27[1]=1;
			}
		});
		r105.setBounds(1434, 247, 44, 23);
		frame.getContentPane().add(r105);
		
		JRadioButton r106 = new JRadioButton("2");
		r106.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c27[2]=2;
			}
		});
		r106.setBounds(1480, 247, 44, 23);
		frame.getContentPane().add(r106);
		
		JRadioButton r107 = new JRadioButton("3");
		r107.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c27[3]=3;
			}
		});
		r107.setBounds(1526, 247, 44, 23);
		frame.getContentPane().add(r107);
		
		JRadioButton r108 = new JRadioButton("4");
		r108.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c27[4]=4;
			}
		});
		r108.setBounds(1572, 247, 44, 23);
		frame.getContentPane().add(r108);
		final ButtonGroup group27=new ButtonGroup();
		group27.add(r105);
		group27.add(r106);
		group27.add(r107);
		group27.add(r108);
		
		JRadioButton r109 = new JRadioButton("1");
		r109.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c28=new int[5];
				c28[1]=1;
			}
		});
		r109.setBounds(1434, 273, 44, 23);
		frame.getContentPane().add(r109);
		
		JRadioButton r110 = new JRadioButton("2");
		r110.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c28[2]=2;
			}
		});
		r110.setBounds(1480, 273, 44, 23);
		frame.getContentPane().add(r110);
		
		JRadioButton r111 = new JRadioButton("3");
		r111.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c28[3]=3;
			}
		});
		r111.setBounds(1526, 273, 44, 23);
		frame.getContentPane().add(r111);
		
		JRadioButton r112 = new JRadioButton("4");
		r112.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c28[4]=4;
			}
		});
		r112.setBounds(1572, 273, 44, 23);
		frame.getContentPane().add(r112);
		final ButtonGroup group28=new ButtonGroup();
		group28.add(r109);
		group28.add(r110);
		group28.add(r111);
		group28.add(r112);
		
		JRadioButton r113 = new JRadioButton("1");
		r113.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c29=new int[5];
				c29[1]=1;
			}
		});
		r113.setBounds(1434, 299, 44, 23);
		frame.getContentPane().add(r113);
		
		JRadioButton r114 = new JRadioButton("2");
		r114.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c29[2]=2;
			}
		});
		r114.setBounds(1480, 299, 44, 23);
		frame.getContentPane().add(r114);
		
		JRadioButton r115 = new JRadioButton("3");
		r115.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c29[3]=3;
			}
		});
		r115.setBounds(1526, 299, 44, 23);
		frame.getContentPane().add(r115);
		
		JRadioButton r116 = new JRadioButton("4");
		r116.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c29[4]=4;
			}
		});
		r116.setBounds(1572, 299, 44, 23);
		frame.getContentPane().add(r116);
		final ButtonGroup group29=new ButtonGroup();
		group29.add(r113);
		group29.add(r114);
		group29.add(r115);
		group29.add(r116);
		
		JRadioButton r117 = new JRadioButton("1");
		r117.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c30=new int[5];
				c30[1]=1;
			}
		});
		r117.setBounds(1434, 325, 44, 23);
		frame.getContentPane().add(r117);
		
		JRadioButton r118 = new JRadioButton("2");
		r118.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c30[2]=2;
			}
		});
		r118.setBounds(1480, 325, 44, 23);
		frame.getContentPane().add(r118);
		
		JRadioButton r119 = new JRadioButton("3");
		r119.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c30[3]=3;
			}
		});
		r119.setBounds(1526, 325, 44, 23);
		frame.getContentPane().add(r119);
		
		JRadioButton r120 = new JRadioButton("4");
		r120.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c30[4]=4;
			}
		});
		r120.setBounds(1572, 325, 44, 23);
		frame.getContentPane().add(r120);
		final ButtonGroup group30=new ButtonGroup();
		group30.add(r117);
		group30.add(r118);
		group30.add(r119);
		group30.add(r120);
                JRadioButton r121 = new JRadioButton("1");
		r121.addActionListener((ActionEvent arg0) -> {
                    c31=new int[5];
                    c31[1]=1;
            });
		r121.setBounds(1746, 89, 44, 23);
		frame.getContentPane().add(r121);
		
		JRadioButton r122= new JRadioButton("2");
		r122.addActionListener((ActionEvent e) -> {
                    c31[2]=2;
            });
		r122.setBounds(1792, 89, 44, 23);
		frame.getContentPane().add(r122);
		
		
		JRadioButton r123 = new JRadioButton("3");
		r123.addActionListener((ActionEvent e) -> {
                    c31[3]=3;
            });
		r123.setBounds(1838, 89, 44, 23);
		frame.getContentPane().add(r123);
		
		JRadioButton r124 = new JRadioButton("4");
		r124.addActionListener((ActionEvent e) -> {
                    c31[4]=4;
            });
		r124.setBounds(1884, 89, 44, 23);
		frame.getContentPane().add(r124);
		final ButtonGroup group31=new ButtonGroup();
		group31.add(r121);
		group31.add(r122);
		group31.add(r123);
		group31.add(r124);
		
		
		
		JRadioButton r125 = new JRadioButton("1");
		r125.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent arg0) {
                            c32=new int[5];
				c32[1]=1;
			}
		});
		r125.setBounds(1746, 115, 44, 23);
		frame.getContentPane().add(r125);
		
		JRadioButton r126 = new JRadioButton("2");
		r126.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c32[2]=2;
			}
		});
		r126.setBounds(1792, 115, 44, 23);
		frame.getContentPane().add(r126);
		
		JRadioButton r127 = new JRadioButton("3");
		r127.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c32[3]=3;
			}
		});
		r127.setBounds(1838, 115, 44, 23);
		frame.getContentPane().add(r127);
		
		JRadioButton r128 = new JRadioButton("4");
		r128.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent arg0) {
				c32[4]=4;
			}
		});
		r128.setBounds(1884, 115, 45, 23);
		frame.getContentPane().add(r128);
		final ButtonGroup group32=new ButtonGroup();
		group32.add(r125);
		group32.add(r126);
		group32.add(r127);
		group32.add(r128);
		
		JRadioButton r129 = new JRadioButton("1");
		r129.addActionListener(new ActionListener() {
                        @SuppressWarnings("override")
			public void actionPerformed(ActionEvent arg0) {
                            c33=new int[5];
				c33[1]=1;
			}
		});
		r129.setBounds(1746, 141, 44, 23);
		frame.getContentPane().add(r129);
		
		JRadioButton r130 = new JRadioButton("2");
		r130.addActionListener(new ActionListener() {
                        @SuppressWarnings("override")
			public void actionPerformed(ActionEvent arg0) {
				c33[2]=2;
			}
		});
		r130.setBounds(1792, 141, 44, 23);
		frame.getContentPane().add(r130);
		
		JRadioButton r131 = new JRadioButton("3");
		r131.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c33[3]=3;
			}
		});
		r131.setBounds(1838, 141, 44, 23);
		frame.getContentPane().add(r131);
		
		JRadioButton r132 = new JRadioButton("4");
		r132.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c33[4]=4;
			}
		});
		r132.setBounds(1884, 141, 44, 23);
		frame.getContentPane().add(r132);
		final ButtonGroup group33=new ButtonGroup();
		group33.add(r129);
		group33.add(r130);
		group33.add(r131);
		group33.add(r132);
		
		JRadioButton r133 = new JRadioButton("1");
		r133.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c34=new int[5];
				c34[1]=1;
			}
		});
		r133.setBounds(1746, 169, 44, 23);
		frame.getContentPane().add(r133);
		
		JRadioButton r134 = new JRadioButton("2");
		r134.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c34[2]=2;
			}
		});
		r134.setBounds(1792, 169, 44, 23);
		frame.getContentPane().add(r134);
		
		JRadioButton r135 = new JRadioButton("3");
		r135.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c34[3]=3;
			}
		});
		r135.setBounds(1838, 169, 44, 23);
		frame.getContentPane().add(r135);
		
		JRadioButton r136 = new JRadioButton("4");
		r136.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c34[4]=4;
			}
		});
		r136.setBounds(1884, 169, 44, 23);
		frame.getContentPane().add(r136);
		final ButtonGroup group34=new ButtonGroup();
		group34.add(r133);
		group34.add(r134);
		group34.add(r135);
		group34.add(r136);
		
		JRadioButton r137 = new JRadioButton("1");
		r137.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c35=new int[5];
				c35[1]=1;
			}
		});
		r137.setBounds(1746, 195, 44, 23);
		frame.getContentPane().add(r137);
		
		JRadioButton r138 = new JRadioButton("2");
		r138.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c35[2]=2;
			}
		});
		r138.setBounds(1792, 195, 44, 23);
		frame.getContentPane().add(r138);
		
		JRadioButton r139 = new JRadioButton("3");
		r139.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c35[3]=3;
			}
		});
		r139.setBounds(1838, 195, 44, 23);
		frame.getContentPane().add(r139);
		
		JRadioButton r140 = new JRadioButton("4");
		r140.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c35[4]=4;
			}
		});
		r140.setBounds(1884, 195, 44, 23);
		frame.getContentPane().add(r140);
		final ButtonGroup group35=new ButtonGroup();
		group35.add(r137);
		group35.add(r138);
		group35.add(r139);
		group35.add(r140);
		
		JRadioButton r141 = new JRadioButton("1");
		r141.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c36=new int[5];
				c36[1]=1;
			}
		});
		r141.setBounds(1746, 221, 44, 23);
		frame.getContentPane().add(r141);
		
		JRadioButton r142 = new JRadioButton("2");
		r142.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c36[2]=2;
			}
		});
		r142.setBounds(1792, 221, 44, 23);
		frame.getContentPane().add(r142);
		
		JRadioButton r143 = new JRadioButton("3");
		r143.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c36[3]=3;
			}
		});
		r143.setBounds(1838, 221, 44, 23);
		frame.getContentPane().add(r143);
		
		JRadioButton r144 = new JRadioButton("4");
		r144.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c36[4]=4;
			}
		});
		r144.setBounds(1884, 221, 44, 23);
		frame.getContentPane().add(r144);
		final ButtonGroup group36=new ButtonGroup();
		group36.add(r141);
		group36.add(r142);
		group36.add(r143);
		group36.add(r144);
		
		JRadioButton r145 = new JRadioButton("1");
		r145.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c37=new int[5];
				c37[1]=1;
			}
		});
		r145.setBounds(1746, 247, 44, 23);
		frame.getContentPane().add(r145);
		
		JRadioButton r146 = new JRadioButton("2");
		r146.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c37[2]=2;
			}
		});
		r146.setBounds(1792, 247, 44, 23);
		frame.getContentPane().add(r146);
		
		JRadioButton r147 = new JRadioButton("3");
		r147.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c37[3]=3;
			}
		});
		r147.setBounds(1838, 247, 44, 23);
		frame.getContentPane().add(r147);
		
		JRadioButton r148 = new JRadioButton("4");
		r148.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c37[4]=4;
			}
		});
		r148.setBounds(1884, 247, 44, 23);
		frame.getContentPane().add(r148);
		final ButtonGroup group37=new ButtonGroup();
		group37.add(r145);
		group37.add(r146);
		group37.add(r147);
		group37.add(r148);
		
		JRadioButton r149 = new JRadioButton("1");
		r149.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c38=new int[5];
				c38[1]=1;
			}
		});
		r149.setBounds(1746, 273, 44, 23);
		frame.getContentPane().add(r149);
		
		JRadioButton r150 = new JRadioButton("2");
		r150.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c38[2]=2;
			}
		});
		r150.setBounds(1792, 273, 44, 23);
		frame.getContentPane().add(r150);
		
		JRadioButton r151 = new JRadioButton("3");
		r151.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c38[3]=3;
			}
		});
		r151.setBounds(1838, 273, 44, 23);
		frame.getContentPane().add(r151);
		
		JRadioButton r152 = new JRadioButton("4");
		r152.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c38[4]=4;
			}
		});
		r152.setBounds(1884, 273, 44, 23);
		frame.getContentPane().add(r152);
		final ButtonGroup group38=new ButtonGroup();
		group38.add(r149);
		group38.add(r150);
		group38.add(r151);
		group38.add(r152);
		
		JRadioButton r153 = new JRadioButton("1");
		r153.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            c39=new int[5];
				c39[1]=1;
			}
		});
		r153.setBounds(1746, 299, 44, 23);
		frame.getContentPane().add(r153);
		
		JRadioButton r154 = new JRadioButton("2");
		r154.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c39[2]=2;
			}
		});
		r154.setBounds(1792, 299, 44, 23);
		frame.getContentPane().add(r154);
		
		JRadioButton r155 = new JRadioButton("3");
		r155.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c39[3]=3;
			}
		});
		r155.setBounds(1838, 299, 44, 23);
		frame.getContentPane().add(r155);
		
		JRadioButton r156 = new JRadioButton("4");
		r156.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c39[4]=4;
			}
		});
		r156.setBounds(1884, 299, 44, 23);
		frame.getContentPane().add(r156);
		final ButtonGroup group39=new ButtonGroup();
		group39.add(r153);
		group39.add(r154);
		group39.add(r155);
		group39.add(r156);
		
		JRadioButton r157 = new JRadioButton("1");
		r157.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent arg0) {
                            c40=new int[5];
				c40[1]=1;
			}
		});
		r157.setBounds(1746, 325, 44, 23);
		frame.getContentPane().add(r157);
		
		JRadioButton r158 = new JRadioButton("2");
		r158.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent arg0) {
				c40[2]=2;
			}
		});
		r158.setBounds(1792, 325, 44, 23);
		frame.getContentPane().add(r158);
		
		JRadioButton r159 = new JRadioButton("3");
		r159.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent arg0) {
				c40[3]=3;
			}
		});
		r159.setBounds(1838, 325, 44, 23);
		frame.getContentPane().add(r159);
		
		JRadioButton r160 = new JRadioButton("4");
		r160.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c40[4]=4;
			}
		});
		r160.setBounds(1884, 325, 44, 23);
		frame.getContentPane().add(r160);
		final ButtonGroup group40=new ButtonGroup();
		group40.add(r157);
		group40.add(r158);
		group40.add(r159);
		group40.add(r160);
		
		JButton submit1 = new JButton("Submit");
                frame.add(submit1);
                submit1.setBounds(1200, 450, 89, 23);
               
		submit1.addActionListener(new ActionListener(){
                        @Override
			public void actionPerformed(ActionEvent e) {
                            try{
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sadiya","root","root");
                            PreparedStatement ps=con.prepareStatement("insert into student values(?,?)");
                            ps.setString(1,t1.getText());
                            ps.setString(2,t2.getText());
                            ps.executeUpdate();
                            
                            ps=con.prepareStatement("insert into teacher1 values(?,?,?,?,?,?,?,?,?,?)");
                            
                           
                            if(r1.isSelected())
                            {
                              a1=1;
                            }
                            else if(r2.isSelected())
                            {
                                a1=2;
                            }
                            else if(r3.isSelected())
                            {
                                a1=3;
                            }
                            else
                            {
                                a1=4;
                            }
                             if(r5.isSelected())
                            {
                              a2=1;
                            }
                            else if(r6.isSelected())
                            {
                                a2=2;
                            }
                            else if(r7.isSelected())
                            {
                                a2=3;
                            }
                            else
                            {
                                a2=4;
                            }
                              if(r9.isSelected())
                            {
                              a3=1;
                            }
                            else if(r10.isSelected())
                            {
                                a3=2;
                            }
                            else if(r11.isSelected())
                            {
                                a3=3;
                            }
                            else
                            {
                                a3=4;
                            }
                               if(r13.isSelected())
                            {
                              a4=1;
                            }
                            else if(r14.isSelected())
                            {
                                a4=2;
                            }
                            else if(r15.isSelected())
                            {
                                a4=3;
                            }
                            else
                            {
                                a4=4;
                            }
                                if(r17.isSelected())
                            {
                              a5=1;
                            }
                            else if(r18.isSelected())
                            {
                                a5=2;
                            }
                            else if(r19.isSelected())
                            {
                                a5=3;
                            }
                            else
                            {
                                a5=4;
                            }
                                 if(r21.isSelected())
                            {
                              a6=1;
                            }
                            else if(r22.isSelected())
                            {
                                a6=2;
                            }
                            else if(r23.isSelected())
                            {
                                a6=3;
                            }
                            else
                            {
                                a6=4;
                            }
                                  if(r25.isSelected())
                            {
                              a7=1;
                            }
                            else if(r26.isSelected())
                            {
                                a7=2;
                            }
                            else if(r27.isSelected())
                            {
                                a7=3;
                            }
                            else
                            {
                                a7=4;
                            }
                                   if(r29.isSelected())
                            {
                              a8=1;
                            }
                            else if(r30.isSelected())
                            {
                                a8=2;
                            }
                            else if(r31.isSelected())
                            {
                                a8=3;
                            }
                            else
                            {
                                a8=4;
                            }
                                    if(r33.isSelected())
                            {
                              a9=1;
                            }
                            else if(r34.isSelected())
                            {
                                a9=2;
                            }
                            else if(r35.isSelected())
                            {
                                a9=3;
                            }
                            else
                            {
                                a9=4;
                            }
                                     if(r37.isSelected())
                            {
                              a10=1;
                            }
                            else if(r38.isSelected())
                            {
                                a10=2;
                            }
                            else if(r39.isSelected())
                            {
                                a10=3;
                            }
                            else
                            {
                                a10=4;
                            }
                                
                         
                            ps.setInt(1,a1);
                            ps.setInt(2,a2);
                            ps.setInt(3,a3);
                            ps.setInt(4,a4);
                            ps.setInt(5,a5);
                            ps.setInt(6,a6);
                            ps.setInt(7,a7);
                            ps.setInt(8,a8);
                            ps.setInt(9,a9);
                            ps.setInt(10,a10);
                            
                            ps.executeUpdate();
                            
                             ps=con.prepareStatement("insert into teacher2 values(?,?,?,?,?,?,?,?,?,?)");
                            
                           
                            if(r41.isSelected())
                            {
                              a11=1;
                            }
                            else if(r42.isSelected())
                            {
                                a11=2;
                            }
                            else if(r43.isSelected())
                            {
                                a11=3;
                            }
                            else
                            {
                                a11=4;
                            }
                             if(r45.isSelected())
                            {
                              a12=1;
                            }
                            else if(r46.isSelected())
                            {
                                a12=2;
                            }
                            else if(r47.isSelected())
                            {
                                a12=3;
                            }
                            else
                            {
                                a12=4;
                            }
                              if(r49.isSelected())
                            {
                              a13=1;
                            }
                            else if(r50.isSelected())
                            {
                                a13=2;
                            }
                            else if(r51.isSelected())
                            {
                                a13=3;
                            }
                            else
                            {
                                a13=4;
                            }
                               if(r53.isSelected())
                            {
                              a14=1;
                            }
                            else if(r54.isSelected())
                            {
                                a14=2;
                            }
                            else if(r55.isSelected())
                            {
                                a14=3;
                            }
                            else
                            {
                                a14=4;
                            }
                                if(r57.isSelected())
                            {
                              a15=1;
                            }
                            else if(r58.isSelected())
                            {
                                a15=2;
                            }
                            else if(r59.isSelected())
                            {
                                a15=3;
                            }
                            else
                            {
                                a15=4;
                            }
                                 if(r61.isSelected())
                            {
                              a16=1;
                            }
                            else if(r62.isSelected())
                            {
                                a16=2;
                            }
                            else if(r63.isSelected())
                            {
                                a16=3;
                            }
                            else
                            {
                                a16=4;
                            }
                                  if(r65.isSelected())
                            {
                              a17=1;
                            }
                            else if(r66.isSelected())
                            {
                                a17=2;
                            }
                            else if(r67.isSelected())
                            {
                                a17=3;
                            }
                            else
                            {
                                a17=4;
                            }
                                   if(r69.isSelected())
                            {
                              a18=1;
                            }
                            else if(r70.isSelected())
                            {
                                a18=2;
                            }
                            else if(r71.isSelected())
                            {
                                a18=3;
                            }
                            else
                            {
                                a18=4;
                            }
                                    if(r73.isSelected())
                            {
                              a19=1;
                            }
                            else if(r74.isSelected())
                            {
                                a19=2;
                            }
                            else if(r75.isSelected())
                            {
                                a19=3;
                            }
                            else
                            {
                                a19=4;
                            }
                                     if(r77.isSelected())
                            {
                              a20=1;
                            }
                            else if(r78.isSelected())
                            {
                                a20=2;
                            }
                            else if(r79.isSelected())
                            {
                                a20=3;
                            }
                            else
                            {
                                a20=4;
                            }
                                
                         
                            ps.setInt(1,a11);
                            ps.setInt(2,a12);
                            ps.setInt(3,a13);
                            ps.setInt(4,a14);
                            ps.setInt(5,a15);
                            ps.setInt(6,a16);
                            ps.setInt(7,a17);
                            ps.setInt(8,a18);
                            ps.setInt(9,a19);
                            ps.setInt(10,a20);
                            
                            ps.executeUpdate();
                            
                             ps=con.prepareStatement("insert into teacher3 values(?,?,?,?,?,?,?,?,?,?)");
                            
                           
                            if(r81.isSelected())
                            {
                              a21=1;
                            }
                            else if(r82.isSelected())
                            {
                                a21=2;
                            }
                            else if(r83.isSelected())
                            {
                                a21=3;
                            }
                            else
                            {
                                a21=4;
                            }
                             if(r85.isSelected())
                            {
                              a22=1;
                            }
                            else if(r86.isSelected())
                            {
                                a22=2;
                            }
                            else if(r87.isSelected())
                            {
                                a22=3;
                            }
                            else
                            {
                                a22=4;
                            }
                              if(r89.isSelected())
                            {
                              a23=1;
                            }
                            else if(r90.isSelected())
                            {
                                a23=2;
                            }
                            else if(r91.isSelected())
                            {
                                a23=3;
                            }
                            else
                            {
                                a23=4;
                            }
                               if(r93.isSelected())
                            {
                              a24=1;
                            }
                            else if(r94.isSelected())
                            {
                                a24=2;
                            }
                            else if(r95.isSelected())
                            {
                                a24=3;
                            }
                            else
                            {
                                a24=4;
                            }
                                if(r97.isSelected())
                            {
                              a25=1;
                            }
                            else if(r98.isSelected())
                            {
                                a25=2;
                            }
                            else if(r99.isSelected())
                            {
                                a25=3;
                            }
                            else
                            {
                                a25=4;
                            }
                                 if(r101.isSelected())
                            {
                              a26=1;
                            }
                            else if(r102.isSelected())
                            {
                                a26=2;
                            }
                            else if(r103.isSelected())
                            {
                                a26=3;
                            }
                            else
                            {
                                a26=4;
                            }
                                  if(r105.isSelected())
                            {
                              a27=1;
                            }
                            else if(r106.isSelected())
                            {
                                a27=2;
                            }
                            else if(r107.isSelected())
                            {
                                a27=3;
                            }
                            else
                            {
                                a27=4;
                            }
                                   if(r109.isSelected())
                            {
                              a28=1;
                            }
                            else if(r110.isSelected())
                            {
                                a28=2;
                            }
                            else if(r111.isSelected())
                            {
                                a28=3;
                            }
                            else
                            {
                                a28=4;
                            }
                                    if(r113.isSelected())
                            {
                              a29=1;
                            }
                            else if(r114.isSelected())
                            {
                                a29=2;
                            }
                            else if(r115.isSelected())
                            {
                                a29=3;
                            }
                            else
                            {
                                a29=4;
                            }
                                     if(r117.isSelected())
                            {
                              a30=1;
                            }
                            else if(r118.isSelected())
                            {
                                a30=2;
                            }
                            else if(r119.isSelected())
                            {
                                a30=3;
                            }
                            else
                            {
                                a30=4;
                            }
                                
                         
                            ps.setInt(1,a21);
                            ps.setInt(2,a22);
                            ps.setInt(3,a23);
                            ps.setInt(4,a24);
                            ps.setInt(5,a25);
                            ps.setInt(6,a26);
                            ps.setInt(7,a27);
                            ps.setInt(8,a28);
                            ps.setInt(9,a29);
                            ps.setInt(10,a30);
                            
                            ps.executeUpdate();
                            
                             ps=con.prepareStatement("insert into teacher4 values(?,?,?,?,?,?,?,?,?,?)");
                            
                           
                            if(r121.isSelected())
                            {
                              a31=1;
                            }
                            else if(r122.isSelected())
                            {
                                a31=2;
                            }
                            else if(r123.isSelected())
                            {
                                a31=3;
                            }
                            else
                            {
                                a31=4;
                            }
                             if(r125.isSelected())
                            {
                              a32=1;
                            }
                            else if(r26.isSelected())
                            {
                                a32=2;
                            }
                            else if(r127.isSelected())
                            {
                                a32=3;
                            }
                            else
                            {
                                a32=4;
                            }
                              if(r129.isSelected())
                            {
                              a33=1;
                            }
                            else if(r130.isSelected())
                            {
                                a33=2;
                            }
                            else if(r131.isSelected())
                            {
                                a33=3;
                            }
                            else
                            {
                                a33=4;
                            }
                               if(r133.isSelected())
                            {
                              a34=1;
                            }
                            else if(r134.isSelected())
                            {
                                a34=2;
                            }
                            else if(r135.isSelected())
                            {
                                a34=3;
                            }
                            else
                            {
                                a34=4;
                            }
                                if(r137.isSelected())
                            {
                              a35=1;
                            }
                            else if(r138.isSelected())
                            {
                                a35=2;
                            }
                            else if(r139.isSelected())
                            {
                                a35=3;
                            }
                            else
                            {
                                a35=4;
                            }
                                 if(r141.isSelected())
                            {
                              a36=1;
                            }
                            else if(r142.isSelected())
                            {
                                a36=2;
                            }
                            else if(r143.isSelected())
                            {
                                a36=3;
                            }
                            else
                            {
                                a36=4;
                            }
                                  if(r145.isSelected())
                            {
                              a37=1;
                            }
                            else if(r146.isSelected())
                            {
                                a37=2;
                            }
                            else if(r147.isSelected())
                            {
                                a37=3;
                            }
                            else
                            {
                                a37=4;
                            }
                                   if(r149.isSelected())
                            {
                              a38=1;
                            }
                            else if(r150.isSelected())
                            {
                                a38=2;
                            }
                            else if(r151.isSelected())
                            {
                                a38=3;
                            }
                            else
                            {
                                a38=4;
                            }
                                    if(r153.isSelected())
                            {
                              a39=1;
                            }
                            else if(r154.isSelected())
                            {
                                a39=2;
                            }
                            else if(r155.isSelected())
                            {
                                a39=3;
                            }
                            else
                            {
                                a39=4;
                            }
                                     if(r157.isSelected())
                            {
                              a40=1;
                            }
                            else if(r158.isSelected())
                            {
                                a40=2;
                            }
                            else if(r159.isSelected())
                            {
                                a40=3;
                            }
                            else
                            {
                                a40=4;
                            }
                                
                         
                            ps.setInt(1,a31);
                            ps.setInt(2,a32);
                            ps.setInt(3,a33);
                            ps.setInt(4,a34);
                            ps.setInt(5,a35);
                            ps.setInt(6,a36);
                            ps.setInt(7,a37);
                            ps.setInt(8,a38);
                            ps.setInt(9,a39);
                            ps.setInt(10,a40);
                            
                            ps.executeUpdate();
                                  
 }
                            catch(ClassNotFoundException | SQLException ex)
                            {
                                System.out.println(ex);
                            }
                            
                            
                            
                            JOptionPane.showMessageDialog(null, "FEEDBACK SUBMITTED SUCCESSFULLY!!!!!!");

                            t1.setText("");
                            t2.setText("");
                        
                            
                      
                          
                                group1.clearSelection();
				group2.clearSelection();
				group3.clearSelection();
				group4.clearSelection();
				group5.clearSelection();
				group6.clearSelection();
				group7.clearSelection();
				group8.clearSelection();
				group9.clearSelection();
				group10.clearSelection();
                                group11.clearSelection();
                                group12.clearSelection();
				group13.clearSelection();
				group14.clearSelection();
				group15.clearSelection();
				group16.clearSelection();
				group17.clearSelection();
				group18.clearSelection();
				group19.clearSelection();
				group20.clearSelection();
                                group21.clearSelection();
                                group22.clearSelection();
				group23.clearSelection();
				group24.clearSelection();
				group25.clearSelection();
				group26.clearSelection();
				group27.clearSelection();
				group28.clearSelection();
				group29.clearSelection();
				group30.clearSelection();
                                group31.clearSelection();
                                group32.clearSelection();
				group33.clearSelection();
				group34.clearSelection();
				group35.clearSelection();
				group36.clearSelection();
				group37.clearSelection();
				group38.clearSelection();
				group39.clearSelection();
				group40.clearSelection();
                        
                        }
                });
        }
}
						
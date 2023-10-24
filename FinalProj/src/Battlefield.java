import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Battlefield extends JFrame implements ActionListener {
    int value;
    JButton skill1_button, skill2_button, skill3_button, skill4_button;
    JPanel skill_panel, profile_panel, boss_panel;
    JLabel skill_panel_label, profile_panel_label, profile_pic_label, boss_panel_label, profile_username_label, profile_health_label;
    int player_health = 10;
    int player_max_health = 10;
    Battlefield(){
        int width = 1520;
        int height = 820;

        //frame layout
        this.setVisible(true);
        SizeAdjust(width, height); //input values of frame width and height here to automatically adjust other panels
        this.setTitle("Reforge: Rise of the Seventeen Cities");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLayout(null);

        //background
        ImageIcon bg_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\pixel_bg.jpg");
        JLabel bg = new JLabel();
        bg.setIcon(bg_pic);
        bg.setBounds(0,0, width, height);
        bg.setOpaque(false);
        this.add(bg);

        this.value = value;
    }

    public void SizeAdjust(int width, int height){
        //for self-adjustments of borders
        int right_border_x = width - 188;
        int border_height = height - 150;

        //for self adjustments of panels
        int skill_panel_y = height - 170;
        int skill_panel_width = width - 520;
        int panel_height = height - border_height;
        int skill_buttons_width = panel_height - 10;
        int skill_buttons_height = panel_height - 10;
        int buttons_margin_x = (skill_panel_width - (skill_buttons_width * 4)) / 5;
        int buttons_margin_y = panel_height - 145;
        int profile_panel_width = width - skill_panel_width;

        //frame size
        this.setSize(width, height);

        BattlefieldLayout(right_border_x, border_height, skill_panel_y, skill_panel_width, panel_height,
                skill_buttons_width, skill_buttons_height, profile_panel_width, buttons_margin_x, buttons_margin_y);
    }

    public void BattlefieldLayout(int right_x, int border_height, int skill_y, int skill_width, int panel_height,
                                  int button_width, int button_height, int profile_width, int margin_x, int margin_y){

        //border layout
        ImageIcon right_border = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\right_border.png");
        ImageIcon left_border = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\left_border.png");
        JLabel right_border_label = new JLabel();
        JLabel left_border_label = new JLabel();
        right_border_label.setIcon(right_border);
        right_border_label.setOpaque(false);
        right_border_label.setBounds(right_x,0,177,border_height);
        left_border_label.setIcon(left_border);
        left_border_label.setOpaque(false);
        left_border_label.setBounds(0,0,177,border_height);

        //skill panel layout
        SkillPanel(skill_y, skill_width, panel_height);

        //skill buttons layout
        FirstSkill(margin_x, margin_y, button_width, button_height);
        SecondSkill(margin_x, margin_y, button_width, button_height);
        ThirdSkill(margin_x, margin_y, button_width, button_height);
        FourthSkill(margin_x, margin_y, button_width, button_height);

        //add to skill panel
        skill_panel.add(skill1_button);
        skill_panel.add(skill2_button);
        skill_panel.add(skill3_button);
        skill_panel.add(skill4_button);
        skill_panel.add(skill_panel_label);

        //profile panel layout
        ProfilePanel(skill_width, skill_y, profile_width, panel_height, button_width, button_height);

        //add to profile panel
        profile_panel.add(profile_health_label);
        profile_panel.add(profile_username_label);
        profile_panel.add(profile_pic_label);
        profile_panel.add(profile_panel_label);

        //boss profile panel layout
        BossPanel();

        //add to boss panel
        boss_panel.add(boss_panel_label);

        //add to frame
        this.add(boss_panel);
        this.setComponentZOrder(boss_panel, 0);
        this.add(skill_panel);
        this.add(profile_panel);
        this.add(right_border_label);
        this.add(left_border_label);
    }

    public void SkillPanel(int skill_y, int skill_width, int panel_height){
        //skill panel layout
        ImageIcon skill_panel_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\skill_panel.png");
        skill_panel_label = new JLabel();
        skill_panel_label.setIcon(skill_panel_pic);
        skill_panel_label.setBounds(0,0,1000,140);

        skill_panel = new JPanel();
        skill_panel.setBounds(0, skill_y, skill_width, panel_height);
        skill_panel.setLayout(new BorderLayout());
    }

    public void FirstSkill(int margin_x, int margin_y, int button_width, int button_height){
        //first skill button layout
        ImageIcon skill1 = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\frostbite_dagger_button.png");
        skill1_button = new JButton(skill1);
        skill1_button.setBounds(margin_x, margin_y, button_width,button_height);
        skill1_button.setContentAreaFilled(false);
        skill1_button.setBorderPainted(false);
        skill1_button.setFocusable(false);
        skill1_button.addActionListener(this);
    }

    public void SecondSkill(int margin_x, int margin_y, int button_width, int button_height){
        //second skill layout
        ImageIcon skill2 = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\soulshatter_blade_button.png");
        skill2_button = new JButton(skill2);
        skill2_button.setBounds((margin_x * 2) + button_width, margin_y, button_width, button_height);
        skill2_button.setContentAreaFilled(false);
        skill2_button.setBorderPainted(false);
        skill2_button.setFocusable(false);
        skill2_button.addActionListener(this);
    }

    public void ThirdSkill(int margin_x, int margin_y, int button_width, int button_height){
        ImageIcon skill1 = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\frostbite_dagger_button.png");
        skill3_button = new JButton(skill1);
        skill3_button.setBounds((margin_x * 3) + (button_width * 2), margin_y, button_width, button_height);
        skill3_button.setContentAreaFilled(false);
        skill3_button.setBorderPainted(false);
        skill3_button.setFocusable(false);
        skill3_button.addActionListener(this);
    }

    public void FourthSkill(int margin_x, int margin_y, int button_width, int button_height){
        ImageIcon skill2 = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\soulshatter_blade_button.png");
        skill4_button = new JButton(skill2);
        skill4_button.setBounds((margin_x * 4) + (button_width * 3), margin_y, button_width, button_height);
        skill4_button.setContentAreaFilled(false);
        skill4_button.setBorderPainted(false);
        skill4_button.setFocusable(false);
        skill4_button.addActionListener(this);
    }

    public void ProfilePanel(int skill_width, int skill_y, int profile_width, int panel_height, int button_width, int button_height){
        //profile panel layout
        ImageIcon profile_panel_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\profile_panel.png");
        ImageIcon profile_player_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\voidbringer_staff_button.png");

        profile_panel_label = new JLabel();
        profile_panel_label.setIcon(profile_panel_pic);
        profile_panel_label.setOpaque(false);
        profile_panel_label.setBounds(0, 0, profile_width, panel_height);

        profile_pic_label = new JLabel();
        profile_pic_label.setIcon(profile_player_pic);
        profile_pic_label.setOpaque(false);
        profile_pic_label.setBounds(50, 5, button_width, button_height);

        profile_username_label = new JLabel();
        profile_username_label.setText("USERNAME");
        profile_username_label.setBounds(200,0, 300, 80);

        profile_health_label = new JLabel();
        profile_health_label.setText(player_health + " / " + player_max_health);
        profile_health_label.setBounds(200, 50, 300, 80);

        profile_panel = new JPanel();
        profile_panel.setBounds(skill_width, skill_y, profile_width, panel_height);
        profile_panel.setLayout(new BorderLayout());
    }

    public void BossPanel(){
        ImageIcon boss_panel_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\profile_panel.png");
        boss_panel = new JPanel();
        boss_panel.setBounds(805,0,510, 140);
        boss_panel_label = new JLabel();
        boss_panel_label.setIcon(boss_panel_pic);
        boss_panel_label.setBounds(0,0,510,140);
        boss_panel_label.setOpaque(false);
        boss_panel.setLayout(new BorderLayout());
    }

    @Override
    public void actionPerformed(ActionEvent e){
            if (e.getSource() == skill1_button || e.getSource() == skill3_button) {
                player_health -= 1;
                profile_health_label.setText(player_health + " / " + player_max_health + value);
                System.out.println("Frostbite Dagger");
            } else {
                System.out.println("Soulshatter Blade");
            }
    }
}
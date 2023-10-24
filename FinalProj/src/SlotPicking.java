import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SlotPicking extends JFrame implements ActionListener {
    JButton frostbiteDagger, infernoScythe, phoenixWingSpear, runeboundCrossbow, serpentsClaws;
    JButton shadowReaverAxe, soulshatterBlade, starfallBow, thunderstrikeHammer, voidbringerStaff;
    JButton aegisSteel, armorersGemstone, barrierBracelet, defendersTalisman, guardiansAmulet;
    JButton protectionCharm, safeguardingMedallion, sentinelsBarricade, shieldbearersPendant, wardingRing;
    JButton brewOfDecay, elixirOfResilience, potentFuryBrew, potionOfRecovery, weaknessPotion;
    JPanel desc_panel;
    JLabel itemDesc_label, itemName_label, desc_panel_label;
     SlotPicking(){
        int width = 1000;
        int height = 735;

        this.setSize(width, height);
        this.setVisible(true);
        this.setLayout(null);
        this.setTitle("Reforge: Rise of the Seventeen Cities");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        AttackButtons();
        DefenseButtons();
        SupportButtons();
        DescPanel();
        this.getContentPane().setBackground(Color.BLACK);
    }

    public void DescPanel(){
         desc_panel = new JPanel();
         desc_panel.setBounds(731,0,260, 735);
         desc_panel.setLayout(new BorderLayout());

         itemDesc_label = new JLabel();
         itemName_label = new JLabel();
         desc_panel_label = new JLabel();

         itemName_label.setBounds(0, 50, 100,100);
         itemDesc_label.setBounds(0, 40, 100,100);

         desc_panel.add(itemName_label);
         desc_panel.add(itemDesc_label);
         this.add(desc_panel);
    }
    public void AttackButtons() {
        //attack buttons images
        ImageIcon frostbiteDagger_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\frostbite_dagger_button.png");
        ImageIcon infernoScythe_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\inferno_scythe_button.png");
        ImageIcon phoenixWingSpear_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\phoenix_wing_spear_button.png");
        ImageIcon runeboundCrossbow_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\runebound_crossbow_button.png");
        ImageIcon serpentsClaws_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\serpent's_claws_button.png");
        ImageIcon shadowReaverAxe_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\shadow_reaver_axe_button.png");
        ImageIcon soulshatterBlade_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\soulshatter_blade_button.png");
        ImageIcon starfallBow_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\starfall_bow_button.png");
        ImageIcon thunderstrikeHammer_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\thunderstrike_hammer_button.png");
        ImageIcon voidbringerStaff_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\voidbringer_staff_button.png");

        //attack buttons
        frostbiteDagger = new JButton(frostbiteDagger_pic);
        infernoScythe = new JButton(infernoScythe_pic);
        phoenixWingSpear = new JButton(phoenixWingSpear_pic);
        runeboundCrossbow = new JButton(runeboundCrossbow_pic);
        serpentsClaws = new JButton(serpentsClaws_pic);
        shadowReaverAxe = new JButton(shadowReaverAxe_pic);
        soulshatterBlade = new JButton(soulshatterBlade_pic);
        starfallBow = new JButton(starfallBow_pic);
        thunderstrikeHammer = new JButton(thunderstrikeHammer_pic);
        voidbringerStaff = new JButton(voidbringerStaff_pic);

        //adjustments for attack buttons
        frostbiteDagger.setContentAreaFilled(false);
        frostbiteDagger.setBorderPainted(false);
        frostbiteDagger.setFocusable(false);
        frostbiteDagger.addActionListener(this);
        frostbiteDagger.setBounds(0, 0, 140, 140);

        infernoScythe.setContentAreaFilled(false);
        infernoScythe.setBorderPainted(false);
        infernoScythe.setFocusable(false);
        infernoScythe.addActionListener(this);
        infernoScythe.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                itemName_label.setText("Inferno Scythe");
            }

            @Override
            public void mouseExited(MouseEvent e){
                itemName_label.setText("");
            }
        });
        infernoScythe.setBounds(140, 0, 140, 140);

        phoenixWingSpear.setContentAreaFilled(false);
        phoenixWingSpear.setBorderPainted(false);
        phoenixWingSpear.setFocusable(false);
        phoenixWingSpear.addActionListener(this);
        phoenixWingSpear.setBounds(280, 0, 140, 140);

        runeboundCrossbow.setContentAreaFilled(false);
        runeboundCrossbow.setBorderPainted(false);
        runeboundCrossbow.setFocusable(false);
        runeboundCrossbow.addActionListener(this);
        runeboundCrossbow.setBounds(420, 0, 140, 140);

        serpentsClaws.setContentAreaFilled(false);
        serpentsClaws.setBorderPainted(false);
        serpentsClaws.setFocusable(false);
        serpentsClaws.addActionListener(this);
        serpentsClaws.setBounds(560, 0, 140, 140);

        shadowReaverAxe.setContentAreaFilled(false);
        shadowReaverAxe.setBorderPainted(false);
        shadowReaverAxe.setFocusable(false);
        shadowReaverAxe.addActionListener(this);
        shadowReaverAxe.setBounds(0, 140, 140, 140);

        soulshatterBlade.setContentAreaFilled(false);
        soulshatterBlade.setBorderPainted(false);
        soulshatterBlade.setFocusable(false);
        soulshatterBlade.addActionListener(this);
        soulshatterBlade.setBounds(140, 140, 140, 140);

        starfallBow.setContentAreaFilled(false);
        starfallBow.setBorderPainted(false);
        starfallBow.setFocusable(false);
        starfallBow.addActionListener(this);
        starfallBow.setBounds(280, 140, 140, 140);

        thunderstrikeHammer.setContentAreaFilled(false);
        thunderstrikeHammer.setBorderPainted(false);
        thunderstrikeHammer.setFocusable(false);
        thunderstrikeHammer.addActionListener(this);
        thunderstrikeHammer.setBounds(420, 140, 140, 140);

        voidbringerStaff.setContentAreaFilled(false);
        voidbringerStaff.setBorderPainted(false);
        voidbringerStaff.setFocusable(false);
        voidbringerStaff.addActionListener(this);
        voidbringerStaff.setBounds(560, 140, 140, 140);

        //adding attack buttons to frame
        this.add(frostbiteDagger);
        this.add(infernoScythe);
        this.add(phoenixWingSpear);
        this.add(runeboundCrossbow);
        this.add(serpentsClaws);
        this.add(shadowReaverAxe);
        this.add(soulshatterBlade);
        this.add(starfallBow);
        this.add(thunderstrikeHammer);
        this.add(voidbringerStaff);
    }

    public void DefenseButtons() {
        //defense buttons images
        ImageIcon aegisSteel_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\defense_buttons\\aegis_steel_button.png");
        ImageIcon armorersGemstone_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\defense_buttons\\armorers_gemstone_button.png");
        ImageIcon barrierBracelet_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\defense_buttons\\barrier_bracelet_button.png");
        ImageIcon defendersTalisman_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\defense_buttons\\defenders_talisman_button.png");
        ImageIcon guardiansAmulet_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\defense_buttons\\guardians_amulet_button.png");
        ImageIcon protectionCharm_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\defense_buttons\\protection_charm_button.png");
        ImageIcon safeguardingMedallion_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\defense_buttons\\safeguarding_medallion_button.png");
        ImageIcon sentinelsBarricade_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\defense_buttons\\sentinels_barricade_button.png");
        ImageIcon shieldbearersPendant_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\defense_buttons\\shieldbearers_pendant_button.png");
        ImageIcon wardingRing_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\defense_buttons\\warding_ring_button.png");

        //defense buttons
        aegisSteel = new JButton(aegisSteel_pic);
        armorersGemstone = new JButton(armorersGemstone_pic);
        barrierBracelet = new JButton(barrierBracelet_pic);
        defendersTalisman = new JButton(defendersTalisman_pic);
        guardiansAmulet = new JButton(guardiansAmulet_pic);
        protectionCharm = new JButton(protectionCharm_pic);
        safeguardingMedallion = new JButton(safeguardingMedallion_pic);
        sentinelsBarricade = new JButton(sentinelsBarricade_pic);
        shieldbearersPendant = new JButton(shieldbearersPendant_pic);
        wardingRing = new JButton(wardingRing_pic);

        //adjustments for defense buttons
        aegisSteel.setContentAreaFilled(false);
        aegisSteel.setBorderPainted(false);
        aegisSteel.setFocusable(false);
        aegisSteel.addActionListener(this);
        aegisSteel.setBounds(0, 280, 140, 140);

        armorersGemstone.setContentAreaFilled(false);
        armorersGemstone.setBorderPainted(false);
        armorersGemstone.setFocusable(false);
        armorersGemstone.addActionListener(this);
        armorersGemstone.setBounds(140, 280, 140, 140);

        barrierBracelet.setContentAreaFilled(false);
        barrierBracelet.setBorderPainted(false);
        barrierBracelet.setFocusable(false);
        barrierBracelet.addActionListener(this);
        barrierBracelet.setBounds(280, 280, 140, 140);

        defendersTalisman.setContentAreaFilled(false);
        defendersTalisman.setBorderPainted(false);
        defendersTalisman.setFocusable(false);
        defendersTalisman.addActionListener(this);
        defendersTalisman.setBounds(420, 280, 140, 140);

        guardiansAmulet.setContentAreaFilled(false);
        guardiansAmulet.setBorderPainted(false);
        guardiansAmulet.setFocusable(false);
        guardiansAmulet.addActionListener(this);
        guardiansAmulet.setBounds(560, 280, 140, 140);

        protectionCharm.setContentAreaFilled(false);
        protectionCharm.setBorderPainted(false);
        protectionCharm.setFocusable(false);
        protectionCharm.addActionListener(this);
        protectionCharm.setBounds(0, 420, 140, 140);

        safeguardingMedallion.setContentAreaFilled(false);
        safeguardingMedallion.setBorderPainted(false);
        safeguardingMedallion.setFocusable(false);
        safeguardingMedallion.addActionListener(this);
        safeguardingMedallion.setBounds(140, 420, 140, 140);

        sentinelsBarricade.setContentAreaFilled(false);
        sentinelsBarricade.setBorderPainted(false);
        sentinelsBarricade.setFocusable(false);
        sentinelsBarricade.addActionListener(this);
        sentinelsBarricade.setBounds(280, 420, 140, 140);

        shieldbearersPendant.setContentAreaFilled(false);
        shieldbearersPendant.setBorderPainted(false);
        shieldbearersPendant.setFocusable(false);
        shieldbearersPendant.addActionListener(this);
        shieldbearersPendant.setBounds(420, 420, 140, 140);

        wardingRing.setContentAreaFilled(false);
        wardingRing.setBorderPainted(false);
        wardingRing.setFocusable(false);
        wardingRing.addActionListener(this);
        wardingRing.setBounds(560, 420, 140, 140);

        //adding defense buttons to frame
        this.add(aegisSteel);
        this.add(armorersGemstone);
        this.add(barrierBracelet);
        this.add(defendersTalisman);
        this.add(guardiansAmulet);
        this.add(protectionCharm);
        this.add(safeguardingMedallion);
        this.add(sentinelsBarricade);
        this.add(shieldbearersPendant);
        this.add(wardingRing);
    }

    public void SupportButtons(){
        //support buttons images
        ImageIcon brewOfDecay_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\support_buttons\\brew_of_decay_button.png");
        ImageIcon elixirOfResilience_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\support_buttons\\elixir_of_resilience_button.png");
        ImageIcon potentFuryBrew_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\support_buttons\\potent_fury_brew_button.png");
        ImageIcon potionOfRecovery_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\support_buttons\\potion_of_recovery_button.png");
        ImageIcon weaknessPotion_pic = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\support_buttons\\weakness_potion_button.png");

        //support buttons
        brewOfDecay = new JButton(brewOfDecay_pic);
        elixirOfResilience = new JButton(elixirOfResilience_pic);
        potentFuryBrew = new JButton(potentFuryBrew_pic);
        potionOfRecovery = new JButton(potionOfRecovery_pic);
        weaknessPotion = new JButton(weaknessPotion_pic);

        //adjustments for support buttons
        brewOfDecay.setContentAreaFilled(false);
        brewOfDecay.setBorderPainted(false);
        brewOfDecay.setFocusable(false);
        brewOfDecay.addActionListener(this);
        brewOfDecay.setBounds(0,560, 140, 140);

        elixirOfResilience.setContentAreaFilled(false);
        elixirOfResilience.setBorderPainted(false);
        elixirOfResilience.setFocusable(false);
        elixirOfResilience.addActionListener(this);
        elixirOfResilience.setBounds(140,560, 140, 140);

        potentFuryBrew.setContentAreaFilled(false);
        potentFuryBrew.setBorderPainted(false);
        potentFuryBrew.setFocusable(false);
        potentFuryBrew.addActionListener(this);
        potentFuryBrew.setBounds(280,560, 140, 140);

        potionOfRecovery.setContentAreaFilled(false);
        potionOfRecovery.setBorderPainted(false);
        potionOfRecovery.setFocusable(false);
        potionOfRecovery.addActionListener(this);
        potionOfRecovery.setBounds(420,560, 140, 140);

        weaknessPotion.setContentAreaFilled(false);
        weaknessPotion.setBorderPainted(false);
        weaknessPotion.setFocusable(false);
        weaknessPotion.addActionListener(this);
        weaknessPotion.setBounds(560,560, 140, 140);

        //adding of support buttons to the frame
        this.add(brewOfDecay);
        this.add(elixirOfResilience);
        this.add(potentFuryBrew);
        this.add(potionOfRecovery);
        this.add(weaknessPotion);
    }

    @Override
    public void actionPerformed(ActionEvent e){
         if (e.getSource() == frostbiteDagger) {
             itemName_label.setText("Frostbite Dagger");
             frostbiteDagger.setEnabled(false);
         } else if (e.getSource() == infernoScythe) {
             System.out.println("2");
             infernoScythe.setEnabled(false);
         } else if (e.getSource() == phoenixWingSpear) {
             System.out.println("3");
             phoenixWingSpear.setEnabled(false);
         } else if (e.getSource() == runeboundCrossbow) {
             System.out.println("4");
             runeboundCrossbow.setEnabled(false);
         } else if (e.getSource() == serpentsClaws) {
             System.out.println("5");
             serpentsClaws.setEnabled(false);
         } else if (e.getSource() == shadowReaverAxe) {
             System.out.println("6");
                 shadowReaverAxe.setEnabled(false);
         } else if (e.getSource() == soulshatterBlade) {
             System.out.println("7");
             soulshatterBlade.setEnabled(false);
         } else if (e.getSource() == starfallBow) {
             System.out.println("8");
             starfallBow.setEnabled(false);
         } else if (e.getSource() == thunderstrikeHammer) {
             System.out.println("9");
             thunderstrikeHammer.setEnabled(false);
         } else if (e.getSource() == voidbringerStaff) {
             System.out.println("10");
             voidbringerStaff.setEnabled(false);
         } else if (e.getSource() == aegisSteel) {
             System.out.println("11");
             aegisSteel.setEnabled(false);
         } else if (e.getSource() == armorersGemstone) {
             System.out.println("12");
             armorersGemstone.setEnabled(false);
         } else if (e.getSource() == barrierBracelet) {
             System.out.println("13");
             barrierBracelet.setEnabled(false);
         } else if (e.getSource() == defendersTalisman) {
             System.out.println("14");
             defendersTalisman.setEnabled(false);
         } else if (e.getSource() == guardiansAmulet) {
             System.out.println("15");
             guardiansAmulet.setEnabled(false);
         } else if (e.getSource() == protectionCharm) {
             System.out.println("16");
             protectionCharm.setEnabled(false);
         } else if (e.getSource() == safeguardingMedallion) {
             System.out.println("17");
             safeguardingMedallion.setEnabled(false);
         } else if (e.getSource() == sentinelsBarricade) {
             System.out.println("18");
             sentinelsBarricade.setEnabled(false);
         } else if (e.getSource() == shieldbearersPendant) {
             System.out.println("19");
             shieldbearersPendant.setEnabled(false);
         } else if (e.getSource() == wardingRing) {
             System.out.println("20");
             wardingRing.setEnabled(false);
         } else if (e.getSource() == brewOfDecay) {
             System.out.println("21");
             brewOfDecay.setEnabled(false);
         } else if (e.getSource() == elixirOfResilience) {
             System.out.println("22");
             elixirOfResilience.setEnabled(false);
         } else if (e.getSource() == potentFuryBrew) {
             System.out.println("23");
             potentFuryBrew.setEnabled(false);
         } else if (e.getSource() == potionOfRecovery) {
             System.out.println("24");
             potionOfRecovery.setEnabled(false);
         } else if (e.getSource() == weaknessPotion) {
             System.out.println("25");
             weaknessPotion.setEnabled(false);
         }
    }
}

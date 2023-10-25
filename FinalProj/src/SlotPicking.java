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
    JLabel itemDesc_label, itemName_label, desc_panel_label, slot_label, itemImg_label;

    //url for attack weapons buttons
    String frostbiteDagger_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\frostbite_dagger_button.png";
    String infernoScythe_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\inferno_scythe_button.png";
    String phoenixWingSpear_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\phoenix_wing_spear_button.png";
    String runeboundCrossbow_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\runebound_crossbow_button.png";
    String serpentsClaws_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\serpent's_claws_button.png";
    String shadowReaverAxe_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\shadow_reaver_axe_button.png";
    String soulshatterBlade_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\soulshatter_blade_button.png";
    String starfallBow_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\starfall_bow_button.png";
    String thunderstrikeHammer_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\thunderstrike_hammer_button.png";
    String voidbringerStaff_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\attack_buttons\\voidbringer_staff_button.png";

    //attack buttons images
    ImageIcon frostbiteDagger_pic = new ImageIcon(frostbiteDagger_button_url);
    ImageIcon infernoScythe_pic = new ImageIcon(infernoScythe_button_url);
    ImageIcon phoenixWingSpear_pic = new ImageIcon(phoenixWingSpear_button_url);
    ImageIcon runeboundCrossbow_pic = new ImageIcon(runeboundCrossbow_button_url);
    ImageIcon serpentsClaws_pic = new ImageIcon(serpentsClaws_button_url);
    ImageIcon shadowReaverAxe_pic = new ImageIcon(shadowReaverAxe_button_url);
    ImageIcon soulshatterBlade_pic = new ImageIcon(soulshatterBlade_button_url);
    ImageIcon starfallBow_pic = new ImageIcon(starfallBow_button_url);
    ImageIcon thunderstrikeHammer_pic = new ImageIcon(thunderstrikeHammer_button_url);
    ImageIcon voidbringerStaff_pic = new ImageIcon(voidbringerStaff_button_url);

    //url for defense artifacts buttons
    String aegisSteel_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\defense_buttons\\aegis_steel_button.png";
    String armorersGemstone_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\defense_buttons\\armorers_gemstone_button.png";
    String barrierBracelet_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\defense_buttons\\barrier_bracelet_button.png";
    String defendersTalisman_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\defense_buttons\\defenders_talisman_button.png";
    String guardiansAmulet_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\defense_buttons\\guardians_amulet_button.png";
    String protectionCharm_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\defense_buttons\\protection_charm_button.png";
    String safeguardingMedallion_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\defense_buttons\\safeguarding_medallion_button.png";
    String sentinelsBarricade_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\defense_buttons\\sentinels_barricade_button.png";
    String shieldbearersPendant_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\defense_buttons\\shieldbearers_pendant_button.png";
    String wardingRing_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\defense_buttons\\warding_ring_button.png";

    //defense buttons images
    ImageIcon aegisSteel_pic = new ImageIcon(aegisSteel_button_url);
    ImageIcon armorersGemstone_pic = new ImageIcon(armorersGemstone_button_url);
    ImageIcon barrierBracelet_pic = new ImageIcon(barrierBracelet_button_url);
    ImageIcon defendersTalisman_pic = new ImageIcon(defendersTalisman_button_url);
    ImageIcon guardiansAmulet_pic = new ImageIcon(guardiansAmulet_button_url);
    ImageIcon protectionCharm_pic = new ImageIcon(protectionCharm_button_url);
    ImageIcon safeguardingMedallion_pic = new ImageIcon(safeguardingMedallion_button_url);
    ImageIcon sentinelsBarricade_pic = new ImageIcon(sentinelsBarricade_button_url);
    ImageIcon shieldbearersPendant_pic = new ImageIcon(shieldbearersPendant_button_url);
    ImageIcon wardingRing_pic = new ImageIcon(wardingRing_button_url);

    //url for support potions buttons
    String brewOfDecay_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\support_buttons\\brew_of_decay_button.png";
    String elixirOfResilience_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\support_buttons\\elixir_of_resilience_button.png";
    String potentFuryBrew_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\support_buttons\\potent_fury_brew_button.png";
    String potionOfRecovery_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\support_buttons\\potion_of_recovery_button.png";
    String weaknessPotion_button_url = "C:\\Users\\User\\FinalProj\\src\\assets\\support_buttons\\weakness_potion_button.png";

    //support buttons images
    ImageIcon brewOfDecay_pic = new ImageIcon(brewOfDecay_button_url);
    ImageIcon elixirOfResilience_pic = new ImageIcon(elixirOfResilience_button_url);
    ImageIcon potentFuryBrew_pic = new ImageIcon(potentFuryBrew_button_url);
    ImageIcon potionOfRecovery_pic = new ImageIcon(potionOfRecovery_button_url);
    ImageIcon weaknessPotion_pic = new ImageIcon(weaknessPotion_button_url);

     SlotPicking(){
        int width = 1005;
        int height = 735;

        ImageIcon slot_img = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\skill_panel2.jpg");
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

        slot_label = new JLabel();
        slot_label.setIcon(slot_img);
        slot_label.setBounds(-3,0, 740,735);
        this.add(slot_label);
    }

    public void DescPanel(){
         ImageIcon desc_img = new ImageIcon("C:\\Users\\User\\FinalProj\\src\\assets\\desc_panel.png");
         desc_panel = new JPanel();
         desc_panel.setBounds(731,0,260, 735);
         desc_panel.setLayout(new BorderLayout());

         itemImg_label = new JLabel();
         itemDesc_label = new JLabel();
         itemName_label = new JLabel();
         desc_panel_label = new JLabel();

         itemImg_label.setOpaque(false);

         desc_panel_label.setIcon(desc_img);
         desc_panel_label.setBounds(0,0, 260, 735);

         itemName_label.setBounds(75, 268, 260, 30);
         itemDesc_label.setBounds(50, 280, 200,150);

         desc_panel.add(itemImg_label);
         desc_panel.add(itemName_label);
         desc_panel.add(itemDesc_label);
         desc_panel.add(desc_panel_label);
         this.add(desc_panel);
    }
    public void AttackButtons() {
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
        frostbiteDagger.addMouseListener(createMouseListener("Frostbite Dagger", "Description for Frostbite Dagger",frostbiteDagger_pic));
        frostbiteDagger.setBounds(6, 15, 140, 140);

        infernoScythe.setContentAreaFilled(false);
        infernoScythe.setBorderPainted(false);
        infernoScythe.setFocusable(false);
        infernoScythe.addActionListener(this);
        infernoScythe.addMouseListener(createMouseListener("Inferno Scythe", "Description for Inferno Scythe",infernoScythe_pic));
        infernoScythe.setBounds(155, 15, 140, 140);

        phoenixWingSpear.setContentAreaFilled(false);
        phoenixWingSpear.setBorderPainted(false);
        phoenixWingSpear.setFocusable(false);
        phoenixWingSpear.addActionListener(this);
        phoenixWingSpear.addMouseListener(createMouseListener("Phoenix Wing Spear", "Description for Phoenix Wing Spear",phoenixWingSpear_pic));
        phoenixWingSpear.setBounds(300, 15, 140, 140);

        runeboundCrossbow.setContentAreaFilled(false);
        runeboundCrossbow.setBorderPainted(false);
        runeboundCrossbow.setFocusable(false);
        runeboundCrossbow.addActionListener(this);
        runeboundCrossbow.addMouseListener(createMouseListener("Runebound Crossbow", "Description for Runebound Crossbow",runeboundCrossbow_pic));
        runeboundCrossbow.setBounds(440, 15, 140, 140);

        serpentsClaws.setContentAreaFilled(false);
        serpentsClaws.setBorderPainted(false);
        serpentsClaws.setFocusable(false);
        serpentsClaws.addActionListener(this);
        serpentsClaws.addMouseListener(createMouseListener("Serpent's Claws", "Description for Serpent's Claws",serpentsClaws_pic));
        serpentsClaws.setBounds(583, 15, 140, 140);

        shadowReaverAxe.setContentAreaFilled(false);
        shadowReaverAxe.setBorderPainted(false);
        shadowReaverAxe.setFocusable(false);
        shadowReaverAxe.addActionListener(this);
        shadowReaverAxe.addMouseListener(createMouseListener("Shadow Reaver Axe", "Description for Shadow Reaver Axe",shadowReaverAxe_pic));
        shadowReaverAxe.setBounds(6, 148, 140, 140);

        soulshatterBlade.setContentAreaFilled(false);
        soulshatterBlade.setBorderPainted(false);
        soulshatterBlade.setFocusable(false);
        soulshatterBlade.addActionListener(this);
        soulshatterBlade.addMouseListener(createMouseListener("Soulshatter Blade","Description for Soulshatter Blade", soulshatterBlade_pic));
        soulshatterBlade.setBounds(155, 148, 140, 140);

        starfallBow.setContentAreaFilled(false);
        starfallBow.setBorderPainted(false);
        starfallBow.setFocusable(false);
        starfallBow.addActionListener(this);
        starfallBow.addMouseListener(createMouseListener("Starfall Bow", "Description for Starfall Bow",starfallBow_pic));
        starfallBow.setBounds(291, 148, 140, 140);

        thunderstrikeHammer.setContentAreaFilled(false);
        thunderstrikeHammer.setBorderPainted(false);
        thunderstrikeHammer.setFocusable(false);
        thunderstrikeHammer.addActionListener(this);
        thunderstrikeHammer.addMouseListener(createMouseListener("Thunderstrike Hammer", "Description for Thunderstrike Hammer",thunderstrikeHammer_pic));
        thunderstrikeHammer.setBounds(435, 148, 140, 140);

        voidbringerStaff.setContentAreaFilled(false);
        voidbringerStaff.setBorderPainted(false);
        voidbringerStaff.setFocusable(false);
        voidbringerStaff.addActionListener(this);
        voidbringerStaff.addMouseListener(createMouseListener("Voidbringer Staff", "Description for Voidbringer Staff",voidbringerStaff_pic));
        voidbringerStaff.setBounds(580, 148, 140, 140);

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
        aegisSteel.addMouseListener(createMouseListener("Aegis Steel", "Description for Aegis Steel",aegisSteel_pic));
        aegisSteel.setBounds(6, 285, 140, 140);

        armorersGemstone.setContentAreaFilled(false);
        armorersGemstone.setBorderPainted(false);
        armorersGemstone.setFocusable(false);
        armorersGemstone.addActionListener(this);
        armorersGemstone.addMouseListener(createMouseListener("Armorer's Gemstone", "Description for Armorer's Gemstone",armorersGemstone_pic));
        armorersGemstone.setBounds(155, 285, 140, 140);

        barrierBracelet.setContentAreaFilled(false);
        barrierBracelet.setBorderPainted(false);
        barrierBracelet.setFocusable(false);
        barrierBracelet.addActionListener(this);
        barrierBracelet.addMouseListener(createMouseListener("Barrier Bracelet", "Description for Barrier Bracelet",barrierBracelet_pic));
        barrierBracelet.setBounds(299, 285, 140, 140);

        defendersTalisman.setContentAreaFilled(false);
        defendersTalisman.setBorderPainted(false);
        defendersTalisman.setFocusable(false);
        defendersTalisman.addActionListener(this);
        defendersTalisman.addMouseListener(createMouseListener("Defender's Talisman", "Description for Defender's Talisman",defendersTalisman_pic));
        defendersTalisman.setBounds(439, 285, 140, 140);

        guardiansAmulet.setContentAreaFilled(false);
        guardiansAmulet.setBorderPainted(false);
        guardiansAmulet.setFocusable(false);
        guardiansAmulet.addActionListener(this);
        guardiansAmulet.addMouseListener(createMouseListener("Guardian's Amulet", "Description for Guardian's Amulet",guardiansAmulet_pic));
        guardiansAmulet.setBounds(585, 285, 140, 140);

        protectionCharm.setContentAreaFilled(false);
        protectionCharm.setBorderPainted(false);
        protectionCharm.setFocusable(false);
        protectionCharm.addActionListener(this);
        protectionCharm.addMouseListener(createMouseListener("Protection Charm", "Description for Protection Charm",protectionCharm_pic));
        protectionCharm.setBounds(6, 420, 140, 140);

        safeguardingMedallion.setContentAreaFilled(false);
        safeguardingMedallion.setBorderPainted(false);
        safeguardingMedallion.setFocusable(false);
        safeguardingMedallion.addActionListener(this);
        safeguardingMedallion.addMouseListener(createMouseListener("Safeguarding Medallion", "Description for Safeguarding Medallion",safeguardingMedallion_pic));
        safeguardingMedallion.setBounds(155, 420, 140, 140);

        sentinelsBarricade.setContentAreaFilled(false);
        sentinelsBarricade.setBorderPainted(false);
        sentinelsBarricade.setFocusable(false);
        sentinelsBarricade.addActionListener(this);
        sentinelsBarricade.addMouseListener(createMouseListener("Sentinel's Barricade", "Description for Sentinel's Barricade",sentinelsBarricade_pic));
        sentinelsBarricade.setBounds(299, 420, 140, 140);

        shieldbearersPendant.setContentAreaFilled(false);
        shieldbearersPendant.setBorderPainted(false);
        shieldbearersPendant.setFocusable(false);
        shieldbearersPendant.addActionListener(this);
        shieldbearersPendant.addMouseListener(createMouseListener("Shieldbearer's Pendant", "Description for Shieldbearer's Pendant",shieldbearersPendant_pic));
        shieldbearersPendant.setBounds(438, 420, 140, 140);

        wardingRing.setContentAreaFilled(false);
        wardingRing.setBorderPainted(false);
        wardingRing.setFocusable(false);
        wardingRing.addActionListener(this);
        wardingRing.addMouseListener(createMouseListener("Warding Ring", "Description for Warding Ring",wardingRing_pic));
        wardingRing.setBounds(585, 420, 140, 140);

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
        brewOfDecay.addMouseListener(createMouseListener("Brew Of Decay", "Description for Brew Of Decay",brewOfDecay_pic));
        brewOfDecay.setBounds(6,560, 140, 140);

        elixirOfResilience.setContentAreaFilled(false);
        elixirOfResilience.setBorderPainted(false);
        elixirOfResilience.setFocusable(false);
        elixirOfResilience.addActionListener(this);
        elixirOfResilience.addMouseListener(createMouseListener("Elixir Of Resilience","Description for Elixir Of Resistance", elixirOfResilience_pic));
        elixirOfResilience.setBounds(155,560, 140, 140);

        potentFuryBrew.setContentAreaFilled(false);
        potentFuryBrew.setBorderPainted(false);
        potentFuryBrew.setFocusable(false);
        potentFuryBrew.addActionListener(this);
        potentFuryBrew.addMouseListener(createMouseListener("Potent Fury Brew", "Description for Potent Fury Brew",potentFuryBrew_pic));
        potentFuryBrew.setBounds(299,560, 140, 140);

        potionOfRecovery.setContentAreaFilled(false);
        potionOfRecovery.setBorderPainted(false);
        potionOfRecovery.setFocusable(false);
        potionOfRecovery.addActionListener(this);
        potionOfRecovery.addMouseListener(createMouseListener("Potion Of Recovery", "Description for Potion Of Recovery",potionOfRecovery_pic));
        potionOfRecovery.setBounds(438,560, 140, 140);

        weaknessPotion.setContentAreaFilled(false);
        weaknessPotion.setBorderPainted(false);
        weaknessPotion.setFocusable(false);
        weaknessPotion.addActionListener(this);
        weaknessPotion.addMouseListener(createMouseListener("Weakness Potion", "Description for Weakness Potion",weaknessPotion_pic));
        weaknessPotion.setBounds(585,560, 140, 140);

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
             itemName_label.setText("Inferno Scythe");
             infernoScythe.setEnabled(false);
         } else if (e.getSource() == phoenixWingSpear) {
             itemName_label.setText("Phoenix Wing Spear");
             phoenixWingSpear.setEnabled(false);
         } else if (e.getSource() == runeboundCrossbow) {
             itemName_label.setText("Runebound Crossbow");
             runeboundCrossbow.setEnabled(false);
         } else if (e.getSource() == serpentsClaws) {
             itemName_label.setText("Serpent's Claws");
             serpentsClaws.setEnabled(false);
         } else if (e.getSource() == shadowReaverAxe) {
             itemName_label.setText("Shadow Reaver Axe");
             shadowReaverAxe.setEnabled(false);
         } else if (e.getSource() == soulshatterBlade) {
             itemName_label.setText("Soulshatter Blade");
             soulshatterBlade.setEnabled(false);
         } else if (e.getSource() == starfallBow) {
             itemName_label.setText("Starfall Bow");
             starfallBow.setEnabled(false);
         } else if (e.getSource() == thunderstrikeHammer) {
             itemName_label.setText("Thunderstrike Hammer");
             thunderstrikeHammer.setEnabled(false);
         } else if (e.getSource() == voidbringerStaff) {
             itemName_label.setText("Voidbringer Staff");
             voidbringerStaff.setEnabled(false);
         } else if (e.getSource() == aegisSteel) {
             itemName_label.setText("Aegis Steel");
             aegisSteel.setEnabled(false);
         } else if (e.getSource() == armorersGemstone) {
             itemName_label.setText("Armorer's Gemstone");
             armorersGemstone.setEnabled(false);
         } else if (e.getSource() == barrierBracelet) {
             itemName_label.setText("Barrier Bracelet");
             barrierBracelet.setEnabled(false);
         } else if (e.getSource() == defendersTalisman) {
             itemName_label.setText("Defender's Talisman");
             defendersTalisman.setEnabled(false);
         } else if (e.getSource() == guardiansAmulet) {
             itemName_label.setText("Guardian's Amulet");
             guardiansAmulet.setEnabled(false);
         } else if (e.getSource() == protectionCharm) {
             itemName_label.setText("Protection Charm");
             protectionCharm.setEnabled(false);
         } else if (e.getSource() == safeguardingMedallion) {
             itemName_label.setText("Safeguarding Medallion");
             safeguardingMedallion.setEnabled(false);
         } else if (e.getSource() == sentinelsBarricade) {
             itemName_label.setText("Sentinel's Barricade");
             sentinelsBarricade.setEnabled(false);
         } else if (e.getSource() == shieldbearersPendant) {
             itemName_label.setText("Shieldbearer's Pendant");
             shieldbearersPendant.setEnabled(false);
         } else if (e.getSource() == wardingRing) {
             itemName_label.setText("Warding Ring");
             wardingRing.setEnabled(false);
         } else if (e.getSource() == brewOfDecay) {
             itemName_label.setText("Brew Of Decay");
             brewOfDecay.setEnabled(false);
         } else if (e.getSource() == elixirOfResilience) {
             itemName_label.setText("Elixir Of Resilience");
             elixirOfResilience.setEnabled(false);
         } else if (e.getSource() == potentFuryBrew) {
             itemName_label.setText("Potent Fury Brew");
             potentFuryBrew.setEnabled(false);
         } else if (e.getSource() == potionOfRecovery) {
             itemName_label.setText("Potion Of Recovery");
             potionOfRecovery.setEnabled(false);
         } else if (e.getSource() == weaknessPotion) {
             itemName_label.setText("Weakness Potion");
             weaknessPotion.setEnabled(false);
         }
    }
    private MouseAdapter createMouseListener(String name, String desc, ImageIcon image) {
        return new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (((JButton)e.getSource()).isEnabled()) {
                    if (e.getSource() == starfallBow||e.getSource() == thunderstrikeHammer||e.getSource()==voidbringerStaff){
                        itemImg_label.setBounds(66,71,140,140);
                    }else {
                        itemImg_label.setBounds(73, 73, 140, 140);
                    }
                    itemName_label.setText(name);
                    itemImg_label.setIcon(image);
                    itemDesc_label.setText(desc);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                itemName_label.setText("");
                itemImg_label.setIcon(null);
                itemDesc_label.setText(null);
            }
        };
    }
}

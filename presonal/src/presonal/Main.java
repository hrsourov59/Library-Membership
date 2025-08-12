

/*package presonal;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Main frame
        JFrame frame = new JFrame("Library Membership");
        frame.setSize(600, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.WHITE);

        // Welcome label
        JLabel welcomeLabel = new JLabel("Welcome to MU Central Library");
        welcomeLabel.setFont(new Font("Serif", Font.BOLD, 28));
        welcomeLabel.setForeground(Color.BLACK);
        welcomeLabel.setBounds(100, 30, 400, 40);
        frame.add(welcomeLabel);

        // Center image
        ImageIcon imageIcon = new ImageIcon("image/image-5144.jpg");
        Image scaledImage = imageIcon.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setBounds(100, 100, 400, 300);
        frame.add(imageLabel);

        // Bottom panel
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(null);
        bottomPanel.setBackground(Color.LIGHT_GRAY);
        bottomPanel.setBounds(0, 420, 600, 120);
        frame.add(bottomPanel);

        // Info label
        JLabel infoLabel = new JLabel("For Membership Application");
        infoLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
        infoLabel.setForeground(Color.BLACK);
        infoLabel.setBounds(180, 20, 250, 30);
        bottomPanel.add(infoLabel);

        // Click button
        JButton clickButton = new JButton("Click Here");
        clickButton.setBackground(Color.GREEN);
        clickButton.setForeground(Color.BLACK);
        clickButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        clickButton.setFocusPainted(false);
        clickButton.setBounds(230, 60, 130, 40);
        bottomPanel.add(clickButton);

        // Button action
        clickButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame newPage = new JFrame("Membership Details");
                newPage.setSize(600, 700);
                newPage.setLocationRelativeTo(null);
                newPage.getContentPane().setBackground(Color.DARK_GRAY);
                newPage.setLayout(null);

                Color lightYellow = new Color(255, 255, 204);

                JLabel formLabel = new JLabel("Membership Benefits & Rules");
                formLabel.setFont(new Font("Serif", Font.BOLD, 24));
                formLabel.setForeground(lightYellow);
                formLabel.setBounds(120, 30, 400, 30);
                newPage.add(formLabel);

                // Features
                JLabel featuresLabel = new JLabel("Features:");
                featuresLabel.setFont(new Font("Serif", Font.BOLD, 20));
                featuresLabel.setForeground(lightYellow);
                featuresLabel.setBounds(80, 90, 250, 25);
                newPage.add(featuresLabel);

                JLabel f1 = new JLabel("• Access to digital resources");
                f1.setForeground(lightYellow);
                f1.setBounds(100, 120, 300, 20);
                newPage.add(f1);

                JLabel f2 = new JLabel("• Borrow up to 5 books/month");
                f2.setForeground(lightYellow);
                f2.setBounds(100, 145, 300, 20);
                newPage.add(f2);

                JLabel f3 = new JLabel("• Study room reservation privileges");
                f3.setForeground(lightYellow);
                f3.setBounds(100, 170, 350, 20);
                newPage.add(f3);

                // Rules
                JLabel rulesLabel = new JLabel("Rules:");
                rulesLabel.setFont(new Font("Serif", Font.BOLD, 20));
                rulesLabel.setForeground(lightYellow);
                rulesLabel.setBounds(80, 210, 250, 25);
                newPage.add(rulesLabel);

                JLabel r1 = new JLabel("• Return books within 15 days");
                r1.setForeground(lightYellow);
                r1.setBounds(100, 240, 300, 20);
                newPage.add(r1);

                JLabel r2 = new JLabel("• Maintain silence in the library");
                r2.setForeground(lightYellow);
                r2.setBounds(100, 265, 300, 20);
                newPage.add(r2);

                JLabel r3 = new JLabel("• Membership is non-transferable");
                r3.setForeground(lightYellow);
                r3.setBounds(100, 290, 300, 20);
                newPage.add(r3);

                // Terms and conditions radio
                JRadioButton agreeBtn = new JRadioButton("I agree to the terms and conditions");
                agreeBtn.setBounds(80, 330, 300, 25);
                agreeBtn.setBackground(Color.DARK_GRAY);
                agreeBtn.setForeground(lightYellow);
                agreeBtn.setFont(new Font("SansSerif", Font.PLAIN, 14));
                newPage.add(agreeBtn);

                
                JLabel checkLabel = new JLabel("");
                checkLabel.setBounds(400, 330, 30, 25);
                checkLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
                checkLabel.setForeground(Color.GREEN);
                newPage.add(checkLabel);

                // Next button (initially disabled)
                JButton nextButton = new JButton("Next");
                nextButton.setBackground(Color.GREEN);
                nextButton.setForeground(Color.BLACK);
                nextButton.setFont(new Font("SansSerif", Font.BOLD, 16));
                nextButton.setBounds(220, 380, 150, 40);
                nextButton.setEnabled(false);
                newPage.add(nextButton);

                // Listener for ✔ and enabling Next
                agreeBtn.addItemListener(new ItemListener() {
                    public void itemStateChanged(ItemEvent e) {
                        boolean selected = agreeBtn.isSelected();
                        nextButton.setEnabled(selected);
                    }
                });

                newPage.setVisible(true);
            }
        });

        frame.setVisible(true);
    }
}*/

package presonal;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Main frame
        JFrame frame = new JFrame("Library Membership");
        frame.setSize(600, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.WHITE);

        // Welcome label
        JLabel welcomeLabel = new JLabel("Welcome to MU Central Library");
        welcomeLabel.setFont(new Font("Serif", Font.BOLD, 28));
        welcomeLabel.setForeground(Color.BLACK);
        welcomeLabel.setBounds(100, 30, 400, 40);
        frame.add(welcomeLabel);

        // Center image
        ImageIcon imageIcon = new ImageIcon("image/image-5144.jpg");
        Image scaledImage = imageIcon.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setBounds(100, 100, 400, 300);
        frame.add(imageLabel);

        // Bottom panel
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(null);
        bottomPanel.setBackground(Color.LIGHT_GRAY);
        bottomPanel.setBounds(0, 420, 600, 120);
        frame.add(bottomPanel);

        // Info label
        JLabel infoLabel = new JLabel("For Membership Application");
        infoLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
        infoLabel.setForeground(Color.BLACK);
        infoLabel.setBounds(180, 20, 250, 30);
        bottomPanel.add(infoLabel);

        // Click button
        JButton clickButton = new JButton("Click Here");
        clickButton.setBackground(Color.GREEN);
        clickButton.setForeground(Color.BLACK);
        clickButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        clickButton.setFocusPainted(false);
        clickButton.setBounds(230, 60, 130, 40);
        bottomPanel.add(clickButton);

        // Button action
        clickButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame newPage = new JFrame("Membership Details");
                newPage.setSize(600, 700);
                newPage.setLocationRelativeTo(null);
                newPage.getContentPane().setBackground(Color.DARK_GRAY);
                newPage.setLayout(null);

                Color lightYellow = new Color(255, 255, 204);

                JLabel formLabel = new JLabel("Membership Benefits & Rules");
                formLabel.setFont(new Font("Serif", Font.BOLD, 24));
                formLabel.setForeground(lightYellow);
                formLabel.setBounds(120, 30, 400, 30);
                newPage.add(formLabel);

                // Features
                JLabel featuresLabel = new JLabel("Features:");
                featuresLabel.setFont(new Font("Serif", Font.BOLD, 20));
                featuresLabel.setForeground(lightYellow);
                featuresLabel.setBounds(80, 90, 250, 25);
                newPage.add(featuresLabel);

                JLabel f1 = new JLabel("• Access to digital resources");
                f1.setForeground(lightYellow);
                f1.setBounds(100, 120, 300, 20);
                newPage.add(f1);

                JLabel f2 = new JLabel("• Borrow up to 5 books/month");
                f2.setForeground(lightYellow);
                f2.setBounds(100, 145, 300, 20);
                newPage.add(f2);

                JLabel f3 = new JLabel("• Study room reservation privileges");
                f3.setForeground(lightYellow);
                f3.setBounds(100, 170, 350, 20);
                newPage.add(f3);

                // Rules
                JLabel rulesLabel = new JLabel("Rules:");
                rulesLabel.setFont(new Font("Serif", Font.BOLD, 20));
                rulesLabel.setForeground(lightYellow);
                rulesLabel.setBounds(80, 210, 250, 25);
                newPage.add(rulesLabel);

                JLabel r1 = new JLabel("• Return books within 15 days");
                r1.setForeground(lightYellow);
                r1.setBounds(100, 240, 300, 20);
                newPage.add(r1);

                JLabel r2 = new JLabel("• Maintain silence in the library");
                r2.setForeground(lightYellow);
                r2.setBounds(100, 265, 300, 20);
                newPage.add(r2);

                JLabel r3 = new JLabel("• Membership is non-transferable");
                r3.setForeground(lightYellow);
                r3.setBounds(100, 290, 300, 20);
                newPage.add(r3);

                // Terms and conditions radio
                JRadioButton agreeBtn = new JRadioButton("I agree to the terms and conditions");
                agreeBtn.setBounds(80, 330, 300, 25);
                agreeBtn.setBackground(Color.DARK_GRAY);
                agreeBtn.setForeground(lightYellow);
                agreeBtn.setFont(new Font("SansSerif", Font.PLAIN, 14));
                newPage.add(agreeBtn);

                JLabel checkLabel = new JLabel("");
                checkLabel.setBounds(400, 330, 30, 25);
                checkLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
                checkLabel.setForeground(Color.GREEN);
                newPage.add(checkLabel);

                // Next button (initially disabled)
                JButton nextButton = new JButton("Next");
                nextButton.setBackground(Color.GREEN);
                nextButton.setForeground(Color.BLACK);
                nextButton.setFont(new Font("SansSerif", Font.BOLD, 16));
                nextButton.setBounds(220, 380, 150, 40);
                nextButton.setEnabled(false);
                newPage.add(nextButton);

                // Listener for ✔ and enabling Next
                agreeBtn.addItemListener(new ItemListener() {
                    public void itemStateChanged(ItemEvent e) {
                        boolean selected = agreeBtn.isSelected();
                        nextButton.setEnabled(selected);
                    }
                });

                // Action for Next button
                nextButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFrame formPage = new JFrame("Application Form");
                        formPage.setSize(600, 700);
                        formPage.setLocationRelativeTo(null);
                        formPage.getContentPane().setBackground(Color.WHITE);
                        formPage.setLayout(null);

                        JLabel titleLabel = new JLabel("APPLICATION FORM");
                        titleLabel.setFont(new Font("Serif", Font.BOLD, 26));
                        titleLabel.setForeground(Color.BLUE);
                        titleLabel.setBounds(170, 30, 300, 30);
                        formPage.add(titleLabel);

                        // Labels and fields
                        String[] labels = {
                            "Name:", "Department:", "Batch:", "Gender:", "Blood Group:",
                            "Mobile Number:", "Email:"
                        };

                        int y = 80;
                        JTextField nameField = new JTextField();
                        JTextField deptField = new JTextField();
                        JTextField batchField = new JTextField();
                        JComboBox<String> genderBox = new JComboBox<>(new String[]{"Male", "Female", "Others"});
                        JTextField bloodField = new JTextField();
                        JTextField mobileField = new JTextField();
                        JTextField emailField = new JTextField();

                        JTextField[] fields = {
                            nameField, deptField, batchField, bloodField, mobileField, emailField
                        };

                        for (int i = 0; i < labels.length; i++) {
                            JLabel lbl = new JLabel(labels[i]);
                            lbl.setFont(new Font("SansSerif", Font.PLAIN, 16));
                            lbl.setBounds(80, y, 150, 25);
                            formPage.add(lbl);

                            if (labels[i].equals("Gender:")) {
                                genderBox.setBounds(240, y, 200, 25);
                                formPage.add(genderBox);
                            } else {
                                fields[i < 3 ? i : i - 1].setBounds(240, y, 200, 25);
                                formPage.add(fields[i < 3 ? i : i - 1]);
                            }

                            y += 40;
                        }

                        // Confirm button
                        JButton confirmButton = new JButton("Confirm");
                        confirmButton.setBounds(220, y + 20, 150, 40);
                        confirmButton.setBackground(Color.GREEN);
                        confirmButton.setForeground(Color.BLACK);
                        confirmButton.setFont(new Font("SansSerif", Font.BOLD, 16));
                        formPage.add(confirmButton);

                        confirmButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                //JOptionPane.showMessageDialog(formPage, "Application Submitted Successfully!");
                            	JFrame successPage = new JFrame("Submission Successful");
                            	successPage.setSize(600, 700);
                            	successPage.setLocationRelativeTo(null);
                            	successPage.getContentPane().setBackground(Color.WHITE);
                            	successPage.setLayout(null);

                            	// Top panel with message
                            	JPanel topPanel = new JPanel();
                            	topPanel.setBackground(new Color(173, 216, 230)); // light blue
                            	topPanel.setBounds(0, 0, 600, 100);
                            	topPanel.setLayout(null);

                            	JLabel congratsLabel = new JLabel(" YOUR APPLICATION SUBMITTED SUCCESSFULLY");
                            	congratsLabel.setFont(new Font("Serif", Font.BOLD, 18));
                            	congratsLabel.setForeground(Color.BLACK);
                            	congratsLabel.setBounds(30, 30, 540, 30);
                            	topPanel.add(congratsLabel);

                            	successPage.add(topPanel);

                            	// Bottom image
                            	ImageIcon bottomImageIcon = new ImageIcon("new/newimage.jpg"); 
                            	Image bottomScaledImage = bottomImageIcon.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
                            	ImageIcon bottomScaledIcon = new ImageIcon(bottomScaledImage);

                            	JLabel imageLabel = new JLabel(bottomScaledIcon);
                            	imageLabel.setBounds(100, 150, 400, 400); // Positioned below the top panel
                            	successPage.add(imageLabel);

                            	successPage.setVisible(true);
                            }
                        });

                        formPage.setVisible(true);
                    }
                });

                newPage.setVisible(true);
            }
        });

        frame.setVisible(true);
    }
}


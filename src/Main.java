/**
 * Sources:
 * stackoverflow.com
 * docs.oracle.com
 * flaticon.com
 * geeksforgeeks.org
 * coderanch.com
 */


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class Main extends JFrame {

    public static final Font font = new Font("Calibri", Font.PLAIN, 20);
    private static final JFrame frame = new JFrame("ATM");
    private static final JPanel startPanel = new JPanel();
    private static final JPanel passwordPanel = new JPanel();
    private static final JPanel mainPanel = new JPanel();
    private static final JPanel changePassPanel = new JPanel();
    private static final JPanel balancePanel = new JPanel();
    private static final JPanel withdrawPanel = new JPanel();
    private static final JPanel transferPanel = new JPanel();
    private static final JPanel successPanel = new JPanel();
    private static final JLabel choose_lang_per_label = new JLabel("زبان خود را انتخاب کنید");
    private static final JLabel choose_lang_eng_label = new JLabel("Choose Your Language");
    private static final JLabel warningLabel = new JLabel("");
    private static final JLabel enterPassLabel1 = new JLabel();
    private static final JLabel enterPassLabel2 = new JLabel();
    private static final JLabel balanceLabel = new JLabel("");
    private static final JLabel moneyLabel = new JLabel("");
    private static final JLabel cardNumberLabel = new JLabel("");
    private static final JLabel successLabel = new JLabel("");
    private static final JButton choose_lang_per_button = new JButton("فارسی");
    private static final JButton choose_lang_eng_button = new JButton("English");
    private static final JButton submitButtonForEnterPass = new JButton("");
    private static final JButton submitButtonForChangePass = new JButton("");
    private static final JButton submitButtonForTransfer = new JButton("");
    private static final JButton changePassButton = new JButton("");
    private static final JButton transferButton = new JButton("");
    private static final JButton withdrawButton = new JButton("");
    private static final JButton balanceButton = new JButton("");
    private static final TextField passTextField1 = new TextField("");
    private static final TextField passTextField2 = new TextField("");
    private static final TextField moneyTextField = new TextField("");
    private static final TextField cardNumberTextField = new TextField("");
    private static final Color DEFAULT_COLOR = Color.green;
    private static final GridBagConstraints gbc = new GridBagConstraints();
    private static final Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
    private static final Dimension frameDimension = new Dimension();
    private static final double BALANCE = (int) (Math.ceil(Math.random() * 100)) * 10000;
    private static String language = ""; //can be Per or Eng
    private static String currentPanel = "startPanel";
    private static boolean passFlag = true;
    public static final ActionListener actionListener = createActionListener();

    public static void main(String[] args) throws IOException {
        setUI();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        InputStream imgStream = Main.class.getResourceAsStream("atm.png");
        BufferedImage img = ImageIO.read(imgStream);
        frame.setIconImage(img);

        gbc.insets = new Insets(10, 10, 10, 10);

        startPanel.setLayout(new GridBagLayout());
        startPanel.setBackground(DEFAULT_COLOR); //************

        passwordPanel.setLayout(new GridBagLayout());
        passwordPanel.setBackground(DEFAULT_COLOR);

        mainPanel.setLayout(new GridBagLayout());
        mainPanel.setBackground(DEFAULT_COLOR);

        changePassPanel.setLayout(new GridBagLayout());
        changePassPanel.setBackground(DEFAULT_COLOR);

        balancePanel.setLayout(new GridBagLayout());
        balancePanel.setBackground(DEFAULT_COLOR);

        withdrawPanel.setLayout(new GridBagLayout());
        withdrawPanel.setBackground(DEFAULT_COLOR);

        transferPanel.setLayout(new GridBagLayout());
        transferPanel.setBackground(DEFAULT_COLOR);

        successPanel.setLayout(new GridBagLayout());
        successPanel.setBackground(DEFAULT_COLOR);


        choose_lang_per_label.setHorizontalAlignment(SwingConstants.RIGHT);
        choose_lang_eng_label.setHorizontalAlignment(SwingConstants.LEFT);
        enterPassLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        enterPassLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        warningLabel.setHorizontalAlignment(SwingConstants.CENTER);
        balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        successLabel.setHorizontalAlignment(SwingConstants.CENTER);
        moneyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cardNumberLabel.setHorizontalAlignment(SwingConstants.CENTER);


        warningLabel.setForeground(Color.red);


        choose_lang_per_button.setFocusable(false);
        choose_lang_eng_button.setFocusable(false);
        submitButtonForEnterPass.setFocusable(false);
        submitButtonForChangePass.setFocusable(false);
        transferButton.setFocusable(false);
        withdrawButton.setFocusable(false);
        balanceButton.setFocusable(false);
        changePassButton.setFocusable(false);
        submitButtonForTransfer.setFocusable(false);

        choose_lang_per_label.setFont(font);
        choose_lang_eng_label.setFont(font);
        enterPassLabel1.setFont(font);
        enterPassLabel2.setFont(font);
        warningLabel.setFont(font);
        balanceLabel.setFont(font);
        successLabel.setFont(font);
        moneyLabel.setFont(font);
        cardNumberLabel.setFont(font);
        choose_lang_per_button.setFont(font);
        choose_lang_eng_button.setFont(font);
        submitButtonForEnterPass.setFont(font);
        submitButtonForChangePass.setFont(font);
        submitButtonForTransfer.setFont(font);
        passTextField1.setFont(font);
        passTextField2.setFont(font);
        moneyTextField.setFont(font);
        cardNumberTextField.setFont(font);
        transferButton.setFont(font);
        withdrawButton.setFont(font);
        balanceButton.setFont(font);
        changePassButton.setFont(font);


        choose_lang_per_button.addActionListener(actionListener);
        choose_lang_eng_button.addActionListener(actionListener);
        submitButtonForEnterPass.addActionListener(actionListener);
        submitButtonForChangePass.addActionListener(actionListener);
        transferButton.addActionListener(actionListener);
        withdrawButton.addActionListener(actionListener);
        balanceButton.addActionListener(actionListener);
        changePassButton.addActionListener(actionListener);
        submitButtonForTransfer.addActionListener(actionListener);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        startPanel.add(choose_lang_eng_button, gbc);
        gbc.gridx++;
        gbc.weightx = 1;
        startPanel.add(choose_lang_eng_label, gbc);
        gbc.gridx++;
        gbc.weightx = 1;
        startPanel.add(choose_lang_per_label, gbc);
        gbc.gridx++;
        gbc.weightx = 0;
        startPanel.add(choose_lang_per_button, gbc);


        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        passwordPanel.add(enterPassLabel1, gbc);
        gbc.gridy++;
        passwordPanel.add(passTextField1, gbc);
        gbc.gridy++;
        gbc.fill = GridBagConstraints.NONE;
        passwordPanel.add(submitButtonForEnterPass, gbc);
        gbc.gridy++;
        passwordPanel.add(warningLabel, gbc);
        gbc.gridy++;
        passwordPanel.add(new ReturnButton(), gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;


        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(withdrawButton, gbc);
        gbc.gridx++;
        gbc.weightx = 1;
        mainPanel.add(new JLabel(), gbc);
        gbc.weightx = 0;
        gbc.gridx++;
        mainPanel.add(changePassButton, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        mainPanel.add(transferButton, gbc);
        gbc.gridx++;
        gbc.weightx = 1;
        mainPanel.add(new JLabel(), gbc);
        gbc.weightx = 0;
        gbc.gridx++;
        mainPanel.add(balanceButton, gbc);
        gbc.gridx = 1;
        gbc.gridy++;
        gbc.weightx = 0;
        gbc.fill = GridBagConstraints.NONE;
        mainPanel.add(new ReturnButton(), gbc);


        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        changePassPanel.add(enterPassLabel2, gbc);
        gbc.gridy++;
        changePassPanel.add(passTextField2, gbc);
        gbc.gridy++;
        gbc.fill = GridBagConstraints.NONE;
        changePassPanel.add(submitButtonForChangePass, gbc);
        gbc.gridy++;
        changePassPanel.add(new ReturnButton(), gbc);


        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        balancePanel.add(balanceLabel, gbc);
        gbc.gridy++;
        gbc.fill = GridBagConstraints.NONE;
        balancePanel.add(new ReturnButton(), gbc);


        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.NONE;
        withdrawPanel.add(new WithdrawButton(100000), gbc);
        gbc.weightx = 1;
        gbc.gridx++;
        withdrawPanel.add(new JLabel(), gbc);
        gbc.weightx = 0;
        gbc.gridx++;
        withdrawPanel.add(new WithdrawButton(150000), gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        withdrawPanel.add(new WithdrawButton(200000), gbc);
        gbc.weightx = 1;
        gbc.gridx++;
        withdrawPanel.add(new JLabel(), gbc);
        gbc.weightx = 0;
        gbc.gridx++;
        withdrawPanel.add(new WithdrawButton(500000), gbc);
        gbc.gridx = 1;
        gbc.gridy++;
        withdrawPanel.add(new ReturnButton(), gbc);


        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        transferPanel.add(moneyLabel, gbc);
        gbc.gridy++;
        transferPanel.add(moneyTextField, gbc);
        gbc.gridy++;
        transferPanel.add(cardNumberLabel, gbc);
        gbc.gridy++;
        transferPanel.add(cardNumberTextField, gbc);
        gbc.gridy++;
        gbc.fill = GridBagConstraints.NONE;
        transferPanel.add(submitButtonForTransfer, gbc);
        gbc.gridy++;
        transferPanel.add(new ReturnButton(), gbc);


        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        successPanel.add(successLabel, gbc);
        gbc.gridy++;
        gbc.fill = GridBagConstraints.NONE;
        successPanel.add(new ReturnButton(), gbc);


        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(startPanel, gbc);

        frame.pack();
        frameDimension.width = (int) (frame.getSize().width * 1.2);
        frameDimension.height = (int) (frame.getSize().getHeight() * 4);
        if (frameDimension.width < screenDimension.width && frameDimension.height < screenDimension.height) {
            frame.setSize(frameDimension);
        }
        frame.setMinimumSize(frame.getSize());
        frame.setLocation((screenDimension.width - frame.getSize().width) / 2, (screenDimension.height - frame.getSize().height) / 2);
        frame.revalidate();
        frame.repaint();
        frame.setVisible(true);
    }

    private static void setUI() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            ex.printStackTrace(System.err);
        }
    }
    private static ActionListener createActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();
                if (src == choose_lang_per_button) {
                    language = "Per";
                    currentPanel = "passwordPanel";
                    successLabel.setText("عملیات با موفقیت انجام شد!");
                    enterPassLabel1.setText("رمز خود را وارد کنید");
                    submitButtonForEnterPass.setText("ثبت");
                    withdrawButton.setText("برداشت وجه");
                    transferButton.setText("کارت به کارت");
                    changePassButton.setText("تغییر رمز");
                    balanceButton.setText("اعلام موجودی");
                    replacePanel(startPanel, passwordPanel);
                }
                if (src == choose_lang_eng_button) {
                    successLabel.setText("Operation Completed Successfully!");
                    language = "Eng";
                    currentPanel = "passwordPanel";
                    enterPassLabel1.setText("Enter Your PIN");
                    submitButtonForEnterPass.setText("Submit");
                    withdrawButton.setText("Withdraw");
                    transferButton.setText("Transfer");
                    changePassButton.setText("Change PIN");
                    balanceButton.setText("Balance");
                    replacePanel(startPanel, passwordPanel);
                }
                if (src == submitButtonForEnterPass) {
                    warningLabel.setText("");
                    if (passTextField1.getText().isEmpty()) {
                        passFlag = false;
                    }
                    if (passTextField1.getText().length() < 4 && !passTextField1.getText().isEmpty()) {
                        if (language.equals("Per")) {
                            warningLabel.setText(warningLabel.getText() + " * " + "رمز کوتاه است");
                        } else if (language.equals("Eng")) {
                            warningLabel.setText(warningLabel.getText() + " * " + "PIN is too short");
                        }
                        passFlag = false;
                    }
                    if (passTextField1.getText().length() > 20 && !passTextField1.getText().isEmpty()) {
                        if (language.equals("Per")) {
                            warningLabel.setText(warningLabel.getText() + " * " + "رمز طولانی است");
                        } else if (language.equals("Eng")) {
                            warningLabel.setText(warningLabel.getText() + " * " + "PIN is too long");
                        }
                        passFlag = false;
                    }
                    if (!passTextField1.getText().matches("[0-9]+") && !passTextField1.getText().isEmpty()) {
                        if (language.equals("Per")) {
                            warningLabel.setText(warningLabel.getText() + " * " + "رمز تنها می تواند شامل ارقام باشد");
                        } else if (language.equals("Eng")) {
                            warningLabel.setText(warningLabel.getText() + " * " + "PIN can only contain numbers");
                        }
                        passFlag = false;
                    }
                    if (passFlag) {
                        currentPanel = "mainPanel";
                        replacePanel(passwordPanel, mainPanel);
                    }
                    passFlag = true;
                }
                if (src instanceof ReturnButton) {
                    switch (currentPanel) {
                        case "startPanel":
                            break;
                        case "passwordPanel":
                            replacePanel(passwordPanel, startPanel);
                            break;
                        case "mainPanel":
                            replacePanel(mainPanel, startPanel);
                            break;
                        case "changePassPanel":
                            replacePanel(changePassPanel, startPanel);
                            break;
                        case "balancePanel":
                            replacePanel(balancePanel, startPanel);
                            break;
                        case "successPanel":
                            replacePanel(successPanel, startPanel);
                            break;
                        case "withdrawPanel":
                            replacePanel(withdrawPanel, startPanel);
                            break;
                        case "transferPanel":
                            replacePanel(transferPanel, startPanel);
                            break;
                    }
                }
                if (src == changePassButton) {
                    if (language.equals("Per")) {
                        enterPassLabel2.setText("رمز جدید را وارد کنید");
                        submitButtonForChangePass.setText("تایید");
                    } else if (language.equals("Eng")) {
                        enterPassLabel2.setText("Enter New PIN");
                        submitButtonForChangePass.setText("Submit");
                    }
                    replacePanel(mainPanel, changePassPanel);
                    currentPanel = "changePassPanel";
                }
                if (src == balanceButton) {
                    if (language.equals("Per")) {
                        balanceLabel.setText("موجودی حساب شما: " + String.valueOf(BALANCE) + " ریال");
                    } else if (language.equals("Eng")) {
                        balanceLabel.setText("Your Balance is: " + String.valueOf(BALANCE) + " Rials");
                    }
                    replacePanel(mainPanel, balancePanel);
                    currentPanel = "balancePanel";
                }
                if (src == submitButtonForChangePass) {
                    replacePanel(changePassPanel, successPanel);
                    currentPanel = "successPanel";
                }
                if (src == withdrawButton) {
                    replacePanel(mainPanel, withdrawPanel);
                    currentPanel = "withdrawPanel";
                }
                if (src instanceof WithdrawButton) {
                    replacePanel(withdrawPanel, successPanel);
                    currentPanel = "successPanel";
                }
                if (src == transferButton) {
                    if (language.equals("Per")) {
                        moneyLabel.setText("مبلغ مورد نظر را وارد کنید:");
                        cardNumberLabel.setText("شماره کارت مقصد را وارد کنید:");
                        submitButtonForTransfer.setText("تایید");
                    } else if (language.equals("Eng")) {
                        moneyLabel.setText("Enter Amount of Money: ");
                        cardNumberLabel.setText("Enter Destination Card Number: ");
                        submitButtonForTransfer.setText("Submit");
                    }
                    replacePanel(mainPanel, transferPanel);
                    currentPanel = "transferPanel";
                }
                if (src == submitButtonForTransfer) {
                    replacePanel(transferPanel, successPanel);
                    currentPanel = "successPanel";
                }
            }
        };
    }

    private static void replacePanel(JPanel panelToRemove, JPanel panelToAdd) {
        if (panelToAdd.equals(passwordPanel)) {
            setPasswordPanelComponentsToEmpty();
        } else if (panelToAdd.equals(changePassPanel)) {
            passTextField2.setText("");
        } else if (panelToAdd.equals(transferPanel)) {
            moneyTextField.setText("");
            cardNumberTextField.setText("");
        }
        frame.remove(panelToRemove);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(panelToAdd, gbc);

        frame.pack();
        frameDimension.width = (int) (frame.getSize().width * 1.5);
        frameDimension.height = (int) (frame.getSize().getHeight() * 5);
        if (frameDimension.width < screenDimension.width && frameDimension.height < screenDimension.height) {
            frame.setSize(frameDimension);
        }
        frame.setMinimumSize(frame.getSize());
        frame.setLocation((screenDimension.width - frame.getSize().width) / 2, (screenDimension.height - frame.getSize().height) / 2);
        frame.revalidate();
        frame.repaint();
    }

    private static void setPasswordPanelComponentsToEmpty() {
        passFlag = true;
        passTextField1.setText("");
        warningLabel.setText("");
    }
}

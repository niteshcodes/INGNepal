 

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border;
//initializing instance variables inside a class which is implemented to Actionlistener 
public class INGNepal implements ActionListener {

    private JPanel panel;
    private JFrame frame;
    private JLabel forFullTimeEmployeeLbl, vacancyNumLbl, salaryLbl, employeeNumLbl, qualificationLbl, positionLbl,
            hoursWorkedLbl, staffNameLbl, appointedByLbl, jobLbl, dateOfJoinedLbl

            , forPartTimeEmployeeLblX, vacancyNumLblX, wagesLblX, empNumLblX, qualificationLblX, EmpNumLblTerminateX,
            positionLblX,

            hrsWorkedLblX, staffNameLblX, appointedByLblX, jobLblX, shiftsLblX, dateOfJoinedLblX;

    private JTextArea vacancyArea, salaryArea, employeeNumArea, qualificationArea, positionArea, hrsWrokedArea,
            staffNameArea, appointedByArea, jobArea,

            vacNumAreaX, wagesAreaX, empNumAreaX, qualificationAreaX, EmpNumberAreaTermX, positionAreaX, hrsWorkedAreaX,
            staffNameAreaX, appointedByAreaX, jobAreaX, shiftsAreaX;
    private JButton addBtn, appointBtn, clearBtn, terminateBtnX, addStaffPartTimeBtnX, appointBtnX, clearBtnX,
            displayBtnX;
                private JComboBox<String> yearCombo, monthCombo, dayCombo, yearComboX, monthComboX, dayComboX;

    ArrayList<StaffHire> list = new ArrayList<StaffHire>();
    //creating a main object to display the code
    public static void main(String[] args) {
        new INGNepal(); 

    }
    //initializing constructor of classes such as frame, panal, button, text area and combobox
    private INGNepal() {

        /*-----------FOR FULL TIME-------------*/

        frame = new JFrame("Staff Hire");
        frame.setResizable(false);
        frame.setBounds(250, 55, 1000, 750);
        Border txtB = BorderFactory.createLineBorder(Color.BLACK); 
        //setbounds is used to size the frame, textarea, label and so on in order
        panel = new JPanel();
        Color c = new Color(240, 240, 240);
        Color clrterm = new Color(239,19,19); 
        panel.setBackground(c);
        panel.setLayout(null);

        /*------labels-------*/
        forFullTimeEmployeeLbl = new JLabel();
        forFullTimeEmployeeLbl.setText("For Full Time Employee:");
        forFullTimeEmployeeLbl.setBounds(50, 22, 550, 50);
        //font objects could be initiated in order to put text of different fonts
        Font font = new Font("Times New Roman", Font.PLAIN, 30);
        Font fontDisplay = new Font(null, Font.BOLD, 20);
        Font fontTerm = new Font(null, Font.BOLD, 20);
        forFullTimeEmployeeLbl.setFont(font);
        panel.add(forFullTimeEmployeeLbl);
        frame.add(panel);

        vacancyNumLbl = new JLabel();
        vacancyNumLbl.setText("Vacancy Number:");
        vacancyNumLbl.setBounds(50, 90, 120, 25);
        panel.add(vacancyNumLbl);

        salaryLbl = new JLabel();
        salaryLbl.setText("Salary:");
        salaryLbl.setBounds(50, 150, 120, 25);
        panel.add(salaryLbl);

        employeeNumLbl = new JLabel();
        employeeNumLbl.setText("Employee Number:");
        employeeNumLbl.setBounds(50, 220, 120, 25);
        panel.add(employeeNumLbl);

        qualificationLbl = new JLabel();
        qualificationLbl.setText("Qualification:");
        qualificationLbl.setBounds(50, 280, 120, 25);
        panel.add(qualificationLbl);

        positionLbl = new JLabel();
        positionLbl.setText("Position:");
        positionLbl.setBounds(350, 90, 120, 25);
        panel.add(positionLbl);

        hoursWorkedLbl = new JLabel();
        hoursWorkedLbl.setText("Hours Worked:");
        hoursWorkedLbl.setBounds(310, 150, 120, 25);
        panel.add(hoursWorkedLbl);

        staffNameLbl = new JLabel();
        staffNameLbl.setText("Staff Name:");
        staffNameLbl.setBounds(340, 220, 120, 25);
        panel.add(staffNameLbl);

        appointedByLbl = new JLabel();
        appointedByLbl.setText("Appointed By:");
        appointedByLbl.setBounds(320, 280, 120, 25);
        panel.add(appointedByLbl);

        jobLbl = new JLabel();
        jobLbl.setText("Job:");
        jobLbl.setBounds(580, 90, 120, 25);
        panel.add(jobLbl);

        dateOfJoinedLbl = new JLabel();
        dateOfJoinedLbl.setText("Date Of Joined:");
        dateOfJoinedLbl.setBounds(580, 220, 120, 25);
        panel.add(dateOfJoinedLbl);

        /*------TextArea-------*/
        vacancyArea = new JTextArea(); 
        vacancyArea.setBounds(165, 90, 150, 25);
        panel.add(vacancyArea);
        vacancyArea.setBorder(txtB);
        panel.repaint();
        

        salaryArea = new JTextArea(); 
        salaryArea.setBounds(95, 150, 150, 25);
        panel.add(salaryArea);
        salaryArea.setBorder(txtB);
        panel.repaint();

        employeeNumArea = new JTextArea(); 
        employeeNumArea.setBounds(165, 220, 150, 25);
        panel.add(employeeNumArea);
        employeeNumArea.setBorder(txtB);
        panel.repaint();

        qualificationArea = new JTextArea(); 
        qualificationArea.setBounds(135, 280, 150, 25);
        panel.add(qualificationArea);
        qualificationArea.setBorder(txtB);
        panel.repaint();

        positionArea = new JTextArea(); 
        positionArea.setBounds(405, 90, 150, 25);
        panel.add(positionArea);
        positionArea.setBorder(txtB);
        panel.repaint();

        hrsWrokedArea = new JTextArea();
        hrsWrokedArea.setBounds(405, 150, 150, 25);
        panel.add(hrsWrokedArea);
        hrsWrokedArea.setBorder(txtB);
        panel.repaint();

        staffNameArea = new JTextArea(); 
        staffNameArea.setBounds(415, 220, 150, 25);
        panel.add(staffNameArea);
        staffNameArea.setBorder(txtB);
        panel.repaint();

        appointedByArea = new JTextArea(); 
        appointedByArea.setBounds(415, 280, 150, 25);
        panel.add(appointedByArea);
        appointedByArea.setBorder(txtB);
        panel.repaint();

        jobArea = new JTextArea(); 
        jobArea.setBounds(610, 89, 150, 25);
        panel.add(jobArea);
        jobArea.setBorder(txtB);
        panel.repaint();

        /*----Buttons---*/

        addBtn = new JButton("Add Staff Full Time");
        addBtn.setBounds(610, 150, 150, 25);
        addBtn.addActionListener(this);
        addBtn.setForeground(Color.BLACK);
        panel.add(addBtn);
        panel.repaint();
        //button is then linked with action listener by addBtn.
        //addActionListener(this). which would call the action listener interface 
        appointBtn = new JButton("Appoint");
        appointBtn.setBounds(610, 280, 150, 25);
        appointBtn.addActionListener(this);
        appointBtn.setForeground(Color.BLACK);
        panel.add(appointBtn);
        panel.repaint();

        clearBtn = new JButton("Clear");
        clearBtn.setBounds(820, 120, 105, 55);
        clearBtn.addActionListener(this);
        panel.add(clearBtn);
        clearBtn.setForeground(Color.BLACK);
        panel.repaint();

        /*----ComboBox--*/

        String year[] = { "2001", "2005-2010", "2010-2014", "2014-2018", "2018- " };
        yearCombo = new JComboBox<String>(year);
        yearCombo.setBounds(680, 220, 90, 25);
        panel.add(yearCombo);
        panel.repaint();
        //combobox is used to add dates. this acts as drop down menu. 
        String month[] = { "January", "Feburary", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        monthCombo = new JComboBox<String>(month);
        monthCombo.setBounds(770, 220, 70, 25);
        panel.add(monthCombo);
        panel.repaint();

        String day[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        dayCombo = new JComboBox<String>(day);
        dayCombo.setBounds(840, 220, 50, 25);
        panel.add(dayCombo);
        panel.repaint();

        /*----FOR PART TIME EMPLOYEE----*/

        forPartTimeEmployeeLblX = new JLabel();
        forPartTimeEmployeeLblX.setText("For Part Time Employee:");
        forPartTimeEmployeeLblX.setBounds(50, 330, 550, 50);

        Font xfont = new Font("Times New Roman", Font.PLAIN, 30);
        forPartTimeEmployeeLblX.setFont(xfont);
        panel.add(forPartTimeEmployeeLblX);
        frame.add(panel);

        vacancyNumLblX = new JLabel();
        vacancyNumLblX.setText("Vacancy Number:");
        vacancyNumLblX.setBounds(50, 390, 120, 25);
        panel.add(vacancyNumLblX);
        panel.repaint();

        wagesLblX = new JLabel();
        wagesLblX.setText("Wages:");
        wagesLblX.setBounds(50, 450, 120, 25);
        panel.add(wagesLblX);

        empNumLblX = new JLabel();
        empNumLblX.setText("Employee Number:");
        empNumLblX.setBounds(50, 520, 120, 25);
        panel.add(empNumLblX);

        qualificationLblX = new JLabel();
        qualificationLblX.setText("Qualification:");
        qualificationLblX.setBounds(50, 580, 120, 25);
        panel.add(qualificationLblX);

        EmpNumLblTerminateX = new JLabel();
        EmpNumLblTerminateX.setText("Employee Number:");
        EmpNumLblTerminateX.setBounds(50, 640, 120, 25);
        panel.add(EmpNumLblTerminateX);

        positionLblX = new JLabel();
        positionLblX.setText("Position:");
        positionLblX.setBounds(350, 390, 120, 25);
        panel.add(positionLblX);

        hrsWorkedLblX = new JLabel();
        hrsWorkedLblX.setText("Hours Worked:");
        hrsWorkedLblX.setBounds(310, 450, 120, 25);
        panel.add(hrsWorkedLblX);

        staffNameLblX = new JLabel();
        staffNameLblX.setText("Staff Name:");
        staffNameLblX.setBounds(325, 520, 120, 25);
        panel.add(staffNameLblX);

        appointedByLblX = new JLabel();
        appointedByLblX.setText("Appointed By:");
        appointedByLblX.setBounds(320, 580, 120, 25);
        panel.add(appointedByLblX);

        jobLblX = new JLabel();
        jobLblX.setText("Job:");
        jobLblX.setBounds(580, 390, 120, 25);
        panel.add(jobLblX);

        shiftsLblX = new JLabel();
        shiftsLblX.setText("Shifts:");
        shiftsLblX.setBounds(580, 440, 120, 25);
        panel.add(shiftsLblX);
        //objects for labels are created and added to the panel
        dateOfJoinedLblX = new JLabel();
        dateOfJoinedLblX.setText("Date of Joined:");
        dateOfJoinedLblX.setBounds(580, 520, 150, 25);
        panel.add(dateOfJoinedLblX);
        panel.repaint();

        /*---xTEXTAREA---*/
        vacNumAreaX = new JTextArea();
        vacNumAreaX.setBounds(165, 390, 150, 25);
        panel.add(vacNumAreaX);
        vacNumAreaX.setBorder(txtB);
        panel.repaint();

        wagesAreaX = new JTextArea();
        wagesAreaX.setBounds(95, 450, 150, 25);
        panel.add(wagesAreaX);
        wagesAreaX.setBorder(txtB);
        panel.repaint();

        empNumAreaX = new JTextArea();
        empNumAreaX.setBounds(165, 520, 150, 25);
        panel.add(empNumAreaX);
        empNumAreaX.setBorder(txtB);
        panel.repaint();

        qualificationAreaX = new JTextArea();
        qualificationAreaX.setBounds(135, 580, 150, 25);
        panel.add(qualificationAreaX);
        qualificationAreaX.setBorder(txtB);
        panel.repaint();

        EmpNumberAreaTermX = new JTextArea();
        EmpNumberAreaTermX.setBounds(160, 640, 150, 25);
        panel.add(EmpNumberAreaTermX);
        EmpNumberAreaTermX.setBorder(txtB);
        panel.repaint();

        positionAreaX = new JTextArea();
        positionAreaX.setBounds(405, 390, 150, 25);
        panel.add(positionAreaX);
        positionAreaX.setBorder(txtB);
        panel.repaint();

        hrsWorkedAreaX = new JTextArea();
        hrsWorkedAreaX.setBounds(405, 450, 150, 25);
        panel.add(hrsWorkedAreaX);
        hrsWorkedAreaX.setBorder(txtB);
        panel.repaint();

        staffNameAreaX = new JTextArea();
        staffNameAreaX.setBounds(405, 520, 150, 25);
        panel.add(staffNameAreaX);
        staffNameAreaX.setBorder(txtB);
        panel.repaint();

        appointedByAreaX = new JTextArea();
        appointedByAreaX.setBounds(415, 580, 150, 25);
        panel.add(appointedByAreaX);
        appointedByAreaX.setBorder(txtB);
        panel.repaint();

        jobAreaX = new JTextArea();
        jobAreaX.setBounds(610, 389, 150, 25);
        panel.add(jobAreaX);
        jobAreaX.setBorder(txtB);
        panel.repaint();

        shiftsAreaX = new JTextArea();
        shiftsAreaX.setBounds(620, 440, 150, 25);
        panel.add(shiftsAreaX);
        shiftsAreaX.setBorder(txtB);
        panel.repaint();

        /*----terminateBtnX---*/

        terminateBtnX = new JButton("Terminate");
        terminateBtnX.setBounds(320, 626, 160, 52);
        terminateBtnX.setFont(fontTerm);
        terminateBtnX.addActionListener(this);
        panel.add(terminateBtnX);
        terminateBtnX.setBackground(clrterm);
        terminateBtnX.setForeground(Color.WHITE); 
        panel.repaint();

        addStaffPartTimeBtnX = new JButton("Add Staff Part Time");
        addStaffPartTimeBtnX.setBounds(580, 485, 150, 25);
        addStaffPartTimeBtnX.addActionListener(this);
        addStaffPartTimeBtnX.setForeground(Color.BLACK);
        panel.add(addStaffPartTimeBtnX);
        panel.repaint();

        appointBtnX = new JButton("Appoint");
        appointBtnX.setBounds(610, 580, 150, 25);
        appointBtnX.addActionListener(this);
        appointBtnX.setForeground(Color.BLACK);
        panel.add(appointBtnX);
        panel.repaint();

        clearBtnX = new JButton("Clear");
        clearBtnX.setBounds(820, 400, 105, 55);
        clearBtnX.addActionListener(this);
        panel.add(clearBtnX);
        clearBtnX.setForeground(Color.BLACK);
        panel.repaint();

        displayBtnX = new JButton("Display");
        displayBtnX.setBounds(810, 600, 131, 69);
        displayBtnX.addActionListener(this);
        displayBtnX.setFont(fontDisplay);
        displayBtnX.setForeground(Color.BLACK);
        panel.add(displayBtnX);
        panel.repaint();

        /*----xComboBox----*/
        String xyear[] = { "2001-2005", "2005-2010", "2010-2014", "2014-2018", "2018- " };
        yearComboX = new JComboBox<String>(xyear);
        yearComboX.setBounds(680, 520, 90, 25);
        panel.add(yearComboX);
        panel.repaint();

        String xmonth[] = { "January", "Feburary", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        monthComboX = new JComboBox<String>(xmonth);
        monthComboX.setBounds(770, 520, 70, 25);
        panel.add(monthComboX);
        panel.repaint();

        String xday[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15",
                "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        dayComboX = new JComboBox<String>(xday);
        dayComboX.setBounds(840, 520, 50, 25);
        panel.add(dayComboX);
        panel.repaint();
        
        
        
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearBtn) {

            /* ===CLEAR TExT AREA=== */
            //sets the value of text field to "" and resets the combo box of fulltime staff hire after clear button is pressed
            vacancyArea.setText("");
            salaryArea.setText("");
            employeeNumArea.setText("");
            qualificationArea.setText("");
            positionArea.setText("");
            hrsWrokedArea.setText("");
            staffNameArea.setText("");
            appointedByArea.setText("");
            jobArea.setText("");

            yearCombo.setSelectedIndex(0);
            monthCombo.setSelectedIndex(0);
            dayCombo.setSelectedIndex(0);

            JOptionPane.showMessageDialog(frame, "The Full Time Employee is Cleared");

        }

        else if (e.getSource() == clearBtnX) {
            //sets the value of text field to "" and resets the combo box of parttime staff hire after clear button is pressed
            vacNumAreaX.setText("");
            wagesAreaX.setText("");
            empNumAreaX.setText("");
            qualificationAreaX.setText("");
            EmpNumberAreaTermX.setText("");
            positionAreaX.setText("");
            hrsWorkedAreaX.setText("");
            staffNameAreaX.setText("");
            appointedByAreaX.setText("");
            jobAreaX.setText("");
            shiftsAreaX.setText("");

            yearComboX.setSelectedIndex(0);
            monthComboX.setSelectedIndex(0);
            dayComboX.setSelectedIndex(0);

            JOptionPane.showMessageDialog(frame, "The Part Time Employee is Cleared");
        } else if (e.getSource() == addBtn) {
            //initialize the variables as null
            int VacNo = 0;
            float salary = 0, hrsWorked = 0;
            String job = "", position = "";

            try {
                //convert the input into string and change it into integer, float, float and string respectively
                VacNo = Integer.parseInt(vacancyArea.getText()); 
                salary = Float.parseFloat(salaryArea.getText()); 
                hrsWorked = Float.parseFloat(hrsWrokedArea.getText()); 
                job = jobArea.getText(); 
                position = positionArea.getText(); 

                boolean isDuplicateVacNo = false;

                for (StaffHire var : list) {
                    if (var.getVacancyNumber() == VacNo) {
                        isDuplicateVacNo = true;
                        break;
                        //the code breaks out of the for loop and goes to the else block as isDuplicate is set as true 
                    }
                }
                if (isDuplicateVacNo == false) {
                    //creates an object called FullTimeStaffHire which consists of parameters VacNo, position, job, salary, hrsWorked
                    FullTimeStaffHire obj = new FullTimeStaffHire(VacNo, position, job, salary, hrsWorked);
                    //the object is then added in the list
                    list.add(obj);
                    //since  input is received optionpane is displayed
                    JOptionPane.showMessageDialog(frame, "Vacancy added. The No of Vacancy is: " + list.size());
                } else {
                    //incase the value was repeated, error message pops up
                    JOptionPane.showMessageDialog(null, "Input Vacancy no is already in the list.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception exp) {
                //incase any invalid input was typed, it gies to the catch block and goes through an exception 
                JOptionPane.showMessageDialog(null, "Input is invalid", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }

        else if (e.getSource() == appointBtn) {
            try {
                //initializing the variable including the combobox and convert the input into string and changed into the respective variable
                int EmpNo = Integer.parseInt(employeeNumArea.getText());
                String qualification = qualificationArea.getText();
                String staffName = staffNameArea.getText();
                String apppointedBy = appointedByArea.getText();
                String DOJ = yearCombo.getSelectedItem() + "/" + monthCombo.getSelectedItem() + "/"
                        + dayCombo.getSelectedItem();

                boolean EmpNoFound = false;

                for (StaffHire obj : list) { //creating the object of staffhire and equating it into list
                    if (obj.getVacancyNumber() == EmpNo) {
                        EmpNoFound = true;
                        if (obj instanceof FullTimeStaffHire) { // creating an object while taking an instance of fulltimestaffhire
                            FullTimeStaffHire h = (FullTimeStaffHire) obj; //douncating by taking fulltimestaffhire as referenc 
                            if (h.getjoined() == true) {
                                //error message pops up if the staff is previously inputted
                                JOptionPane.showMessageDialog(null, "Staff Already Hired!", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                            } else {
                                //data is stored and info optionpane pops up
                                h.appointFullTimeStaff(staffName, DOJ, apppointedBy, qualification);
                                JOptionPane.showMessageDialog(frame, "Staff Has been Hired");
                                break;
                            }
                        } else {
                            //if the user types the value in part time staffhire and tries to register in fulltime, this message would pop up
                            JOptionPane.showMessageDialog(null, "Staff is not for Full Time Staff Hire", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }
                }
                if (!EmpNoFound) {
                    //shows an error if the wrong employee number is typed as oppose to registered vaccancy number
                    JOptionPane.showMessageDialog(null, "Vacancy Number not found!", "Error",
                            JOptionPane.ERROR_MESSAGE);

                }

            } catch (Exception ae) {
                //if any error occurs except that, it goes in the final exception 
                JOptionPane.showMessageDialog(null, "Input is invalid!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // For PART TIME STAFF HIRE

        else if (e.getSource() == addStaffPartTimeBtnX) {

            int VacNo = 0;
            float wages = 0, hrsWorked = 0;
            String job = "", position = "", shifts = "";

            try {
                VacNo = Integer.parseInt(vacNumAreaX.getText());
                wages = Float.parseFloat(wagesAreaX.getText());
                hrsWorked = Float.parseFloat(hrsWorkedAreaX.getText());
                job = jobAreaX.getText();
                position = positionAreaX.getText();
                shifts = shiftsAreaX.getText();

                boolean isDuplicateVacNo = false;

                for (StaffHire var : list) {
                    if (var.getVacancyNumber() == VacNo) {
                        isDuplicateVacNo = true;
                        break;
                    }
                }
                if (isDuplicateVacNo == false) {
                    PartTimeStaffHire obj = new PartTimeStaffHire(VacNo, position, job, hrsWorked, wages, shifts);
                    list.add(obj);
                    JOptionPane.showMessageDialog(frame, "Vacancy added: " + list.size());
                } else {
                    JOptionPane.showMessageDialog(null, "Input Vacancy no is already in the list.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception exp) {
                JOptionPane.showMessageDialog(null, "Input is invalid", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // FOR PART TIME EMPLOYEE

        else if (e.getSource() == appointBtnX) {
            try {
                int EmpNo = Integer.parseInt(empNumAreaX.getText());
                String qualification = qualificationAreaX.getText();
                String staffName = staffNameAreaX.getText();
                String apppointedBy = appointedByAreaX.getText();
                String DOJ = yearComboX.getSelectedItem() + "/" + monthComboX.getSelectedItem() + "/"
                        + dayComboX.getSelectedItem();

                boolean EmpNoFound = false;

                for (StaffHire obj : list) {
                    if (obj.getVacancyNumber() == EmpNo) {
                        EmpNoFound = true;
                        if (obj instanceof PartTimeStaffHire) { // staff hire is the parent class so creating an object through an instance of parttime staffhire 
                            PartTimeStaffHire h = (PartTimeStaffHire) obj; //downcasting while taking parttimestaffhire as reference 
                            if (h.isJoined() == true) {
                                JOptionPane.showMessageDialog(null, "Staff Already Hired!", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                            } else {
                                h.hirePartTime(staffName, DOJ, qualification, apppointedBy);
                                JOptionPane.showMessageDialog(frame, "Staff Has been Hired");
                                break;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Staff is not for Full Time Staff Hire", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }
                }
                if (!EmpNoFound) {
                    JOptionPane.showMessageDialog(null, "Vacancy Number not found!", "Error",
                            JOptionPane.ERROR_MESSAGE);

                }

            } catch (Exception ae) {
                JOptionPane.showMessageDialog(null, "Invalid Input!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == displayBtnX) {
        
            for (StaffHire obj : list) {
                if (obj instanceof StaffHire) {
                    if (obj instanceof FullTimeStaffHire) {
                        FullTimeStaffHire h = (FullTimeStaffHire) obj;
                        h.display();

                    }
                    if (obj instanceof PartTimeStaffHire) {
                        PartTimeStaffHire h = (PartTimeStaffHire) obj;
                        h.display();
                        break;
                    }

                }
            }
        }
        
        else if (e.getSource() == terminateBtnX) {
            try {
                int terminateVac = Integer.parseInt(EmpNumberAreaTermX.getText());
                for (StaffHire obj : list) {
                    if (terminateVac == obj.getVacancyNumber()) {
                        if (obj instanceof PartTimeStaffHire) { //creating an object by taking parttimestaffhire as instance
                            PartTimeStaffHire h = (PartTimeStaffHire) obj; //downcasting by referencing parttimestaffhire
                            h.staffTerminated();
                            JOptionPane.showMessageDialog(frame, "Staff terminated."); //infopane in case the staff is terminated
                        }else if (obj instanceof FullTimeStaffHire) { //creating an object by taking fulltimestaffhire as instance
                            FullTimeStaffHire m = (FullTimeStaffHire) obj; //downcasting by referencing fulltimestaffhire
                            JOptionPane.showMessageDialog(frame, "Staff Already Terminated.", "Error",//errorpane incase the staff was already terminated
                                    JOptionPane.ERROR_MESSAGE);

                        
                        }else {
                            JOptionPane.showMessageDialog(frame, "Staff Already Terminated.", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            } catch (Exception ae) {
                JOptionPane.showMessageDialog(frame, "Invalid Input!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

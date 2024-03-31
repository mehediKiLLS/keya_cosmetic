/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keya_cosmetics_demo;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import keya_cosmetics_demo.HRUser;
/**
 *
 * @author Asus
 */
public class HRUser implements Serializable  {

    // Explicit serialVersionUID definition
    private static final long serialVersionUID = 1L;
    
    private int userID;
    private String name;
    private String role;
        
    private LocalDate DateOfLeave;
    private int SelectNumberOfDays; 
    private String SelectReason;
    private String CommentForApplyLeave;

    public HRUser(LocalDate DateOfLeave, int userID, String name, String role) {
        this.userID = userID;
        this.name = name;
        this.role = role;
        this.DateOfLeave = DateOfLeave;
        this.SelectNumberOfDays = SelectNumberOfDays;
        this.SelectReason = SelectReason;
        this.CommentForApplyLeave = CommentForApplyLeave;
    }
    

    // Constructor
    public HRUser(int userID, String name, String role) {
        this.userID = userID;
        this.name = name;
        this.role = role;
    }

    // Getters and Setters
    public int getUserID() {
        return userID;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public LocalDate getDateOfLeave() {
        return DateOfLeave;
    }

    public int getSelectNumberOfDays() {
        return SelectNumberOfDays;
    }

    public String getSelectReason() {
        return SelectReason;
    }

    public String getCommentForApplyLeave() {
        return CommentForApplyLeave;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private static final Logger LOG = Logger.getLogger(HRUser.class.getName());

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "HRUser{" + "userID=" + userID + ", name=" + name + ", role=" + role + '}';
    }

public static boolean addNewEmployee(int userID, String name, String role)
        //Integer reciverId, Integer senderId, String details) 
{

        HRUser newHRUser = new HRUser(
                userID,
                name,
                role
        );

        System.out.println("Task made:" + newHRUser.toString());

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {

            f = new File("newHRUser.bin");

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(newHRUser);
            oos.close();
            return true;

        } catch (IOException e) {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(HRUser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Error writing Object to binary file");
            return false;

        }
    }

    public void setDateOfLeave(LocalDate DateOfLeave) {
        this.DateOfLeave = DateOfLeave;
    }

    public void setSelectNumberOfDays(int SelectNumberOfDays) {
        this.SelectNumberOfDays = SelectNumberOfDays;
    }

    public void setSelectReason(String SelectReason) {
        this.SelectReason = SelectReason;
    }

    public void setCommentForApplyLeave(String CommentForApplyLeave) {
        this.CommentForApplyLeave = CommentForApplyLeave;
    }


     
          public static ObservableList<HRUser> readHRUserList() {
        ObservableList<HRUser> HRUserList = FXCollections.observableArrayList();
        HRUser i;
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("newHRUser.bin"));
            while (true) {
                i = (HRUser) ois.readObject();
                System.out.println("The patient u read: " + i.toString());
                HRUserList.add(i);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File reading done");
        }
        System.out.println(HRUserList);
        return HRUserList;

    }
          
          
          
          
          
          
          public static boolean CreateNewLeaveApplication(
     LocalDate DateOfLeave,
     int SelectNumberOfDays, 
     String SelectReason,
     String CommentForApplyLeave)
             
     {
        if (DateOfLeave==null || SelectNumberOfDays<=0 || SelectReason == null)
        {
        
                return false;
        }
        else{
         File f =null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try{
            f = new File("EmployeeForLeaveElectricity.bin");

            if (f.exists()){
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
                
            }
            HRUser Enp = new HRUser(DateOfLeave,SelectNumberOfDays, SelectReason,CommentForApplyLeave);
            oos.writeObject(Enp);
            return true;
        } catch (IOException ex){

             Logger.getLogger(HRUser.class.getName()).log(Level.SEVERE, null, ex);
           
                
            }finally {
            try{
                if (oos != null) oos.close();
                if (fos != null) fos.close();
            }catch(IOException e){
                Logger.getLogger(HRUser.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
    return false;
    }

    }
    
    
    
    
    
}
    

          
       
          
          
          
          
          
          
          
  

package contactmanagementsoftware.commands;

import contactmanagementsoftware.MUI;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class cancelCommand implements Command {
   static MUI mui;
    public cancelCommand(MUI mui) {
        this.mui = mui;
    }
    @Override
    public void execute(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        mui = MUI.getInstance();
        JPanel jPanel1 = mui.getjPanel1();
        JPanel jPanel3 = mui.getjPanel3();
        jPanel1.setVisible(true);
        jPanel3.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    @Override
    public void undo(ActionEvent evt) {

    }
}

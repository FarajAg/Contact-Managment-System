package contactmanagementsoftware.commands;

import contactmanagementsoftware.MUI;

import java.awt.event.ActionEvent;

public class exitCommand implements Command {
    static MUI mui;

    public exitCommand(MUI mui) {
        this.mui = mui;
    }

    @Override
    public void execute(ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    @Override
    public void undo(ActionEvent evt) {

    }
}

package ui.Person;

import assessments.AssessmentFeed;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ModuleLeadWindow extends JFrame {
    private static ArrayList<ArrayList<String>> studentDataBase;
    private static int sDBsize;
    private static ArrayList<String> studentCIDs;



    public ModuleLeadWindow() {
        super("Module Lead View");
        sDBsize = assessments.AssessmentFeed.getCIDs().size();



        JPanel grid = new JPanel(new GridLayout(sDBsize, 7));
        studentCIDs.addAll(AssessmentFeed.getCIDs());
        for (int i = 0; i < sDBsize; i++) {
            String name = AssessmentFeed.getStudentName(studentCIDs.get(i));
            String cid = studentCIDs.get(i);
            String type = AssessmentFeed.getStudentType(studentCIDs.get(i));
            double ipt_pm = AssessmentFeed.getResult(cid,AssessmentFeed.PROGRAMMING_TEST,AssessmentFeed.PROGRAM_MARK);
            double ipt_es = AssessmentFeed.getResult(cid,AssessmentFeed.PROGRAMMING_TEST,AssessmentFeed.EXPLAINED_SUCCESSFULLY);
            double app_fm = AssessmentFeed.getResult(cid,AssessmentFeed.AI_PROJECT,AssessmentFeed.FUNCTIONALITY_MARK);
            double app_vm = AssessmentFeed.getResult(cid,AssessmentFeed.AI_PROJECT,AssessmentFeed.FUNCTIONALITY_MARK);
            switch (type) {
                
                case "UG":
                    Student su = new UGStudent(name, cid, type, ipt_es, ipt_pm, app_fm, app_vm);
                    grid.add(su);
                case "MSc":
                    double sdv_dm = AssessmentFeed.getResult(cid,AssessmentFeed.DESIGN_VIVA,AssessmentFeed.DESIGN_MARK);
                    double sdv_em = AssessmentFeed.getResult(cid,AssessmentFeed.DESIGN_VIVA,AssessmentFeed.EXPLANATION_MARK);
                    Student sm = new MScStudent(name, cid, type, ipt_es, ipt_pm, app_fm, app_vm, sdv_dm, sdv_em);
                    grid.add(sm);
            }


        }
    }
}

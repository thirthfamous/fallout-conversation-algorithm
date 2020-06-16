package GameObjects.DialogueTree;

import java.util.ArrayList;
import java.util.List;

public class DialogueNode {
    public int nodeID = -1;
    public String text;
    public List<DialogueOption> options = new ArrayList<DialogueOption>();

    @Override
    public String toString() {
        return "\"DialogueNode\"{" +
                "\"nodeID\" : " +"\""+ nodeID +"\""+
                ", \"text\" :" + "\""+ text + "\"" +
                ", \"options\" :" +"\""+ options + "\"" +
                "}";
    }

    public DialogueNode() {
        options = new ArrayList<DialogueOption>();
    }

    public DialogueNode(String text){
        this.text = text;
        options = new ArrayList<DialogueOption>();
    }

}

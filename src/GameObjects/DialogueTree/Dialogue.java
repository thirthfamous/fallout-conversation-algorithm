package GameObjects.DialogueTree;

import java.util.ArrayList;
import java.util.List;

public class Dialogue {
    public List<DialogueNode> nodes = new ArrayList<DialogueNode>();

    public void addNode(DialogueNode node){
        if(node == null) return;

        nodes.add(node);
        node.nodeID = nodes.indexOf(node);
    }

    public void addOption(String text, DialogueNode node, DialogueNode destination){
        if(!nodes.contains(destination)) addNode(destination);
        if(!nodes.contains(node)) addNode(node);

        DialogueOption dialogueOption;

        if(destination == null){
            dialogueOption = new DialogueOption(text, -1);
        }else{
            dialogueOption = new DialogueOption(text, destination.nodeID);
        }
        node.options.add(dialogueOption);
    }

    public DialogueNode buttonOfDestination(int destinationID){
        for (DialogueNode node : nodes) {
           if(node.nodeID == destinationID){
               return node;
           }
        }
       return null;
    }

    @Override
    public String toString() {
        return "\"Dialogue\" : {" +
                "\"nodes\" : " +"\""+ nodes + "\"" +
                "}";
    }
}

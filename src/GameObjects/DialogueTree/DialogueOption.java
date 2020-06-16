package GameObjects.DialogueTree;

public class DialogueOption {
    public String text;
    public int destinationNodeID;

    public DialogueOption() {

    }

    public DialogueOption(String text, int destinationNodeID){
        this.text = text;
        this.destinationNodeID = destinationNodeID;
    }

    @Override
    public String toString() {
        return "\"DialogueOption\"{" +
                "\"text\" : " +"\"" + text + "\"" +
                ",\"destinationNodeID\":" +"\""+ destinationNodeID +"\""+
                "}";
    }
}

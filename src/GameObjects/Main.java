package GameObjects;

import GameObjects.DialogueTree.Dialogue;
import GameObjects.DialogueTree.DialogueNode;
import GameObjects.DialogueTree.DialogueOption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dialogue dialogue = new Dialogue();
        dialogue.addNode(new DialogueNode("Hello there, my name is Farhan")); // 0
        dialogue.addNode(new DialogueNode("Do you mind if i join your science group ?")); // 1
        dialogue.addNode(new DialogueNode("Well, of course  we can cooperate together as a team. So what do you think ?")); // 2
        dialogue.addNode(new DialogueNode("Hmmm that's too bad then -_-")); // 3
        dialogue.addNode(new DialogueNode("Wow thanks, so where will we going to be start at ?")); // 4

        dialogue.addOption("Hello Farhan", dialogue.nodes.get(0), dialogue.nodes.get(1));
        dialogue.addOption("Why do you want to join me ?", dialogue.nodes.get(1), dialogue.nodes.get(2));
        dialogue.addOption("Sorry, but no", dialogue.nodes.get(1), dialogue.nodes.get(3));
        dialogue.addOption("All right, let's team up !", dialogue.nodes.get(2), dialogue.nodes.get(4));

        DialogueNode currentDialogue = dialogue.buttonOfDestination(0);
        int answer = 0;
        while (true){
            System.out.println(currentDialogue.text);
            if(currentDialogue.options.isEmpty()){
                System.out.println("Conversation Ended");
                break;
            }
            for (DialogueOption option : currentDialogue.options){
                System.out.println("Destination ID : "+option.destinationNodeID+", Text : "+option.text);
            }
            System.out.println("Your Answer : ");
            answer = sc.nextInt();
            currentDialogue = dialogue.buttonOfDestination(answer);
        }
    }
}


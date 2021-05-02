package ie.gmit.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainMessageApp {

	public static void main(String[] args) throws IOException {

		Formatter formatter = new TextFormatter();//creates formatter

		PrintWriter writer = new PrintWriter(new FileWriter("test_msg.txt"));
		//PrintWriter writer = new PrintWriter(System.out);

		Message msg = new Message("This is a message2");
		MessagePrinter printer = new MessagePrinter();

		//write message is passed the message, formatter type and writer type
		printer.writeMessage(msg, formatter, writer);
	}

}

package sphinx;
/*
 * Copyright 1999-2004 Carnegie Mellon University.
 * Portions Copyright 2004 Sun Microsystems, Inc.
 * Portions Copyright 2004 Mitsubishi Electric Research Laboratories.
 * All Rights Reserved.  Use is subject to license terms.
 *
 * See the file "license.terms" for information on usage and
 * redistribution of this file, and for a DISCLAIMER OF ALL
 * WARRANTIES.
 *
 */



import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;


/**
 * A simple HelloWorld demo showing a simple speech application built using Sphinx-4. This application uses the Sphinx-4
 * endpointer, which automatically segments incoming audio into utterances and silences.
 */
public class HelloWorld {

    public static void main(String[] args) {
        ConfigurationManager cm;

        if (args.length > 0) {
            cm = new ConfigurationManager(args[0]);
        } else {
            cm = new ConfigurationManager("src/sphinx/helloworld.config.xml");
        }

        Recognizer recognizer = (Recognizer) cm.lookup("recognizer");
        recognizer.allocate();

        // start the microphone or exit if the programm if this is not possible
        Microphone microphone = (Microphone) cm.lookup("microphone");
        if (!microphone.startRecording()) {
            System.out.println("Cannot start microphone.");
            recognizer.deallocate();
            System.exit(1);
        }

        System.out.println("FILL THIS IN LATER");

        // loop the recognition until the programm exits.
        while (true) {
            System.out.println("Start speaking. Press Ctrl-C to quit.\n");

            Result result = recognizer.recognize();
            String resultText = result.getBestFinalResultNoFiller();

            if(resultText.equals("name car")) {
	            System.out.println("You said: " + resultText + "\n");
			}
            else if(resultText.equals("name bank")){
            	System.out.println("You said:  " + resultText + "\n");
            }
            else if(resultText.equals("create class")){
            	System.out.println("You said:  " + resultText + "\n");
            }
            else if(resultText.equals("create association")){
            	System.out.println("You said:  " + resultText + "\n");
            }
            else if(resultText.equals("create package")){
            	System.out.println("You said:  " + resultText + "\n");
            }
            else if(resultText.equals("delete class car")){
            	System.out.println("You said:  " + resultText + "\n");
            }
            else if(resultText.equals("delete class bank")){
            	System.out.println("You said:  " + resultText + "\n");
            }
            else if(resultText.equals("choose draw")){
            	System.out.println("You said:  " + resultText + "\n");
            }
            else if(resultText.equals("choose select")){
            	System.out.println("You said:  " + resultText + "\n");
            }
            else if(resultText.equals("choose connect")){
            	System.out.println("You said:  " + resultText + "\n");
            }
            else if(resultText.equals("choose drag")){
            	System.out.println("You said:  " + resultText + "\n");
            }
            else if(resultText.equals("undo")){
            	System.out.println("You said:  " + resultText + "\n");
            }
            else if(resultText.equals("redo")){
            	System.out.println("You said:  " + resultText + "\n");
            }
			else {
				System.out.println("NOPE " + resultText + "\n");
			}
        }
    }
}

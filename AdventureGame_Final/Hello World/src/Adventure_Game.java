import java.util.Scanner; // imports scanner 

/**
 * Text adventure game 
 * @author Haider Khan
 * Takes user input using string method 
 * Every user decision results in a different continuation of the game 
 * makes use of the scanner object and of if/ if else statements and conditionals 
 * Uses boolean statments 
 */

public class Exam_Review {

	static Scanner scan = new Scanner(System.in); // declares scanner 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int state = 0; // variables 
		long StartTime = 0;
		long timeRemaining = 0;
		String input = "";
		double Health = 15; // health already initalized 
		boolean Prisoncellopen = false, Metalrod = false, Guardstate = true, Keysobtained = false, Prisonlock = false, Prisoncellin = true,
				firstchoice_knife = false, firstchoice_gun=false, Prisonscreen = false, Exitquestion = false, exittestbegin = false, exittestpassed = false,
				weaponequipped = false, firstwrongchoice_weapon = false, firstchoiceweapon = false, guardsappraoched = false, guardstakenout = false, secondfloor = false, controlpanelreach = false,
				exitdoorreach1 = false, riot = false, lockdown = false, prisonriotState = true; // boolean statements 

		while (state < 99){ // sets the while loop

			switch (state){ //first switch state 
			case 0: // starting location 
				say("You are a CIA agent who was sent on a mission with a very specific task and that is to collect intel on the group 54 Immortals");
				say("However, on this mission your cover is blow as you discover information that must be reported at once");
				say("But, lucky for you! You are a highly trained CIA agent");
				say("In this adventre text game you are responsible to break out of this highly guarded prison and get your collected information to the U.S government");
				say("Do you understand?");
				break;

			case 1: // case 2 description
				say("You look around and notice that the prison cell is very heavly fortified");
				say("But, you notice that the prison door is a traditional door with bars and the bench is very lose");
				say("You spend all day planning your escape and measuring the length of the bar,the bar reaches the security guard and the keys");
				break;

			case 2: //case 3 description
				say("Your night guard is asleep and you have obtained the metal rod by disassembling the becnch ");
				say("However, there is a guard on duty at all times with the keys, but lucky for you the night guard takes a nap");
				say("You spend all day planning your escape and measuring the length of the bar,the bar reaches the security guard and the keys");
				say("You notice that the keys are on the table and the rod can reach the keys, but the rod can also reach the guard");
				break;

			case 3: // case 4 description
				say("You have taken out the guard and it seems the keys can be reached by the rod that you disassembled");
				break;

			case 4: // case 5 description
				say("You have obtained the keys and your night is down, you need act fast before the guard gets back up!");
				if (Prisonlock = false){
					say("the prison is locked");
				}

				break;

			case 5:// case 6 description			
				say("The prison door is wide open and your night guard is knocked out, you can exit the prison cell and enter a large isolated room");
				break;

			case 6: // case 7 description
				say("The room is dimly lit with a one light luminating the whole room, you feel the walls and observe that all walls are reinforced with solid metal");
				say("You have exited the prison cell, you look around and notice that the room that you entered is more fortified than your prison cell!");
				say("You began to observe that the only exit to exit the room is a heavy metal door with a small screen right in the middle of it");
				break;

			case 7: // case 8 description
				say("You have apprached the exit door and the screen in the middle of the door prompts:");
				say("This door can only be opened from the outside using a ID card, inorder to open the door from the inside a mathematical answer must be answerd in 10 seconds");
				say("If the answer is not questioned within the 10 seconds gurards outside will resort to a breach protocal and storm prison room");
				say("Start?");
				break;
				
			case 8: // case 9 description
				say("The screen moves to the next prompt");
				say("The screen states: The timer will start as soon as you begin to answer");
				say("The mathematical question that needs to be answerd is:");
				say("The countdown commences "+ (15 -(timeRemaining/1000)) + "second left before the breach protocal takes place");
				say("3x3/3");
				break;
				
			case 9: // case 10 description
				say("Great you enterd the passcode correctly and decide to take a look around the prison room one last time");
				say("You notice that that under the table there are two weapons one is a Ak-47 and the other is a sharp combat knife");
				break;
			
			case 10: // case 11 description
				say("You have equiped a weapon and have exited the prison room");
				say("You begin to observe the prison hallway and notice that the :");
				say("Prison is located under the mountain and the only windows are in the roof and the prison is double story with prison rooms similar to yours all across ");
				say("You start to observe all the obstacles you must get through:");
				say("There are are four guards near the doors that lead to the stair case that leads to the second floor");
				say("It seems the only way to exit the prison is by going to the second floor");
				say("Do you wish to approach the staircase leading to second floor?");
				break;
			
			case 11: // case 12 description
				say("You have approached the staircase that leads to the second floor");
				say("However, there are four guards blocking the way");
				break;
			
			case 12: // case 13 description
				say("You have taken out the guards");
				say("The stair case leading upstairs is clear");
				break;
				
			case 13: // case 14 description
				say("You have came upstairs and observe that there are is a long row of prison rooms");
				say("There are no guards presnt, but you notice there is a control panel connected to the railing of the second floor");
				say("There is a exit door at the end of the long row of prison room");
				break; 
				
			case 14: // case 15 description
				say("Inoder to exit this prison you need a ID card, that ID card belong to the warden of this prison");
				say("When you reach the control panel it has two options:");
				say("Press (1) Open All Prison Rooms");
				say("Press (2) To put prison in lock down");
				break;
				
			case 15: // case 16 description
				say("As soon as you hit the Open all Prison Room all prison rooms open with loud thump");
				say("You start to hear loud noises of prisoners roaring and the emergency sirens went off");
				say("Moments later prisnors started to flood both the upstairs and downstairs hallway");
				say("The exit door is open and heavly armoured security guards are coming through that door");
				say("The prisnors wreak havoc and attack the guard");
				say("You notice that you are still holding your weapon"); 
				break;
				
			case 16: // case 17 description
				say("The riot continues for atleast 10 minutes and the prisoners are filled with rage and they are attacking the guards");
				say("Every wave of guards beigns to dwindle in force and the prison exit door is clear");
				break;
				
			case 17: // case 18 description
				say("You have exited the prison");
				say("You start to notice that all the prisoners who were involed in the riot begin to get shot down");
				say("There are dozens of guards in Goliath suits who have raised a 10 feet high barrier and shooting prisoners as they run out of the prison");
				say("You start to look around and notice that the sky is filled with colours that you have never seen before");
				say("You take shelter from the heavey gun fire and think to your self where the hell am I in the universe am I too late to deliver the news?");
				break;
				
			case 30: // death state 
				say("You have locked down the prison, thus you have locked your seld in");
				say("Backup guards flooded the prison by making in the walls and killed you,");
				say("Health = 0");
				break;
				
				
			} // end switch 

			input = ask("What do you want to do?"); // asks for user input 

			switch (state) { // beginning state for second switch 
			case 0: // first case programming 
				if (input.contains("Understand")|| input.contains("yes")) { 
					say("Great lets get started");
				}
				state = 1;
				break;


			case 1:// start state (first location)

				if (input.contains("bench") && input.contains("disassamble") ||input.contains("break")  && (Prisoncellopen == false) &&(Metalrod == false)){ // input.contains sting that checks for user input 
					state = 2;
					Metalrod = true; // gives the player a metal bar
					say("You have obtained the metal rod");
					say("It seems as if your night guard has went to sleep and the keys are in reach");
				}

				else if ((input.contains("examine") || input.contains("look")) && input.contains ("door") &&(Metalrod == false) &&(Prisoncellopen == false)){ // input.contains sting that checks for user input 
					Metalrod = false; // keeps metal bar neutral 
					say("The prison cell is heavely fortified, but the prison door is a normal bar door and the guard is asleep");
				}

				else if (input.contains("examine") || input.contains("look") && input.contains ("bar") || input.contains ("bench") &&(Metalrod == false)){ // input.contains sting that checks for user input 
					say("it is is a long bench that is made for prisons to sleep on, the bench is assmebed with large metal bars and the bench seems like it is in a very bad shape");
				}

				else if (input.contains("examine") || input.contains("look") && input.contains ("door") &&(Metalrod == true) &&(Prisoncellopen == false)){ // input.contains sting that checks for user input 
					say("You have already obatined the metal bar, it seems the prison door is locked and the gurard is asleep");
				}
				
				else if (input.contains("examine") || input.contains("look") && input.contains ("around") || input.contains("around")){ // input.contains sting that checks for user input 
					state = 1;
				}
				else if (Metalrod == false){ // if metal rod is false say this from description case 25 
					state = 25;
				}

				else { // if none of the commands can't be registerd that say this prompt 
					say("I do not understand your command, please read the description carefully or check your spelling");
				}

				break; // ends case 1

			case 2:
				if (input.contains("take out") || input.contains("kill") || input.contains("hit")  && input.contains("guard") && ( Guardstate == true)){ // input.contains sting that checks for user input 
					state = 3;
					Guardstate = false;
					say("You have taken out your night guard");
				}

				else if (input.contains("get") || input.contains("take") && input.contains("bar") || input.contains("rod") // input.contains sting that checks for user input 
						|| input.contains("metal bar") && input.contains("keys") &&( Guardstate == true)){
					Guardstate = true; // guard is still present in the room
					Health = Health-3; // decrease in Health 
					say("Oh No! The guard was still present in your room! Now your health has gone down by 3 and now your health is " + Health);
					say("Wait until your guard goes back to sleep and retry");
				}

				else if (input.contains("get") || input.contains("take") && input.contains("keys") &&( Guardstate == true)){ // input.contains sting that checks for user input 
					state = 2;
					say("How do you plan on taking the keys, you did disassemble the metal bar recently");
				}

				else if (input.contains("examine") || input.contains("look") && input.contains("through") || input.contains("out") && input.contains("door") && ( Guardstate == true)){ // input.contains sting that checks for user input 
					say("The guard is asleep and it seems that the guard has the keys");
				}

				else { // if none of the commands can be registers this statement is prompted to the user 
					say("I do not understand your command, please read the description carefully or check your spelling");
				}

				break; //ends case 2 

			case 3:
				if (input.contains("get") || input.contains("take") && input.contains("bar") || input.contains("rod")  // input.contains sting that checks for user input 
						|| input.contains("metal bar") && input.contains("keys") &&(  Keysobtained == false)){
					Keysobtained = true;
					state = 4;
					say("You have obtained the prison keys");
				}

				else if (input.contains("get") || input.contains("take") && input.contains("keys") &&( Guardstate == true)){ // input.contains sting that checks for user input 
					say("How do you plan on taking the keys, you did disassemble the metal bar recently");
				}

				else if (input.contains("open")&& input.contains("door")){ // input.contains sting that checks for user input 
					say("You have not obainted the keys yet");
				}

				else {
					say("I do not understand your command, please read the description carefully or check your spelling");
				}
				break; // ends case 3 

			case 4: 

				if (input.contains("open") && input.contains("prison cell") || input.contains("door") && input.contains("keys") &&( Prisonlock == false) && input.contains("keys") ){ // input.contains sting that checks for user input 
					Prisonlock = true; // it's opened 
					state = 5;
					say("You opened the prison cell that you were in");
				}

				else if (input.contains("open") && input.contains("door") || input.contains("prison cell")  && (Prisonlock == false)){ // input.contains sting that checks for user input 
					say("You have obtained the keys, but how do you plan on opening the door");
				}

				else if (input.contains("exit") || input.contains("enter") && input.contains("prison cell") || input.contains("door") && Prisonlock == false){ // input.contains sting that checks for user input 
					say("The prison cell is locked");
				}

				break; // ends case 4

			case 5: 
				if (input.contains("exit") && input.contains("prison cell")|| input.contains("prison door") || input.contains("cell") // input.contains sting that checks for user input 
						&&(Prisonlock == true) && (Prisoncellin == true)){
					Prisoncellin = false;// you are no longer in the prison cell and have enterd the next fortified room 
					state = 6;
					say("You have exited the prsion cell");
				}

				else if (input.contains("close") && input.contains("door") || input.contains("prison cell") || input.contains("prison door") // input.contains sting that checks for user input 
						|| input.contains("cell")&& (Prisoncellin == true)) {
					Prisonlock = false; 
					say("The prison cell is now locked");

				}	

				else if (input.contains("look") || input.contains("examine") && input.contains("outside") && (Prisoncellin == true)){ // input.contains sting that checks for user input 
					say("Outside the prison there are heavly fortified walls and one door that has a screen on");
					say("There is a camera that is observing the whole outside room");
				}

				else {
					say("I do not understand your command, please read the description carefully or check your spelling");
				}
				break;

			case 6:
				if (input.contains("approach") || (input.contains("go") && input.contains("door") || input.contains("screen")&& (Prisoncellin == false) && (Prisonscreen == false))){ // input.contains sting that checks for user input 
					Prisonscreen = true; // you have approached the screen
					state = 7;
				}


				else if (input.contains("observe") ||input.contains("look") && input.contains("room")&&(Prisoncellin == false)){ // input.contains sting that checks for user input 
					state = 6; //returns to state 6 that repeats the description 
				}

				else { // if the commands can not be registerd this statement is prompted to the user 
					say("I do not understand your command, please read the description carefully or check your spelling"); 
				}

				break; // ends case 6

			case 7: 
				if (input.contains("begin") || (input.contains("start") || (input.contains("yes") && (Prisonscreen == true) && (exittestbegin == false)))){ // input.contains sting that checks for user input 
					exittestbegin = true; // starts the exit question if it it turned true in the follwing case you move onto the next location 
					state = 8;
				}

				else if (input.contains("stop") || (input.contains("cancel") || (input.contains("exit") && (Prisonscreen == true) && (exittestbegin == false)))){ // input.contains sting that checks for user input 
					say("The protocal to exit door is cancelled"); // you are getting to ahead 
					state = 6;
				}

				else { // if the commands don't make sense this prompt is presented 
					say("I do not understand your command, please read the description carefully or check your spelling");
				}	
				break; // ends case 7
				
			case 8: 
				
				timeRemaining = System.currentTimeMillis() - StartTime; // sets the timer 
					if (timeRemaining > 1500){
						say("the timer went off");
				}
				
				if (input.contains("3") && (exittestbegin == true) && (timeRemaining > 1500)){ // input.contains sting that checks for user input (if the answer is correct within the time than exittestpassed - true
					exittestpassed = true; // you have passed the test 
					state = 9;
				}
				
			else if (input.contains("3") && (exittestbegin == true) && (timeRemaining < 1500)){  // if the timer is greater than 15 seconds and you have answerd the question you still move to the nect state but with decrease health
					exittestpassed = false; // you have approached the screen
					state = 6;
					Health = Health-5; // decreases health by 5 
					say("You answerd your question wrong, the guards resorted to the breach protocol and returned you to the prison");
					say("Now your health has gone down by 3 and now your health is " + Health);
				}
				
				break; // ends case 8
			
			case 9: 
				
				if (input.contains("take") && input.contains("knife") && (firstchoice_knife == false) && (firstchoiceweapon == false)){ // input.contains sting that checks for user input and turns weapon equipped to true 
					state = 10;
					firstchoice_knife = true;	
					firstchoiceweapon = true;
					firstwrongchoice_weapon = true;
					firstchoice_gun = false;	
				
				} 
				
				else if (input.contains("take") || input.contains("pick") || input.contains("get")&& input.contains("gun") || input.contains("47") && (firstchoice_gun==false)){ // equip gun 
					state = 10;
					firstchoice_gun= true;	
					firstchoiceweapon = true;
					firstwrongchoice_weapon = false;
					firstchoice_knife= false;	
				}
				

				else if (input.contains("get") || input.contains("take") && input.contains("weapon")){ // asks user to further specify 
					state = 9;
					say("Which weapon do you wish to equip ");
				}

				else if (input.contains("examine") || input.contains("look") && input.contains("room") || input.contains("around") && input.contains("door")){ // return user to state description 
					state = 9; // case description 
				}

				else { // if the command is not recognozied promoted with this statement 
					say("I do not understand your command, please read the description carefully or check your spelling");
				}

				break; // ends case 9 
	
			case 10: 
				if (input.contains("go") || input.contains("walk") || input.contains("approach")&& input.contains("guards") || input.contains("stairs") && (firstwrongchoice_weapon == true) && (guardsappraoched == false)){
					guardsappraoched = true; // you have apprached the guards 
					state = 11;
				}
				
				else if (input.contains("go") || input.contains("return") || input.contains("back")&& input.contains("cell") || input.contains("room") && (firstchoice_gun == false)){
					state = 6; // takes you back to state 6 since you asked to go back
				}
				
				else { // does not recognize your command so it prompts you with this statement 
					say("I do not understand your command, please read the description carefully or check your spelling");
				}
				break; // ends case 10 
				
			case 11: 
				
				if (input.contains("attack") && input.contains("guards") || input.contains("guard") && (firstchoice_knife == true) && (firstchoiceweapon == true)){ // input.contains sting that checks for user input 
					guardstakenout = true; // turns guards knocked out to true and decrease health by 5 b/c you chose the wrong weapon 
					Health = 12;
					Health = Health-5; // decreases health by 5 
					say("Oh No! You chose a knife when you escaped the prison room so you took some damage, but you defeated the guards regardless");
					say("Now your health has gone down by 2 and now your health is " + Health);
					state = 12; // takes you to the next statemnt 
				}
				
				else if (input.contains("attack") || (input.contains("take") && input.contains("guards") || input.contains("men")  && (firstchoice_gun == true) &&(firstchoiceweapon == false))){
					guardstakenout = true; // take you to the next statement and does not take any life b/c you chose a machine gun 
					state = 12; // still take you to the next state 

				}
		
				else { // if command not recongnized by either of the sting takes you to the description of state 11 
					say("I do not understand your command, you have came too far to give up");
					state = 11; 
				}
				
				break;
				
			case 12: 
				if (input.contains("up") || input.contains("upstairs") && input.contains("go")|| input.contains("walk") &&(secondfloor == false)){ // input.contains sting that checks for user input 
					secondfloor = true;// you are no longer in the prison cell and have enterd the next fortified room 
					state = 13;
				}
				
				else { // does not recognize the command, so it return you with this statement and restates case description 
					say("I do not understand your command, please check your input");
					state = 12; 
				}
				
				break; // ends case 12 
				
			case 13: 
				
				if (input.contains("go") && input.contains("exit")){ // input.contains sting that checks for user input 
					exitdoorreach1 = true;
					say("You need a ID card inorder to exit this prison");
					state = 13;                                        
				}
				
				else if (input.contains("approach") || input.contains("go") && input.contains("control")){ // checks if  the user wants to check contrl panel 
					controlpanelreach = true; // you have approached the control pane
					state = 14;  //exitdoorreach1 = false;        
				}
				
				else { // command not recognized statement 
					say("I do not understand your command, please check your input");
					state = 13; 
				}
				break; // ends case 13 
				
			case 14: 
				if (input.contains("1") && (riot == false)){ // initates the riot 
					riot = true; 
					state = 15;
				}
				
				else if(input.contains("2") && (lockdown == false)) { //initates the lock down/ but it ends the game because you locked your self in the prison 
					lockdown = true; 
					state = 30; 
				}
				
				break; // case 14 
				
			case 15: 
				 if (input.contains("attack") || input.contains("fight") && (prisonriotState == true)){ // input.contains sting that checks for user input 
					state = 16;
					prisonriotState = false; // finsihes the riot 
				}
				
				else if (input.contains("go") && input.contains("exit")){ // if you try to exit you are told you can not at this stage 
					say("You are in a middle of a prison riot! Do you really think you can just exit");                                     
				}
				
				else { // command not understood 
					say("I do not understand your command, please check your input");
					state = 14; 
				}
				
				break; // ends case 15 
				
			case 16: 
				if (input.contains("exit") || input.contains("leave") && (prisonriotState == false)){ // input.contains sting that checks for user input 
					state = 17; // take you to the final state     
				}
				
				else { //command not understood 
					say("I do not understand your command, please check your input");
					state = 15; 
				}
				
				break;
				
				
				
			}
		}// ends program
	}// end while loop

	public static int ask(String prompt, int initialVal){ // ask function with int 
		say(prompt);
		return scan.nextInt();
	}

	public static double ask(String prompt, double initialVal){ // ask function with doubles  
		say(prompt);
		return scan.nextInt();
	}

	private static String ask(String words){
		say(words);
		return scan.nextLine();
	}

	public static void say(String words){ // say function 
		System.out.println(words);
	}
}




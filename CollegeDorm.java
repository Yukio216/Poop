/*
 * Author: Arturo Tenorio
 * Instructor : Eric Mailman
 * File Name: CollegeDorm.java
 * Date: Feb 19, 2015
 * Class: CSC164-402
 * Purpose: College Dorm Project
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollegeDorm {

	private static ArrayList<String> dorminfo = new ArrayList<String>();
	private static ArrayList<String> studentinfo = new ArrayList<String>();
	private static String dormName = "";
	private static int buildingNumber = 0;
	private static String studentID = "";
	private static String studentName = "";
	private static int dormRoomNum = 0;
	private static DormRoom dorm = new DormRoom();
	private static Student s = new Student();
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Test stupid list
		/*for (int i = 0; i < 10; i++) {
			dorm = new DormRoom();
			dorm.setDName("Dorm " + i);
			dorm.setRoom(i);
			dorminfo.add(dorm.toString());
		}
		for (int i = 0; i < dorminfo.size(); i++) {
			System.out.println(dorminfo.get(i));
		}*/

		StartMenu();
		int choice = input.nextInt();
		Cases(choice);

	}

	// Declare a method to add a dorm to the dorm array
	public static void initDormArray() {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter dorm name: ");
		dormName = input.next();

		System.out.print("Enter dorm number: ");
		buildingNumber = input.nextInt();

		// add shit here
		dorm = new DormRoom();
		dorm.setDName(dormName);
		dorm.setRoom(buildingNumber);
		dorminfo.add(dorm.toString());

		StartMenu();
		int choice = input.nextInt();
		Cases(choice);

		input.close();
	}

	// Declare a method to add a student to the student array
	public static void initStudentArray() {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter student ID: ");
		studentID = input.next();

		System.out.print("Enter student name: ");
		studentName = input.next();

		System.out.print("Enter dorm number: ");
		dormRoomNum = input.nextInt();

		s = new Student();
		s.setID(studentID);
		s.setSName(studentName);
		s.setSRoom(dormRoomNum);
		studentinfo.add(s.toString());

		StartMenu();
		int choice = input.nextInt();
		Cases(choice);

		input.close();
	}

	public static void StartMenu() {

		System.out.println("Welcome to your Dorm Room experience!");
		System.out.println("\t1. Add a dorm (name and number)");
		System.out
				.println("\t2. Assign student to dorm(ID, name, dorm number)");
		System.out.println("\t3. List dorms");
		System.out.println("\t4. List students");
		System.out.println("\t5. Quit");
		System.out.print("Select 1 - 4 (5 to Quit): ");
	}

	public static void Cases(int choice) {
		Scanner input = new Scanner(System.in);
		do {
			switch (choice) {
			case 1:
				initDormArray();
				break;
			case 2:
				initStudentArray();
				break;
			case 3:
			
				break;
			case 4:
				while (((Iterator<String>) studentinfo).hasNext()) {
					System.out.println(((Iterator<String>) studentinfo).next()
							.toString());
				}
				break;
			case 5:
				System.out.println("Done");
				System.exit(1);
				break;
			default:
				System.out.println("Pancakes.");
			}

		} while (choice != 5);

		input.close();
	}

}

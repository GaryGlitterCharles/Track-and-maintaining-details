package asses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of containers :");
		int numOfContainer = sc.nextInt();
		List<Container> details = new ArrayList<>();

		for (int i = 0; i < numOfContainer; i++) {
			Container container = new Container();
			System.out.println("Enter the container " + (i + 1) + " details :");
			System.out.println("enter the container name");
			container.setContainerNumber(sc.next());
			container.setLength(sc.nextFloat());
			container.setWidth(sc.nextFloat());
			container.setHeight(sc.nextFloat());
			container.setWeight(sc.nextDouble());
			details.add(container);
		}
		System.out.println("The container details are: ");
		System.out.format("%-20s %-15s %-15s %-15s %s\n", "Container Number", "Length", "Width", "Height", "Weight");
		for (Container out : details) {
			out.displayContainerDetails();
		}

		sc.close();
	}

}

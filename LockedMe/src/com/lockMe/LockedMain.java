package com.lockMe;

public class LockedMain {
	

		public static void main(String[] args) {
			
			// Create "main" folder if not present in current folder structure
			FileOperations.createMainFolderIfNotPresent("main");
			
			MenuOptions.printWelcomeScreen("LockedMe.com", "Sk Saud");
			
			HandleOptions.handleWelcomeScreenInput();
		}

		

}

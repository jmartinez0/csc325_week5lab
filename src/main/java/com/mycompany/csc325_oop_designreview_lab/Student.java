package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
	// ToDo 1: Make this class a child of Human
	// ToDo 2: Fix the resulting errors
        // ToDo 3: Add a field for GPA and create setter and getter
        // ToDo 4: Add comments to your code
        
        private int GPA;
        
        //Method to return address
        @Override
	public String getAddress() {
            return address;
        }
        
        //Method to set address
        @Override
        public void setAddress(String address) {
            this.address = address;
        }
        
        //Method to return GPA
        public int getGPA() {
            return GPA;
        }

        //Method to set GPA
        public void setGPA(int GPA) {
            this.GPA = GPA;
        }
        
        
}
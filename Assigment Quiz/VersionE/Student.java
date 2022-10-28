package VersionE;

public class Student {
    String StudentId;
    String StudentName;
    private int count;
    
    public Student(String StudentId, String StudentName) {
        this.StudentId = StudentId;
        this.StudentName = StudentName;
    }

    private boolean isInt() {
    	for(int i = 2; i < StudentId.length(); i++) {
    		if(Character.isDigit(StudentId.charAt(i))) {
    			count++;
    		}
    	}
    	
    	if(count == 8)
    		return true;
    	return false;
    }
    
    public void display() {
        try {
            if ((StudentId.substring(0, 2).equals("IT")) == true && (StudentId.length() == 10) && (isInt() == true)) {
                System.out.println(StudentId);
                System.out.println(StudentName);
            } else {
                throw new InvalidITNumberException("Invalid IT number");
            }
        } catch (InvalidITNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
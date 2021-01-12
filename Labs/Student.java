public class Student
{
    private String fullName; // Class diagram uses - sign, denoting private variable
    private String id;

    private double grade;

    private int numUpdated, numAccessed;

     // CONSTRUCTORS - Methods with same name as class. No return type

    public Student()
    {
    	id = null;
    	fullName = null;
    	grade = -1;
    	numUpdated = 0;
    	numAccessed = 0;
    	//System.out.println("Inside constructor");
    }

    /** This function is an extra example, correlates to student2 in lab9.java
    public Student(String fullName, String id, double grade)
    {
    	this.id = id; // The "this" modifier is used when a variable is duplicated as a parameter.
    	this.fullName = fullName;
    	this.grade = grade;
    	numUpdated = 0;
    	numAccessed = 0;
    }
    */
    public String getFullName()
    {
    	numAccessed++;
    	return fullName;
    }

    public String getId()
    {
    	numAccessed++;
    	return id;
    }

    public double getGrade()
    {
    	numAccessed++;
    	return grade;
    }

    public void setFullName(String fullName)
    {
    	this.fullName = fullName;
    	numUpdated++;
    }

    public void setId(String id)
    {
    	this.id = id;
    	numUpdated++;
    }

    public void setGrade(double grade)
    {
    	this.grade = grade;
    	numUpdated++;
    }

    public int getNumUpdated()
    {
    	numAccessed++;
    	return numUpdated;
    }

    public int getNumAccessed()
    {
    	numAccessed++;
    	return numAccessed;
    }
}
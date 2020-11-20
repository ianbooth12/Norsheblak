public class Student10
{
	private String fullName;
	private String id;

	private double grade;

	public Student10(String x, String y, double z)
	{
		fullName = x;
		id = y;
		grade = z;
	}

	public String getFullName()
	{
		return fullName;
	}

	public double getGrade()
	{
		return grade;
	}

	public void setFullName(String fullName)
	{
		this.fullName = fullName;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public void setGrade(double grade)
	{
		this.grade = grade;
	}

	public String toString()
	{
		return fullName + "\t" + id;
	}

	// student1.equals(student2);
	public boolean equals(Object obj)
	{
		Student10 other = (Student10)obj;

		if (other == null)
		{
			return false;
		}

		if (obj.getClass() != this.getClass())
		{
			return false;
		}

		if (other.getId().equals(this.getId()))
		{
			return true;
		}

		return false;
	}
}
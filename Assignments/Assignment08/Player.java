// CSE 110 93389: Monday 10:45 AM Section
// Assignment  : 8
// Author      : Ian Booth ID #1219005593
// Description : Classes for recording team stats/names


public class Player
{
	private String name;

	private double attackStat;

	private double blockStat;

	public Player(String givenName, double givenAttack, double givenBlock)
	{
		name = givenName;
		attackStat = givenAttack;
		blockStat = givenBlock;
	}

	public String getName()
	{
		return name;
	}

	public double getAttackStat()
	{
		return attackStat;
	}

	public void setAttackStat(double attackStat)
	{
		this.attackStat = attackStat;
	}

	public double getBlockStat()
	{
		return blockStat;
	}

	public void setBlockStat(double blockStat)
	{
		this.blockStat = blockStat;
	}

	public void printPlayerInfo()
	{
		System.out.println(name + " (attack = " + attackStat + ", block = " + blockStat + ")");
	}
}
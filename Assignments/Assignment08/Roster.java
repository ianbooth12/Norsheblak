// CSE 110 93389: Monday 10:45 AM Section
// Assignment  : 8
// Author      : Ian Booth ID #1219005593
// Description : Classes for recording team stats/names

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Roster
{

	private ArrayList<Player> players;

	public Roster()
	{
		players = new ArrayList<Player>();
	}

	public Roster(String fileName) throws IOException
	{
		players = new ArrayList<Player>();
		File test = new File(fileName);
		Scanner in = new Scanner(test);

		while(in.hasNextLine())
		{
			int i = 0;
			int j = 0;
			String line = in.nextLine();
			while(!Character.isDigit(line.charAt(i)))
			{
				i++;
			}
			String name = line.substring(0, i);
			j = i;
			while(!Character.isWhitespace(line.charAt(j)))
			{
				j++;
			}

			String attackString = line.substring(i,j);
			attackString = attackString.trim();
			double attackStat = Double.parseDouble(attackString);

			String blockString = line.substring(j);	
			blockString = blockString.trim();
			double blockStat = Double.parseDouble(blockString);
			Player nore = new Player(name, attackStat, blockStat);
			players.add(nore);
		}
	}

	public void addPlayer(String name, double attackStat, double blockStat)
	{
		Player nore = new Player(name, attackStat, blockStat);
		players.add(nore);
	}

	public int countPlayers()
	{
		return players.size();
	}

	public Player getPlayerByName(String playerName)
	{
		for (int i = 0; i < players.size(); i++)
		{
			Player temp = players.get(i);
			if (temp.getName().equals(playerName))
			{
				return players.get(i);
			}
			else
			{
				return null;
			}
		}
		return null;
	}

	public void printTopAttackers()
	{
		Player oldBest = players.get(0);
		Player best = players.get(0);
		for (int i = 0; i < players.size(); i++)
		{
			Player temp = players.get(i);
			if (temp.getAttackStat() > best.getAttackStat())
			{
				oldBest = best;
				best = players.get(i);
			}
			if(temp.getAttackStat() > oldBest.getAttackStat() && temp.getAttackStat() < best.getAttackStat())
			{
				oldBest = players.get(i);
			}
		}
		best.printPlayerInfo();
		oldBest.printPlayerInfo();
	}

	public void printTopBlockers()
	{
		Player oldBest = players.get(0);
		Player best = players.get(0);
		for (int i = 0; i < players.size(); i++)
		{
			Player blardy = players.get(i);
			if (blardy.getBlockStat() > best.getBlockStat());
			{
				oldBest = best;
				best = players.get(i);

			}
			if (blardy.getBlockStat() > oldBest.getBlockStat() && blardy.getBlockStat() < best.getBlockStat())
			{
				oldBest = players.get(i);
			}
		}
		best.printPlayerInfo();
		oldBest.printPlayerInfo();

	}

	public void printAllPlayers()
	{
		for (int i = 0; i < players.size(); i++)
		{
			Player bench = players.get(i);
			bench.printPlayerInfo();
		}
	}
}

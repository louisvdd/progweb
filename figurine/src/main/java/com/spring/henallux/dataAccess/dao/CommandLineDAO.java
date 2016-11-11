package com.spring.henallux.dataAccess.dao;

import java.util.*;

import org.junit.experimental.categories.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.henallux.model.Command;

@Service
public class CommandLineDAO 
{
	@Autowired
	private CommandLineRepository commandLineRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
	
	public CommandLine save(CommandLine commandLine)
	{
		CommandLineEntity commandLineEntity = providerConverter.commandLineModeltoCommandLineEntity(commandLine);
		commandLineEntity = commandLineRepository.save(commandLineEntity);
		return providerConverter.commandLineEntitytoCommandModel(commandLineEntity);
	}
	
	public ArrayList<Command> getAllCommandLines()
	{
		List <CommandLineEntity> commandeLIneEntities = commandLineRepository.findAll();
		ArrayList <CommandLine> commandLines = new ArrayList<>();
		for (CommandLineEntity entity : commandeLineEntities)
		{
			CommandLine commandLine = providerConverter.commandLineEntitytoCommandLineModel(entity);
			commandLines.add(commandLine);
		}
		return commandLines;
	}
}
